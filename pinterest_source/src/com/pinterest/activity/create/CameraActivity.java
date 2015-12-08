// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.camera.CameraManager;
import com.pinterest.ui.camera.CameraPreview;
import java.io.File;

// Referenced classes of package com.pinterest.activity.create:
//            CreateActivity

public class CameraActivity extends BaseActivity
{

    public static final String DEBUG_TAG = "CameraActivity";
    private static int _currentCameraId;
    private static boolean _isGridEnabled;
    LinearLayout _cameraPreviewGrid;
    ImageButton _captureButton;
    RelativeLayout _captureLayout;
    private android.view.View.OnClickListener _captureListener;
    private com.pinterest.ui.camera.CameraManager.OpenCamera _currentOpenTask;
    ImageButton _flashButton;
    private android.view.View.OnClickListener _flashButtonListener;
    private int _flashClickCount;
    ImageView _flashIndicator;
    ImageButton _gridButton;
    private android.view.View.OnClickListener _gridButtonListener;
    private int _normalizedOrientation;
    private com.pinterest.ui.camera.CameraManager.OpenCamera.OpenCameraCallback _openCameraCallback;
    private OrientationEventListener _orientationEventListener;
    ImageView _overflowView;
    RelativeLayout _photoLayout;
    private android.hardware.Camera.PictureCallback _pictureCallback;
    private File _pictureFile;
    private CameraPreview _preview;
    FrameLayout _previewLayout;
    Button _retakeButton;
    LinearLayout _settingsButton;
    private android.view.View.OnClickListener _settingsButtonListener;
    LinearLayout _settingsLayout;
    ImageButton _switchButton;
    private android.view.View.OnClickListener _switchCameraButtonListener;
    ImageButton _useButton;
    private android.view.View.OnClickListener _useButtonListener;

    public CameraActivity()
    {
        _pictureCallback = new _cls7();
        _openCameraCallback = new _cls8();
        _switchCameraButtonListener = new _cls9();
        _captureListener = new _cls10();
        _flashButtonListener = new _cls11();
        _useButtonListener = new _cls12();
        _settingsButtonListener = new _cls13();
        _gridButtonListener = new _cls14();
    }

    private void closeSettings()
    {
label0:
        {
            if (CameraManager.isCameraAvailable())
            {
                _settingsLayout.clearAnimation();
                _settingsButton.setVisibility(0);
                if (_settingsLayout.getVisibility() != 0)
                {
                    break label0;
                }
                Animation animation = AnimationUtils.loadAnimation(this, 0x7f040016);
                animation.setAnimationListener(new _cls6());
                _settingsLayout.startAnimation(animation);
            }
            return;
        }
        _settingsLayout.setVisibility(8);
    }

    private void initListeners()
    {
        _flashButton.setOnClickListener(_flashButtonListener);
        _gridButton.setOnClickListener(_gridButtonListener);
        _settingsButton.setOnClickListener(_settingsButtonListener);
        _useButton.setOnClickListener(_useButtonListener);
        if (Camera.getNumberOfCameras() > 1)
        {
            _switchButton.setImageDrawable(DrawableUtils.tintIcon(_switchButton.getDrawable(), 0x7f0e00bf));
            _switchButton.setOnClickListener(_switchCameraButtonListener);
        }
        if (CameraManager.checkCameraHardware(this))
        {
            _captureButton.setOnClickListener(_captureListener);
        }
        _retakeButton.setOnClickListener(new _cls1());
        _settingsLayout.setOnClickListener(new _cls2());
        _orientationEventListener = new _cls3(this);
        _preview.setOnTouchListener(new _cls4());
    }

    private void pin(Uri uri)
    {
        if (uri != null)
        {
            Intent intent = new Intent(this, com/pinterest/activity/create/CreateActivity);
            intent.putExtra("Image Uri", uri.toString());
            startActivity(intent);
            finish();
        }
    }

