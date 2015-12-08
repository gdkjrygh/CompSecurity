// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.urbanairship:
//            ApplicationMetrics, PreferenceDataStore

class t> extends BroadcastReceiver
{

    final ApplicationMetrics this$0;

    public void onReceive(Context context, Intent intent)
    {
        ApplicationMetrics.access$000(ApplicationMetrics.this).put("com.urbanairship.application.metrics.LAST_OPEN", Long.valueOf(System.currentTimeMillis()));
    }

    ()
    {
        this$0 = ApplicationMetrics.this;
        super();
    }
}
