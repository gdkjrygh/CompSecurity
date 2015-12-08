// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.t;
import com.roidapp.cloudlib.al;
import java.util.concurrent.AbstractExecutorService;

// Referenced classes of package com.roidapp.cloudlib.push:
//            c, b, e, d

public final class a
{

    private static boolean a = false;

    public static void a(Context context)
    {
_L2:
        return;
        if (a || context == null || !n.c()) goto _L2; else goto _L1
_L1:
        context = context.getApplicationContext();
        a = true;
        if (!al.g().c(context) || !al.g().e(context.getApplicationContext())) goto _L2; else goto _L3
_L3:
        String s;
        long l;
        SharedPreferences sharedpreferences = context.getSharedPreferences("pushservice", 0);
        s = sharedpreferences.getString("regid", null);
        if (TextUtils.isEmpty(s) || sharedpreferences.getInt("appVersion", -1) != n.c(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s.equals(sharedpreferences.getString("uploadregid", null)))
        {
            e(context, s);
            return;
        }
        l = sharedpreferences.getLong("uploadTime", 0L);
        if (System.currentTimeMillis() - l <= 0x240c8400L) goto _L2; else goto _L4
_L4:
        e(context, s);
        return;
        if (context == null) goto _L2; else goto _L5
_L5:
        context = context.getApplicationContext();
        t.a().execute(new c(context));
        return;
    }

    public static void a(Context context, String s)
    {
        a(context, s, true);
    }

    private static void a(Context context, String s, boolean flag)
    {
        if (!a)
        {
            a(context);
        }
        if (a)
        {
            Context context1 = context.getApplicationContext();
            context = context.getSharedPreferences("pushservice", 0).getString("regid", null);
            if (context != null)
            {
                t.a().execute(new b(s, flag, context1, context));
            }
        }
    }

    public static String b(Context context)
    {
        return context.getSharedPreferences("pushservice", 0).getString("snsToken", null);
    }

    public static void b(Context context, String s)
    {
        a(context, s, false);
    }

    static SharedPreferences c(Context context)
    {
        return context.getSharedPreferences("pushservice", 0);
    }

    static void c(Context context, String s)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("pushservice", 0);
        int i = n.c(context);
        context = sharedpreferences.edit();
        context.putString("regid", s);
        context.putInt("appVersion", i);
        context.apply();
    }

    static void d(Context context, String s)
    {
        if (com.roidapp.cloudlib.push.e.b(context, s))
        {
            context = context.getSharedPreferences("pushservice", 0).edit();
            context.putString("uploadregid", s);
            context.putLong("uploadTime", System.currentTimeMillis());
            context.apply();
        }
    }

    private static void e(Context context, String s)
    {
        context = context.getApplicationContext();
        t.a().execute(new d(context, s));
    }

}
