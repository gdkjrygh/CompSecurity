// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.al;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class a
{

    private static a c = null;
    private static final List d = Arrays.asList(new String[] {
        "LG-E400", "LG-E405", "LG-L38C", "LGL35G"
    });
    public boolean a;
    public boolean b;

    private a()
    {
        a = false;
        b = false;
    }

    public static a a()
    {
        com/roidapp/photogrid/common/a;
        JVM INSTR monitorenter ;
        a a1;
        if (c == null)
        {
            c = new a();
        }
        a1 = c;
        com/roidapp/photogrid/common/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a(Context context)
    {
        return com.roidapp.cloudlib.a.a.a(context).a("other", "ad_error_hide", true);
    }

    public static boolean a(Context context, String s, boolean flag)
    {
label0:
        {
            Object obj = com.roidapp.cloudlib.a.a.a(context).c("admob", "country");
            String s1 = Locale.getDefault().getCountry();
            Log.e("locale", s1);
            if (s1 == null || obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!s1.equalsIgnoreCase((String)((Iterator) (obj)).next()));
            return false;
        }
        return com.roidapp.cloudlib.a.a.a(context).a("admob", s, flag);
    }

    public static void b(Context context)
    {
        context.getSharedPreferences(context.getPackageName(), 0).edit().putBoolean("is_ad_error", true).apply();
    }

    public final boolean c(Context context)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (!n.a(d, Build.MODEL)) goto _L2; else goto _L1
_L1:
        a = true;
        if (n.d())
        {
            flag = false;
        }
        b = flag;
_L4:
        return flag;
_L2:
        if (al.g().e(context.getApplicationContext()) && (!context.getSharedPreferences(context.getPackageName(), 0).getBoolean("is_ad_error", false) || !a(context)))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        try
        {
            a = flag;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            a = true;
        }
        if (!n.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (!a)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (b) goto _L4; else goto _L3
_L3:
        return false;
    }

}
