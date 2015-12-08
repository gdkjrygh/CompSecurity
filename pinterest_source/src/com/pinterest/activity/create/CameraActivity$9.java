// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.ner
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        if (CameraActivity.access$200() == 0)
        {
            int _tmp = CameraActivity.access$202(1);
        } else
        {
            int _tmp1 = CameraActivity.access$202(0);
        }
        CameraActivity.access$600(CameraActivity.this, CameraActivity.access$200(), 0x7f0e00c1);
        CameraActivity.access$700(CameraActivity.this, _switchButton, _switchButton.getDrawable());
        CameraActivity.access$802(CameraActivity.this, new com.pinterest.ui.camera.nCamera(CameraActivity.access$200(), CameraActivity.access$300(CameraActivity.this), CameraActivity.access$900(CameraActivity.this)));
        CameraActivity.access$800(CameraActivity.this).execute(new Void[0]);
    }

    a()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
