// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.SharedPreferences;

public class e
{

    private static SharedPreferences a = null;

    public e()
    {
    }

    private static SharedPreferences a(Context context)
    {
        com/qihoo/antivirus/update/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = context.getSharedPreferences("update_pref", 0);
        }
        context = a;
        com/qihoo/antivirus/update/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/qihoo/antivirus/update/e;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String a(Context context, String s)
    {
        return a(context).getString(s, null);
    }

    public static void a(Context context, String s, long l)
    {
        context = a(context).edit();
        context.putLong(s, l);
        context.commit();
    }

    public static void a(Context context, String s, String s1)
    {
        context = a(context).edit();
        context.putString(s, s1);
        context.commit();
    }

    public static boolean a(Context context, String s, boolean flag)
    {
        return a(context).getBoolean(s, flag);
    }

}
