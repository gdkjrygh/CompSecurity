// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAValidationParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;

public class DSAParametersGenerator
{

    private static final BigInteger e = BigInteger.valueOf(0L);
    private static final BigInteger f = BigInteger.valueOf(1L);
    private static final BigInteger g = BigInteger.valueOf(2L);
    private int a;
    private int b;
    private int c;
    private SecureRandom d;

    public DSAParametersGenerator()
    {
    }

    private static BigInteger a(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        biginteger1 = biginteger.subtract(f).divide(biginteger1);
        BigInteger biginteger2 = biginteger.subtract(g);
        BigInteger biginteger3;
        do
        {
            biginteger3 = BigIntegers.a(g, biginteger2, securerandom).modPow(biginteger1, biginteger);
        } while (biginteger3.bitLength() <= 1);
        return biginteger3;
    }

    private static void a(Digest digest, byte abyte0[], byte abyte1[])
    {
        digest.a(abyte0, 0, abyte0.length);
        digest.a(abyte1, 0);
    }

    private static void a(byte abyte0[])
    {
        int i = abyte0.length - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
            byte byte0 = (byte)(abyte0[i] + 1 & 0xff);
            abyte0[i] = byte0;
            if (byte0 != 0)
            {
                break;
            }
            i--;
        } while (true);
    }

    private DSAParameters b()
    {
        byte abyte0[] = new byte[20];
        byte abyte1[] = new byte[20];
        byte abyte2[] = new byte[20];
        byte abyte3[] = new byte[20];
        SHA1Digest sha1digest = new SHA1Digest();
        int l = (a - 1) / 160;
        byte abyte4[] = new byte[a / 8];
        do
        {
            BigInteger biginteger;
            do
            {
                d.nextBytes(abyte0);
                a(sha1digest, abyte0, abyte1);
                System.arraycopy(abyte0, 0, abyte2, 0, 20);
                a(abyte2);
                a(sha1digest, abyte2, abyte2);
                for (int i = 0; i != 20; i++)
                {
                    abyte3[i] = (byte)(abyte1[i] ^ abyte2[i]);
                }

                abyte3[0] = (byte)(abyte3[0] | 0xffffff80);
                abyte3[19] = (byte)(abyte3[19] | 1);
                biginteger = new BigInteger(1, abyte3);
            } while (!biginteger.isProbablePrime(c));
            byte abyte5[] = Arrays.b(abyte0);
            a(abyte5);
            int j = 0;
            while (j < 4096) 
            {
                for (int k = 0; k < l; k++)
                {
                    a(abyte5);
                    a(sha1digest, abyte5, abyte1);
                    System.arraycopy(abyte1, 0, abyte4, abyte4.length - (k + 1) * 20, 20);
                }

                a(abyte5);
                a(sha1digest, abyte5, abyte1);
                System.arraycopy(abyte1, 20 - (abyte4.length - l * 20), abyte4, 0, abyte4.length - l * 20);
                abyte4[0] = (byte)(abyte4[0] | 0xffffff80);
                BigInteger biginteger1 = new BigInteger(1, abyte4);
                biginteger1 = biginteger1.subtract(biginteger1.mod(biginteger.shiftLeft(1)).subtract(f));
                if (biginteger1.bitLength() == a && biginteger1.isProbablePrime(c))
                {
                    return new DSAParameters(biginteger1, biginteger, a(biginteger1, biginteger, d), new DSAValidationParameters(abyte0, j));
                }
                j++;
            }
        } while (true);
    }

    public final DSAParameters a()
    {
        if (a > 1024)
        {
            SHA256Digest sha256digest = new SHA256Digest();
            int l = sha256digest.b() * 8;
            byte abyte0[] = new byte[b / 8];
            int i1 = (a - 1) / l;
            int j1 = a;
            byte abyte1[] = new byte[sha256digest.b()];
            do
            {
                BigInteger biginteger4;
                do
                {
                    d.nextBytes(abyte0);
                    a(((Digest) (sha256digest)), abyte0, abyte1);
                    BigInteger biginteger = (new BigInteger(1, abyte1)).mod(f.shiftLeft(b - 1));
                    biginteger4 = f.shiftLeft(b - 1).add(biginteger).add(f).subtract(biginteger.mod(g));
                } while (!biginteger4.isProbablePrime(c));
                byte abyte2[] = Arrays.b(abyte0);
                int k1 = a;
                int i = 0;
                while (i < k1 * 4) 
                {
                    BigInteger biginteger1 = e;
                    int k = 0;
                    for (int j = 0; k <= i1; j += l)
                    {
                        a(abyte2);
                        a(((Digest) (sha256digest)), abyte2, abyte1);
                        BigInteger biginteger3 = new BigInteger(1, abyte1);
                        BigInteger biginteger2 = biginteger3;
                        if (k == i1)
                        {
                            biginteger2 = biginteger3.mod(f.shiftLeft((j1 - 1) % l));
                        }
                        biginteger1 = biginteger1.add(biginteger2.shiftLeft(j));
                        k++;
                    }

                    biginteger1 = biginteger1.add(f.shiftLeft(a - 1));
                    biginteger1 = biginteger1.subtract(biginteger1.mod(biginteger4.shiftLeft(1)).subtract(f));
                    if (biginteger1.bitLength() == a && biginteger1.isProbablePrime(c))
                    {
                        return new DSAParameters(biginteger1, biginteger4, a(biginteger1, biginteger4, d), new DSAValidationParameters(abyte0, i));
                    }
                    i++;
                }
            } while (true);
        } else
        {
            return b();
        }
    }

    public final void a(int i, int j, SecureRandom securerandom)
    {
        int k;
        if (i > 1024)
        {
            k = 256;
        } else
        {
            k = 160;
        }
        a = i;
        b = k;
        c = j;
        d = securerandom;
    }

}
