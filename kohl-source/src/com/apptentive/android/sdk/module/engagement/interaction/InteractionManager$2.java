// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.metric.MetricModule;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction:
//            InteractionManager

static final class val.context
    implements ionHandler
{

    final Context val$context;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.w("UncaughtException in InteractionManager.", throwable, new Object[0]);
        MetricModule.sendError(val$context.getApplicationContext(), throwable, null, null);
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
