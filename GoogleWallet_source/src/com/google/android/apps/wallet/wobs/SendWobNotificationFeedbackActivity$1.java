// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            SendWobNotificationFeedbackActivity

final class val.wobId
    implements Callable
{

    final SendWobNotificationFeedbackActivity this$0;
    final Context val$context;
    final String val$wobId;

    private String call()
        throws Exception
    {
        return debugInfo.outputDebugInfo(val$context, val$wobId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_sendwobnotificationfeedbackactivity;
        val$context = context1;
        val$wobId = String.this;
        super();
    }
}
