// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ch, c

private final class e
    implements Runnable
{

    final ch a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final long f = System.currentTimeMillis();
    private long g;

    public final void run()
    {
        if (e > 0L && g >= e)
        {
            if (!"0".equals(c))
            {
                ch.a(a).remove(c);
            }
            return;
        }
        g = g + 1L;
        if (!ch.d(a)) goto _L2; else goto _L1
_L1:
        boolean flag = ch.e(a);
_L4:
        if (flag)
        {
            long l = System.currentTimeMillis();
            ch.b(a).a(com.google.android.gms.tagmanager.c.a(new Object[] {
                "event", b, "gtm.timerInterval", String.valueOf(d), "gtm.timerLimit", String.valueOf(e), "gtm.timerStartTime", String.valueOf(f), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - f), "gtm.timerEventNumber", String.valueOf(g), "gtm.triggers", c
            }));
        }
        ch.c(a).postDelayed(this, d);
        return;
_L2:
        Object obj = (ActivityManager)ch.f(a).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)ch.f(a).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)ch.f(a).getSystemService("power");
        for (obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); ((Iterator) (obj)).hasNext();)
        {
            android.app.ityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
            if (Process.myPid() == runningappprocessinfo.pid && runningappprocessinfo.importance == 100 && !keyguardmanager.inKeyguardRestrictedInputMode() && powermanager.isScreenOn())
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
        }

        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    rocessInfo(ch ch1, String s, String s1, long l, long l1)
    {
        a = ch1;
        super();
        b = s;
        c = s1;
        d = l;
        e = l1;
    }
}
