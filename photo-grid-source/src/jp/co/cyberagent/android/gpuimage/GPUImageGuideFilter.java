// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilterGroup, GPUImageSaturationFilter, GPUImageScreenBlendFilter, GPUImageSkinCheckFilter, 
//            GPUImageBoxBlurFilter2, GPUImageMulityply, GPUImageGuideCoeA, GPUImageSubtractBlendFilter, 
//            GPUImageAddFilter, GPUImageAlphaBlendFilter2, GPUImageFilter, GPUImageTwoInputFilter, 
//            Rotation

public class GPUImageGuideFilter extends GPUImageFilterGroup
{

    public GPUImageGuideFilter(float f, float f1, int i, int j)
    {
        super(createFilters(f, f1, i, j));
    }

    private static List createFilters(float f, float f1, int i, int j)
    {
        ArrayList arraylist = new ArrayList(1);
        GPUImageSaturationFilter gpuimagesaturationfilter = new GPUImageSaturationFilter();
        GPUImageScreenBlendFilter gpuimagescreenblendfilter = new GPUImageScreenBlendFilter();
        gpuimagesaturationfilter.setSaturation(0.0F);
        gpuimagesaturationfilter.setAlpha(0.0F);
        arraylist.add(new GPUImageSkinCheckFilter());
        arraylist.add(new GPUImageBoxBlurFilter2(f, i, j));
        arraylist.add(new GPUImageMulityply());
        arraylist.add(new GPUImageBoxBlurFilter2(f, i, j));
        arraylist.add(new GPUImageGuideCoeA(f1));
        arraylist.add(new GPUImageMulityply());
        arraylist.add(new GPUImageSubtractBlendFilter());
        arraylist.add(new GPUImageBoxBlurFilter2(f, i, j));
        arraylist.add(new GPUImageBoxBlurFilter2(f, i, j));
        arraylist.add(new GPUImageMulityply());
        arraylist.add(new GPUImageAddFilter());
        arraylist.add(new GPUImageAlphaBlendFilter2(true));
        arraylist.add(gpuimagesaturationfilter);
        arraylist.add(gpuimagescreenblendfilter);
        return arraylist;
    }

    public void onDraw(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        runPendingOnDrawTasks();
        while (!isInitialized() || mFrameBuffers == null || mFrameBufferTextures == null || mMergedFilters == null) 
        {
            return;
        }
        GLES20.glBindFramebuffer(36160, mFrameBuffers[0]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(0)).onDraw(i, mGLCubeBuffer, mGLTextureBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[1]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(1)).onDraw(mFrameBufferTextures[0], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[2]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(2)).onDraw(mFrameBufferTextures[1], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[1]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(3);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[0]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[0], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[3]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(4)).onDraw(mFrameBufferTextures[1], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[4]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(5)).onDraw(mFrameBufferTextures[3], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[1]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(6);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[4]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[3]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(7);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[1]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[4]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(8);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[3]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[2]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(9)).onDraw(mFrameBufferTextures[1], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[1]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(10)).onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[2]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(11)).onDraw(mFrameBufferTextures[4], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[3]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(12)).onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[4]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(13);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[1]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[0], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[2]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(14);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[4]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[3], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[1]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(15)).onDraw(mFrameBufferTextures[2], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, mFrameBuffers[2]);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
        ((GPUImageFilter)mMergedFilters.get(16)).onDraw(mFrameBufferTextures[1], mGLCubeBuffer, mGLTextureFlipBuffer);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.153F, 0.153F, 0.153F, 1.0F);
        GLES20.glClear(16640);
        floatbuffer1 = (GPUImageFilter)mMergedFilters.get(17);
        ((GPUImageTwoInputFilter)floatbuffer1).setTexture(mFrameBufferTextures[1]);
        ((GPUImageTwoInputFilter)floatbuffer1).setRotation(Rotation.NORMAL, false, true);
        floatbuffer1.onDraw(mFrameBufferTextures[2], floatbuffer, mGLTextureFlipBuffer);
    }

    public void onOutputSizeChanged(int i, int j)
    {
        mOutputWidth = i;
        mOutputHeight = j;
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
            mFrameBuffers = new int[5];
            mFrameBufferTextures = new int[5];
            for (int l = 0; l < 5; l++)
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

    public void setAlpha(float f)
    {
        ((GPUImageSaturationFilter)(GPUImageFilter)mMergedFilters.get(mMergedFilters.size() - 2)).setAlpha(f);
    }

    public void setEps(float f)
    {
        ((GPUImageGuideCoeA)(GPUImageFilter)mMergedFilters.get(6)).setEPS(f);
    }
}
