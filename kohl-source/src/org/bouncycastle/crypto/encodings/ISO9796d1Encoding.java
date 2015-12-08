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

    private static final BigInteger SIX = BigInteger.valueOf(6L);
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16L);
    private static byte inverse[] = {
        8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 
        13, 10, 14, 9, 0, 7
    };
    private static byte shadows[] = {
        14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 
        11, 6, 7, 10, 12, 1
    };
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits;

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricblockcipher)
    {
        padBits = 0;
        engine = asymmetricblockcipher;
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

    private byte[] decodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        int k;
        boolean flag2;
label0:
        {
            flag2 = false;
            abyte0 = engine.processBlock(abyte0, i, j);
            int l = (bitSize + 13) / 16;
            abyte0 = new BigInteger(1, abyte0);
            if (!abyte0.mod(SIXTEEN).equals(SIX))
            {
                if (modulus.subtract(abyte0).mod(SIXTEEN).equals(SIX))
                {
                    abyte0 = modulus.subtract(abyte0);
                } else
                {
                    throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
                }
            }
            abyte0 = convertOutputDecryptOnly(abyte0);
            if ((abyte0[abyte0.length - 1] & 0xf) != 6)
            {
                throw new InvalidCipherTextException("invalid forcing byte in block");
            }
            abyte0[abyte0.length - 1] = (byte)((abyte0[abyte0.length - 1] & 0xff) >>> 4 | inverse[(abyte0[abyte0.length - 2] & 0xff) >> 4] << 4);
            abyte0[0] = (byte)(shadows[(abyte0[1] & 0xff) >>> 4] << 4 | shadows[abyte0[1] & 0xf]);
            j = abyte0.length - 1;
            k = 0;
            boolean flag = false;
            i = 1;
            do
            {
                if (j < abyte0.length - l * 2)
                {
                    break label0;
                }
                int i1 = shadows[(abyte0[j] & 0xff) >>> 4] << 4 | shadows[abyte0[j] & 0xf];
                boolean flag1 = flag;
                if (((abyte0[j - 1] ^ i1) & 0xff) != 0)
                {
                    if (flag)
                    {
                        break;
                    }
                    i = (abyte0[j - 1] ^ i1) & 0xff;
                    k = j - 1;
                    flag1 = true;
                }
                j -= 2;
                flag = flag1;
            } while (true);
            throw new InvalidCipherTextException("invalid tsums in block");
        }
        abyte0[k] = 0;
        byte abyte1[] = new byte[(abyte0.length - k) / 2];
        for (j = ((flag2) ? 1 : 0); j < abyte1.length; j++)
        {
            abyte1[j] = abyte0[j * 2 + k + 1];
        }

        padBits = i - 1;
        return abyte1;
    }

    private byte[] encodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        byte abyte1[] = new byte[(bitSize + 7) / 8];
        int l = padBits;
        int i1 = (bitSize + 13) / 16;
        int k = 0;
        while (k < i1) 
        {
            if (k > i1 - j)
            {
                System.arraycopy(abyte0, (i + j) - (i1 - k), abyte1, abyte1.length - i1, i1 - k);
            } else
            {
                System.arraycopy(abyte0, i, abyte1, abyte1.length - (k + j), j);
            }
            k += j;
        }
        for (i = abyte1.length - i1 * 2; i != abyte1.length; i += 2)
        {
            byte byte0 = abyte1[(abyte1.length - i1) + i / 2];
            abyte1[i] = (byte)(shadows[(byte0 & 0xff) >>> 4] << 4 | shadows[byte0 & 0xf]);
            abyte1[i + 1] = byte0;
        }

        i = abyte1.length - j * 2;
        abyte1[i] = (byte)(l + 1 ^ abyte1[i]);
        abyte1[abyte1.length - 1] = (byte)(abyte1[abyte1.length - 1] << 4 | 6);
        i = 8 - (bitSize - 1) % 8;
        if (i != 8)
        {
            abyte1[0] = (byte)(abyte1[0] & 255 >>> i);
            abyte1[0] = (byte)(128 >>> i | abyte1[0]);
            i = 0;
        } else
        {
            abyte1[0] = 0;
            abyte1[1] = (byte)(abyte1[1] | 0x80);
            i = 1;
        }
        return engine.processBlock(abyte1, i, abyte1.length - i);
    }

    public int getInputBlockSize()
    {
        int j = engine.getInputBlockSize();
        int i = j;
        if (forEncryption)
        {
            i = (j + 1) / 2;
        }
        return i;
    }

    public int getOutputBlockSize()
    {
        int i = engine.getOutputBlockSize();
        if (forEncryption)
        {
            return i;
        } else
        {
            return (i + 1) / 2;
        }
    }

    public int getPadBits()
    {
        return padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return engine;
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
        engine.init(flag, cipherparameters);
        modulus = rsakeyparameters.getModulus();
        bitSize = modulus.bitLength();
        forEncryption = flag;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        if (forEncryption)
        {
            return encodeBlock(abyte0, i, j);
        } else
        {
            return decodeBlock(abyte0, i, j);
        }
    }

    public void setPadBits(int i)
    {
        if (i > 7)
        {
            throw new IllegalArgumentException("padBits > 7");
        } else
        {
            padBits = i;
            return;
        }
    }

}
