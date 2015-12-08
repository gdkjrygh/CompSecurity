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

public class ECDSASigner
    implements ECConstants, DSA
{

    ECKeyParameters key;
    SecureRandom random;

    public ECDSASigner()
    {
    }

    private BigInteger calculateE(BigInteger biginteger, byte abyte0[])
    {
        int i = biginteger.bitLength();
        int j = abyte0.length * 8;
        if (i >= j)
        {
            return new BigInteger(1, abyte0);
        } else
        {
            return (new BigInteger(1, abyte0)).shiftRight(j - i);
        }
    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        BigInteger biginteger = key.getParameters().getN();
        abyte0 = calculateE(biginteger, abyte0);
        BigInteger biginteger1;
        BigInteger biginteger2;
        do
        {
            int i = biginteger.bitLength();
            do
            {
                do
                {
                    biginteger2 = new BigInteger(i, random);
                } while (biginteger2.equals(ZERO) || biginteger2.compareTo(biginteger) >= 0);
                biginteger1 = key.getParameters().getG().multiply(biginteger2).getX().toBigInteger().mod(biginteger);
            } while (biginteger1.equals(ZERO));
            BigInteger biginteger3 = ((ECPrivateKeyParameters)key).getD();
            biginteger2 = biginteger2.modInverse(biginteger).multiply(abyte0.add(biginteger3.multiply(biginteger1))).mod(biginteger);
        } while (biginteger2.equals(ZERO));
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
        BigInteger biginteger2 = key.getParameters().getN();
        for (abyte0 = calculateE(biginteger2, abyte0); biginteger.compareTo(ONE) < 0 || biginteger.compareTo(biginteger2) >= 0 || biginteger1.compareTo(ONE) < 0 || biginteger1.compareTo(biginteger2) >= 0;)
        {
            return false;
        }

        biginteger1 = biginteger1.modInverse(biginteger2);
        abyte0 = abyte0.multiply(biginteger1).mod(biginteger2);
        biginteger1 = biginteger.multiply(biginteger1).mod(biginteger2);
        return ECAlgorithms.sumOfTwoMultiplies(key.getParameters().getG(), abyte0, ((ECPublicKeyParameters)key).getQ(), biginteger1).getX().toBigInteger().mod(biginteger2).equals(biginteger);
    }
}
