// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ECParameterSpec

public class ECNamedCurveParameterSpec extends ECParameterSpec
{

    private String name;

    public ECNamedCurveParameterSpec(String s, ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger)
    {
        super(eccurve, ecpoint, biginteger);
        name = s;
    }

    public ECNamedCurveParameterSpec(String s, ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        super(eccurve, ecpoint, biginteger, biginteger1);
        name = s;
    }

    public ECNamedCurveParameterSpec(String s, ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        super(eccurve, ecpoint, biginteger, biginteger1, abyte0);
        name = s;
    }

    public String getName()
    {
        return name;
    }
}
