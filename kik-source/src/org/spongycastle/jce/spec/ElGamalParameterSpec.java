// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class ElGamalParameterSpec
    implements AlgorithmParameterSpec
{

    private BigInteger a;
    private BigInteger b;

    public ElGamalParameterSpec(BigInteger biginteger, BigInteger biginteger1)
    {
        a = biginteger;
        b = biginteger1;
    }

    public final BigInteger a()
    {
        return a;
    }

    public final BigInteger b()
    {
        return b;
    }
}
