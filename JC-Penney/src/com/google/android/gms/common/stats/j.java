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
import com.google.android.gms.d.h;
import com.google.android.gms.d.p;
import com.google.android.gms.d.t;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            e, f, WakeLockEvent

public class j
{

    private static String a = "WakeLockTracker";
    private static j b = new j();
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static IntentFilter d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static Integer e;

    public j()
    {
    }

    private int a(Context context)
    {
        boolean flag = true;
        Intent intent = context.getApplicationContext().registerReceiver(null, d);
        int i;
        int k;
        boolean flag1;
        if (intent == null)
        {
            i = 0;
        } else
        {
            i = intent.getIntExtra("plugged", 0);
        }
        if ((i & 7) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (t.e())
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isInteractive();
        } else
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isScreenOn();
        }
        if (flag1)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return k << 1 | i;
    }

    public static j a()
    {
        return b;
    }

    private float b(Context context)
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        context = context.getApplicationContext().registerReceiver(null, intentfilter);
        float f1 = (0.0F / 0.0F);
        if (context != null)
        {
            int i = context.getIntExtra("level", -1);
            int k = context.getIntExtra("scale", -1);
            f1 = (float)i / (float)k;
        }
        return f1;
    }

    private static int b()
    {
        int i;
        try
        {
            if (p.a())
            {
                return ((Integer)e.a.c()).intValue();
            }
            i = f.a;
        }
        catch (SecurityException securityexception)
        {
            return f.a;
        }
        return i;
    }

    private static boolean c(Context context)
    {
        if (e == null)
        {
            e = Integer.valueOf(b());
        }
        return e.intValue() != f.a;
    }

    public void a(Context context, String s, int i, String s1, String s2, int k, List list)
    {
        if (c(context))
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(a, (new StringBuilder()).append("missing wakeLock key. ").append(s).toString());
                return;
            }
            long l = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                s = new WakeLockEvent(l, i, s1, k, list, s, SystemClock.elapsedRealtime(), a(context), s2, context.getPackageName(), b(context));
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

}
