// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class ECGOST3410Signer
    implements DSA
{

    ECKeyParameters key;
    SecureRandom random;

    public ECGOST3410Signer()
    {
    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i != abyte1.length; i++)
        {
            abyte1[i] = abyte0[abyte1.length - 1 - i];
        }

        abyte0 = new BigInteger(1, abyte1);
        BigInteger biginteger = key.getParameters().getN();
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            do
            {
                do
                {
                    biginteger2 = new BigInteger(biginteger.bitLength(), random);
                } while (biginteger2.equals(ECConstants.ZERO));
                biginteger1 = key.getParameters().getG().multiply(biginteger2).getX().toBigInteger().mod(biginteger);
            } while (biginteger1.equals(ECConstants.ZERO));
            BigInteger biginteger3 = ((ECPrivateKeyParameters)key).getD();
            biginteger2 = biginteger2.multiply(abyte0).add(biginteger3.multiply(biginteger1)).mod(biginteger);
        } while (biginteger2.equals(ECConstants.ZERO));
        return (new BigInteger[] {
            biginteger1, biginteger2
        });
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                random = cipherparameters.getRandom();
                key = (ECPrivateKeyParameters)cipherparameters.getParameters();
                return;
            } else
            {
                random = new SecureRandom();
                key = (ECPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            key = (ECPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i != abyte1.length; i++)
        {
            abyte1[i] = abyte0[abyte1.length - 1 - i];
        }

        BigInteger biginteger2 = new BigInteger(1, abyte1);
        for (abyte0 = key.getParameters().getN(); biginteger.compareTo(ECConstants.ONE) < 0 || biginteger.compareTo(abyte0) >= 0 || biginteger1.compareTo(ECConstants.ONE) < 0 || biginteger1.compareTo(abyte0) >= 0;)
        {
            return false;
        }

        biginteger2 = biginteger2.modInverse(abyte0);
        biginteger1 = biginteger1.multiply(biginteger2).mod(abyte0);
        biginteger2 = abyte0.subtract(biginteger).multiply(biginteger2).mod(abyte0);
        return ECAlgorithms.sumOfTwoMultiplies(key.getParameters().getG(), biginteger1, ((ECPublicKeyParameters)key).getQ(), biginteger2).getX().toBigInteger().mod(abyte0).equals(biginteger);
    }
}
