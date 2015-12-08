// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ltu
    implements Runnable
{

    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final long e = System.currentTimeMillis();
    private long f;
    private ltt g;

    ltu(ltt ltt1, String s, String s1, long l, long l1)
    {
        g = ltt1;
        super();
        a = s;
        b = s1;
        c = l;
        d = l1;
    }

    public final void run()
    {
        if (d > 0L && f >= d)
        {
            if (!"0".equals(b))
            {
                ltt.a(g).remove(b);
            }
            return;
        }
        f = f + 1L;
        if (!ltt.d(g)) goto _L2; else goto _L1
_L1:
        boolean flag = ltt.e(g);
_L4:
        if (flag)
        {
            long l = System.currentTimeMillis();
            ltt.b(g).a(lpu.a(new Object[] {
                "event", a, "gtm.timerInterval", String.valueOf(c), "gtm.timerLimit", String.valueOf(d), "gtm.timerStartTime", String.valueOf(e), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - e), "gtm.timerEventNumber", String.valueOf(f), "gtm.triggers", b
            }));
        }
        ltt.c(g).postDelayed(this, c);
        return;
_L2:
        Object obj = (ActivityManager)ltt.f(g).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)ltt.f(g).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)ltt.f(g).getSystemService("power");
        for (obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); ((Iterator) (obj)).hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
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
}
