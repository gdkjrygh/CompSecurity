// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import java.io.File;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter, GPUImageRenderer, PixelBuffer, Rotation

public class GPUImage
{

    private static int __glMaxTextureSize = 0;
    private final Context mContext;
    private Bitmap mCurrentBitmap;
    private GPUImageFilter mFilter;
    private GLSurfaceView mGlSurfaceView;
    public final GPUImageRenderer mRenderer;
    private ScaleType mScaleType;

    public GPUImage(Context context)
    {
        mScaleType = ScaleType.CENTER_INSIDE;
        if (!supportsOpenGLES2(context))
        {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        } else
        {
            mContext = context;
            mFilter = new GPUImageFilter();
            mRenderer = new GPUImageRenderer(mFilter);
            return;
        }
    }

    public static void getBitmapForMultipleFilters(Bitmap bitmap, List list, ResponseListener responselistener)
    {
        if (list.isEmpty())
        {
            return;
        }
        GPUImageRenderer gpuimagerenderer = new GPUImageRenderer((GPUImageFilter)list.get(0));
        gpuimagerenderer.setImageBitmap(bitmap, false);
        bitmap = new PixelBuffer(bitmap.getWidth(), bitmap.getHeight());
        bitmap.setRenderer(gpuimagerenderer);
        GPUImageFilter gpuimagefilter;
        for (list = list.iterator(); list.hasNext(); gpuimagefilter.destroy())
        {
            gpuimagefilter = (GPUImageFilter)list.next();
            gpuimagerenderer.setFilter(gpuimagefilter);
            responselistener.response(bitmap.getBitmap());
        }

        gpuimagerenderer.deleteImage();
        bitmap.destroy();
    }

    public static int getGlMaxTextureSize()
    {
        if (__glMaxTextureSize <= 0)
        {
            int ai[] = new int[1];
            GLES20.glGetIntegerv(3379, ai, 0);
            __glMaxTextureSize = ai[0];
        }
        return __glMaxTextureSize;
    }

    private int getOutputHeight()
    {
        if (mRenderer != null && mRenderer.getFrameHeight() != 0)
        {
            return mRenderer.getFrameHeight();
        }
        if (mCurrentBitmap != null)
        {
            return mCurrentBitmap.getHeight();
        } else
        {
            return ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getHeight();
        }
    }

    private int getOutputWidth()
    {
        if (mRenderer != null && mRenderer.getFrameWidth() != 0)
        {
            return mRenderer.getFrameWidth();
        }
        if (mCurrentBitmap != null)
        {
            return mCurrentBitmap.getWidth();
        } else
        {
            return ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getWidth();
        }
    }

    private String getPath(Uri uri)
    {
        Object obj = null;
        Cursor cursor = mContext.getContentResolver().query(uri, new String[] {
            "_data"
        }, null, null, null);
        int i = cursor.getColumnIndexOrThrow("_data");
        uri = obj;
        if (cursor.moveToFirst())
        {
            uri = cursor.getString(i);
        }
        cursor.close();
        return uri;
    }

    private void setUpCameraGingerbread(Camera camera)
    {
        mRenderer.setUpSurfaceTexture(camera);
    }

    private boolean supportsOpenGLES2(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000;
    }

    public void clearDrawQueue()
    {
        if (mRenderer != null)
        {
            mRenderer.getDrawQueue().clear();
        }
    }

    public void closeBlendMode()
    {
        mRenderer.closeBlendMode();
    }

    public void deleteBufferDirectly()
    {
        mRenderer.deleteBufferDirectly();
    }

    public void deleteCameraImage()
    {
        if (mRenderer != null)
        {
            mRenderer.deleteCameraImage();
        }
    }

