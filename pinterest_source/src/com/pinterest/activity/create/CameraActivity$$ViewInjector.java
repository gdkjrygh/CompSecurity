// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

public class 
{

    public static void inject(butterknife.ity ity, CameraActivity cameraactivity, Object obj)
    {
        cameraactivity._previewLayout = (FrameLayout)ity._previewLayout(obj, 0x7f0f007d, "field '_previewLayout'");
        cameraactivity._cameraPreviewGrid = (LinearLayout)ity._cameraPreviewGrid(obj, 0x7f0f0082, "field '_cameraPreviewGrid'");
        cameraactivity._settingsLayout = (LinearLayout)ity._settingsLayout(obj, 0x7f0f007e, "field '_settingsLayout'");
        cameraactivity._captureLayout = (RelativeLayout)ity._captureLayout(obj, 0x7f0f0083, "field '_captureLayout'");
        cameraactivity._photoLayout = (RelativeLayout)ity._photoLayout(obj, 0x7f0f0084, "field '_photoLayout'");
        cameraactivity._settingsButton = (LinearLayout)ity._settingsButton(obj, 0x7f0f007f, "field '_settingsButton'");
        cameraactivity._retakeButton = (Button)ity._retakeButton(obj, 0x7f0f00dc, "field '_retakeButton'");
        cameraactivity._captureButton = (ImageButton)ity._captureButton(obj, 0x7f0f00d7, "field '_captureButton'");
        cameraactivity._switchButton = (ImageButton)ity._switchButton(obj, 0x7f0f00da, "field '_switchButton'");
        cameraactivity._gridButton = (ImageButton)ity._gridButton(obj, 0x7f0f00d8, "field '_gridButton'");
        cameraactivity._flashButton = (ImageButton)ity._flashButton(obj, 0x7f0f00d9, "field '_flashButton'");
        cameraactivity._useButton = (ImageButton)ity._useButton(obj, 0x7f0f00db, "field '_useButton'");
        cameraactivity._overflowView = (ImageView)ity._overflowView(obj, 0x7f0f0081, "field '_overflowView'");
        cameraactivity._flashIndicator = (ImageView)ity._flashIndicator(obj, 0x7f0f0080, "field '_flashIndicator'");
    }

    public static void reset(CameraActivity cameraactivity)
    {
        cameraactivity._previewLayout = null;
        cameraactivity._cameraPreviewGrid = null;
        cameraactivity._settingsLayout = null;
        cameraactivity._captureLayout = null;
        cameraactivity._photoLayout = null;
        cameraactivity._settingsButton = null;
        cameraactivity._retakeButton = null;
        cameraactivity._captureButton = null;
        cameraactivity._switchButton = null;
        cameraactivity._gridButton = null;
        cameraactivity._flashButton = null;
        cameraactivity._useButton = null;
        cameraactivity._overflowView = null;
        cameraactivity._flashIndicator = null;
    }

    public ()
    {
    }
}
