// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DHAgreement
{

    private DHPrivateKeyParameters a;
    private DHParameters b;
    private BigInteger c;
    private SecureRandom d;

    public DHAgreement()
    {
    }

    public BigInteger calculateAgreement(DHPublicKeyParameters dhpublickeyparameters, BigInteger biginteger)
    {
        if (!dhpublickeyparameters.getParameters().equals(b))
        {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        } else
        {
            BigInteger biginteger1 = b.getP();
            return biginteger.modPow(a.getX(), biginteger1).multiply(dhpublickeyparameters.getY().modPow(c, biginteger1)).mod(biginteger1);
        }
    }

    public BigInteger calculateMessage()
    {
        Object obj = new DHKeyPairGenerator();
        ((DHKeyPairGenerator) (obj)).init(new DHKeyGenerationParameters(d, b));
        obj = ((DHKeyPairGenerator) (obj)).generateKeyPair();
        c = ((DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate()).getX();
        return ((DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic()).getY();
    }

    public void init(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            d = cipherparameters.getRandom();
            cipherparameters = (AsymmetricKeyParameter)cipherparameters.getParameters();
        } else
        {
            d = new SecureRandom();
            cipherparameters = (AsymmetricKeyParameter)cipherparameters;
        }
        if (!(cipherparameters instanceof DHPrivateKeyParameters))
        {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        } else
        {
            a = (DHPrivateKeyParameters)cipherparameters;
            b = a.getParameters();
            return;
        }
    }
}
