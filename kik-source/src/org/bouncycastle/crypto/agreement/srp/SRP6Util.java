// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.BigIntegers;

public class SRP6Util
{

    private static BigInteger a = BigInteger.valueOf(0L);
    private static BigInteger b = BigInteger.valueOf(1L);

    public SRP6Util()
    {
    }

    public static BigInteger calculateK(Digest digest, BigInteger biginteger, BigInteger biginteger1)
    {
        return hashPaddedPair(digest, biginteger, biginteger, biginteger1);
    }

    public static BigInteger calculateU(Digest digest, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        return hashPaddedPair(digest, biginteger, biginteger1, biginteger2);
    }

    public static BigInteger calculateX(Digest digest, BigInteger biginteger, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        byte abyte3[] = new byte[digest.getDigestSize()];
        digest.update(abyte1, 0, abyte1.length);
        digest.update((byte)58);
        digest.update(abyte2, 0, abyte2.length);
        digest.doFinal(abyte3, 0);
        digest.update(abyte0, 0, abyte0.length);
        digest.update(abyte3, 0, abyte3.length);
        digest.doFinal(abyte3, 0);
        return (new BigInteger(1, abyte3)).mod(biginteger);
    }

    public static BigInteger generatePrivateValue(Digest digest, BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        int i = Math.min(256, biginteger.bitLength() / 2);
        return BigIntegers.a(b.shiftLeft(i - 1), biginteger.subtract(b), securerandom);
    }

    private static byte[] getPadded(BigInteger biginteger, int i)
    {
        biginteger = BigIntegers.a(biginteger);
        if (biginteger.length < i)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(biginteger, 0, abyte0, i - biginteger.length, biginteger.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    private static BigInteger hashPaddedPair(Digest digest, BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        int i = (biginteger.bitLength() + 7) / 8;
        biginteger1 = getPadded(biginteger1, i);
        biginteger2 = getPadded(biginteger2, i);
        digest.update(biginteger1, 0, biginteger1.length);
        digest.update(biginteger2, 0, biginteger2.length);
        biginteger1 = new byte[digest.getDigestSize()];
        digest.doFinal(biginteger1, 0);
        return (new BigInteger(1, biginteger1)).mod(biginteger);
    }

    public static BigInteger validatePublicValue(BigInteger biginteger, BigInteger biginteger1)
    {
        biginteger = biginteger1.mod(biginteger);
        if (biginteger.equals(a))
        {
            throw new CryptoException("Invalid public value: 0");
        } else
        {
            return biginteger;
        }
    }

}
