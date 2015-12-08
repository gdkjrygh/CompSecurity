// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.encodings;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;

public class ISO9796d1Encoding
    implements AsymmetricBlockCipher
{

    private static final BigInteger a = BigInteger.valueOf(16L);
    private static final BigInteger b = BigInteger.valueOf(6L);
    private static byte c[] = {
        14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 
        11, 6, 7, 10, 12, 1
    };
    private static byte d[] = {
        8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 
        13, 10, 14, 9, 0, 7
    };
    private AsymmetricBlockCipher e;
    private boolean f;
    private int g;
    private int h;
    private BigInteger i;

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricblockcipher)
    {
        h = 0;
        e = asymmetricblockcipher;
    }

    public final int a()
    {
        int k = e.a();
        int j = k;
        if (f)
        {
            j = (k + 1) / 2;
        }
        return j;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        RSAKeyParameters rsakeyparameters;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            rsakeyparameters = (RSAKeyParameters)((ParametersWithRandom)cipherparameters).b();
        } else
        {
            rsakeyparameters = (RSAKeyParameters)cipherparameters;
        }
        e.a(flag, cipherparameters);
        i = rsakeyparameters.b();
        g = i.bitLength();
        f = flag;
    }

    public final byte[] a(byte abyte0[], int j, int k)
    {
        int k1;
        boolean flag2;
label0:
        {
            flag2 = false;
            if (f)
            {
                byte abyte1[] = new byte[(g + 7) / 8];
                int i1 = h;
                int j1 = (g + 13) / 16;
                int l = 0;
                while (l < j1) 
                {
                    if (l > j1 - k)
                    {
                        System.arraycopy(abyte0, (j + k) - (j1 - l), abyte1, abyte1.length - j1, j1 - l);
                    } else
                    {
                        System.arraycopy(abyte0, j, abyte1, abyte1.length - (l + k), k);
                    }
                    l += k;
                }
                for (j = abyte1.length - j1 * 2; j != abyte1.length; j += 2)
                {
                    byte byte0 = abyte1[(abyte1.length - j1) + j / 2];
                    abyte1[j] = (byte)(c[(byte0 & 0xff) >>> 4] << 4 | c[byte0 & 0xf]);
                    abyte1[j + 1] = byte0;
                }

                j = abyte1.length - k * 2;
                abyte1[j] = (byte)(i1 + 1 ^ abyte1[j]);
                abyte1[abyte1.length - 1] = (byte)(abyte1[abyte1.length - 1] << 4 | 6);
                j = 8 - (g - 1) % 8;
                if (j != 8)
                {
                    abyte1[0] = (byte)(abyte1[0] & 255 >>> j);
                    abyte1[0] = (byte)(128 >>> j | abyte1[0]);
                    j = 0;
                } else
                {
                    abyte1[0] = 0;
                    abyte1[1] = (byte)(abyte1[1] | 0x80);
                    j = 1;
                }
                return e.a(abyte1, j, abyte1.length - j);
            }
            abyte0 = e.a(abyte0, j, k);
            int l1 = (g + 13) / 16;
            abyte0 = new BigInteger(1, abyte0);
            if (!abyte0.mod(a).equals(b))
            {
                if (i.subtract(abyte0).mod(a).equals(b))
                {
                    abyte0 = i.subtract(abyte0);
                } else
                {
                    throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
                }
            }
            abyte0 = abyte0.toByteArray();
            if (abyte0[0] == 0)
            {
                byte abyte2[] = new byte[abyte0.length - 1];
                System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
                abyte0 = abyte2;
            }
            if ((abyte0[abyte0.length - 1] & 0xf) != 6)
            {
                throw new InvalidCipherTextException("invalid forcing byte in block");
            }
            abyte0[abyte0.length - 1] = (byte)((abyte0[abyte0.length - 1] & 0xff) >>> 4 | d[(abyte0[abyte0.length - 2] & 0xff) >> 4] << 4);
            abyte0[0] = (byte)(c[(abyte0[1] & 0xff) >>> 4] << 4 | c[abyte0[1] & 0xf]);
            j = abyte0.length - 1;
            k = 0;
            boolean flag = false;
            k1 = 1;
            do
            {
                if (j < abyte0.length - l1 * 2)
                {
                    break label0;
                }
                int i2 = c[(abyte0[j] & 0xff) >>> 4] << 4 | c[abyte0[j] & 0xf];
                boolean flag1 = flag;
                if (((abyte0[j - 1] ^ i2) & 0xff) != 0)
                {
                    if (flag)
                    {
                        break;
                    }
                    k1 = (abyte0[j - 1] ^ i2) & 0xff;
                    k = j - 1;
                    flag1 = true;
                }
                j -= 2;
                flag = flag1;
            } while (true);
            throw new InvalidCipherTextException("invalid tsums in block");
        }
        abyte0[k] = 0;
        byte abyte3[] = new byte[(abyte0.length - k) / 2];
        for (j = ((flag2) ? 1 : 0); j < abyte3.length; j++)
        {
            abyte3[j] = abyte0[j * 2 + k + 1];
        }

        h = k1 - 1;
        return abyte3;
    }

    public final int b()
    {
        int j = e.b();
        if (f)
        {
            return j;
        } else
        {
            return (j + 1) / 2;
        }
    }

}
