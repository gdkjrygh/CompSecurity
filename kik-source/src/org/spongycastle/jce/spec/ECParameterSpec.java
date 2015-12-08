// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

public class ECParameterSpec
    implements AlgorithmParameterSpec
{

    private ECCurve a;
    private byte b[];
    private ECPoint c;
    private BigInteger d;
    private BigInteger e;

    public ECParameterSpec(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        a = eccurve;
        c = ecpoint;
        d = biginteger;
        e = biginteger1;
        b = abyte0;
    }

    public final ECCurve b()
    {
        return a;
    }

    public final ECPoint c()
    {
        return c;
    }

    public final BigInteger d()
    {
        return d;
    }

    public final BigInteger e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ECParameterSpec)
        {
            if (a.equals(((ECParameterSpec) (obj = (ECParameterSpec)obj)).a) && c.equals(((ECParameterSpec) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final byte[] f()
    {
        return b;
    }

    public int hashCode()
    {
        return a.hashCode() ^ c.hashCode();
    }
}
