// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;

public class BigIntPolynomial
{

    private static final double b = Math.log10(2D);
    BigInteger a[];

    private BigIntPolynomial(BigInteger abiginteger[])
    {
        a = abiginteger;
    }

    public Object clone()
    {
        return new BigIntPolynomial((BigInteger[])a.clone());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BigIntPolynomial)obj;
            if (!Arrays.a(a, ((BigIntPolynomial) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.a(a) + 31;
    }

}
