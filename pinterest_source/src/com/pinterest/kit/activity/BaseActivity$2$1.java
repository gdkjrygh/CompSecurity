// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import android.hardware.SensorManager;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.squareup.seismic.ShakeDetector;

// Referenced classes of package com.pinterest.kit.activity:
//            BaseActivity

class this._cls1
    implements com.pinterest.activity.task.dialog.issListener
{

    final ystemService this$1;

    public void onDismiss(BaseDialog basedialog)
    {
        BaseActivity.access$000(_fld0).a((SensorManager)getSystemService("sensor"));
    }

    g()
    {
        this$1 = this._cls1.this;
        super();
    }
}
