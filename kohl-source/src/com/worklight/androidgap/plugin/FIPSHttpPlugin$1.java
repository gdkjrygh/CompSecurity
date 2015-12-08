// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import com.worklight.androidgap.fips.FipsHandler;
import com.worklight.common.Logger;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            FIPSHttpPlugin

class val.callbackContext
    implements Runnable
{

    final FIPSHttpPlugin this$0;
    final CallbackContext val$callbackContext;
    final Context val$ctx;

    public void run()
    {
        try
        {
            FipsHandler.getInstance(val$ctx);
            FIPSHttpPlugin.FIPS_ENABLED = true;
            val$callbackContext.success();
            return;
        }
        catch (Throwable throwable)
        {
            FIPSHttpPlugin.access$000().error("An unrecoverable error has occurred: ", throwable);
            val$callbackContext.error(FIPSHttpPlugin.access$100(FIPSHttpPlugin.this, (new StringBuilder()).append("An unrecoverable error has occurred: ").append(throwable.getLocalizedMessage()).toString()));
            return;
        }
    }

    ()
    {
        this$0 = final_fipshttpplugin;
        val$ctx = context;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
