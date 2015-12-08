// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;

public class GOST3410PublicKeyParameterSetSpec
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public GOST3410PublicKeyParameterSetSpec(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = biginteger;
        b = biginteger1;
        c = biginteger2;
    }

    public final BigInteger a()
    {
        return a;
    }

    public final BigInteger b()
    {
        return b;
    }

    public final BigInteger c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof GOST3410PublicKeyParameterSetSpec)
        {
            obj = (GOST3410PublicKeyParameterSetSpec)obj;
            flag = flag1;
            if (c.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).c))
            {
                flag = flag1;
                if (a.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).a))
                {
                    flag = flag1;
                    if (b.equals(((GOST3410PublicKeyParameterSetSpec) (obj)).b))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c.hashCode() ^ a.hashCode() ^ b.hashCode();
    }
}
