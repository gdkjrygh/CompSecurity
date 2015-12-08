// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui:
//            f

class ceiver extends BroadcastReceiver
{

    final f a;

    public void onReceive(Context context, Intent intent)
    {
        if ("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK".equals(intent.getAction()))
        {
            context = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
            f.a(a, context);
        }
    }

    ceiver(f f1)
    {
        a = f1;
        super();
    }
}
