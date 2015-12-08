// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.ProgressDialog;
import android.content.Context;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package com.worklight.androidgap.plugin:
//            BusyIndicator

class val.text
    implements Runnable
{

    final BusyIndicator this$0;
    private final CordovaInterface val$ctx;
    private final String val$text;

    public void run()
    {
        BusyIndicator.access$0(BusyIndicator.this, new ProgressDialog((Context)val$ctx));
        BusyIndicator.access$1(BusyIndicator.this).setCancelable(true);
        BusyIndicator.access$1(BusyIndicator.this).setCanceledOnTouchOutside(false);
        BusyIndicator.access$1(BusyIndicator.this).setIndeterminate(true);
        BusyIndicator.access$1(BusyIndicator.this).setMessage((new StringBuilder(String.valueOf(val$text))).append(" ").toString());
        BusyIndicator.access$1(BusyIndicator.this).show();
    }

    ()
    {
        this$0 = final_busyindicator;
        val$ctx = cordovainterface;
        val$text = String.this;
        super();
    }
}
