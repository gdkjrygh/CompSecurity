// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            p

public final class aq
{

    static String a(int i)
    {
        return a("&cd", i);
    }

    private static String a(String s, int i)
    {
        if (i < 1)
        {
            p.a((new StringBuilder()).append("index out of range for ").append(s).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }

    static String b(int i)
    {
        return a("&cm", i);
    }

    public static String c(int i)
    {
        return a("&pr", i);
    }

    public static String d(int i)
    {
        return a("&promo", i);
    }

    public static String e(int i)
    {
        return a("pi", i);
    }

    public static String f(int i)
    {
        return a("&il", i);
    }

    public static String g(int i)
    {
        return a("cd", i);
    }

    public static String h(int i)
    {
        return a("cm", i);
    }
}
