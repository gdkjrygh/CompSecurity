// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.roidapp.baselib.c.n;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.roidapp.videolib:
//            f, a

public final class e
{

    private static e a;
    private static final List d = Arrays.asList(new String[] {
        "SAMSUNG-SGH-I747", "VS950 4G", "Viettel_i67", "KYY21", "R8113", "SoftwinerEvb", "C5303", "LG-E40", "LG-E425g", "X9017", 
        "X907", "DTC GT8", "ST27i", "C5302", "ME172V", "A95", "Flare 2.0", "Tablet", "Aqua.Active", "ICE 350e", 
        "GT-S5303B", "GT-S5301B", "GT-I5800", "GT-I8190", "GT-N5100", "GT-N7000", "GT-N7100", "LG-L38C", "M100", "ME172V", 
        "MTK6515", "ONE TOUCH TAB 7HD", "ZTE V791", "Lenovo A369", "SM-N900V", "C1504", "Micromax A35", "SM-T210", "GT-S6310"
    });
    private static final List e = Arrays.asList(new String[] {
        "LG-P990", "GT-I9103"
    });
    private a b;
    private Boolean c;

    private e()
    {
    }

    public static e a()
    {
        if (a == null)
        {
            a = new e();
        }
        return a;
    }

    public static void a(Context context, boolean flag)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.putBoolean("videoTestFailed", flag).apply();
    }

    public static boolean a(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("videoOK2", false);
    }

    private static boolean a(String s, List list)
    {
        if (list != null)
        {
            return n.a(list, s);
        } else
        {
            return n.a(d, s);
        }
    }

    public static void b(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("videoOK2", true).apply();
    }

    public static void b(Context context, boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("videoUninstall", flag).apply();
    }

    public static boolean c(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("videoTestFailed", false);
    }

    public static boolean d(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("videoUninstall", false);
    }

    public final int a(Context context, List list)
    {
        if (!n.b())
        {
            return f.b;
        }
        String s = Build.CPU_ABI;
        if (s != null && !s.startsWith("armeabi-v7a"))
        {
            return f.b;
        }
        if (n.a(e, Build.MODEL)) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        Boolean boolean1;
        boolean1 = Boolean.valueOf(n.a("neon"));
        c = boolean1;
        if (boolean1.booleanValue()) goto _L2; else goto _L5
_L5:
        return f.b;
_L4:
        if (!c.booleanValue()) goto _L5; else goto _L2
_L2:
        if (n.d())
        {
            if (a(Build.MODEL, list))
            {
                if (a(context))
                {
                    return f.a;
                } else
                {
                    return f.c;
                }
            } else
            {
                return f.a;
            }
        }
        if (a(Build.MODEL, list))
        {
            return f.b;
        }
        if (a(context))
        {
            return f.a;
        } else
        {
            return f.c;
        }
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public final void e(Context context)
    {
        b.a(context);
    }

}
