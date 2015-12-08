// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.crashlytics.android.Crashlytics;
import com.lyft.scoop.Scoop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.controls.CameraToolbar;
import me.lyft.android.controls.FlashButton;
import me.lyft.android.controls.PreviewFrameLayout;
import me.lyft.android.controls.PreviewSurfaceView;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.logging.L;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.NextOrErrorAction0;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.utils.CameraExtensions;
import me.lyft.android.utils.FileUtils;
import me.lyft.android.utils.ViewCompat;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class CaptureView extends FrameLayout
    implements android.view.SurfaceHolder.Callback
{

    public static final int ATTRIBUTE_CAMERA_BACK = 0;
    public static final int ATTRIBUTE_CAMERA_FRONT = 1;
    public static final int ATTRIBUTE_ORIENTATION_LANDSCAPE = 1;
    public static final int ATTRIBUTE_ORIENTATION_PORTRAIT = 0;
    private static final int CAMERA_NOT_FOUND = -1;
    public static final String FOCUS_MODE_CONTINUOUS_PICTURE = "continuous-picture";
    private static final int FOCUS_STATE_COMPLETE = 3;
    private static final int FOCUS_STATE_FOCUSING = 1;
    private static final int FOCUS_STATE_FOCUSING_SNAP_ON_FINISH = 2;
    private static final int FOCUS_STATE_IDLE = 0;
    public static final int ORIENTATION_HYSTERESIS = 5;
    public static final String TEMP_FILE_NAME = "camera_capture.jpg";
    ActivityController activityController;
    IAppForegroundDetector appForegroundDetector;
    private android.hardware.Camera.AutoFocusCallback autoFocusCallback = new android.hardware.Camera.AutoFocusCallback() {

        final CaptureView this$0;

        public void onAutoFocus(boolean flag1, Camera camera1)
        {
            if (focusState == 2)
            {
                takePicture();
            }
            focusState = 3;
        }

            
            {
                this$0 = CaptureView.this;
                super();
            }
    };
    private Binder binder;
    MessageBus bus;
    protected Camera camera;
    View captureButton;
    ICaptureImageSession captureImageSession;
    IDevice device;
    DialogFlow dialogFlow;
    private int displayRotation;
    FlashButton flashButton;
    View flashButtonFrame;
    protected String flashMode;
    private int focusState;
    private Action1 onCameraLockedDialogResult = new Action1() {

        final CaptureView this$0;

        public volatile void call(Object obj)
        {
            call((DialogResult)obj);
        }

        public void call(DialogResult dialogresult)
        {
            captureImageSession.cancel();
        }

            
            {
                this$0 = CaptureView.this;
                super();
            }
    };
    private android.view.View.OnTouchListener onCaptureButtonTouched = new android.view.View.OnTouchListener() {

        final CaptureView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getActionMasked() == 0 && hasAutoFocus() && (focusState == 0 || focusState == 3))
            {
                safeAutoFocus();
                focusState = 1;
            }
            return false;
        }

            
            {
                this$0 = CaptureView.this;
                super();
            }
    };
    private final int orientation;
    private ScreenOrientationEventListener orientationListener;
    PreviewFrameLayout previewFrame;
    protected android.hardware.Camera.Size previewSize;
    protected SurfaceHolder previewSurfaceHolder;
    PreviewSurfaceView previewSurfaceView;
    protected boolean previewing;
    private int screenOrientation;
    protected int selectedCamera;
    View switchCameraButton;
    private android.hardware.Camera.PictureCallback takePictureCallback = new android.hardware.Camera.PictureCallback() {

        final CaptureView this$0;

        public void onPictureTaken(byte abyte0[], Camera camera1)
        {
            processImage(abyte0).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).doOnEach(new NextOrErrorAction0() {

                final _cls10 this$1;

                public void call()
                {
                    startPreview();
                    takePictureInProgress = false;
                    setControlsEnabled(true);
                }

            
            {
                this$1 = _cls10.this;
                super();
            }
            }).subscribe(new SecureObserver() {

                final _cls10 this$1;

                public void onSafeError(Throwable throwable)
                {
                    super.onSafeError(throwable);
                    showPhotoCaptureFailedDialog();
                }

                public void onSafeNext(File file)
                {
                    super.onSafeNext(file);
                    captureImageSession.onImageCaptured(file);
                }

                public volatile void onSafeNext(Object obj)
                {
                    onSafeNext((File)obj);
                }

            
            {
                this$1 = _cls10.this;
                super();
            }
            });
        }

            
            {
                this$0 = CaptureView.this;
                super();
            }
    };
    private boolean takePictureInProgress;
    CameraToolbar toolbar;

    public CaptureView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CaptureView(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        super(context, attributeset, i);
        flashMode = "auto";
        focusState = 0;
        Scoop.a(this).b(this);
        context = context.getTheme().obtainStyledAttributes(attributeset, me.lyft.android.R.styleable.CaptureView, i, 0);
        int j = context.getInt(0, 0);
        orientation = context.getInt(1, 0);
        context.recycle();
        i = ((flag) ? 1 : 0);
        if (j == 1)
        {
            i = ((flag) ? 1 : 0);
            if (hasFrontCamera())
            {
                i = 1;
            }
        }
        selectedCamera = i;
        if (orientation == 0)
        {
            i = 0x7f03001f;
        } else
        {
            i = 0x7f03001e;
        }
        Scoop.a(this).a(getContext()).inflate(i, this, true);
        orientationListener = new ScreenOrientationEventListener(getContext());
    }

    private void checkFlashButtonAvailability()
    {
        if (selectedCamera == 1 || !device.hasCameraFlash())
        {
            flashButton.setEnabled(false);
            flashButtonFrame.setEnabled(false);
            return;
        } else
        {
            flashButton.setEnabled(true);
            flashButtonFrame.setEnabled(true);
            return;
        }
    }

    private void disableKeepScreenOn()
    {
        activityController.getActivity().getWindow().clearFlags(0x600480);
    }

    private void disableViewState()
    {
        stopPreview();
        previewSurfaceView.getHolder().removeCallback(this);
        disableKeepScreenOn();
        orientationListener.disable();
        releaseCamera();
    }

    private void enableKeepScreenOn()
    {
        activityController.getActivity().getWindow().addFlags(0x600480);
    }

    private int getCameraInfoOrientation(int i)
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i, camerainfo);
        return camerainfo.orientation;
    }

    private int getDisplayOrientation(int i, int j)
    {
        j = getCameraInfoOrientation(j);
        if (isFrontCamera())
        {
            return (360 - (j + i) % 360) % 360;
        } else
        {
            return ((j - i) + 360) % 360;
        }
    }

    private android.hardware.Camera.Size getOptimalPreviewSize(List list, int i, int j)
    {
        double d1 = (double)i / (double)j;
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((android.hardware.Camera.Size) (obj1));
_L2:
        Object obj = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj1 = (android.hardware.Camera.Size)iterator.next();
            if (Math.abs((double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height - d1) <= 0.10000000000000001D && (double)Math.abs(((android.hardware.Camera.Size) (obj1)).height - j) < d)
            {
                d = Math.abs(((android.hardware.Camera.Size) (obj1)).height - j);
                obj = obj1;
            }
        } while (true);
        obj1 = obj;
        if (obj != null)
        {
            continue;
        }
        d = 1.7976931348623157E+308D;
        iterator = list.iterator();
        do
        {
            obj1 = obj;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (android.hardware.Camera.Size)iterator.next();
            if ((double)Math.abs(((android.hardware.Camera.Size) (list)).height - j) < d)
            {
                d = Math.abs(((android.hardware.Camera.Size) (list)).height - j);
            } else
            {
                list = ((List) (obj));
            }
            obj = list;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getOutputPhotoRotation(int i)
    {
        int j = getCameraInfoOrientation(selectedCamera);
        if (isFrontCamera())
        {
            return ((j - i) + 360) % 360;
        } else
        {
            return (j + i) % 360;
        }
    }

    private boolean hasAutoFocus()
    {
        return !isFrontCamera() && getContext().getPackageManager().hasSystemFeature("android.hardware.camera.autofocus");
    }

    private boolean hasFrontCamera()
    {
        return Camera.getNumberOfCameras() > 1;
    }

    private void initCameraIfNeeded()
    {
        if (camera != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        camera = openCamera();
        setFlashMode();
        setCameraPreviewSize();
        setFocusMode();
        setDisplayOrientation();
        updateOutputRotation();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Crashlytics.a(runtimeexception);
        if (runtimeexception.getMessage().equalsIgnoreCase("Fail to connect to camera service"))
        {
            showCameraLockedError();
            return;
        } else
        {
            throw runtimeexception;
        }
    }

    private boolean isFrontCamera()
    {
        return selectedCamera == 1;
    }

    private boolean isOrientationChanged(int i, int j)
    {
        if (j != -1)
        {
            if (Math.min(i = Math.abs(i - j), 360 - i) < 50)
            {
                return false;
            }
        }
        return true;
    }

    private boolean isPortrait()
    {
        return orientation == 0;
    }

    private void onCaptureButtonClicked()
    {
        if (!takePictureInProgress)
        {
            if (!hasAutoFocus() || focusState == 3)
            {
                takePicture();
            } else
            {
                if (focusState == 1)
                {
                    focusState = 2;
                    return;
                }
                if (focusState == 0)
                {
                    safeAutoFocus();
                    focusState = 2;
                    return;
                }
            }
        }
    }

    private void onPause()
    {
        disableViewState();
    }

    private void onResume()
    {
        takePictureInProgress = false;
        focusState = 0;
        orientationListener.enable();
        enableKeepScreenOn();
        previewSurfaceView.getHolder().addCallback(this);
        startPreview();
    }

    private Camera openCamera()
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        int j = -1;
        for (int i = 0; i < Camera.getNumberOfCameras(); i++)
        {
            Camera.getCameraInfo(i, camerainfo);
            if (camerainfo.facing == selectedCamera)
            {
                j = i;
            }
        }

        openCamera(j);
        return camera;
    }

    private void openCamera(int i)
    {
        if (i > -1)
        {
            camera = Camera.open(i);
            return;
        } else
        {
            camera = Camera.open();
            selectedCamera = 0;
            return;
        }
    }

    private Observable processImage(final byte data[])
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final CaptureView this$0;
            final byte val$data[];

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                FileOutputStream fileoutputstream = null;
                FileOutputStream fileoutputstream1;
                File file;
                file = FileUtils.getTemporaryFile(getContext(), "camera_capture.jpg");
                fileoutputstream1 = new FileOutputStream(file);
                fileoutputstream = fileoutputstream1;
                fileoutputstream1.write(data);
                fileoutputstream = fileoutputstream1;
                subscriber.onNext(file);
                fileoutputstream = fileoutputstream1;
                subscriber.onCompleted();
                Closeables.closeQuietly(fileoutputstream1);
                return;
                Throwable throwable;
                throwable;
                fileoutputstream1 = null;
_L4:
                fileoutputstream = fileoutputstream1;
                subscriber.onError(throwable);
                Closeables.closeQuietly(fileoutputstream1);
                return;
                subscriber;
_L2:
                Closeables.closeQuietly(fileoutputstream);
                throw subscriber;
                subscriber;
                if (true) goto _L2; else goto _L1
_L1:
                throwable;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = CaptureView.this;
                data = abyte0;
                super();
            }
        });
    }

    private void releaseCamera()
    {
        if (camera != null)
        {
            camera.release();
            camera = null;
            previewing = false;
        }
    }

    private static int roundOrientation(int i)
    {
        return (((i + 45) / 90) * 90) % 360;
    }

    private void safeAutoFocus()
    {
        try
        {
            camera.autoFocus(autoFocusCallback);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            takePicture();
            L.e(runtimeexception, "safeAutoFocus exception caught", new Object[0]);
            return;
        }
    }

    private void setCameraPreviewSize()
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        android.hardware.Camera.Size size = CameraExtensions.getBestPictureSize(parameters);
        parameters.setPictureSize(size.width, size.height);
        if (isPortrait())
        {
            previewFrame.setAspectRatio((double)size.height / (double)size.width);
        } else
        {
            previewFrame.setAspectRatio((double)size.width / (double)size.height);
        }
        previewSize = getOptimalPreviewSize(parameters.getSupportedPreviewSizes(), size.width, size.height);
        parameters.setPreviewSize(previewSize.width, previewSize.height);
        camera.setParameters(parameters);
    }

    private void setControlsEnabled(boolean flag)
    {
        if (flag)
        {
            toolbar.enableHomeButton();
        } else
        {
            toolbar.disableHomeButton();
        }
        if (flashButton != null)
        {
            flashButton.setEnabled(flag);
            flashButtonFrame.setEnabled(flag);
        }
        if (switchCameraButton != null)
        {
            switchCameraButton.setEnabled(flag);
        }
    }

    private void setDisplayOrientation()
    {
        displayRotation = device.getDisplayRotation();
        int i = getDisplayOrientation(displayRotation, selectedCamera);
        if (camera != null)
        {
            camera.setDisplayOrientation(i);
        }
    }

    private void setFlashMode()
    {
        if (!isFrontCamera() && device.hasCameraFlash())
        {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(flashMode);
            camera.setParameters(parameters);
        }
    }

    private void setFlashModeButtonBackground(String s)
    {
        flashButton.setFlashMode(s);
    }

    private void setFocusMode()
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (!parameters.getSupportedFocusModes().contains("continuous-picture") || device.isModel("GT-I9500")) goto _L2; else goto _L1
_L1:
        parameters.setFocusMode("continuous-picture");
