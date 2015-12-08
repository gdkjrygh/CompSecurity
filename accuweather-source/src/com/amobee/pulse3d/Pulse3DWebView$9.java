// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView

class val.command
    implements Runnable
{

    final Pulse3DWebView this$0;
    final Pulse3DWebView val$amobee3DWebView;
    final String val$command;

    public void run()
    {
        if (val$amobee3DWebView == null)
        {
            return;
        } else
        {
            val$amobee3DWebView.loadUrl((new StringBuilder()).append("javascript:").append(val$command).toString());
            return;
        }
    }

    ()
    {
        this$0 = final_pulse3dwebview;
        val$amobee3DWebView = pulse3dwebview1;
        val$command = String.this;
        super();
    }
}
