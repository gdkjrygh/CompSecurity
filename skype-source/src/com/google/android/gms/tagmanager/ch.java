// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, c

final class ch extends o
{
    private final class a
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
            boolean flag = com.google.android.gms.tagmanager.ch.e(a);
_L4:
            if (flag)
            {
                long l1 = System.currentTimeMillis();
                ch.b(a).a(com.google.android.gms.tagmanager.c.a(new Object[] {
                    "event", b, "gtm.timerInterval", String.valueOf(d), "gtm.timerLimit", String.valueOf(e), "gtm.timerStartTime", String.valueOf(f), "gtm.timerCurrentTime", String.valueOf(l1), 
                    "gtm.timerElapsedTime", String.valueOf(l1 - f), "gtm.timerEventNumber", String.valueOf(g), "gtm.triggers", c
                }));
            }
            ch.c(a).postDelayed(this, d);
            return;
_L2:
            Object obj = (ActivityManager)com.google.android.gms.tagmanager.ch.f(a).getSystemService("activity");
            KeyguardManager keyguardmanager = (KeyguardManager)com.google.android.gms.tagmanager.ch.f(a).getSystemService("keyguard");
            PowerManager powermanager = (PowerManager)com.google.android.gms.tagmanager.ch.f(a).getSystemService("power");
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

        a(String s, String s1, long l1, long l2)
        {
            a = ch.this;
            super();
            b = s;
            c = s1;
            d = l1;
            e = l2;
        }
    }


    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private boolean f;
    private boolean g;
    private final Context h;
    private c i;
    private final HandlerThread j = new HandlerThread("Google GTM SDK Timer", 10);
    private Handler k;
    private final Set l = new HashSet();

    public ch(Context context, c c1)
    {
        super(a, new String[] {
            c, b
        });
        h = context;
        i = c1;
        j.start();
        k = new Handler(j.getLooper());
    }

    static Set a(ch ch1)
    {
        return ch1.l;
    }

    static c b(ch ch1)
    {
        return ch1.i;
    }

    static Handler c(ch ch1)
    {
        return ch1.k;
    }

    static boolean d(ch ch1)
    {
        return ch1.g;
    }

    static boolean e(ch ch1)
    {
        return ch1.f;
    }

    static Context f(ch ch1)
    {
        return ch1.h;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
label0:
        {
label1:
            {
                String s1 = cl.a((com.google.android.gms.internal.h.a)map.get(b));
                String s = cl.a((com.google.android.gms.internal.h.a)map.get(e));
                String s2 = cl.a((com.google.android.gms.internal.h.a)map.get(c));
                map = cl.a((com.google.android.gms.internal.h.a)map.get(d));
                long l1;
                long l2;
                try
                {
                    l1 = Long.parseLong(s2);
                }
                catch (NumberFormatException numberformatexception)
                {
                    l1 = 0L;
                }
                try
                {
                    l2 = Long.parseLong(map);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    l2 = 0L;
                }
                if (l1 <= 0L || TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                if (s != null)
                {
                    map = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                map = "0";
            }
            if (!l.contains(map))
            {
                if (!"0".equals(map))
                {
                    l.add(map);
                }
                k.postDelayed(new a(s1, map, l1, l2), l1);
            }
        }
        return com.google.android.gms.tagmanager.cl.f();
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.aL.toString();
        b = f.bH.toString();
        c = f.bm.toString();
        d = f.bu.toString();
        e = f.dl.toString();
    }
}
