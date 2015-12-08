// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.common.Log;
import com.umeng.common.b;

// Referenced classes of package com.umeng.analytics:
//            h

public class ReportPolicy
{

    public static final int BATCH_AT_LAUNCH = 1;
    public static final int BATCH_BY_INTERVAL = 6;
    public static final int DAILY = 4;
    public static final int REALTIME = 0;
    public static final int WIFIONLY = 5;
    static final int a = 2;
    static final int b = 3;
    private static long c = 10000L;
    private int d;
    private long e;
    private long f;

    public ReportPolicy()
    {
        d = -1;
        e = -1L;
        f = -1L;
    }

    static void a(Context context, int i)
    {
        if (i < 0 || i > 6)
        {
            Log.b("MobclickAgent", "Illegal value of report policy");
            return;
        } else
        {
            com.umeng.analytics.h.b(context).edit().putInt("umeng_local_report_policy", i).commit();
            return;
        }
    }

    static void b(Context context, int i, long l)
    {
        if (i < 0 || i > 6)
        {
            Log.b("MobclickAgent", "Illegal value of report policy");
            return;
        }
        long l1 = l;
        if (i == 6)
        {
            l1 = l;
            if (l < c)
            {
                l1 = c;
                Log.b("MobclickAgent", String.format("Report interval can't be less than %dms, reset to %dms", new Object[] {
                    Long.valueOf(c), Long.valueOf(c)
                }));
            }
        }
        com.umeng.analytics.h.b(context).edit().putInt("umeng_local_report_policy", i).putLong("report_interval", l1).commit();
    }

    void a(Context context)
    {
        if (d == 4)
        {
            context = h.d(context).edit();
            context.putString(com.umeng.common.b.c(), "true");
            context.commit();
        } else
        if (d == 6)
        {
            e = System.currentTimeMillis();
            com.umeng.analytics.h.b(context).edit().putLong("last_report_time", e).commit();
            return;
        }
    }

    void a(Context context, int i, long l)
    {
        if (i < 0 || i > 6)
        {
            Log.b("MobclickAgent", "Illegal value of report policy");
            return;
        }
        d = i;
        f = l;
        context = com.umeng.analytics.h.b(context).edit().putInt("umeng_net_report_policy", i);
        long l1 = l;
        if (l < c)
        {
            l1 = c;
        }
        context.putLong("report_interval", l1).commit();
    }

    boolean a()
    {
        while (d == 0 || d == 6 && System.currentTimeMillis() - e > f) 
        {
            return true;
        }
        return false;
    }

    boolean a(String s, Context context)
    {
        boolean flag1 = true;
        if (com.umeng.common.b.a(context, "android.permission.ACCESS_NETWORK_STATE") && com.umeng.common.b.m(context)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if ("flush".equals(s)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if ("error".equals(s)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        d;
        JVM INSTR tableswitch 0 6: default 96
    //                   0 21
    //                   1 107
    //                   2 136
    //                   3 96
    //                   4 144
    //                   5 180
    //                   6 118;
           goto _L6 _L4 _L7 _L8 _L6 _L9 _L10 _L11
_L6:
        d = b(context);
        return true;
_L7:
        flag = flag1;
        if (s == "launch") goto _L4; else goto _L12
_L12:
        return false;
_L11:
        if (System.currentTimeMillis() - e <= f) goto _L12; else goto _L13
_L13:
        return true;
_L8:
        if (s != "terminate") goto _L12; else goto _L14
_L14:
        return true;
_L9:
        if (h.d(context).getString(com.umeng.common.b.c(), "false").equals("true"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s.equals("launch")) goto _L4; else goto _L15
_L15:
        return false;
_L10:
        return com.umeng.common.b.k(context);
    }

    int b(Context context)
    {
        context = com.umeng.analytics.h.b(context);
        if (context.getInt("umeng_net_report_policy", -1) != -1)
        {
            return context.getInt("umeng_net_report_policy", 1);
        } else
        {
            return context.getInt("umeng_local_report_policy", 1);
        }
    }

    void c(Context context)
    {
        if (d == -1)
        {
            d = b(context);
        }
        if (d == 6 && f == -1L)
        {
            context = com.umeng.analytics.h.b(context);
            f = context.getLong("report_interval", c);
            e = context.getLong("last_report_time", -1L);
        }
    }

}
