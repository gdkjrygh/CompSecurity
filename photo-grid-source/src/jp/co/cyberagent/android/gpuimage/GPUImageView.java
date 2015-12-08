// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.io.File;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage, GPUImageRenderer, GPUImageFilter, Rotation

public class GPUImageView extends FrameLayout
{

    private boolean bGalaxyYSeries;
    private Context mContext;
    private GPUImageFilter mFilter;
    public Size mForceSize;
    private GLSurfaceView mGLSurfaceView;
    private GPUImage mGPUImage;
    private OnPictureSavedListener mPictureListener;
    private float mRatio;
    private SaveTask mSaveTask;
    private File mfile;
    private GPUImage.OnImageLoadDoneListener mlistener;

    public GPUImageView(Context context)
    {
        super(context);
        mForceSize = null;
        mRatio = 0.0F;
        mfile = null;
        bGalaxyYSeries = false;
        init(context, null);
    }

    public GPUImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mForceSize = null;
        mRatio = 0.0F;
        mfile = null;
        bGalaxyYSeries = false;
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        mGLSurfaceView = new GPUImageGLSurfaceView(context, attributeset);
        addView(mGLSurfaceView);
        mGPUImage = new GPUImage(getContext());
        mGPUImage.setGLSurfaceView(mGLSurfaceView);
    }

    public void cancelSavePicturesTask()
    {
        mSaveTask.cancel(true);
    }

    public Bitmap capture()
    {
        final Semaphore waiter = new Semaphore(0);
        final int width = mGLSurfaceView.getMeasuredWidth();
        final int height = mGLSurfaceView.getMeasuredHeight();
        final int pixelMirroredArray[] = new int[width * height];
        mGPUImage.runOnGLThread(new _cls3());
        requestRender();
        waiter.acquire();
        waiter = Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        waiter.copyPixelsFromBuffer(IntBuffer.wrap(pixelMirroredArray));
        return waiter;
    }

    public Bitmap capture(int i, int j)
    {
        final Semaphore waiter;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Do not call this method from the UI thread!");
        }
        mForceSize = new Size(i, j);
        waiter = new Semaphore(0);
        mGPUImage.mRenderer.mGalaxyYCapture = true;
        post(new _cls1());
        synchronized (mGPUImage.mRenderer.mSurfaceChangedWaiter)
        {
            mGPUImage.mRenderer.mSurfaceChangedWaiter.wait(3000L);
        }
