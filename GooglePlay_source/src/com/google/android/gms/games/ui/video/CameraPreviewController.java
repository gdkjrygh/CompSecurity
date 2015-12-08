// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.WindowManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            DeviceRotationListener

public final class CameraPreviewController
{
    private class _cls6 extends android.hardware.camera2.CameraCaptureSession.StateCallback
    {

        final CameraPreviewController this$0;

        public final void onClosed(CameraCaptureSession cameracapturesession)
        {
            super.onClosed(cameracapturesession);
            mCameraCaptureSession = null;
        }

        public final void onConfigureFailed(CameraCaptureSession cameracapturesession)
        {
            GamesLog.e("CameraPreviewCtrl", "Could not configure camera preview");
            mPreviewRequestBuilder;
            if (mCallbacksHandler != null)
            {
                mCallbacksHandler.onCameraPreviewError(new RuntimeException("Could not configure camera preview"));
            }
        }

        public final void onConfigured(CameraCaptureSession cameracapturesession)
        {
            if (mCameraDevice == null)
            {
                return;
            } else
            {
                mCameraCaptureSession = cameracapturesession;
                mPreviewRequestBuilder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                tryStartPreviewSession();
                return;
            }
        }

        _cls6()
        {
            this$0 = CameraPreviewController.this;
            super();
        }
    }

    private class CameraPreviewCallbacks
    {

        public abstract void onCameraPreviewError(Exception exception);
    }

    private static final class CompareSizesByArea
        implements Comparator
    {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (Size)obj;
            obj1 = (Size)obj1;
            return Long.signum((long)((Size) (obj)).getWidth() * (long)((Size) (obj)).getHeight() - (long)((Size) (obj1)).getWidth() * (long)((Size) (obj1)).getHeight());
        }

        private CompareSizesByArea()
        {
        }

