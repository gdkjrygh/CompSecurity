// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class ej
{

    private static final BigDecimal a = new BigDecimal("100");

    public static BigDecimal a(int i)
    {
        return (new BigDecimal(i)).divide(a);
    }

    public static BigDecimal a(BigDecimal bigdecimal)
    {
        return bigdecimal.setScale(2, RoundingMode.HALF_UP);
    }

}
