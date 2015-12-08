// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.app.ProgressDialog;

// Referenced classes of package com.soundcloud.android.crop:
//            MonitoredActivity

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        cess._mth000(this._cls0.this).removeLifeCycleListener(this._cls0.this);
        if (cess._mth100(this._cls0.this).getWindow() != null)
        {
            cess._mth100(this._cls0.this).dismiss();
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
