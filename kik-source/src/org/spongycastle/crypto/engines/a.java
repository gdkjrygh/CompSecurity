// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

final class a
{

    private RSAKeyParameters a;
    private boolean b;

    a()
    {
    }

    public final int a()
    {
        int i = a.b().bitLength();
        if (b)
        {
            return (i + 7) / 8 - 1;
        } else
        {
            return (i + 7) / 8;
        }
    }

    public final BigInteger a(byte abyte0[], int i, int j)
    {
        byte abyte1[];
label0:
        {
            if (j > a() + 1)
            {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (j == a() + 1 && !b)
            {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (i == 0)
            {
                abyte1 = abyte0;
                if (j == abyte0.length)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
        }
        abyte0 = new BigInteger(1, abyte1);
        if (abyte0.compareTo(a.b()) >= 0)
        {
            throw new DataLengthException("input too large for RSA cipher.");
        } else
        {
            return abyte0;
        }
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            a = (RSAKeyParameters)((ParametersWithRandom)cipherparameters).b();
        } else
        {
            a = (RSAKeyParameters)cipherparameters;
        }
        b = flag;
    }

    public final byte[] a(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (b)
        {
            if (biginteger[0] == 0 && biginteger.length > b())
            {
                byte abyte0[] = new byte[biginteger.length - 1];
                System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
                return abyte0;
            }
            if (biginteger.length < b())
            {
                byte abyte1[] = new byte[b()];
                System.arraycopy(biginteger, 0, abyte1, abyte1.length - biginteger.length, biginteger.length);
                return abyte1;
            }
        } else
        if (biginteger[0] == 0)
        {
            byte abyte2[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte2, 0, abyte2.length);
            return abyte2;
        }
        return biginteger;
    }

    public final int b()
    {
        int i = a.b().bitLength();
        if (b)
        {
            return (i + 7) / 8;
        } else
        {
            return (i + 7) / 8 - 1;
        }
    }

    public final BigInteger b(BigInteger biginteger)
    {
        if (a instanceof RSAPrivateCrtKeyParameters)
        {
            Object obj = (RSAPrivateCrtKeyParameters)a;
            BigInteger biginteger1 = ((RSAPrivateCrtKeyParameters) (obj)).e();
            BigInteger biginteger2 = ((RSAPrivateCrtKeyParameters) (obj)).f();
            BigInteger biginteger4 = ((RSAPrivateCrtKeyParameters) (obj)).g();
            BigInteger biginteger3 = ((RSAPrivateCrtKeyParameters) (obj)).h();
            obj = ((RSAPrivateCrtKeyParameters) (obj)).i();
            biginteger4 = biginteger.remainder(biginteger1).modPow(biginteger4, biginteger1);
            biginteger = biginteger.remainder(biginteger2).modPow(biginteger3, biginteger2);
            return biginteger4.subtract(biginteger).multiply(((BigInteger) (obj))).mod(biginteger1).multiply(biginteger2).add(biginteger);
        } else
        {
            return biginteger.modPow(a.c(), a.b());
        }
    }
}
