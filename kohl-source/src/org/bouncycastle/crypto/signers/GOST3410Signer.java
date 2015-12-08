// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.GOST3410KeyParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class GOST3410Signer
    implements DSA
{

    GOST3410KeyParameters key;
    SecureRandom random;

    public GOST3410Signer()
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
        GOST3410Parameters gost3410parameters = key.getParameters();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(gost3410parameters.getQ().bitLength(), random);
        } while (biginteger.compareTo(gost3410parameters.getQ()) >= 0);
        BigInteger biginteger1 = gost3410parameters.getA().modPow(biginteger, gost3410parameters.getP()).mod(gost3410parameters.getQ());
        return (new BigInteger[] {
            biginteger1, biginteger.multiply(abyte0).add(((GOST3410PrivateKeyParameters)key).getX().multiply(biginteger1)).mod(gost3410parameters.getQ())
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
                key = (GOST3410PrivateKeyParameters)cipherparameters.getParameters();
                return;
            } else
            {
                random = new SecureRandom();
                key = (GOST3410PrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            key = (GOST3410PublicKeyParameters)cipherparameters;
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
        abyte0 = key.getParameters();
        for (BigInteger biginteger3 = BigInteger.valueOf(0L); biginteger3.compareTo(biginteger) >= 0 || abyte0.getQ().compareTo(biginteger) <= 0 || biginteger3.compareTo(biginteger1) >= 0 || abyte0.getQ().compareTo(biginteger1) <= 0;)
        {
            return false;
        }

        biginteger2 = biginteger2.modPow(abyte0.getQ().subtract(new BigInteger("2")), abyte0.getQ());
        biginteger1 = biginteger1.multiply(biginteger2).mod(abyte0.getQ());
        biginteger2 = abyte0.getQ().subtract(biginteger).multiply(biginteger2).mod(abyte0.getQ());
        return abyte0.getA().modPow(biginteger1, abyte0.getP()).multiply(((GOST3410PublicKeyParameters)key).getY().modPow(biginteger2, abyte0.getP())).mod(abyte0.getP()).mod(abyte0.getQ()).equals(biginteger);
    }
}
