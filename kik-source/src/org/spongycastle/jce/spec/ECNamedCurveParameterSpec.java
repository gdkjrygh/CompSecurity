// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.jce.spec:
//            ECParameterSpec

public class ECNamedCurveParameterSpec extends ECParameterSpec
{

    private String a;

    public ECNamedCurveParameterSpec(String s, ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        super(eccurve, ecpoint, biginteger, biginteger1, abyte0);
        a = s;
    }

    public final String a()
    {
        return a;
    }
}
