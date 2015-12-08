// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.it;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            d, WakeLockEvent

public final class h
{

    private static String a = "WakeLockTracker";
    private static h b = new h();
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static IntentFilter d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static Integer e;

    public h()
    {
    }

    public static h a()
    {
        return b;
    }

    public static void a(Context context, String s, int i, String s1, String s2, int j, List list)
    {
        if (e == null)
        {
            e = Integer.valueOf(b());
        }
        boolean flag;
        if (e.intValue() != d.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(a, (new StringBuilder("missing wakeLock key. ")).append(s).toString());
                return;
            }
            long l1 = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                long l2 = SystemClock.elapsedRealtime();
                Object obj = context.getApplicationContext().registerReceiver(null, d);
                float f;
                Object obj1;
                int k;
                boolean flag1;
                boolean flag2;
                if (obj == null)
                {
                    k = 0;
                } else
                {
                    k = ((Intent) (obj)).getIntExtra("plugged", 0);
                }
                if ((k & 7) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (it.g())
                {
                    flag2 = ((PowerManager)context.getSystemService("power")).isInteractive();
                } else
                {
                    flag2 = ((PowerManager)context.getSystemService("power")).isScreenOn();
                }
                if (flag2)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = context.getPackageName();
                obj1 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                obj1 = context.getApplicationContext().registerReceiver(null, ((IntentFilter) (obj1)));
                f = (0.0F / 0.0F);
                if (obj1 != null)
                {
                    int l = ((Intent) (obj1)).getIntExtra("level", -1);
                    int i1 = ((Intent) (obj1)).getIntExtra("scale", -1);
                    f = (float)l / (float)i1;
                }
                s = new WakeLockEvent(l1, i, s1, j, list, s, l2, k << 1 | flag1, s2, ((String) (obj)), f);
                try
                {
                    context.startService((new Intent()).setComponent(c).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.wtf(a, context);
                }
                return;
            }
        }
    }

    private static int b()
    {
        int i;
        try
        {
            if (in.a())
            {
                return ((Integer)c.b.a.d()).intValue();
            }
            i = d.a;
        }
        catch (SecurityException securityexception)
        {
            return d.a;
        }
        return i;
    }

}
