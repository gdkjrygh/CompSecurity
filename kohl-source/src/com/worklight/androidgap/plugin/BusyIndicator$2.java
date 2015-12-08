// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.ProgressDialog;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.worklight.androidgap.plugin:
//            BusyIndicator

class this._cls0
    implements Runnable
{

    final BusyIndicator this$0;

    public void run()
    {
        if (BusyIndicator.access$000(BusyIndicator.this) != null)
        {
            BusyIndicator.access$000(BusyIndicator.this).dismiss();
            BusyIndicator.access$002(BusyIndicator.this, null);
        }
        BusyIndicator.access$102(BusyIndicator.this, false);
        BusyIndicator.access$200(BusyIndicator.this).release();
    }

    ()
    {
        this$0 = BusyIndicator.this;
        super();
    }
}
