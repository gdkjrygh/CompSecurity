// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.support.v4.app.FragmentManager;
import android.util.Log;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            AmpSessionHandler, AmpDialogFragment, JavaScriptClient, Constants

class val.attributes
    implements Runnable
{

    final AmpSessionHandler this$0;
    final Map val$ampMessage;
    final Map val$attributes;

    public void run()
    {
        if (AmpSessionHandler.access$000(AmpSessionHandler.this) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            if (AmpSessionHandler.access$000(AmpSessionHandler.this).findFragmentByTag("amp_dialog") == null)
            {
                AmpDialogFragment.newInstance().setData(val$ampMessage).setCallbacks(getDialogCallbacks()).setJavaScriptClient(new JavaScriptClient(getJavaScriptClientCallbacks(val$attributes))).show(AmpSessionHandler.access$000(AmpSessionHandler.this), "amp_dialog");
                AmpSessionHandler.access$000(AmpSessionHandler.this).executePendingTransactions();
                return;
            }
        }
        catch (Exception exception)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e("Localytics", "Localytics library threw an uncaught exception", exception);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ()
    {
        this$0 = final_ampsessionhandler;
        val$ampMessage = map;
        val$attributes = Map.this;
        super();
    }
}
