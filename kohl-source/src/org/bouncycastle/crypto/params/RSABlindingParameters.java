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

    private BigInteger blindingFactor;
    private RSAKeyParameters publicKey;

    public RSABlindingParameters(RSAKeyParameters rsakeyparameters, BigInteger biginteger)
    {
        if (rsakeyparameters instanceof RSAPrivateCrtKeyParameters)
        {
            throw new IllegalArgumentException("RSA parameters should be for a public key");
        } else
        {
            publicKey = rsakeyparameters;
            blindingFactor = biginteger;
            return;
        }
    }

    public BigInteger getBlindingFactor()
    {
        return blindingFactor;
    }

    public RSAKeyParameters getPublicKey()
    {
        return publicKey;
    }
}
