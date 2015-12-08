// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            Rotation, GPUImageFilter

public class GPUImageRenderer
    implements android.hardware.Camera.PreviewCallback, android.opengl.GLSurfaceView.Renderer
{

    static final float CUBE[] = {
        -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
    };
    public static final int NO_IMAGE = -1;
    private android.hardware.Camera.Parameters cameraParams;
    private int mAddedPadding;
    protected OnDrawEndListener mDrawEndListener;
    protected OnDrawDoneListener mDrawListener;
    private GPUImageFilter mFilter;
    private boolean mFlipHorizontal;
    private boolean mFlipVertical;
    private final FloatBuffer mGLCubeBuffer;
    private IntBuffer mGLRgbBuffer;
    private final FloatBuffer mGLTextureBuffer;
    private int mGLTextureId;
    public boolean mGalaxyYCapture;
    private int mImageHeight;
    private int mImageWidth;
    private int mOutputHeight;
    private int mOutputWidth;
    public boolean mPause;
    private Rotation mRotation;
    private final Queue mRunOnDraw = new LinkedList();
    private final Queue mRunOnDrawEnd = new LinkedList();
    public boolean mSave;
    private GPUImage.ScaleType mScaleType;
    public final Object mSurfaceChangedWaiter = new Object();
    private SurfaceTexture mSurfaceTexture;
    public Semaphore waiter;

    public GPUImageRenderer(GPUImageFilter gpuimagefilter)
    {
        mGLTextureId = -1;
        mSurfaceTexture = null;
        mScaleType = GPUImage.ScaleType.CENTER_INSIDE;
        mGalaxyYCapture = false;
        mSave = false;
        mPause = false;
        mFilter = gpuimagefilter;
        mGLCubeBuffer = ByteBuffer.allocateDirect(CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mGLCubeBuffer.put(CUBE).position(0);
        mGLTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        setRotation(Rotation.NORMAL, false, false);
    }

    private float addDistance(float f, float f1)
    {
        if (f == 0.0F)
        {
            return f1;
        } else
        {
            return 1.0F - f1;
        }
    }

    private void adjustImageScaling()
    {
        float f1 = mOutputWidth;
        float f = mOutputHeight;
        if (mRotation == Rotation.ROTATION_270 || mRotation == Rotation.ROTATION_90)
        {
            f1 = mOutputHeight;
            f = mOutputWidth;
        }
        float f2 = Math.max(f1 / (float)mImageWidth, f / (float)mImageHeight);
        int i = Math.round((float)mImageWidth * f2);
        int j = Math.round(f2 * (float)mImageHeight);
        f1 = (float)i / f1;
        f = (float)j / f;
        float af[] = CUBE;
        float af1[] = TextureRotationUtil.getRotation(mRotation, mFlipHorizontal, mFlipVertical);
        if (mScaleType == GPUImage.ScaleType.CENTER_CROP)
        {
            f1 = (1.0F - 1.0F / f1) / 2.0F;
            f = (1.0F - 1.0F / f) / 2.0F;
            float af2[] = new float[8];
            af2[0] = addDistance(af1[0], f1);
            af2[1] = addDistance(af1[1], f);
            af2[2] = addDistance(af1[2], f1);
            af2[3] = addDistance(af1[3], f);
            af2[4] = addDistance(af1[4], f1);
            af2[5] = addDistance(af1[5], f);
            af2[6] = addDistance(af1[6], f1);
            af2[7] = addDistance(af1[7], f);
            af1 = af;
            af = af2;
        } else
        if (!mGalaxyYCapture)
        {
            float af3[] = {
                CUBE[0] / f, CUBE[1] / f1, CUBE[2] / f, CUBE[3] / f1, CUBE[4] / f, CUBE[5] / f1, CUBE[6] / f, CUBE[7] / f1
            };
            af = af1;
            af1 = af3;
        } else
        {
            float af4[] = af;
            af = af1;
            af1 = af4;
        }
        mGLCubeBuffer.clear();
        mGLCubeBuffer.put(af1).position(0);
        mGLTextureBuffer.clear();
        mGLTextureBuffer.put(af).position(0);
    }

    private void deleteTextureImage()
    {
        if (mGLTextureId != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                mGLTextureId
            }, 0);
            mGLTextureId = -1;
        }
    }

    private void runAll(Queue queue)
    {
        queue;
        JVM INSTR monitorenter ;
        for (; !queue.isEmpty(); ((Runnable)queue.poll()).run()) { }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
        queue;
        JVM INSTR monitorexit ;
    }

    public void closeBlendMode()
    {
        runOnDraw(new _cls8());
    }

    protected void deleteBufferDirectly()
    {
        if (mGLRgbBuffer != null)
        {
            mGLRgbBuffer.clear();
            mGLRgbBuffer = null;
        }
    }

    public void deleteCameraImage()
    {
        runOnDraw(new _cls3());
    }

    public void deleteImage()
    {
        runOnDraw(new _cls5());
    }

    public void deleteImageEnd()
    {
        runOnDrawEnd(new _cls6());
    }

    public void destroy()
    {
        deleteImage();
        if (mFilter != null)
        {
            mFilter.destroy();
        }
    }

    public Queue getDrawQueue()
    {
        Queue queue1;
        synchronized (mRunOnDraw)
        {
            queue1 = mRunOnDraw;
        }
        return queue1;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int getFrameHeight()
    {
        return mOutputHeight;
    }

    protected int getFrameWidth()
    {
        return mOutputWidth;
    }

    public Rotation getRotation()
    {
        return mRotation;
    }

    public boolean isFlippedHorizontally()
    {
        return mFlipHorizontal;
    }

    public boolean isFlippedVertically()
    {
        return mFlipVertical;
    }

    public void onDrawFrame(GL10 gl10)
    {
        GLES20.glClearColor(0.153F, 0.153F, 0.153F, 1.0F);
        GLES20.glClear(16640);
        runAll(mRunOnDraw);
        mFilter.onDraw(mGLTextureId, mGLCubeBuffer, mGLTextureBuffer);
        runAll(mRunOnDrawEnd);
        if (mDrawListener != null)
        {
            mDrawListener.onDrawLoadDone();
        }
        if (mDrawEndListener != null)
        {
            mDrawEndListener.onDrawEnd();
        }
    }

    public void onPreviewFrame(final byte data[], final Camera camera)
    {
        if (!mPause && mRunOnDraw.isEmpty() && camera != null && cameraParams != null)
        {
            final android.hardware.Camera.Size previewSize = cameraParams.getPreviewSize();
            if (mRunOnDraw.isEmpty() && previewSize != null)
            {
                runOnDraw(new _cls1());
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        mOutputWidth = i;
        mOutputHeight = j;
        GLES20.glViewport(0, 0, i, j);
        GLES20.glUseProgram(mFilter.getProgram());
        mFilter.onOutputSizeChanged(i, j);
        adjustImageScaling();
        synchronized (mSurfaceChangedWaiter)
        {
            mSurfaceChangedWaiter.notifyAll();
        }
        return;
        exception;
        gl10;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        GLES20.glClearColor(0.153F, 0.153F, 0.153F, 1.0F);
        GLES20.glDisable(2929);
        mFilter.init();
    }

    public void openBlendMode()
    {
        runOnDraw(new _cls7());
    }

    protected void runOnDraw(Runnable runnable)
    {
        synchronized (mRunOnDraw)
        {
            mRunOnDraw.add(runnable);
        }
        return;
        runnable;
        queue;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    protected void runOnDrawEnd(Runnable runnable)
    {
        synchronized (mRunOnDrawEnd)
        {
            mRunOnDrawEnd.add(runnable);
        }
        return;
        runnable;
        queue;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void setDrawEndListener(OnDrawEndListener ondrawendlistener)
    {
        mDrawEndListener = ondrawendlistener;
    }

    public void setDrawListener(OnDrawDoneListener ondrawdonelistener)
    {
        mDrawListener = ondrawdonelistener;
    }

    public void setFilter(final GPUImageFilter filter)
    {
        runOnDraw(new _cls4());
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        setImageBitmap(bitmap, true);
    }

    public void setImageBitmap(final Bitmap bitmap, final boolean recycle)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            runOnDraw(new _cls10());
            return;
        }
    }

    public void setImageThumbnailBitmap(final Bitmap bitmap, final boolean recycle)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            runOnDraw(new _cls9());
            return;
        }
    }

    public void setRotation(Rotation rotation)
    {
        mRotation = rotation;
        adjustImageScaling();
    }

    public void setRotation(Rotation rotation, boolean flag, boolean flag1)
    {
        mFlipHorizontal = flag;
        mFlipVertical = flag1;
        setRotation(rotation);
    }

    public void setRotationCamera(Rotation rotation, boolean flag, boolean flag1)
    {
        setRotation(rotation, flag1, flag);
    }

    public void setScaleType(GPUImage.ScaleType scaletype)
    {
        mScaleType = scaletype;
    }

    public void setUpSurfaceTexture(final Camera camera)
    {
        runOnDraw(new _cls2());
    }




/*
    static int access$002(GPUImageRenderer gpuimagerenderer, int i)
    {
        gpuimagerenderer.mImageWidth = i;
        return i;
    }

*/




/*
    static int access$102(GPUImageRenderer gpuimagerenderer, int i)
    {
        gpuimagerenderer.mImageHeight = i;
        return i;
    }

*/


/*
    static int access$1102(GPUImageRenderer gpuimagerenderer, int i)
    {
        gpuimagerenderer.mAddedPadding = i;
        return i;
    }

*/




/*
    static IntBuffer access$302(GPUImageRenderer gpuimagerenderer, IntBuffer intbuffer)
    {
        gpuimagerenderer.mGLRgbBuffer = intbuffer;
        return intbuffer;
    }

*/



/*
    static int access$402(GPUImageRenderer gpuimagerenderer, int i)
    {
        gpuimagerenderer.mGLTextureId = i;
        return i;
    }

*/




/*
    static SurfaceTexture access$602(GPUImageRenderer gpuimagerenderer, SurfaceTexture surfacetexture)
    {
        gpuimagerenderer.mSurfaceTexture = surfacetexture;
        return surfacetexture;
    }

*/


/*
    static android.hardware.Camera.Parameters access$702(GPUImageRenderer gpuimagerenderer, android.hardware.Camera.Parameters parameters)
    {
        gpuimagerenderer.cameraParams = parameters;
        return parameters;
    }

*/



/*
    static GPUImageFilter access$802(GPUImageRenderer gpuimagerenderer, GPUImageFilter gpuimagefilter)
    {
        gpuimagerenderer.mFilter = gpuimagefilter;
        return gpuimagefilter;
    }

*/


    private class _cls8
        implements Runnable
    {

        final GPUImageRenderer this$0;

        public void run()
        {
            GLES20.glDisable(3042);
        }

        _cls8()
        {
            this$0 = GPUImageRenderer.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final GPUImageRenderer this$0;

        public void run()
        {
            deleteTextureImage();
            deleteBufferDirectly();
        }

        _cls3()
        {
            this$0 = GPUImageRenderer.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final GPUImageRenderer this$0;

        public void run()
        {
            if (mGLTextureId != -1)
            {
                GLES20.glDeleteTextures(1, new int[] {
                    mGLTextureId
                }, 0);
                mGLTextureId = -1;
            }
        }

        _cls5()
        {
            this$0 = GPUImageRenderer.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final GPUImageRenderer this$0;

        public void run()
        {
            GLES20.glDeleteTextures(1, new int[] {
                mGLTextureId
            }, 0);
            mGLTextureId = -1;
        }

        _cls6()
        {
            this$0 = GPUImageRenderer.this;
            super();
        }
    }


    private class OnDrawDoneListener
    {

        public abstract void onDrawLoadDone();

        public abstract void onPreviewFailed();
    }


    private class OnDrawEndListener
    {

        public abstract void onDrawEnd();
    }


    private class _cls1
        implements Runnable
    {

        final GPUImageRenderer this$0;
        final Camera val$camera;
        final byte val$data[];
        final android.hardware.Camera.Size val$previewSize;

        public void run()
        {
            if (mImageWidth > 0 && mImageHeight > 0 && (mImageWidth != previewSize.width || mImageHeight != previewSize.height))
            {
                deleteTextureImage();
                deleteBufferDirectly();
            }
            if (mGLRgbBuffer == null)
            {
                mGLRgbBuffer = IntBuffer.allocate(previewSize.width * previewSize.height);
            }
            GPUImageNativeLibrary.YUVtoRBGA(data, previewSize.width, previewSize.height, mGLRgbBuffer.array());
            mGLTextureId = OpenGlUtils.loadTexture(mGLRgbBuffer, previewSize, mGLTextureId);
            GPUImageFilter.mSrcTexId = mGLTextureId;
            camera.addCallbackBuffer(data);
            if (mImageWidth != previewSize.width)
            {
                mImageWidth = previewSize.width;
                mImageHeight = previewSize.height;
                adjustImageScaling();
            }
_L1:
            return;
            OutOfMemoryError outofmemoryerror;
            outofmemoryerror;
            outofmemoryerror.printStackTrace();
            if (mDrawListener != null)
            {
                mDrawListener.onPreviewFailed();
                return;
            }
              goto _L1
        }

        _cls1()
        {
            this$0 = GPUImageRenderer.this;
            previewSize = size;
            data = abyte0;
            camera = camera1;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final GPUImageRenderer this$0;

        public void run()
        {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
        }

        _cls7()
        {
            this$0 = GPUImageRenderer.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final GPUImageRenderer this$0;
        final GPUImageFilter val$filter;

        public void run()
        {
            GPUImageFilter gpuimagefilter = mFilter;
            mFilter = filter;
            if (gpuimagefilter != null)
            {
                gpuimagefilter.destroy();
            }
            mFilter.init();
            GLES20.glUseProgram(mFilter.getProgram());
            mFilter.onOutputSizeChanged(mOutputWidth, mOutputHeight);
        }

        _cls4()
        {
            this$0 = GPUImageRenderer.this;
            filter = gpuimagefilter;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final GPUImageRenderer this$0;
        final Bitmap val$bitmap;
        final boolean val$recycle;

        public void run()
        {
            mAddedPadding = 0;
            mGLTextureId = OpenGlUtils.loadTexture(bitmap, mGLTextureId, recycle);
            GPUImageFilter.mSrcTexId = mGLTextureId;
            mImageWidth = bitmap.getWidth();
            mImageHeight = bitmap.getHeight();
            adjustImageScaling();
        }

        _cls10()
        {
            this$0 = GPUImageRenderer.this;
            bitmap = bitmap1;
            recycle = flag;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final GPUImageRenderer this$0;
        final Bitmap val$bitmap;
        final boolean val$recycle;

        public void run()
        {
            mAddedPadding = 0;
            mGLTextureId = OpenGlUtils.loadTexture(bitmap, mGLTextureId, recycle);
            GPUImageFilter.mSrcThumbnailTexId = mGLTextureId;
            mImageWidth = bitmap.getWidth();
            mImageHeight = bitmap.getHeight();
            adjustImageScaling();
        }

        _cls9()
        {
            this$0 = GPUImageRenderer.this;
            bitmap = bitmap1;
            recycle = flag;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final GPUImageRenderer this$0;
        final Camera val$camera;

        public void run()
        {
            int ai[] = new int[1];
            GLES20.glGenTextures(1, ai, 0);
            mSurfaceTexture = new SurfaceTexture(ai[0]);
            try
            {
                camera.setPreviewTexture(mSurfaceTexture);
                camera.setPreviewCallback(GPUImageRenderer.this);
                camera.startPreview();
                cameraParams = camera.getParameters();
                return;
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }

        _cls2()
        {
            this$0 = GPUImageRenderer.this;
            camera = camera1;
            super();
        }
    }

}
