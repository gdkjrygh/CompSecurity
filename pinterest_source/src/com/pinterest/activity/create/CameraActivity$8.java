// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.camera.CameraManager;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements com.pinterest.ui.camera.nCamera.OpenCameraCallback
{

    final CameraActivity this$0;

    public void postExecute()
    {
        _photoLayout.setVisibility(8);
        _captureLayout.setVisibility(0);
    }

    public void postExecuteSuccess()
    {
        CameraActivity.access$502(CameraActivity.this, 0);
        CameraManager.setCameraFlashMode(_flashButton, CameraActivity.access$500(CameraActivity.this), false);
        CameraManager.setCameraFlashMode(_flashIndicator, CameraActivity.access$500(CameraActivity.this), true);
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

    a.OpenCameraCallback()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
