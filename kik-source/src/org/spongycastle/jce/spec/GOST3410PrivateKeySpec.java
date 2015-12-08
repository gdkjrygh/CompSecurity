// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class GOST3410PrivateKeySpec
    implements KeySpec
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;

    public GOST3410PrivateKeySpec(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        a = biginteger;
        b = biginteger1;
        c = biginteger2;
        d = biginteger3;
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

    public final BigInteger d()
    {
        return d;
    }
}
