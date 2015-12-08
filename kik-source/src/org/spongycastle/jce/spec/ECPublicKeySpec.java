// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.jce.spec:
//            ECKeySpec, ECParameterSpec

public class ECPublicKeySpec extends ECKeySpec
{

    private ECPoint a;

    public ECPublicKeySpec(ECPoint ecpoint, ECParameterSpec ecparameterspec)
    {
        super(ecparameterspec);
        a = ecpoint;
    }

    public final ECPoint b()
    {
        return a;
    }
}
