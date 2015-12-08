// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.app.ProgressDialog;
import java.util.concurrent.Semaphore;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package com.worklight.androidgap.plugin:
//            BusyIndicator

class val.text
    implements Runnable
{

    final BusyIndicator this$0;
    final String val$text;

    public void run()
    {
        BusyIndicator.access$002(BusyIndicator.this, new ProgressDialog(cordova.getActivity()));
        BusyIndicator.access$000(BusyIndicator.this).setCancelable(false);
        BusyIndicator.access$000(BusyIndicator.this).setCanceledOnTouchOutside(false);
        BusyIndicator.access$000(BusyIndicator.this).setIndeterminate(true);
        BusyIndicator.access$000(BusyIndicator.this).setMessage((new StringBuilder()).append(val$text).append(" ").toString());
        if (!cordova.getActivity().isFinishing())
        {
            BusyIndicator.access$000(BusyIndicator.this).show();
            BusyIndicator.access$102(BusyIndicator.this, true);
        }
        BusyIndicator.access$200(BusyIndicator.this).release();
    }

    ()
    {
        this$0 = final_busyindicator;
        val$text = String.this;
        super();
    }
}