_L4:
        camera.setParameters(parameters);
        return;
_L2:
        if (parameters.getSupportedFocusModes().contains("auto"))
        {
            parameters.setFocusMode("auto");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setOutputRotation(int i)
    {
        if (camera != null)
        {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(i);
            camera.setParameters(parameters);
        }
    }

    private void setPreviewDisplay(SurfaceHolder surfaceholder)
    {
        if (surfaceholder == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        camera.setPreviewDisplay(surfaceholder);
        return;
        surfaceholder;
        releaseCamera();
        throw new RuntimeException("setPreviewDisplay failed", surfaceholder);
    }

    private void showCameraLockedError()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("camera_locked_dialog");
        alertdialog.setMessage(getResources().getString(0x7f070086)).addPositiveButton(getResources().getString(0x7f070212)).setDialogEventClass(me/lyft/android/ui/camera/CaptureView$CameraLockedErrorDialogResult);
        dialogFlow.show(alertdialog);
    }

    private void showPhotoCaptureFailedDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("image_capture_failed")).setTitle(getContext().getString(0x7f0700a8)).setTitleColorResource(0x7f0c00b7).setMessage(getContext().getString(0x7f0700a9)).addPositiveButton(getContext().getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    private void stopPreview()
    {
        if (camera != null && previewing)
        {
            L.d("stopPreview", new Object[0]);
            camera.stopPreview();
        }
        previewing = false;
        focusState = 0;
    }

    private void switchCamera()
    {
        stopPreview();
        releaseCamera();
        if (selectedCamera == 0)
        {
            selectedCamera = 1;
        } else
        {
            selectedCamera = 0;
        }
        checkFlashButtonAvailability();
        startPreview();
    }

    private void switchFlashMode()
    {
        android.hardware.Camera.Parameters parameters;
        if (flashMode.equals("auto"))
        {
            flashMode = "off";
        } else
        if (flashMode.equals("off"))
        {
            flashMode = "on";
        } else
        {
            flashMode = "auto";
        }
        parameters = camera.getParameters();
        parameters.setFlashMode(flashMode);
        setFlashModeButtonBackground(flashMode);
        camera.setParameters(parameters);
    }

    private void takePicture()
    {
        if (!takePictureInProgress)
        {
            takePictureInProgress = true;
            setControlsEnabled(false);
            camera.takePicture(null, null, takePictureCallback);
        }
    }

    private void updateOutputRotation()
    {
        screenOrientation = device.getDisplayRotation();
        setOutputRotation(getOutputPhotoRotation(screenOrientation));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(appForegroundDetector.observeAppForegrounded(), new Action1() {

            final CaptureView this$0;

            public void call(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    onResume();
                    return;
                } else
                {
                    onPause();
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = CaptureView.this;
                super();
            }
        });
        binder.bind(bus.observe(me/lyft/android/ui/camera/CaptureView$CameraLockedErrorDialogResult), onCameraLockedDialogResult);
        if (orientation == 1)
        {
            activityController.setLandscapeOrientation();
        }
    }

    protected void onDetachedFromWindow()
    {
        activityController.restoreDefaultOrientation();
        disableViewState();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        ViewCompat.setSystemUiVisibility(this, 1);
        setFlashModeButtonBackground(flashMode);
        checkFlashButtonAvailability();
        flashButtonFrame.setOnClickListener(new android.view.View.OnClickListener() {

            final CaptureView this$0;

            public void onClick(View view)
            {
                switchFlashMode();
            }

            
            {
                this$0 = CaptureView.this;
                super();
            }
        });
        flashButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CaptureView this$0;

            public void onClick(View view)
            {
                switchFlashMode();
            }

            
            {
                this$0 = CaptureView.this;
                super();
            }
        });
        captureButton.setOnTouchListener(onCaptureButtonTouched);
        captureButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CaptureView this$0;

            public void onClick(View view)
            {
                onCaptureButtonClicked();
            }

            
            {
                this$0 = CaptureView.this;
                super();
            }
        });
        if (!hasFrontCamera())
        {
            switchCameraButton.setVisibility(8);
        } else
        {
            switchCameraButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CaptureView this$0;

                public void onClick(View view)
                {
                    switchCamera();
                }

            
            {
                this$0 = CaptureView.this;
                super();
            }
            });
        }
        toolbar.setTitle(getResources().getString(0x7f07008b));
    }

    public void setSwitchCameraButtonVisibility(int i)
    {
        if (!hasFrontCamera())
        {
            switchCameraButton.setVisibility(8);
            return;
        } else
        {
            switchCameraButton.setVisibility(i);
            return;
        }
    }

    public void startPreview()
    {
        initCameraIfNeeded();
        if (camera == null)
        {
            return;
        }
        if (previewing)
        {
            stopPreview();
        }
        setPreviewDisplay(previewSurfaceHolder);
        try
        {
            L.d("startPreview", new Object[0]);
            camera.startPreview();
        }
        catch (Throwable throwable)
        {
            releaseCamera();
            throw new RuntimeException("startPreview failed", throwable);
        }
        previewing = true;
        focusState = 0;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        previewSurfaceHolder = surfaceholder;
        if (camera == null)
        {
            return;
        }
        if (previewing && surfaceholder.isCreating())
        {
            setPreviewDisplay(surfaceholder);
            return;
        } else
        {
            startPreview();
            return;
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (camera != null)
        {
            camera.stopPreview();
        }
        previewSurfaceHolder = null;
    }




/*
    static boolean access$1002(CaptureView captureview, boolean flag)
    {
        captureview.takePictureInProgress = flag;
        return flag;
    }

*/





/*
    static int access$1302(CaptureView captureview, int i)
    {
        captureview.screenOrientation = i;
        return i;
    }

*/













/*
    static int access$602(CaptureView captureview, int i)
    {
        captureview.focusState = i;
        return i;
    }

*/




    private class ScreenOrientationEventListener extends OrientationEventListener
    {

        final CaptureView this$0;

        public void onOrientationChanged(int i)
        {
            if (i != -1)
            {
                if (isOrientationChanged(i, screenOrientation))
                {
                    screenOrientation = CaptureView.roundOrientation(i);
                    setOutputRotation(getOutputPhotoRotation(screenOrientation));
                }
                if (device.getDisplayRotation() != displayRotation)
                {
                    setDisplayOrientation();
                    return;
                }
            }
        }

        public ScreenOrientationEventListener(Context context)
        {
            this$0 = CaptureView.this;
            super(context);
        }
    }

}
