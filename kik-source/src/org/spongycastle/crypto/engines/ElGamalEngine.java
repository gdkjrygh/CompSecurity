// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ElGamalKeyParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.BigIntegers;

public class ElGamalEngine
    implements AsymmetricBlockCipher
{

    private static final BigInteger e = BigInteger.valueOf(0L);
    private static final BigInteger f = BigInteger.valueOf(1L);
    private static final BigInteger g = BigInteger.valueOf(2L);
    private ElGamalKeyParameters a;
    private SecureRandom b;
    private boolean c;
    private int d;

    public ElGamalEngine()
    {
    }

    public final int a()
    {
        if (c)
        {
            return (d - 1) / 8;
        } else
        {
            return ((d + 7) / 8) * 2;
        }
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            a = (ElGamalKeyParameters)cipherparameters.b();
            b = cipherparameters.a();
        } else
        {
            a = (ElGamalKeyParameters)cipherparameters;
            b = new SecureRandom();
        }
        c = flag;
        d = a.b().a().bitLength();
        if (flag)
        {
            if (!(a instanceof ElGamalPublicKeyParameters))
            {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else
        if (!(a instanceof ElGamalPrivateKeyParameters))
        {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte2[];
        BigInteger biginteger2;
label0:
        {
            if (a == null)
            {
                throw new IllegalStateException("ElGamal engine not initialised");
            }
            int k;
            if (c)
            {
                k = ((d - 1) + 7) / 8;
            } else
            {
                k = a();
            }
            if (j > k)
            {
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            biginteger2 = a.b().a();
            if (a instanceof ElGamalPrivateKeyParameters)
            {
                byte abyte4[] = new byte[j / 2];
                byte abyte1[] = new byte[j / 2];
                System.arraycopy(abyte0, i, abyte4, 0, abyte4.length);
                System.arraycopy(abyte0, abyte4.length + i, abyte1, 0, abyte1.length);
                abyte0 = new BigInteger(1, abyte4);
                BigInteger biginteger = new BigInteger(1, abyte1);
                ElGamalPrivateKeyParameters elgamalprivatekeyparameters = (ElGamalPrivateKeyParameters)a;
                return BigIntegers.a(abyte0.modPow(biginteger2.subtract(f).subtract(elgamalprivatekeyparameters.c()), biginteger2).multiply(biginteger).mod(biginteger2));
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
        ElGamalPublicKeyParameters elgamalpublickeyparameters = (ElGamalPublicKeyParameters)a;
        i = biginteger2.bitLength();
        for (abyte0 = new BigInteger(i, b); abyte0.equals(e) || abyte0.compareTo(biginteger2.subtract(g)) > 0; abyte0 = new BigInteger(i, b)) { }
        BigInteger biginteger3 = a.b().b().modPow(abyte0, biginteger2);
        biginteger1 = biginteger1.multiply(elgamalpublickeyparameters.c().modPow(abyte0, biginteger2)).mod(biginteger2);
        abyte0 = biginteger3.toByteArray();
        biginteger1 = biginteger1.toByteArray();
        byte abyte3[] = new byte[b()];
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

    public final int b()
    {
        if (c)
        {
            return ((d + 7) / 8) * 2;
        } else
        {
            return (d - 1) / 8;
        }
    }

}
