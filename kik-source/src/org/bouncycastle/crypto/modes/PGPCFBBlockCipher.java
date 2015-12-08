// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PGPCFBBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private byte d[];
    private BlockCipher e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public PGPCFBBlockCipher(BlockCipher blockcipher, boolean flag)
    {
        e = blockcipher;
        i = flag;
        g = blockcipher.getBlockSize();
        a = new byte[g];
        b = new byte[g];
        c = new byte[g];
        d = new byte[g];
    }

    private int decryptBlock(byte abyte0[], int j, byte abyte1[], int k)
    {
        boolean flag = false;
        if (g + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.processBlock(b, 0, c, 0);
        int l = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= g)
            {
                break;
            }
            abyte1[k + l] = encryptByte(abyte0[j + l], l);
            l++;
        } while (true);
        for (; i1 < g; i1++)
        {
            b[i1] = abyte0[j + i1];
        }

        return g;
    }

    private int decryptBlockWithIV(byte abyte0[], int j, byte abyte1[], int k)
    {
        if (g + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (f == 0)
        {
            for (k = 0; k < g; k++)
            {
                b[k] = abyte0[j + k];
            }

            e.processBlock(b, 0, c, 0);
            f = f + g;
            return 0;
        }
        if (f == g)
        {
            System.arraycopy(abyte0, j, d, 0, g);
            System.arraycopy(b, 2, b, 0, g - 2);
            b[g - 2] = d[0];
            b[g - 1] = d[1];
            e.processBlock(b, 0, c, 0);
            for (j = 0; j < g - 2; j++)
            {
                abyte1[k + j] = encryptByte(d[j + 2], j);
            }

            System.arraycopy(d, 2, b, 0, g - 2);
            f = f + 2;
            return g - 2;
        }
        if (f >= g + 2)
        {
            System.arraycopy(abyte0, j, d, 0, g);
            abyte1[k + 0] = encryptByte(d[0], g - 2);
            abyte1[k + 1] = encryptByte(d[1], g - 1);
            System.arraycopy(d, 0, b, g - 2, 2);
            e.processBlock(b, 0, c, 0);
            for (j = 0; j < g - 2; j++)
            {
                abyte1[k + j + 2] = encryptByte(d[j + 2], j);
            }

            System.arraycopy(d, 2, b, 0, g - 2);
        }
        return g;
    }

    private int encryptBlock(byte abyte0[], int j, byte abyte1[], int k)
    {
        boolean flag = false;
        if (g + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.processBlock(b, 0, c, 0);
        int l = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= g)
            {
                break;
            }
            abyte1[k + l] = encryptByte(abyte0[j + l], l);
            l++;
        } while (true);
        for (; i1 < g; i1++)
        {
            b[i1] = abyte1[k + i1];
        }

        return g;
    }

    private int encryptBlockWithIV(byte abyte0[], int j, byte abyte1[], int k)
    {
        if (g + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (f == 0)
        {
            e.processBlock(b, 0, c, 0);
            for (int l = 0; l < g; l++)
            {
                abyte1[k + l] = encryptByte(a[l], l);
            }

            System.arraycopy(abyte1, k, b, 0, g);
            e.processBlock(b, 0, c, 0);
            abyte1[g + k] = encryptByte(a[g - 2], 0);
            abyte1[g + k + 1] = encryptByte(a[g - 1], 1);
            System.arraycopy(abyte1, k + 2, b, 0, g);
            e.processBlock(b, 0, c, 0);
            for (int i1 = 0; i1 < g; i1++)
            {
                abyte1[g + k + 2 + i1] = encryptByte(abyte0[j + i1], i1);
            }

            System.arraycopy(abyte1, g + k + 2, b, 0, g);
            f = f + (g * 2 + 2);
            return g * 2 + 2;
        }
        if (f >= g + 2)
        {
            e.processBlock(b, 0, c, 0);
            for (int j1 = 0; j1 < g; j1++)
            {
                abyte1[k + j1] = encryptByte(abyte0[j + j1], j1);
            }

            System.arraycopy(abyte1, k, b, 0, g);
        }
        return g;
    }

    private byte encryptByte(byte byte0, int j)
    {
        return (byte)(c[j] ^ byte0);
    }

    public String getAlgorithmName()
    {
        if (i)
        {
            return (new StringBuilder()).append(e.getAlgorithmName()).append("/PGPCFBwithIV").toString();
        } else
        {
            return (new StringBuilder()).append(e.getAlgorithmName()).append("/PGPCFB").toString();
        }
    }

    public int getBlockSize()
    {
        return e.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return e;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        h = flag;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < a.length)
            {
                System.arraycopy(abyte0, 0, a, a.length - abyte0.length, abyte0.length);
                for (int j = 0; j < a.length - abyte0.length; j++)
                {
                    a[j] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, a, 0, a.length);
            }
            reset();
            e.init(true, cipherparameters.getParameters());
            return;
        } else
        {
            reset();
            e.init(true, cipherparameters);
            return;
        }
    }

    public int processBlock(byte abyte0[], int j, byte abyte1[], int k)
    {
        if (i)
        {
            if (h)
            {
                return encryptBlockWithIV(abyte0, j, abyte1, k);
            } else
            {
                return decryptBlockWithIV(abyte0, j, abyte1, k);
            }
        }
        if (h)
        {
            return encryptBlock(abyte0, j, abyte1, k);
        } else
        {
            return decryptBlock(abyte0, j, abyte1, k);
        }
    }

    public void reset()
    {
        f = 0;
        int j = 0;
        while (j != b.length) 
        {
            if (i)
            {
                b[j] = 0;
            } else
            {
                b[j] = a[j];
            }
            j++;
        }
        e.reset();
    }
}
