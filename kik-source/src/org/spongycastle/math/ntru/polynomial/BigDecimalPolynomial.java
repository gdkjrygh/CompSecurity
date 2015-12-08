// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import java.math.BigDecimal;

public class BigDecimalPolynomial
{

    private static final BigDecimal b = new BigDecimal("0");
    private static final BigDecimal c = new BigDecimal("0.5");
    BigDecimal a[];

    private BigDecimalPolynomial(BigDecimal abigdecimal[])
    {
        a = abigdecimal;
    }

    public Object clone()
    {
        return new BigDecimalPolynomial((BigDecimal[])a.clone());
    }

}
