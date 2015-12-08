// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.View;
import android.widget.ImageButton;
import com.pinterest.ui.camera.CameraManager;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.er
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        if (CameraManager.checkFlashHardware())
        {
            int _tmp = CameraActivity.access$508(CameraActivity.this);
            CameraManager.setCameraFlashMode(_flashButton, CameraActivity.access$500(CameraActivity.this), false);
            CameraManager.setCameraFlashMode(_flashIndicator, CameraActivity.access$500(CameraActivity.this), false);
            CameraActivity.access$700(CameraActivity.this, _flashButton, _flashButton.getDrawable());
        }
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
