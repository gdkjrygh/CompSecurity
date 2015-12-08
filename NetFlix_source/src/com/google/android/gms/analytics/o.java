// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            aa

public final class o
{

    private static String b(String s, int i)
    {
        if (i < 1)
        {
            aa.w((new StringBuilder()).append("index out of range for ").append(s).append(" (").append(i).append(")").toString());
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }

    static String q(int i)
    {
        return b("&cd", i);
    }

    static String r(int i)
    {
        return b("&cm", i);
    }
}
