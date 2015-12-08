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
    implements DSA, ECConstants
{

    ECKeyParameters a;
    SecureRandom b;

    public ECDSASigner()
    {
    }

    private BigInteger calculateE(BigInteger biginteger, byte abyte0[])
    {
        if (biginteger.bitLength() > abyte0.length * 8)
        {
            abyte0 = new BigInteger(1, abyte0);
        } else
        {
            int i = abyte0.length * 8;
            BigInteger biginteger1 = new BigInteger(1, abyte0);
            abyte0 = biginteger1;
            if (i - biginteger.bitLength() > 0)
            {
                return biginteger1.shiftRight(i - biginteger.bitLength());
            }
        }
        return abyte0;
    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        BigInteger biginteger = a.getParameters().getN();
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
                    biginteger2 = new BigInteger(i, b);
                } while (biginteger2.equals(f) || biginteger2.compareTo(biginteger) >= 0);
                biginteger1 = a.getParameters().getG().a(biginteger2).b().a().mod(biginteger);
            } while (biginteger1.equals(f));
            BigInteger biginteger3 = ((ECPrivateKeyParameters)a).getD();
            biginteger2 = biginteger2.modInverse(biginteger).multiply(abyte0.add(biginteger3.multiply(biginteger1))).mod(biginteger);
        } while (biginteger2.equals(f));
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
                b = cipherparameters.getRandom();
                a = (ECPrivateKeyParameters)cipherparameters.getParameters();
                return;
            } else
            {
                b = new SecureRandom();
                a = (ECPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            a = (ECPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        BigInteger biginteger2 = a.getParameters().getN();
        for (abyte0 = calculateE(biginteger2, abyte0); biginteger.compareTo(g) < 0 || biginteger.compareTo(biginteger2) >= 0 || biginteger1.compareTo(g) < 0 || biginteger1.compareTo(biginteger2) >= 0;)
        {
            return false;
        }

        biginteger1 = biginteger1.modInverse(biginteger2);
        abyte0 = abyte0.multiply(biginteger1).mod(biginteger2);
        biginteger1 = biginteger.multiply(biginteger1).mod(biginteger2);
        return ECAlgorithms.a(a.getParameters().getG(), abyte0, ((ECPublicKeyParameters)a).getQ(), biginteger1).b().a().mod(biginteger2).equals(biginteger);
    }
}
