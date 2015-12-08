// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

class val.loadError
    implements Runnable
{

    final CordovaWebView this$0;
    final int val$currentLoadUrlTimeout;
    final Runnable val$loadError;
    final int val$loadUrlTimeoutValue;
    final CordovaWebView val$me;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        wait(val$loadUrlTimeoutValue);
        this;
        JVM INSTR monitorexit ;
_L2:
        if (val$me.loadUrlTimeout == val$currentLoadUrlTimeout)
        {
            CordovaWebView.access$100(val$me).getActivity().runOnUiThread(val$loadError);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    ace()
    {
        this$0 = final_cordovawebview;
        val$loadUrlTimeoutValue = i;
        val$me = cordovawebview1;
        val$currentLoadUrlTimeout = j;
        val$loadError = Runnable.this;
        super();
    }
}
