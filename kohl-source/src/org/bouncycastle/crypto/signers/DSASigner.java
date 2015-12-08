// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DSASigner
    implements DSA
{

    DSAKeyParameters key;
    SecureRandom random;

    public DSASigner()
    {
    }

    private BigInteger calculateE(BigInteger biginteger, byte abyte0[])
    {
        if (biginteger.bitLength() >= abyte0.length * 8)
        {
            return new BigInteger(1, abyte0);
        } else
        {
            biginteger = new byte[biginteger.bitLength() / 8];
            System.arraycopy(abyte0, 0, biginteger, 0, biginteger.length);
            return new BigInteger(1, biginteger);
        }
    }

    public BigInteger[] generateSignature(byte abyte0[])
    {
        DSAParameters dsaparameters = key.getParameters();
        abyte0 = calculateE(dsaparameters.getQ(), abyte0);
        int i = dsaparameters.getQ().bitLength();
        BigInteger biginteger;
        do
        {
            biginteger = new BigInteger(i, random);
        } while (biginteger.compareTo(dsaparameters.getQ()) >= 0);
        BigInteger biginteger1 = dsaparameters.getG().modPow(biginteger, dsaparameters.getP()).mod(dsaparameters.getQ());
        return (new BigInteger[] {
            biginteger1, biginteger.modInverse(dsaparameters.getQ()).multiply(abyte0.add(((DSAPrivateKeyParameters)key).getX().multiply(biginteger1))).mod(dsaparameters.getQ())
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
                key = (DSAPrivateKeyParameters)cipherparameters.getParameters();
                return;
            } else
            {
                random = new SecureRandom();
                key = (DSAPrivateKeyParameters)cipherparameters;
                return;
            }
        } else
        {
            key = (DSAPublicKeyParameters)cipherparameters;
            return;
        }
    }

    public boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1)
    {
        DSAParameters dsaparameters = key.getParameters();
        abyte0 = calculateE(dsaparameters.getQ(), abyte0);
        for (BigInteger biginteger2 = BigInteger.valueOf(0L); biginteger2.compareTo(biginteger) >= 0 || dsaparameters.getQ().compareTo(biginteger) <= 0 || biginteger2.compareTo(biginteger1) >= 0 || dsaparameters.getQ().compareTo(biginteger1) <= 0;)
        {
            return false;
        }

        biginteger1 = biginteger1.modInverse(dsaparameters.getQ());
        abyte0 = abyte0.multiply(biginteger1).mod(dsaparameters.getQ());
        biginteger1 = biginteger.multiply(biginteger1).mod(dsaparameters.getQ());
        return dsaparameters.getG().modPow(abyte0, dsaparameters.getP()).multiply(((DSAPublicKeyParameters)key).getY().modPow(biginteger1, dsaparameters.getP())).mod(dsaparameters.getP()).mod(dsaparameters.getQ()).equals(biginteger);
    }
}
