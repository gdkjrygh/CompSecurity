// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.livedata:
//            c, a, d

class g.c extends c
{

    final com.fitbit.livedata.c a;

    public void a(Intent intent)
    {
        intent = intent.getAction();
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND".equals(intent))
        {
            com.fitbit.e.a.a("BluetoothLiveDataManager", "Application switched to background. Stop streaming...", new Object[0]);
            a.b();
        } else
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent))
        {
            com.fitbit.e.a.a("BluetoothLiveDataManager", "Application switched to foreground. Scheduling start...", new Object[0]);
            com.fitbit.livedata.c.a(a).c(false);
            c.b(a).a(2000L);
            return;
        }
    }

    g.c(com.fitbit.livedata.c c1)
    {
        a = c1;
        super();
    }
}