    private void setScreen()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            getWindow().setFlags(1024, 1024);
            return;
        } else
        {
            getWindow().getDecorView().setSystemUiVisibility(4);
            return;
        }
    }

    private void setSwitchButtonIcon(int i, int j)
    {
        Drawable drawable;
        if (i == 0)
        {
            drawable = Resources.drawable(0x7f020166);
        } else
        {
            drawable = Resources.drawable(0x7f020164);
        }
        _switchButton.setImageDrawable(DrawableUtils.tintIcon(drawable, j));
    }

    private void switchImage(final ImageView view, final Drawable drawable)
    {
        Animation animation = AnimationUtils.loadAnimation(this, 0x7f040020);
        animation.setAnimationListener(new _cls5());
        view.startAnimation(animation);
    }

    protected void init()
    {
        _isGridEnabled = false;
        CameraManager.clearSupportedFlashList();
        _currentCameraId = Preferences.persisted().getInt("PREFS_KEY_CAMERA_ID", 0);
        setSwitchButtonIcon(_currentCameraId, 0x7f0e00c1);
        _flashButton.setImageDrawable(DrawableUtils.tintIcon(0x7f02019e, Resources.color(0x7f0e00c1)));
        _overflowView.setImageDrawable(DrawableUtils.tintIcon(0x7f0201d0, Resources.color(0x7f0e00bf)));
        _preview = new CameraPreview(this);
        _previewLayout.addView(_preview);
        CameraPreview.apply34Ratio(_previewLayout);
        initListeners();
    }

    public void onBackPressed()
    {
        if (_photoLayout.getVisibility() == 0)
        {
            _photoLayout.setVisibility(8);
            _captureLayout.setVisibility(0);
            _preview.setClickable(true);
            closeSettings();
            CameraManager.getCamera().startPreview();
            _preview.setActive(true);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setScreen();
        setContentView(0x7f03001d);
        ButterKnife.a(this);
        init();
    }

    protected void onDestroy()
    {
        ButterKnife.a(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 25 || i == 24)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 25 || i == 24)
        {
            if (_captureButton.isClickable())
            {
                takePicture();
            }
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onPause()
    {
        _currentOpenTask.cancel(true);
        CameraManager.closeCamera(_preview);
        _orientationEventListener.disable();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        _orientationEventListener.enable();
        if (CameraManager.checkCameraHardware(this))
        {
            if (_currentOpenTask != null && _currentOpenTask.isActive())
            {
                _currentOpenTask.cancel(true);
            }
            _currentOpenTask = new com.pinterest.ui.camera.CameraManager.OpenCamera(_currentCameraId, _preview, _openCameraCallback);
            _currentOpenTask.execute(new Void[0]);
        }
    }

    protected void onStop()
    {
        Preferences.persisted().set("PREFS_KEY_CAMERA_ID", _currentCameraId);
        super.onStop();
    }

    public void takePicture()
    {
        _captureButton.setClickable(false);
        _settingsLayout.setVisibility(8);
        _settingsButton.setVisibility(8);
        if (CameraManager.isCameraAvailable() && _preview.isActive())
        {
            _preview.setActive(false);
            CameraManager.setCameraOrientation(_normalizedOrientation);
            CameraManager.getCamera().takePicture(null, null, _pictureCallback);
        }
    }




/*
    static int access$102(CameraActivity cameraactivity, int i)
    {
        cameraactivity._normalizedOrientation = i;
        return i;
    }

*/



/*
    static boolean access$1102(boolean flag)
    {
        _isGridEnabled = flag;
        return flag;
    }

*/



/*
    static int access$202(int i)
    {
        _currentCameraId = i;
        return i;
    }

*/




/*
    static File access$402(CameraActivity cameraactivity, File file)
    {
        cameraactivity._pictureFile = file;
        return file;
    }

*/



/*
    static int access$502(CameraActivity cameraactivity, int i)
    {
        cameraactivity._flashClickCount = i;
        return i;
    }

*/


/*
    static int access$508(CameraActivity cameraactivity)
    {
        int i = cameraactivity._flashClickCount;
        cameraactivity._flashClickCount = i + 1;
        return i;
    }

*/





/*
    static com.pinterest.ui.camera.CameraManager.OpenCamera access$802(CameraActivity cameraactivity, com.pinterest.ui.camera.CameraManager.OpenCamera opencamera)
    {
        cameraactivity._currentOpenTask = opencamera;
        return opencamera;
    }

*/


    private class _cls7
        implements android.hardware.Camera.PictureCallback
    {

        final CameraActivity this$0;

        public void onPictureTaken(byte abyte0[], Camera camera)
        {
            _captureLayout.setVisibility(8);
            _captureButton.setClickable(true);
            _photoLayout.setVisibility(0);
            _preview.setClickable(false);
            _pictureFile = CameraManager.getOutputMediaFile();
            _useButton.setClickable(true);
            if (_pictureFile == null)
            {
                PLog.log("CameraActivity", "Error creating media file, check storage permissions: ", new Object[0]);
                return;
            }
            camera = new FileOutputStream(_pictureFile);
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            camera.write(abyte0);
            camera.close();
_L2:
            MediaScannerConnection.scanFile(Application.context(), new String[] {
                _pictureFile.getPath()
            }, null, null);
            Events.post(new PhotoItem(_pictureFile.getPath()));
            return;
            abyte0;
            PLog.log("CameraActivity", (new StringBuilder("File not found: ")).append(abyte0.getMessage()).toString(), new Object[0]);
            continue; /* Loop/switch isn't completed */
            abyte0;
            PLog.log("CameraActivity", (new StringBuilder("Error accessing file: ")).append(abyte0.getMessage()).toString(), new Object[0]);
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls7()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls8
        implements com.pinterest.ui.camera.CameraManager.OpenCamera.OpenCameraCallback
    {

        final CameraActivity this$0;

        public void postExecute()
        {
            _photoLayout.setVisibility(8);
            _captureLayout.setVisibility(0);
        }

        public void postExecuteSuccess()
        {
            _flashClickCount = 0;
            CameraManager.setCameraFlashMode(_flashButton, _flashClickCount, false);
            CameraManager.setCameraFlashMode(_flashIndicator, _flashClickCount, true);
            _captureButton.setClickable(true);
            _switchButton.setClickable(true);
            _flashButton.setClickable(true);
            _settingsLayout.setClickable(true);
            _switchButton.setImageDrawable(DrawableUtils.tintIcon(_switchButton.getDrawable(), 0x7f0e00bf));
            _gridButton.setImageDrawable(DrawableUtils.tintIcon(_gridButton.getDrawable(), 0x7f0e00bf));
        }

        public void preExecute()
        {
            _switchButton.setClickable(false);
            _captureButton.setClickable(false);
            _flashButton.setClickable(false);
            _settingsLayout.setClickable(false);
            _flashButton.setImageDrawable(DrawableUtils.tintIcon(0x7f02019e, 0x7f0e00c1));
            _switchButton.setImageDrawable(DrawableUtils.tintIcon(_switchButton.getDrawable(), 0x7f0e00c1));
            _gridButton.setImageDrawable(DrawableUtils.tintIcon(_gridButton.getDrawable(), 0x7f0e00c1));
        }

        _cls8()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            if (CameraActivity._currentCameraId == 0)
            {
                CameraActivity._currentCameraId = 1;
            } else
            {
                CameraActivity._currentCameraId = 0;
            }
            setSwitchButtonIcon(CameraActivity._currentCameraId, 0x7f0e00c1);
            switchImage(_switchButton, _switchButton.getDrawable());
            _currentOpenTask = new com.pinterest.ui.camera.CameraManager.OpenCamera(CameraActivity._currentCameraId, _preview, _openCameraCallback);
            _currentOpenTask.execute(new Void[0]);
        }

        _cls9()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            takePicture();
        }

        _cls10()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }



    private class _cls12
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            if (_pictureFile != null)
            {
                view = Uri.fromFile(_pictureFile);
                pin(view);
            }
        }

        _cls12()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls13
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            _settingsLayout.clearAnimation();
            _settingsLayout.setVisibility(0);
            _settingsLayout.startAnimation(AnimationUtils.loadAnimation(CameraActivity.this, 0x7f040015));
            _settingsButton.setVisibility(8);
        }

        _cls13()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls14
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            boolean flag = false;
            if (CameraActivity._isGridEnabled)
            {
                view = Resources.drawable(0x7f0201a4);
                _cameraPreviewGrid.setVisibility(8);
            } else
            {
                view = Resources.drawable(0x7f0201a5);
                _cameraPreviewGrid.setVisibility(0);
            }
            if (!CameraActivity._isGridEnabled)
            {
                flag = true;
            }
            CameraActivity._isGridEnabled = flag;
            switchImage(_gridButton, DrawableUtils.tintIcon(view, 0x7f0e00bf));
        }

        _cls14()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls6
        implements android.view.animation.Animation.AnimationListener
    {

        final CameraActivity this$0;

        public void onAnimationEnd(Animation animation)
        {
            _settingsLayout.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls6()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            onBackPressed();
        }

        _cls1()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CameraActivity this$0;

        public void onClick(View view)
        {
            closeSettings();
        }

        _cls2()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls3 extends OrientationEventListener
    {

        final CameraActivity this$0;

        public void onOrientationChanged(int i)
        {
            if (i != -1)
            {
                _normalizedOrientation = CameraManager.normalizeRotation(CameraActivity._currentCameraId, i);
            }
        }

        _cls3(Context context)
        {
            this$0 = CameraActivity.this;
            super(context);
        }
    }


    private class _cls4
        implements android.view.View.OnTouchListener
    {

        final CameraActivity this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (_captureLayout.getVisibility() == 0)
            {
                closeSettings();
            }
            return false;
        }

        _cls4()
        {
            this$0 = CameraActivity.this;
            super();
        }
    }


    private class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        final CameraActivity this$0;
        final Drawable val$drawable;
        final Animation val$in;
        final ImageView val$view;

        public void onAnimationEnd(Animation animation)
        {
            view.setImageDrawable(drawable);
            view.startAnimation(in);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls5()
        {
            this$0 = CameraActivity.this;
            view = imageview;
            drawable = drawable1;
            in = animation;
            super();
        }
    }

}
