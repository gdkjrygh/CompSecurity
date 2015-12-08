// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            aa

public final class o
{

    private static String b(String s1, int i)
    {
        if (i < 1)
        {
            aa.A((new StringBuilder()).append("index out of range for ").append(s1).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s1).append(i).toString();
        }
    }

    static String s(int i)
    {
        return b("&cd", i);
    }

    static String t(int i)
    {
        return b("&cm", i);
    }

    public static String u(int i)
    {
        return b("&pr", i);
    }

    public static String v(int i)
    {
        return b("&promo", i);
    }

    public static String w(int i)
    {
        return b("pi", i);
    }

    public static String x(int i)
    {
        return b("&il", i);
    }

    public static String y(int i)
    {
        return b("cd", i);
    }

    public static String z(int i)
    {
        return b("cm", i);
    }
}
