// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ElGamalKeySpec, ElGamalParameterSpec

public class ElGamalPrivateKeySpec extends ElGamalKeySpec
{

    private BigInteger x;

    public ElGamalPrivateKeySpec(BigInteger biginteger, ElGamalParameterSpec elgamalparameterspec)
    {
        super(elgamalparameterspec);
        x = biginteger;
    }

    public BigInteger getX()
    {
        return x;
    }
}
