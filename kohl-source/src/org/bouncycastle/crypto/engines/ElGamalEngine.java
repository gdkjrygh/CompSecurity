// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

public class ElGamalEngine
    implements AsymmetricBlockCipher
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final BigInteger TWO = BigInteger.valueOf(2L);
    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;

    public ElGamalEngine()
    {
    }

    public int getInputBlockSize()
    {
        if (forEncryption)
        {
            return (bitSize - 1) / 8;
        } else
        {
            return ((bitSize + 7) / 8) * 2;
        }
    }

    public int getOutputBlockSize()
    {
        if (forEncryption)
        {
            return ((bitSize + 7) / 8) * 2;
        } else
        {
            return (bitSize - 1) / 8;
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            key = (ElGamalKeyParameters)cipherparameters.getParameters();
            random = cipherparameters.getRandom();
        } else
        {
            key = (ElGamalKeyParameters)cipherparameters;
            random = new SecureRandom();
        }
        forEncryption = flag;
        bitSize = key.getParameters().getP().bitLength();
        if (flag)
        {
            if (!(key instanceof ElGamalPublicKeyParameters))
            {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else
        if (!(key instanceof ElGamalPrivateKeyParameters))
        {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        byte abyte2[];
        BigInteger biginteger2;
label0:
        {
            if (key == null)
            {
                throw new IllegalStateException("ElGamal engine not initialised");
            }
            int k;
            if (forEncryption)
            {
                k = ((bitSize - 1) + 7) / 8;
            } else
            {
                k = getInputBlockSize();
            }
            if (j > k)
            {
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            biginteger2 = key.getParameters().getP();
            if (key instanceof ElGamalPrivateKeyParameters)
            {
                byte abyte4[] = new byte[j / 2];
                byte abyte1[] = new byte[j / 2];
                System.arraycopy(abyte0, i, abyte4, 0, abyte4.length);
                System.arraycopy(abyte0, abyte4.length + i, abyte1, 0, abyte1.length);
                abyte0 = new BigInteger(1, abyte4);
                BigInteger biginteger = new BigInteger(1, abyte1);
                ElGamalPrivateKeyParameters elgamalprivatekeyparameters = (ElGamalPrivateKeyParameters)key;
                return BigIntegers.asUnsignedByteArray(abyte0.modPow(biginteger2.subtract(ONE).subtract(elgamalprivatekeyparameters.getX()), biginteger2).multiply(biginteger).mod(biginteger2));
            }
            if (i == 0)
            {
                abyte2 = abyte0;
                if (j == abyte0.length)
                {
                    break label0;
                }
            }
            abyte2 = new byte[j];
            System.arraycopy(abyte0, i, abyte2, 0, j);
        }
        BigInteger biginteger1 = new BigInteger(1, abyte2);
        if (biginteger1.bitLength() >= biginteger2.bitLength())
        {
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        ElGamalPublicKeyParameters elgamalpublickeyparameters = (ElGamalPublicKeyParameters)key;
        i = biginteger2.bitLength();
        for (abyte0 = new BigInteger(i, random); abyte0.equals(ZERO) || abyte0.compareTo(biginteger2.subtract(TWO)) > 0; abyte0 = new BigInteger(i, random)) { }
        BigInteger biginteger3 = key.getParameters().getG().modPow(abyte0, biginteger2);
        biginteger1 = biginteger1.multiply(elgamalpublickeyparameters.getY().modPow(abyte0, biginteger2)).mod(biginteger2);
        abyte0 = biginteger3.toByteArray();
        biginteger1 = biginteger1.toByteArray();
        byte abyte3[] = new byte[getOutputBlockSize()];
        if (abyte0.length > abyte3.length / 2)
        {
            System.arraycopy(abyte0, 1, abyte3, abyte3.length / 2 - (abyte0.length - 1), abyte0.length - 1);
        } else
        {
            System.arraycopy(abyte0, 0, abyte3, abyte3.length / 2 - abyte0.length, abyte0.length);
        }
        if (biginteger1.length > abyte3.length / 2)
        {
            System.arraycopy(biginteger1, 1, abyte3, abyte3.length - (biginteger1.length - 1), biginteger1.length - 1);
            return abyte3;
        } else
        {
            System.arraycopy(biginteger1, 0, abyte3, abyte3.length - biginteger1.length, biginteger1.length);
            return abyte3;
        }
    }

}
