// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

// Referenced classes of package com.baidu.android.pushservice:
//            PushSettings

public final class a
{

    public static int a = 600;
    public static int b = 30;
    public static int c = 3;
    public static int d = 0;

    public static short a()
    {
        return 36;
    }

    public static void a(Context context, Intent intent)
    {
        if (b())
        {
            com.baidu.frontia.a.b.a.a.b("Constants", "start service: com.baidu.android.pushservice.PushService");
        }
        intent.setClassName(context.getPackageName(), "com.baidu.android.pushservice.PushService");
        context.startService(intent);
_L1:
        return;
        context;
        if (b())
        {
            com.baidu.frontia.a.b.a.a.d("Constants", (new StringBuilder("error ")).append(context.getMessage()).toString());
            return;
        }
          goto _L1
    }

    public static void a(Context context, boolean flag)
    {
        byte byte0 = 36;
        if (flag)
        {
            byte0 = 0;
        }
        context = context.getSharedPreferences("pst", 4).edit();
        context.putInt("com.baidu.push.nd_restart", byte0);
        context.commit();
    }

    public static boolean a(Context context)
    {
        int i;
        try
        {
            i = android.provider.Settings.System.getInt(context.getContentResolver(), "com.baidu.android.pushservice.PushSettings.internal_debug_mode");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return i == 1;
    }

    public static void b(Context context, boolean flag)
    {
        Object obj = context.getSharedPreferences("pst", 4);
        if (flag)
        {
            if ("disabled".equals(c(context)))
            {
                a(context, true);
            }
            context = "enabled";
        } else
        {
            context = "disabled";
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("s_e", context);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

    public static boolean b()
    {
        return PushSettings.c();
    }

    public static boolean b(Context context)
    {
        boolean flag = false;
        if (36 > context.getSharedPreferences("pst", 4).getInt("com.baidu.push.nd_restart", 0))
        {
            flag = true;
        }
        return flag;
    }

    public static String c(Context context)
    {
        return context.getSharedPreferences("pst", 4).getString("s_e", "default");
    }

}
