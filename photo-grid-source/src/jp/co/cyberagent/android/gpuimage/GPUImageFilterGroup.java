// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter, GPUImageRenderer, Rotation

public class GPUImageFilterGroup extends GPUImageFilter
{

    protected List mFilters;
    protected int mFrameBufferTextures[];
    protected int mFrameBuffers[];
    protected final FloatBuffer mGLCubeBuffer;
    protected final FloatBuffer mGLTextureBuffer;
    protected final FloatBuffer mGLTextureFlipBuffer;
    protected List mMergedFilters;

    public GPUImageFilterGroup()
    {
        this(null);
    }

    public GPUImageFilterGroup(List list)
    {
        mFilters = list;
        if (mFilters == null)
        {
            mFilters = new ArrayList();
        } else
        {
            updateMergedFilters();
        }
        mGLCubeBuffer = ByteBuffer.allocateDirect(GPUImageRenderer.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mGLCubeBuffer.put(GPUImageRenderer.CUBE).position(0);
        mGLTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mGLTextureBuffer.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        list = TextureRotationUtil.getRotation(Rotation.NORMAL, false, true);
        mGLTextureFlipBuffer = ByteBuffer.allocateDirect(list.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mGLTextureFlipBuffer.put(list).position(0);
    }

    public void addFilter(GPUImageFilter gpuimagefilter)
    {
        if (gpuimagefilter == null)
        {
            return;
        } else
        {
            mFilters.add(gpuimagefilter);
            updateMergedFilters();
            return;
        }
    }

    protected void destroyFramebuffers()
    {
        if (mFrameBufferTextures != null)
        {
            GLES20.glDeleteTextures(mFrameBufferTextures.length, mFrameBufferTextures, 0);
            mFrameBufferTextures = null;
        }
        if (mFrameBuffers != null)
        {
            GLES20.glDeleteFramebuffers(mFrameBuffers.length, mFrameBuffers, 0);
            mFrameBuffers = null;
        }
    }

    public List getFilters()
    {
        return mFilters;
    }

    public List getMergedFilters()
    {
        return mMergedFilters;
    }

    public void onDestroy()
    {
        destroyFramebuffers();
        for (Iterator iterator = mFilters.iterator(); iterator.hasNext(); ((GPUImageFilter)iterator.next()).destroy()) { }
        super.onDestroy();
    }

    public void onDraw(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        runPendingOnDrawTasks();
        break MISSING_BLOCK_LABEL_4;
        if (isInitialized() && mFrameBuffers != null && mFrameBufferTextures != null && mMergedFilters != null)
        {
            int i1 = mMergedFilters.size();
            int k = 0;
            int j = i;
            while (k < i1) 
            {
                GPUImageFilter gpuimagefilter = (GPUImageFilter)mMergedFilters.get(k);
                int l;
                if (k < i1 - 1)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (l != 0)
                {
                    GLES20.glBindFramebuffer(36160, mFrameBuffers[k]);
                    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                    GLES20.glClear(16640);
                }
                if (k == 0)
                {
                    if (i1 == 1)
                    {
                        gpuimagefilter.onDraw(j, floatbuffer, floatbuffer1);
                    } else
                    {
                        gpuimagefilter.onDraw(j, mGLCubeBuffer, mGLTextureBuffer);
                    }
                } else
                if (k == i1 - 1)
                {
                    FloatBuffer floatbuffer2;
                    if (i1 % 2 == 0)
                    {
                        floatbuffer2 = mGLTextureFlipBuffer;
                    } else
                    {
                        floatbuffer2 = floatbuffer1;
                    }
                    gpuimagefilter.onDraw(j, floatbuffer, floatbuffer2);
                } else
                {
                    gpuimagefilter.onDraw(j, mGLCubeBuffer, mGLTextureBuffer);
                }
                if (l != 0)
                {
                    GLES20.glBindFramebuffer(36160, 0);
                    l = mFrameBufferTextures[k];
                    j = l;
                    if (k == 0)
                    {
                        j = l;
                        if (isCameraRender)
                        {
                            if (isDarkCorner)
                            {
                                GPUImageFilter.mSrcTexId = l;
                                j = l;
                            } else
                            {
                                GPUImageFilter.mSrcTexId = i;
                                j = l;
                            }
                        }
                    }
                }
                k++;
            }
        }
        return;
    }

    public void onInit()
    {
        super.onInit();
        for (Iterator iterator = mFilters.iterator(); iterator.hasNext(); ((GPUImageFilter)iterator.next()).init()) { }
    }

    public void onOutputSizeChanged(int i, int j)
    {
        super.onOutputSizeChanged(i, j);
        if (mFrameBuffers != null)
        {
            destroyFramebuffers();
        }
        int i1 = mFilters.size();
        for (int k = 0; k < i1; k++)
        {
            ((GPUImageFilter)mFilters.get(k)).onOutputSizeChanged(i, j);
        }

        if (mMergedFilters != null && mMergedFilters.size() > 0)
        {
            int j1 = mMergedFilters.size();
            mFrameBuffers = new int[j1 - 1];
            mFrameBufferTextures = new int[j1 - 1];
            for (int l = 0; l < j1 - 1; l++)
            {
                GLES20.glGenFramebuffers(1, mFrameBuffers, l);
                GLES20.glGenTextures(1, mFrameBufferTextures, l);
                GLES20.glBindTexture(3553, mFrameBufferTextures[l]);
                GLES20.glTexImage2D(3553, 0, 6408, i, j, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729F);
                GLES20.glTexParameterf(3553, 10241, 9729F);
                GLES20.glTexParameterf(3553, 10242, 33071F);
                GLES20.glTexParameterf(3553, 10243, 33071F);
                GLES20.glBindFramebuffer(36160, mFrameBuffers[l]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, mFrameBufferTextures[l], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }

        }
    }

    public void updateMergedFilters()
    {
        if (mFilters != null)
        {
            Iterator iterator;
            if (mMergedFilters == null)
            {
                mMergedFilters = new ArrayList();
            } else
            {
                mMergedFilters.clear();
            }
            iterator = mFilters.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (GPUImageFilter)iterator.next();
                if (obj instanceof GPUImageFilterGroup)
                {
                    ((GPUImageFilterGroup)obj).updateMergedFilters();
                    obj = ((GPUImageFilterGroup)obj).getMergedFilters();
                    if (obj != null && !((List) (obj)).isEmpty())
                    {
                        mMergedFilters.addAll(((java.util.Collection) (obj)));
                    }
                } else
                {
                    mMergedFilters.add(obj);
                }
            }
        }
    }
}
