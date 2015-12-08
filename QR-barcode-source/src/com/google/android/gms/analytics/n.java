// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            z

public final class n
{

    public static String A(int i)
    {
        return d("&promo", i);
    }

    public static String B(int i)
    {
        return d("pi", i);
    }

    public static String C(int i)
    {
        return d("&il", i);
    }

    public static String D(int i)
    {
        return d("cd", i);
    }

    public static String E(int i)
    {
        return d("cm", i);
    }

    private static String d(String s, int i)
    {
        if (i < 1)
        {
            com.google.android.gms.analytics.z.T((new StringBuilder()).append("index out of range for ").append(s).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }

    static String x(int i)
    {
        return d("&cd", i);
    }

    static String y(int i)
    {
        return d("&cm", i);
    }

    public static String z(int i)
    {
        return d("&pr", i);
    }
}