_L2:
        mGPUImage.runOnGLThread(new _cls2());
        requestRender();
        waiter.acquire();
        return capture();
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void closeBlendMode()
    {
        mGPUImage.closeBlendMode();
    }

    public void deleteImage()
    {
        mGPUImage.deleteImage();
    }

    public GPUImageFilter getFilter()
    {
        return mFilter;
    }

    public GPUImage getGPUImage()
    {
        return mGPUImage;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (mRatio != 0.0F)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            j = android.view.View.MeasureSpec.getSize(j);
            if ((float)i / mRatio < (float)j)
            {
                j = Math.round((float)i / mRatio);
            } else
            {
                i = Math.round((float)j * mRatio);
            }
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void onPause()
    {
        mGLSurfaceView.onPause();
    }

    public void onResume()
    {
        mGLSurfaceView.onResume();
        if (!bGalaxyYSeries)
        {
            mGPUImage.deleteImage();
            mGPUImage.setImage(mfile, mlistener);
        }
        if (mFilter != null)
        {
            setFilter(mFilter);
        }
    }

    public void openBlendMode()
    {
        mGPUImage.openBlendMode();
    }

    public void releaseGLSurfaceView()
    {
        mGPUImage.deleteImage();
        mGPUImage.deleteFilter();
    }

    public void requestRender()
    {
        mGLSurfaceView.requestRender();
    }

    public void saveToPictures(String s, String s1, int i, int j, OnPictureSavedListener onpicturesavedlistener)
    {
        mSaveTask = new SaveTask(s, s1, i, j, onpicturesavedlistener);
        mSaveTask.execute(new Void[0]);
    }

    public void saveToPictures(String s, String s1, OnPictureSavedListener onpicturesavedlistener)
    {
        mSaveTask = new SaveTask(s, s1, onpicturesavedlistener);
        mSaveTask.execute(new Void[0]);
    }

    public void setDrawEndListener(GPUImageRenderer.OnDrawEndListener ondrawendlistener)
    {
        mGPUImage.setDrawEndListener(ondrawendlistener);
    }

    public void setDrawListener(GPUImageRenderer.OnDrawDoneListener ondrawdonelistener)
    {
        mGPUImage.setDrawListener(ondrawdonelistener);
    }

    public void setFile(File file, GPUImage.OnImageLoadDoneListener onimageloaddonelistener)
    {
        mfile = file;
        mlistener = onimageloaddonelistener;
    }

    public void setFilter(GPUImageFilter gpuimagefilter)
    {
        mFilter = gpuimagefilter;
        mGPUImage.setFilter(gpuimagefilter);
    }

    public void setFilterNoApply(GPUImageFilter gpuimagefilter)
    {
        mFilter = gpuimagefilter;
    }

    public void setGalaxyYSeries(boolean flag)
    {
        bGalaxyYSeries = flag;
    }

    public void setImage(Bitmap bitmap)
    {
        mGPUImage.setImage(bitmap);
    }

    public void setImage(Bitmap bitmap, boolean flag)
    {
        mGPUImage.setImage(bitmap, flag);
    }

    public void setImage(Uri uri)
    {
        mGPUImage.setImage(uri);
    }

    public void setImage(File file, GPUImage.OnImageLoadDoneListener onimageloaddonelistener)
    {
        mGPUImage.setImage(file, onimageloaddonelistener);
    }

    public void setRatio(float f)
    {
        mRatio = f;
        mGLSurfaceView.requestLayout();
        mGPUImage.deleteImage();
    }

    public void setRotation(Rotation rotation)
    {
        mGPUImage.setRotation(rotation);
        requestRender();
    }

    public void setScaleType(GPUImage.ScaleType scaletype)
    {
        mGPUImage.setScaleType(scaletype);
    }


    private class GPUImageGLSurfaceView extends GLSurfaceView
    {

        final GPUImageView this$0;

        protected void onMeasure(int i, int j)
        {
            if (mForceSize != null)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mForceSize.width, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mForceSize.height, 0x40000000));
                return;
            } else
            {
                super.onMeasure(i, j);
                return;
            }
        }

        public GPUImageGLSurfaceView(Context context)
        {
            this$0 = GPUImageView.this;
            super(context);
        }

        public GPUImageGLSurfaceView(Context context, AttributeSet attributeset)
        {
            this$0 = GPUImageView.this;
            super(context, attributeset);
        }
    }


    private class SaveTask extends c
    {

        private final String mFileName;
        private final String mFolderName;
        private final Handler mHandler;
        private final int mHeight;
        private final OnPictureSavedListener mListener;
        private final int mWidth;
        final GPUImageView this$0;

        protected transient Bitmap doInBackground(Void avoid[])
        {
            try
            {
                if (mWidth != 0)
                {
                    return capture(mWidth, mHeight);
                }
                avoid = capture();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
                return null;
            }
            return avoid;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            mListener.onPictureSaved(bitmap);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        public SaveTask(int i, int j, OnPictureSavedListener onpicturesavedlistener)
        {
            this$0 = GPUImageView.this;
            super();
            mFolderName = null;
            mFileName = null;
            mWidth = i;
            mHeight = j;
            mListener = onpicturesavedlistener;
            mHandler = new Handler();
        }

        public SaveTask(String s, String s1, int i, int j, OnPictureSavedListener onpicturesavedlistener)
        {
            this$0 = GPUImageView.this;
            super();
            mFolderName = s;
            mFileName = s1;
            mWidth = i;
            mHeight = j;
            mListener = onpicturesavedlistener;
            mHandler = new Handler();
        }

        public SaveTask(String s, String s1, OnPictureSavedListener onpicturesavedlistener)
        {
            this(s, s1, 0, 0, onpicturesavedlistener);
        }

        private class OnPictureSavedListener
        {

            public abstract void onPictureSaved(Bitmap bitmap);
        }

    }


    private class _cls3
        implements Runnable
    {

        final GPUImageView this$0;
        final int val$height;
        final int val$pixelMirroredArray[];
        final Semaphore val$waiter;
        final int val$width;

        public void run()
        {
            IntBuffer intbuffer = IntBuffer.allocate(width * height);
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, intbuffer);
            int ai[] = intbuffer.array();
            for (int i = 0; i < height; i++)
            {
                for (int j = 0; j < width; j++)
                {
                    pixelMirroredArray[(height - i - 1) * width + j] = ai[width * i + j];
                }

            }

            waiter.release();
        }

        _cls3()
        {
            this$0 = GPUImageView.this;
            width = i;
            height = j;
            pixelMirroredArray = ai;
            waiter = semaphore;
            super();
        }
    }


    private class Size
    {

        int height;
        int width;

        public Size(int i, int j)
        {
            width = i;
            height = j;
        }
    }


    private class _cls1
        implements Runnable
    {

        final GPUImageView this$0;

        public void run()
        {
            mGLSurfaceView.requestLayout();
        }

        _cls1()
        {
            this$0 = GPUImageView.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final GPUImageView this$0;
        final Semaphore val$waiter;

        public void run()
        {
            waiter.release();
        }

        _cls2()
        {
            this$0 = GPUImageView.this;
            waiter = semaphore;
            super();
        }
    }

}
