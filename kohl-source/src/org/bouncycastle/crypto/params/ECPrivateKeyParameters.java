// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECKeyParameters, ECDomainParameters

public class ECPrivateKeyParameters extends ECKeyParameters
{

    BigInteger d;

    public ECPrivateKeyParameters(BigInteger biginteger, ECDomainParameters ecdomainparameters)
    {
        super(true, ecdomainparameters);
        d = biginteger;
    }

    public BigInteger getD()
    {
        return d;
    }
}
