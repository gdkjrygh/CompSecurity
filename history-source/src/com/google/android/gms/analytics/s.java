// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ae

public final class s
{

    public static String A(int i)
    {
        return d("&pr", i);
    }

    public static String B(int i)
    {
        return d("&promo", i);
    }

    public static String C(int i)
    {
        return d("pi", i);
    }

    public static String D(int i)
    {
        return d("&il", i);
    }

    public static String E(int i)
    {
        return d("cd", i);
    }

    public static String F(int i)
    {
        return d("cm", i);
    }

    private static String d(String s1, int i)
    {
        if (i < 1)
        {
            ae.T((new StringBuilder()).append("index out of range for ").append(s1).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s1).append(i).toString();
        }
    }

    static String y(int i)
    {
        return d("&cd", i);
    }

    static String z(int i)
    {
        return d("&cm", i);
    }
}
