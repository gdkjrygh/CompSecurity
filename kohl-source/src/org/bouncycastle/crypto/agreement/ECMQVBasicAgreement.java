// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class ECMQVBasicAgreement
    implements BasicAgreement
{

    MQVPrivateParameters privParams;

    public ECMQVBasicAgreement()
    {
    }

    private ECPoint calculateMqvAgreement(ECDomainParameters ecdomainparameters, ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1, ECPublicKeyParameters ecpublickeyparameters, ECPublicKeyParameters ecpublickeyparameters1, ECPublicKeyParameters ecpublickeyparameters2)
    {
        BigInteger biginteger = ecdomainparameters.getN();
        int i = (biginteger.bitLength() + 1) / 2;
        BigInteger biginteger1 = ECConstants.ONE.shiftLeft(i);
        if (ecpublickeyparameters == null)
        {
            ecpublickeyparameters = ecdomainparameters.getG().multiply(ecprivatekeyparameters1.getD());
        } else
        {
            ecpublickeyparameters = ecpublickeyparameters.getQ();
        }
        ecpublickeyparameters = ecpublickeyparameters.getX().toBigInteger().mod(biginteger1).setBit(i);
        ecprivatekeyparameters = ecprivatekeyparameters.getD().multiply(ecpublickeyparameters).mod(biginteger).add(ecprivatekeyparameters1.getD()).mod(biginteger);
        ecprivatekeyparameters1 = ecpublickeyparameters2.getQ().getX().toBigInteger().mod(biginteger1).setBit(i);
        ecdomainparameters = ecdomainparameters.getH().multiply(ecprivatekeyparameters).mod(biginteger);
        ecdomainparameters = ECAlgorithms.sumOfTwoMultiplies(ecpublickeyparameters1.getQ(), ecprivatekeyparameters1.multiply(ecdomainparameters).mod(biginteger), ecpublickeyparameters2.getQ(), ecdomainparameters);
        if (ecdomainparameters.isInfinity())
        {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        } else
        {
            return ecdomainparameters;
        }
    }

    public BigInteger calculateAgreement(CipherParameters cipherparameters)
    {
        cipherparameters = (MQVPublicParameters)cipherparameters;
        ECPrivateKeyParameters ecprivatekeyparameters = privParams.getStaticPrivateKey();
        return calculateMqvAgreement(ecprivatekeyparameters.getParameters(), ecprivatekeyparameters, privParams.getEphemeralPrivateKey(), privParams.getEphemeralPublicKey(), cipherparameters.getStaticPublicKey(), cipherparameters.getEphemeralPublicKey()).getX().toBigInteger();
    }

    public void init(CipherParameters cipherparameters)
    {
        privParams = (MQVPrivateParameters)cipherparameters;
    }
}
