// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;


// Referenced classes of package org.apache.sanselan.common:
//            RationalNumber

class b
{

    public final RationalNumber a;
    public final double b;

    public static final b a(RationalNumber rationalnumber, double d)
    {
        return new <init>(rationalnumber, Math.abs(rationalnumber.doubleValue() - d));
    }

    public String toString()
    {
        return a.toString();
    }

    private (RationalNumber rationalnumber, double d)
    {
        a = rationalnumber;
        b = d;
    }
}