    public void deleteFilter()
    {
        mRenderer.runOnDraw(new _cls4());
        GPUImageFilter gpuimagefilter = mFilter;
        gpuimagefilter;
        JVM INSTR monitorenter ;
        requestRender();
        mFilter.wait(3000L);
_L1:
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        gpuimagefilter;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void deleteImage()
    {
        mRenderer.deleteImage();
        mCurrentBitmap = null;
    }

    public Bitmap getBitmapWithFilterApplied()
    {
        return getBitmapWithFilterApplied(mCurrentBitmap);
    }

    public Bitmap getBitmapWithFilterApplied(Bitmap bitmap)
    {
        if (mGlSurfaceView == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        mRenderer.deleteImage();
        mRenderer.runOnDraw(new _cls3());
        Object obj = mFilter;
        obj;
        JVM INSTR monitorenter ;
        requestRender();
        mFilter.wait();
_L4:
        GPUImageRenderer gpuimagerenderer;
        gpuimagerenderer = new GPUImageRenderer(mFilter);
        gpuimagerenderer.setRotation(Rotation.NORMAL, mRenderer.isFlippedHorizontally(), mRenderer.isFlippedVertically());
        gpuimagerenderer.setScaleType(mScaleType);
        gpuimagerenderer.mSave = true;
        obj = new PixelBuffer(bitmap.getWidth(), bitmap.getHeight());
_L2:
        ((PixelBuffer) (obj)).setRenderer(gpuimagerenderer);
        gpuimagerenderer.setImageBitmap(bitmap, true);
        bitmap = ((PixelBuffer) (obj)).getBitmap();
        mFilter.destroy();
        gpuimagerenderer.deleteImage();
        ((PixelBuffer) (obj)).destroy();
        mRenderer.setFilter(mFilter);
        if (mCurrentBitmap != null && !mCurrentBitmap.isRecycled())
        {
            mRenderer.setImageBitmap(mCurrentBitmap, false);
        }
        requestRender();
        return bitmap;
        InterruptedException interruptedexception;
        interruptedexception;
        interruptedexception.printStackTrace();
        continue; /* Loop/switch isn't completed */
        bitmap;
        obj;
        JVM INSTR monitorexit ;
        throw bitmap;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        illegalargumentexception.printStackTrace();
        illegalargumentexception = new PixelBuffer(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        bitmap.printStackTrace();
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Bitmap getBitmapWithFilterApplied2(final Bitmap pixelMirroredArray)
    {
        Object obj;
        GPUImageRenderer gpuimagerenderer;
        final Semaphore waiter;
        final int width;
        final int height;
        try
        {
            obj = new PixelBuffer(pixelMirroredArray.getWidth(), pixelMirroredArray.getHeight());
        }
        // Misplaced declaration of an exception variable
        catch (final Bitmap pixelMirroredArray)
        {
            return null;
        }
        gpuimagerenderer = new GPUImageRenderer(mFilter);
        gpuimagerenderer.setRotation(Rotation.NORMAL, mRenderer.isFlippedHorizontally(), mRenderer.isFlippedVertically());
        gpuimagerenderer.setScaleType(mScaleType);
        gpuimagerenderer.mSave = true;
        width = pixelMirroredArray.getWidth();
        height = pixelMirroredArray.getHeight();
        ((PixelBuffer) (obj)).setRenderer(gpuimagerenderer);
        gpuimagerenderer.setImageBitmap(pixelMirroredArray, true);
        waiter = new Semaphore(0);
        gpuimagerenderer.runOnDrawEnd(new _cls1());
        gpuimagerenderer.deleteImageEnd();
        pixelMirroredArray = new int[width * height];
        gpuimagerenderer.runOnDrawEnd(new _cls2());
        gpuimagerenderer.onDrawFrame(((PixelBuffer) (obj)).mGL);
        try
        {
            waiter.acquire();
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        obj = Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        ((Bitmap) (obj)).copyPixelsFromBuffer(IntBuffer.wrap(pixelMirroredArray));
        return ((Bitmap) (obj));
    }

    public void openBlendMode()
    {
        mRenderer.openBlendMode();
    }

    public void pause()
    {
        if (mRenderer != null)
        {
            mRenderer.mPause = true;
        }
    }

    public void requestRender()
    {
        if (mGlSurfaceView != null)
        {
            mGlSurfaceView.requestRender();
        }
    }

    public void resume()
    {
        if (mRenderer != null)
        {
            mRenderer.mPause = false;
        }
    }

    public void runOnGLThread(Runnable runnable)
    {
        mRenderer.runOnDrawEnd(runnable);
    }

    public void saveToPictures(Bitmap bitmap, String s, String s1, OnPictureSavedListener onpicturesavedlistener)
    {
        (new SaveTask(bitmap, s, s1, onpicturesavedlistener)).execute(new Void[0]);
    }

    public void saveToPictures(String s, String s1, OnPictureSavedListener onpicturesavedlistener)
    {
        saveToPictures(mCurrentBitmap, s, s1, onpicturesavedlistener);
    }

    public void setDrawEndListener(GPUImageRenderer.OnDrawEndListener ondrawendlistener)
    {
        mRenderer.setDrawEndListener(ondrawendlistener);
    }

    public void setDrawListener(GPUImageRenderer.OnDrawDoneListener ondrawdonelistener)
    {
        mRenderer.setDrawListener(ondrawdonelistener);
    }

    public void setFilter(GPUImageFilter gpuimagefilter)
    {
        mFilter = gpuimagefilter;
        mRenderer.setFilter(mFilter);
    }

    public void setGLSurfaceView(GLSurfaceView glsurfaceview)
    {
        mGlSurfaceView = glsurfaceview;
        mGlSurfaceView.setEGLContextClientVersion(2);
        mGlSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        mGlSurfaceView.getHolder().setFormat(1);
        mGlSurfaceView.setRenderer(mRenderer);
        mGlSurfaceView.setRenderMode(0);
    }

    public void setImage(Bitmap bitmap)
    {
        mCurrentBitmap = bitmap;
        mRenderer.setImageBitmap(bitmap, true);
        requestRender();
    }

    public void setImage(Bitmap bitmap, boolean flag)
    {
        mCurrentBitmap = bitmap;
        mRenderer.setImageBitmap(bitmap, flag);
        requestRender();
    }

    public void setImage(Uri uri)
    {
        (new Thread(new LoadImageUriTask(this, uri))).start();
    }

    public void setImage(File file, OnImageLoadDoneListener onimageloaddonelistener)
    {
        (new Thread(new LoadImageFileTask(this, file, onimageloaddonelistener))).start();
    }

    public void setRotation(Rotation rotation)
    {
        mRenderer.setRotation(rotation);
    }

    public void setRotationCamera(Rotation rotation, boolean flag, boolean flag1)
    {
        mRenderer.setRotationCamera(rotation, flag, flag1);
    }

    public void setScaleType(ScaleType scaletype)
    {
        mScaleType = scaletype;
        mRenderer.setScaleType(scaletype);
        mRenderer.deleteImage();
        mCurrentBitmap = null;
        requestRender();
    }

    public void setUpCamera(Camera camera)
    {
        setUpCamera(camera, 0, false, false);
    }

    public void setUpCamera(Camera camera, int i, boolean flag, boolean flag1)
    {
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            setUpCameraGingerbread(camera);
        } else
        {
            camera.setPreviewCallback(mRenderer);
            camera.startPreview();
        }
        camera = Rotation.NORMAL;
        i;
        JVM INSTR lookupswitch 3: default 52
    //                   90: 79
    //                   180: 86
    //                   270: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        mRenderer.setRotationCamera(camera, flag, flag1);
        return;
_L2:
        camera = Rotation.ROTATION_90;
        continue; /* Loop/switch isn't completed */
_L3:
        camera = Rotation.ROTATION_180;
        continue; /* Loop/switch isn't completed */
_L4:
        camera = Rotation.ROTATION_270;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void startRender()
    {
        mGlSurfaceView.setRenderMode(1);
    }

    public void stopRender()
    {
        mGlSurfaceView.setRenderMode(0);
    }







    private class ScaleType extends Enum
    {

        private static final ScaleType $VALUES[];
        public static final ScaleType CENTER_CROP;
        public static final ScaleType CENTER_INSIDE;

        public static ScaleType valueOf(String s)
        {
            return (ScaleType)Enum.valueOf(jp/co/cyberagent/android/gpuimage/GPUImage$ScaleType, s);
        }

        public static ScaleType[] values()
        {
            return (ScaleType[])$VALUES.clone();
        }

        static 
        {
            CENTER_INSIDE = new ScaleType("CENTER_INSIDE", 0);
            CENTER_CROP = new ScaleType("CENTER_CROP", 1);
            $VALUES = (new ScaleType[] {
                CENTER_INSIDE, CENTER_CROP
            });
        }

        private ScaleType(String s, int i)
        {
            super(s, i);
        }
    }


    private class ResponseListener
    {

        public abstract void response(Object obj);
    }


    private class _cls4
        implements Runnable
    {

        final GPUImage this$0;

        public void run()
        {
            synchronized (mFilter)
            {
                mFilter.destroy();
                mFilter.notify();
            }
            return;
            exception;
            gpuimagefilter;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls4()
        {
            this$0 = GPUImage.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final GPUImage this$0;

        public void run()
        {
            synchronized (mFilter)
            {
                mFilter.destroy();
                mFilter.notify();
            }
            return;
            exception;
            gpuimagefilter;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls3()
        {
            this$0 = GPUImage.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final GPUImage this$0;

        public void run()
        {
            synchronized (mFilter)
            {
                mFilter.destroy();
            }
            return;
            exception;
            gpuimagefilter;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls1()
        {
            this$0 = GPUImage.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final GPUImage this$0;
        final int val$height;
        final int val$pixelMirroredArray[];
        final Semaphore val$waiter;
        final int val$width;

        public void run()
        {
            Log.i("SkinFragment", "glReadPixels 00");
            IntBuffer intbuffer = IntBuffer.allocate(width * height);
            Log.i("SkinFragment", "glReadPixels 01");
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, intbuffer);
            int ai[] = intbuffer.array();
            for (int i = 0; i < height; i++)
            {
                for (int j = 0; j < width; j++)
                {
                    pixelMirroredArray[(height - i - 1) * width + j] = ai[width * i + j];
                }

            }

            Log.i("SkinFragment", "glReadPixels 02");
            waiter.release();
        }

        _cls2()
        {
            this$0 = GPUImage.this;
            width = i;
            height = j;
            pixelMirroredArray = ai;
            waiter = semaphore;
            super();
        }
    }


    private class SaveTask extends c
    {

        private final Bitmap mBitmap;
        private final String mFileName;
        private final String mFolderName;
        private final Handler mHandler = new Handler();
        private final OnPictureSavedListener mListener;
        final GPUImage this$0;

        private void saveImage(String s, String s1, Bitmap bitmap)
        {
            s1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), (new StringBuilder()).append(s).append("/").append(s1).toString());
            try
            {
                s1.getParentFile().mkdirs();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(s1));
                s = mContext;
                s1 = s1.toString();
                class _cls1
                    implements android.media.MediaScannerConnection.OnScanCompletedListener
                {

                    final SaveTask this$1;

                    public void onScanCompleted(String s2, final Uri uri)
                    {
                        class _cls1
                            implements Runnable
                        {

                            final _cls1 this$2;
                            final Uri val$uri;

                            public void run()
                            {
                                mListener.onPictureSaved(uri);
                            }

                                _cls1()
                                {
                                    this$2 = _cls1.this;
                                    uri = uri1;
                                    super();
                                }

                            private class OnPictureSavedListener
                            {

                                public abstract void onPictureSaved(Uri uri1);
                            }

                        }

                        if (mListener != null)
                        {
                            mHandler.post(new _cls1());
                        }
                    }

                _cls1()
                {
                    this$1 = SaveTask.this;
                    super();
                }
                }

                bitmap = new _cls1();
                MediaScannerConnection.scanFile(s, new String[] {
                    s1
                }, null, bitmap);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            avoid = getBitmapWithFilterApplied(mBitmap);
            saveImage(mFolderName, mFileName, avoid);
            return null;
        }



        public SaveTask(Bitmap bitmap, String s, String s1, OnPictureSavedListener onpicturesavedlistener)
        {
            this$0 = GPUImage.this;
            super();
            mBitmap = bitmap;
            mFolderName = s;
            mFileName = s1;
            mListener = onpicturesavedlistener;
        }
    }


    private class LoadImageUriTask extends LoadImageTask
    {
        private class LoadImageTask
            implements Runnable
        {

            private final GPUImage mGPUImage;
            private int mOutputHeight;
            private int mOutputWidth;
            private final OnImageLoadDoneListener mlistener;
            final GPUImage this$0;

            private boolean checkSize(boolean flag, boolean flag1)
            {
                if (mScaleType != ScaleType.CENTER_CROP) goto _L2; else goto _L1
_L1:
                if (!flag || !flag1) goto _L4; else goto _L3
_L3:
                return true;
_L4:
                return false;
_L2:
                if (!flag && !flag1)
                {
                    return false;
                }
                if (true) goto _L3; else goto _L5
_L5:
            }

            private int[] getScaleSize(int i, int j)
            {
                float f = (float)i / (float)mOutputWidth;
                float f1 = (float)j / (float)mOutputHeight;
                boolean flag;
                if (mScaleType == ScaleType.CENTER_CROP)
                {
                    if (f > f1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (f < f1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    f = mOutputHeight;
                    f1 = (f / (float)j) * (float)i;
                } else
                {
                    f1 = mOutputWidth;
                    f = (f1 / (float)i) * (float)j;
                }
                return (new int[] {
                    Math.round(f1), Math.round(f)
                });
            }

            private Bitmap loadResizedImage()
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                decode(options);
                int i = 1;
                do
                {
                    boolean flag;
                    boolean flag1;
                    if (options.outWidth / i > mOutputWidth)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (options.outHeight / i > mOutputHeight)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (checkSize(flag, flag1))
                    {
                        i++;
                    } else
                    {
                        int j = i - 1;
                        i = j;
                        if (j <= 0)
                        {
                            i = 1;
                        }
                        Object obj = new android.graphics.BitmapFactory.Options();
                        obj.inSampleSize = i;
                        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                        obj.inPurgeable = true;
                        obj.inTempStorage = new byte[32768];
                        obj = decode(((android.graphics.BitmapFactory.Options) (obj)));
                        if (obj == null)
                        {
                            return null;
                        } else
                        {
                            return rotateImage(((Bitmap) (obj)));
                        }
                    }
                } while (true);
            }

            private Bitmap rotateImage(Bitmap bitmap)
            {
                if (bitmap != null) goto _L2; else goto _L1
_L1:
                Object obj = null;
_L4:
                return ((Bitmap) (obj));
_L2:
                int i = getImageOrientation();
                obj = bitmap;
                if (i == 0) goto _L4; else goto _L3
_L3:
                obj = new Matrix();
                ((Matrix) (obj)).postRotate(i);
                obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
                bitmap.recycle();
                return ((Bitmap) (obj));
                obj;
_L6:
                ((IOException) (obj)).printStackTrace();
                return bitmap;
                IOException ioexception;
                ioexception;
                bitmap = ((Bitmap) (obj));
                obj = ioexception;
                if (true) goto _L6; else goto _L5
_L5:
            }

            private Bitmap scaleBitmap(Bitmap bitmap)
            {
                int ai[] = getScaleSize(bitmap.getWidth(), bitmap.getHeight());
                Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap, ai[0], ai[1], true);
                Bitmap bitmap1 = bitmap;
                if (bitmap2 != bitmap)
                {
                    bitmap.recycle();
                    bitmap1 = bitmap2;
                    System.gc();
                }
                bitmap = bitmap1;
                if (mScaleType == ScaleType.CENTER_CROP)
                {
                    int i = ai[0] - mOutputWidth;
                    int j = ai[1] - mOutputHeight;
                    Bitmap bitmap3 = Bitmap.createBitmap(bitmap1, i / 2, j / 2, ai[0] - i, ai[1] - j);
                    bitmap = bitmap1;
                    if (bitmap3 != bitmap1)
                    {
                        bitmap1.recycle();
                        bitmap = bitmap3;
                    }
                }
                return bitmap;
            }

            protected abstract Bitmap decode(android.graphics.BitmapFactory.Options options);

            protected abstract int getImageOrientation();

            public void run()
            {
                if (mRenderer == null || mRenderer.getFrameWidth() != 0)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
                synchronized (mRenderer.mSurfaceChangedWaiter)
                {
                    mRenderer.mSurfaceChangedWaiter.wait(3000L);
                }
_L6:
                mOutputWidth = getOutputWidth();
                mOutputHeight = getOutputHeight();
                obj = loadResizedImage();
                if (obj != null) goto _L2; else goto _L1
_L1:
                if (mlistener != null)
                {
                    mlistener.onImageLoadDone(new IllegalArgumentException("The image should not be null"), -1, -1);
                }
_L3:
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((InterruptedException) (obj)).printStackTrace();
                }
                continue; /* Loop/switch isn't completed */
_L2:
                mGPUImage.setImage(((Bitmap) (obj)));
                if (mlistener != null)
                {
                    mlistener.onImageLoadDone(null, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
                    return;
                }
                  goto _L3
                OutOfMemoryError outofmemoryerror;
                outofmemoryerror;
                outofmemoryerror.printStackTrace();
                if (mlistener == null) goto _L3; else goto _L4
_L4:
                mlistener.onImageLoadDone(outofmemoryerror, -1, -1);
                return;
                if (true) goto _L6; else goto _L5
_L5:
            }

            public LoadImageTask(GPUImage gpuimage1, OnImageLoadDoneListener onimageloaddonelistener)
            {
                this$0 = GPUImage.this;
                super();
                mGPUImage = gpuimage1;
                mlistener = onimageloaddonelistener;
            }

            private class OnImageLoadDoneListener
            {

                public abstract void onImageLoadDone(Throwable throwable, int i, int j);
            }

        }


        private final Uri mUri;
        final GPUImage this$0;

        protected Bitmap decode(android.graphics.BitmapFactory.Options options)
        {
            try
            {
                java.io.InputStream inputstream;
                if (mUri.getScheme().startsWith("http") || mUri.getScheme().startsWith("https"))
                {
                    inputstream = (new URL(mUri.toString())).openStream();
                } else
                {
                    inputstream = mContext.getContentResolver().openInputStream(mUri);
                }
                return BitmapFactory.decodeStream(inputstream, null, options);
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options)
            {
                options.printStackTrace();
            }
            return null;
        }

        protected int getImageOrientation()
        {
            Cursor cursor = mContext.getContentResolver().query(mUri, new String[] {
                "orientation"
            }, null, null, null);
            if (cursor == null || cursor.getCount() != 1)
            {
                return 0;
            } else
            {
                cursor.moveToFirst();
                int i = cursor.getInt(0);
                cursor.close();
                return i;
            }
        }

        public LoadImageUriTask(GPUImage gpuimage1, Uri uri)
        {
            this$0 = GPUImage.this;
            super(gpuimage1, null);
            mUri = uri;
        }
    }


    private class LoadImageFileTask extends LoadImageTask
    {

        private final File mImageFile;
        final GPUImage this$0;

        protected Bitmap decode(android.graphics.BitmapFactory.Options options)
        {
            Bitmap bitmap;
            bitmap = BitmapFactory.decodeFile(mImageFile.getAbsolutePath(), options);
            options = bitmap;
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            FileInputStream fileinputstream = new FileInputStream(mImageFile);
            Object obj;
            obj = bitmap;
            options = fileinputstream;
            if (!FileType.getTypeByStream(fileinputstream).equals("gif"))
            {
                break MISSING_BLOCK_LABEL_68;
            }
            options = fileinputstream;
            obj = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
            options = fileinputstream;
            bitmap.recycle();
            FileNotFoundException filenotfoundexception;
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options)
            {
                return ((Bitmap) (obj));
            }
            options = ((android.graphics.BitmapFactory.Options) (obj));
            return options;
            filenotfoundexception;
            obj = null;
_L4:
            options = ((android.graphics.BitmapFactory.Options) (obj));
            filenotfoundexception.printStackTrace();
            options = bitmap;
            if (obj != null)
            {
                try
                {
                    ((FileInputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (android.graphics.BitmapFactory.Options options)
                {
                    return bitmap;
                }
                return bitmap;
            } else
            {
                break MISSING_BLOCK_LABEL_75;
            }
            obj;
            options = null;
_L2:
            if (options != null)
            {
                try
                {
                    options.close();
                }
                // Misplaced declaration of an exception variable
                catch (android.graphics.BitmapFactory.Options options) { }
            }
            throw obj;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
            filenotfoundexception;
            obj = fileinputstream;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected int getImageOrientation()
        {
            switch ((new ExifInterface(mImageFile.getAbsolutePath())).getAttributeInt("Orientation", 1))
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 5: // '\005'
            case 7: // '\007'
            default:
                return 0;

            case 6: // '\006'
                return 90;

            case 3: // '\003'
                return 180;

            case 8: // '\b'
                return 270;
            }
        }

        public LoadImageFileTask(GPUImage gpuimage1, File file, OnImageLoadDoneListener onimageloaddonelistener)
        {
            this$0 = GPUImage.this;
            super(gpuimage1, onimageloaddonelistener);
            mImageFile = file;
        }
    }

}
