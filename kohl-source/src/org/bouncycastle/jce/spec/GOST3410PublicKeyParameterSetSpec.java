// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class GOST3410PublicKeyParameterSetSpec
{

    private BigInteger a;
    private BigInteger p;
    private BigInteger q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        p = biginteger;
        q = biginteger1;
        a = biginteger2;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof GOST3410PublicKeyParameterSetSpec)
        {
            obj = (GOST3410PublicKeyParameterSetSpec)obj;
            flag = flag1;
            if (a.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).a))
            {
                flag = flag1;
                if (p.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).p))
                {
                    flag = flag1;
                    if (q.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).q))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public BigInteger getA()
    {
        return a;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public int hashCode()
    {
        return a.hashCode() ^ p.hashCode() ^ q.hashCode();
    }
}
