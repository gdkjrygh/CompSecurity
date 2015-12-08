// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.er
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        boolean flag = false;
        if (CameraActivity.access$1100())
        {
            view = Resources.drawable(0x7f0201a4);
            _cameraPreviewGrid.setVisibility(8);
        } else
        {
            view = Resources.drawable(0x7f0201a5);
            _cameraPreviewGrid.setVisibility(0);
        }
        if (!CameraActivity.access$1100())
        {
            flag = true;
        }
        boolean _tmp = CameraActivity.access$1102(flag);
        CameraActivity.access$700(CameraActivity.this, _gridButton, DrawableUtils.tintIcon(view, 0x7f0e00bf));
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
