// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            RSAPrivateCrtKeyParameters, RSAKeyParameters

public class RSABlindingParameters
    implements CipherParameters
{

    private RSAKeyParameters a;
    private BigInteger b;

    public RSABlindingParameters(RSAKeyParameters rsakeyparameters, BigInteger biginteger)
    {
        if (rsakeyparameters instanceof RSAPrivateCrtKeyParameters)
        {
            throw new IllegalArgumentException("RSA parameters should be for a public key");
        } else
        {
            a = rsakeyparameters;
            b = biginteger;
            return;
        }
    }

    public BigInteger getBlindingFactor()
    {
        return b;
    }

    public RSAKeyParameters getPublicKey()
    {
        return a;
    }
}
