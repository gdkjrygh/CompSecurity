// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ac

public final class s
{

    private static String d(String s1, int i)
    {
        if (i <= 0)
        {
            ac.e((new StringBuilder("index out of range for ")).append(s1).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s1).append(i).toString();
        }
    }

    public static String impressionListPrefix(int i)
    {
        return d("&il", i);
    }

    public static String impressionPrefix(int i)
    {
        return d("pi", i);
    }

    public static String productPrefix(int i)
    {
        return d("&pr", i);
    }

    public static String promotionPrefix(int i)
    {
        return d("&promo", i);
    }

    static String y(int i)
    {
        return d("&cd", i);
    }
}
