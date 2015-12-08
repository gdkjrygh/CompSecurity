// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import android.app.Application;
import android.os.Build;
import com.roidapp.baselib.c.aj;
import java.util.Random;

public final class a
{

    private static final Random a = new Random(System.currentTimeMillis());

    public static String a()
    {
        return aj.a().getString(0x7f070052);
    }

    public static double b()
    {
        return a.nextDouble();
    }

    public static int c()
    {
        return a.nextInt(100);
    }

    public static String d()
    {
        String s;
        try
        {
            s = android.provider.Settings.Secure.getString(aj.a().getContentResolver(), "android_id");
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    public static String e()
    {
        return Build.MODEL;
    }

    public static String f()
    {
        return Build.BRAND;
    }

    public static String g()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String h()
    {
        return "Android";
    }

}
