// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.os.Build;
import java.lang.reflect.Field;

public final class m
{

    public static final int a;
    public static final String b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    private static final boolean j;
    private static final boolean k;

    static 
    {
        boolean flag1 = true;
        a = Integer.parseInt(android.os.Build.VERSION.SDK);
        String s;
        String s1;
        boolean flag;
        try
        {
            s = (String)android/os/Build.getField("MANUFACTURER").get(null);
        }
        catch (Exception exception)
        {
            exception = "";
        }
        b = s;
        s1 = Build.MODEL;
        if (s.equalsIgnoreCase("samsung") && (s1.equalsIgnoreCase("SGH-T959") || s1.equalsIgnoreCase("SAMSUNG-SGH-I897") || s1.equalsIgnoreCase("SGH-I897") || s1.equalsIgnoreCase("GT-I9000")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (s.equalsIgnoreCase("htc") && (s1.equalsIgnoreCase("PC36100") || s1.equalsIgnoreCase("ADR6300") || s1.equalsIgnoreCase("HTC Glacier") || s1.equalsIgnoreCase("T-Mobile myTouch 4G") || s1.equalsIgnoreCase("T-Mobile G2")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = s1.equalsIgnoreCase("Motorola_i1");
        if (s.equalsIgnoreCase("Motorola") && s1.equalsIgnoreCase("MB860"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (s.equalsIgnoreCase("samsung") && a == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        i = flag;
        if (c || e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (!c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
        h = k;
    }
}