        CompareSizesByArea(byte byte0)
        {
            this();
        }
    }


    private static final CompareSizesByArea AREA_COMPARATOR = new CompareSizesByArea((byte)0);
    private static final Comparator RANGE_COMPARATOR = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (Range)obj;
            obj1 = (Range)obj1;
            return Integer.compare(((Integer)((Range) (obj)).getLower()).intValue(), ((Integer)((Range) (obj1)).getLower()).intValue());
        }

    };
    private final android.hardware.camera2.CameraDevice.StateCallback cameraStateCallback = new android.hardware.camera2.CameraDevice.StateCallback() {

        final CameraPreviewController this$0;

        public final void onDisconnected(CameraDevice cameradevice)
        {
            boolean flag = true;
        }

        public final void onError(CameraDevice cameradevice, int k)
        {
            boolean flag = true;
        }

        public final void onOpened(CameraDevice cameradevice)
        {
            mCameraDevice = cameradevice;
            boolean flag4;
            if (mCameraOpenCloseLock.availablePermits() == 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            Preconditions.checkState(flag4, "Unexpected lock state");
            mCameraOpenCloseLock.release();
            CameraPreviewController.access$600(CameraPreviewController.this);
        }

            
            {
                this$0 = CameraPreviewController.this;
                super();
            }
    };
    public CameraPreviewCallbacks mCallbacksHandler;
    CameraCaptureSession mCameraCaptureSession;
    private CameraDevice mCameraDevice;
    private final String mCameraId;
    private final CameraManager mCameraManager;
    private final Semaphore mCameraOpenCloseLock = new Semaphore(1);
    public final TextureView mCameraTexture;
    public boolean mIsCapturing;
    public boolean mIsInitialized;
    private final boolean mIsPortraitNatural;
    private final VideoHandler mOverlayHandler;
    private final int mPreferredPortraitWidth;
    private Size mPreviewBufferSize;
    private android.hardware.camera2.CaptureRequest.Builder mPreviewRequestBuilder;
    public final DeviceRotationListener mRotationListener;
    public final android.view.TextureView.SurfaceTextureListener surfaceTextureListener = new android.view.TextureView.SurfaceTextureListener() {

        final CameraPreviewController this$0;

        public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int k, int l)
        {
            openCamera(k, l);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            VideoUtils.logChatty("CameraPreviewCtrl", "Camera surface destroyed");
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int k, int l)
        {
            configureTransform(k, l);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
        }

            
            {
                this$0 = CameraPreviewController.this;
                super();
            }
    };

    public CameraPreviewController(Context context, String s, int i, TextureView textureview, VideoHandler videohandler)
    {
        boolean flag3 = true;
        boolean flag2 = true;
        super();
        int j;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkNotNull(textureview);
        Preconditions.checkState(PlatformVersion.checkVersion(21));
        mCameraId = s;
        mPreferredPortraitWidth = i;
        mCameraTexture = textureview;
        mCameraManager = (CameraManager)context.getSystemService("camera");
        s = (WindowManager)context.getSystemService("window");
        mOverlayHandler = videohandler;
        i = s.getDefaultDisplay().getRotation();
        j = context.getResources().getConfiguration().orientation;
        if (i == 0 || i == 2)
        {
            if (j == 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            mIsPortraitNatural = flag;
        } else
        {
            boolean flag1;
            if (j == 2)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            mIsPortraitNatural = flag1;
        }
        mRotationListener = new DeviceRotationListener(context, mOverlayHandler.getLooper(), new DeviceRotationListener.DeviceRotationListenerCallback() {

            final CameraPreviewController this$0;

            public final void onDeviceOrientationChanged(int k)
            {
                GamesLog.d("CameraPreviewCtrl", (new StringBuilder("Device rotation changed to ")).append(k).toString());
                configureTransform(mCameraTexture.getWidth(), mCameraTexture.getHeight());
            }

            public final void onInitialDeviceOrientationDetected(int k)
            {
                GamesLog.d("CameraPreviewCtrl", (new StringBuilder("Device rotation starting at ")).append(k).toString());
                configureTransform(mCameraTexture.getWidth(), mCameraTexture.getHeight());
            }

            
            {
                this$0 = CameraPreviewController.this;
                super();
            }
        });
    }

    private void closeCamera(boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        CameraCaptureSession cameracapturesession;
        mCameraOpenCloseLock.acquire();
        cameracapturesession = mCameraCaptureSession;
        if (cameracapturesession == null || !flag) goto _L2; else goto _L1
_L1:
        mCameraCaptureSession.abortCaptures();
_L3:
        mCameraCaptureSession.close();
_L2:
        if (mCameraDevice != null)
        {
            mCameraDevice.close();
        }
        mCameraCaptureSession = null;
        mCameraDevice = null;
        Object obj;
        if (mCameraOpenCloseLock.availablePermits() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        mCameraOpenCloseLock.release();
        return;
        obj;
        GamesLog.w("CameraPreviewCtrl", "Failed to abortCaptures", ((Throwable) (obj)));
          goto _L3
        obj;
        throw new RuntimeException("Interrupted while trying to lock camera closing.", ((Throwable) (obj)));
        obj;
        mCameraCaptureSession = null;
        mCameraDevice = null;
        if (mCameraOpenCloseLock.availablePermits() == 0)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        mCameraOpenCloseLock.release();
        throw obj;
    }

    private Range getRangeForFrameRate$128456d9()
    {
        Object obj;
        try
        {
            obj = mCameraManager.getCameraCharacteristics(mCameraId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.e("CameraPreviewCtrl", "Could not access camera", ((Throwable) (obj)));
            return null;
        }
        obj = (Range[])((CameraCharacteristics) (obj)).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            int i = 0;
            for (int j = obj.length; i < j; i++)
            {
                Range range = obj[i];
                if (range.contains(Integer.valueOf(15)) || range.contains(Integer.valueOf(15000)))
                {
                    arraylist.add(range);
                }
            }

            if (!arraylist.isEmpty())
            {
                return (Range)Collections.min(arraylist, RANGE_COMPARATOR);
            }
        }
        return null;
    }

    public final void cleanup()
    {
        VideoUtils.logChatty("CameraPreviewCtrl", "calling cleanup");
        mPreviewBufferSize = null;
        mCameraTexture.setSurfaceTextureListener(null);
        mRotationListener.disable();
        closeCamera(true);
        mIsCapturing = false;
        mIsInitialized = false;
    }

    public final void configureTransform(int i, int j)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mPreviewBufferSize == null || !mCameraTexture.isAvailable())
        {
            return;
        }
        Matrix matrix = new Matrix();
        RectF rectf1 = new RectF(0.0F, 0.0F, i, j);
        int k = mPreviewBufferSize.getHeight();
        int l = mPreviewBufferSize.getWidth();
        float f;
        float f1;
        float f2;
        RectF rectf;
        if (mIsPortraitNatural)
        {
            rectf = new RectF(0.0F, 0.0F, k, l);
        } else
        {
            rectf = new RectF(0.0F, 0.0F, l, k);
        }
        f = rectf1.centerX();
        f1 = rectf1.centerY();
        rectf.offset(f - rectf.centerX(), f1 - rectf.centerY());
        matrix.setRectToRect(rectf1, rectf, android.graphics.Matrix.ScaleToFit.FILL);
        f2 = Math.max((float)j / (float)k, (float)i / (float)l);
        matrix.postScale(f2, f2, f, f1);
        i = mRotationListener.mCurrentDeviceOrientation;
        if (i != -1 && i != 0)
        {
            matrix.postRotate(i, f, f1);
        }
        mCameraTexture.setTransform(matrix);
    }

    public final boolean initialize()
    {
        Object obj1 = null;
        if (mIsInitialized)
        {
            cleanup();
        }
        Object obj;
        try
        {
            obj = mCameraManager.getCameraCharacteristics(mCameraId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.e("CameraPreviewCtrl", "Could not access camera", ((Throwable) (obj)));
            obj = null;
        }
        if (obj == null)
        {
            GamesLog.e("CameraPreviewCtrl", "No camera characteristics available to retrieve preview size");
            obj = obj1;
        } else
        {
            StreamConfigurationMap streamconfigurationmap = (StreamConfigurationMap)((CameraCharacteristics) (obj)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamconfigurationmap == null)
            {
                GamesLog.e("CameraPreviewCtrl", "Could not get stream config map from camera");
                obj = obj1;
            } else
            {
                obj = streamconfigurationmap.getOutputSizes(256);
                Size asize[];
                if (obj == null || obj.length == 0)
                {
                    obj = null;
                } else
                {
                    obj = (Size)Collections.max(Arrays.asList(((Object []) (obj))), AREA_COMPARATOR);
                }
                asize = streamconfigurationmap.getOutputSizes(android/graphics/SurfaceTexture);
                if (asize == null)
                {
                    GamesLog.e("CameraPreviewCtrl", "Could not find any surface textures for camera");
                    obj = obj1;
                } else
                {
                    ArrayList arraylist = new ArrayList();
                    int i;
                    int j;
                    int k;
                    if (obj == null)
                    {
                        i = 0;
                    } else
                    {
                        i = ((Size) (obj)).getWidth();
                    }
                    if (obj == null)
                    {
                        j = 0;
                    } else
                    {
                        j = ((Size) (obj)).getHeight();
                    }
                    for (k = 0; k < asize.length; k++)
                    {
                        obj = asize[k];
                        int l = ((Size) (obj)).getHeight();
                        int i1 = ((Size) (obj)).getWidth();
                        if (l * i == i1 * j && Math.min(i1, l) >= mPreferredPortraitWidth)
                        {
                            arraylist.add(obj);
                        }
                    }

                    if (arraylist.isEmpty())
                    {
                        GamesLog.e("CameraPreviewCtrl", "Couldn't find any suitable preview size");
                        obj = asize[0];
                    } else
                    {
                        obj = (Size)Collections.min(arraylist, new CompareSizesByArea((byte)0));
                    }
                }
            }
        }
        mPreviewBufferSize = ((Size) (obj));
        if (mPreviewBufferSize == null)
        {
            GamesLog.e("CameraPreviewCtrl", "Failed to create a preview buffer");
            return false;
        } else
        {
            mIsInitialized = true;
            return true;
        }
    }

    public final void openCamera(int i, int j)
    {
        boolean flag1 = true;
        if (!TextUtils.isEmpty(mCameraId)) goto _L2; else goto _L1
_L1:
        GamesLog.e("CameraPreviewCtrl", "Could not find a camera");
_L7:
        return;
_L2:
        configureTransform(i, j);
        if (mCameraOpenCloseLock.tryAcquire(500L, TimeUnit.MILLISECONDS)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = new RuntimeException("Time out waiting to lock camera opening.");
        if (mCallbacksHandler != null)
        {
            mCallbacksHandler.onCameraPreviewError(((Exception) (obj)));
            return;
        }
          goto _L5
        obj;
_L10:
        boolean flag;
        GamesLog.e("CameraPreviewCtrl", "Could not open camera", ((Throwable) (obj)));
        if (mCameraOpenCloseLock.availablePermits() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        mCameraOpenCloseLock.release();
        if (mCallbacksHandler == null) goto _L7; else goto _L6
_L6:
        mCallbacksHandler.onCameraPreviewError(((Exception) (obj)));
        return;
_L5:
        throw obj;
_L4:
        if (mCameraDevice == null) goto _L9; else goto _L8
_L8:
        GamesLog.e("CameraPreviewCtrl", "Camera already opened");
        if (mCameraOpenCloseLock.availablePermits() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        mCameraOpenCloseLock.release();
        return;
_L9:
        mCameraManager.openCamera(mCameraId, cameraStateCallback, null);
        return;
        obj;
          goto _L10
        obj;
          goto _L10
    }

    public final void tryStartPreviewSession()
    {
        if (!mIsCapturing)
        {
            GamesLog.d("CameraPreviewCtrl", "Preview capture not enabled");
        } else
        {
            if (mPreviewRequestBuilder == null)
            {
                GamesLog.d("CameraPreviewCtrl", "No preview request available");
                return;
            }
            if (mCameraCaptureSession == null)
            {
                GamesLog.d("CameraPreviewCtrl", "No capture session available");
                return;
            }
            try
            {
                mCameraCaptureSession.setRepeatingRequest(mPreviewRequestBuilder.build(), null, null);
                return;
            }
            catch (CameraAccessException cameraaccessexception)
            {
                GamesLog.e("CameraPreviewCtrl", "Could not enable camera preview capture session", cameraaccessexception);
                if (mCallbacksHandler != null)
                {
                    mCallbacksHandler.onCameraPreviewError(cameraaccessexception);
                    return;
                }
            }
        }
    }









/*
    static CameraDevice access$402(CameraPreviewController camerapreviewcontroller, CameraDevice cameradevice)
    {
        camerapreviewcontroller.mCameraDevice = cameradevice;
        return cameradevice;
    }

*/



/*
    static void access$600(CameraPreviewController camerapreviewcontroller)
    {
        Object obj;
        Range range;
        obj = camerapreviewcontroller.mCameraTexture.getSurfaceTexture();
        ((SurfaceTexture) (obj)).setDefaultBufferSize(camerapreviewcontroller.mPreviewBufferSize.getWidth(), camerapreviewcontroller.mPreviewBufferSize.getHeight());
        obj = new Surface(((SurfaceTexture) (obj)));
        camerapreviewcontroller.mPreviewRequestBuilder = camerapreviewcontroller.mCameraDevice.createCaptureRequest(3);
        camerapreviewcontroller.mPreviewRequestBuilder.addTarget(((Surface) (obj)));
        range = camerapreviewcontroller.getRangeForFrameRate$128456d9();
        if (range == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        GamesLog.d("CameraPreviewCtrl", (new StringBuilder("Targeting preview frame rate of 15 in range ")).append(range).toString());
        camerapreviewcontroller.mPreviewRequestBuilder.set(CaptureRequest.SENSOR_FRAME_DURATION, Long.valueOf(0x3f940aaL));
        camerapreviewcontroller.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        camerapreviewcontroller.mCameraDevice.createCaptureSession(Collections.singletonList(obj), camerapreviewcontroller. new _cls6(), null);
_L1:
        return;
        CameraAccessException cameraaccessexception;
        cameraaccessexception;
        GamesLog.e("CameraPreviewCtrl", "Could not create capture session", cameraaccessexception);
        camerapreviewcontroller.mPreviewRequestBuilder = null;
        if (camerapreviewcontroller.mCallbacksHandler != null)
        {
            camerapreviewcontroller.mCallbacksHandler.onCameraPreviewError(cameraaccessexception);
            return;
        }
          goto _L1
    }

*/


/*
    static void access$700(CameraPreviewController camerapreviewcontroller, CameraDevice cameradevice, String s)
    {
        boolean flag = true;
        if (camerapreviewcontroller.mCameraOpenCloseLock.availablePermits() == 0)
        {
            camerapreviewcontroller.mCameraOpenCloseLock.release();
        }
        if (camerapreviewcontroller.mCameraOpenCloseLock.availablePermits() != 1)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        camerapreviewcontroller.mCameraDevice = cameradevice;
        camerapreviewcontroller.closeCamera(false);
        if (camerapreviewcontroller.mCallbacksHandler != null)
        {
            camerapreviewcontroller.mCallbacksHandler.onCameraPreviewError(new RuntimeException(s));
        }
        return;
    }

*/


/*
    static CameraCaptureSession access$802(CameraPreviewController camerapreviewcontroller, CameraCaptureSession cameracapturesession)
    {
        camerapreviewcontroller.mCameraCaptureSession = cameracapturesession;
        return cameracapturesession;
    }

*/



/*
    static android.hardware.camera2.CaptureRequest.Builder access$902$2ab079dc(CameraPreviewController camerapreviewcontroller)
    {
        camerapreviewcontroller.mPreviewRequestBuilder = null;
        return null;
    }

*/
}
