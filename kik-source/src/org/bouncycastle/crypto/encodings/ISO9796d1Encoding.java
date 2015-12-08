// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.encodings;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;

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

    private static byte[] convertOutputDecryptOnly(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    private byte[] decodeBlock(byte abyte0[], int j, int k)
    {
        boolean flag2;
        int i1;
label0:
        {
label1:
            {
                flag2 = false;
                abyte0 = e.processBlock(abyte0, j, k);
                i1 = (g + 13) / 16;
                BigInteger biginteger = new BigInteger(1, abyte0);
                abyte0 = biginteger;
                if (!biginteger.mod(a).equals(b))
                {
                    if (!i.subtract(biginteger).mod(a).equals(b))
                    {
                        break label1;
                    }
                    abyte0 = i.subtract(biginteger);
                }
                abyte0 = convertOutputDecryptOnly(abyte0);
                if ((abyte0[abyte0.length - 1] & 0xf) != 6)
                {
                    throw new InvalidCipherTextException("invalid forcing byte in block");
                }
                break label0;
            }
            throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
        }
        int l;
label2:
        {
            abyte0[abyte0.length - 1] = (byte)((abyte0[abyte0.length - 1] & 0xff) >>> 4 | d[(abyte0[abyte0.length - 2] & 0xff) >> 4] << 4);
            abyte0[0] = (byte)(c[(abyte0[1] & 0xff) >>> 4] << 4 | c[abyte0[1] & 0xf]);
            k = abyte0.length - 1;
            l = 0;
            boolean flag = false;
            j = 1;
            do
            {
                if (k < abyte0.length - i1 * 2)
                {
                    break label2;
                }
                int j1 = c[(abyte0[k] & 0xff) >>> 4] << 4 | c[abyte0[k] & 0xf];
                boolean flag1 = flag;
                if (((abyte0[k - 1] ^ j1) & 0xff) != 0)
                {
                    if (flag)
                    {
                        break;
                    }
                    j = (abyte0[k - 1] ^ j1) & 0xff;
                    l = k - 1;
                    flag1 = true;
                }
                k -= 2;
                flag = flag1;
            } while (true);
            throw new InvalidCipherTextException("invalid tsums in block");
        }
        abyte0[l] = 0;
        byte abyte1[] = new byte[(abyte0.length - l) / 2];
        for (k = ((flag2) ? 1 : 0); k < abyte1.length; k++)
        {
            abyte1[k] = abyte0[k * 2 + l + 1];
        }

        h = j - 1;
        return abyte1;
    }

    private byte[] encodeBlock(byte abyte0[], int j, int k)
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
        return e.processBlock(abyte1, j, abyte1.length - j);
    }

    public int getInputBlockSize()
    {
        int k = e.getInputBlockSize();
        int j = k;
        if (f)
        {
            j = (k + 1) / 2;
        }
        return j;
    }

    public int getOutputBlockSize()
    {
        int j = e.getOutputBlockSize();
        if (f)
        {
            return j;
        } else
        {
            return (j + 1) / 2;
        }
    }

    public int getPadBits()
    {
        return h;
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return e;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        RSAKeyParameters rsakeyparameters;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            rsakeyparameters = (RSAKeyParameters)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            rsakeyparameters = (RSAKeyParameters)cipherparameters;
        }
        e.init(flag, cipherparameters);
        i = rsakeyparameters.getModulus();
        g = i.bitLength();
        f = flag;
    }

    public byte[] processBlock(byte abyte0[], int j, int k)
    {
        if (f)
        {
            return encodeBlock(abyte0, j, k);
        } else
        {
            return decodeBlock(abyte0, j, k);
        }
    }

    public void setPadBits(int j)
    {
        if (j > 7)
        {
            throw new IllegalArgumentException("padBits > 7");
        } else
        {
            h = j;
            return;
        }
    }

}
