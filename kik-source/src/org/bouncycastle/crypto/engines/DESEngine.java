// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class DESEngine
    implements BlockCipher
{

    private static final short b[] = {
        128, 64, 32, 16, 8, 4, 2, 1
    };
    private static final int c[] = {
        0x800000, 0x400000, 0x200000, 0x100000, 0x80000, 0x40000, 0x20000, 0x10000, 32768, 16384, 
        8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 
        8, 4, 2, 1
    };
    private static final byte d[] = {
        56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 
        41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 
        26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 
        46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 
        29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 
        12, 4, 27, 19, 11, 3
    };
    private static final byte e[] = {
        1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 
        19, 21, 23, 25, 27, 28
    };
    private static final byte f[] = {
        13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 
        20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 
        26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 
        29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 
        33, 52, 45, 41, 49, 35, 28, 31
    };
    private static final int g[] = {
        0x1010400, 0, 0x10000, 0x1010404, 0x1010004, 0x10404, 4, 0x10000, 1024, 0x1010400, 
        0x1010404, 1024, 0x1000404, 0x1010004, 0x1000000, 4, 1028, 0x1000400, 0x1000400, 0x10400, 
        0x10400, 0x1010000, 0x1010000, 0x1000404, 0x10004, 0x1000004, 0x1000004, 0x10004, 0, 1028, 
        0x10404, 0x1000000, 0x10000, 0x1010404, 4, 0x1010000, 0x1010400, 0x1000000, 0x1000000, 1024, 
        0x1010004, 0x10000, 0x10400, 0x1000004, 1024, 4, 0x1000404, 0x10404, 0x1010404, 0x10004, 
        0x1010000, 0x1000404, 0x1000004, 1028, 0x10404, 0x1010400, 1028, 0x1000400, 0x1000400, 0, 
        0x10004, 0x10400, 0, 0x1010004
    };
    private static final int h[] = {
        0x80108020, 0x80008000, 32768, 0x108020, 0x100000, 32, 0x80100020, 0x80008020, 0x80000020, 0x80108020, 
        0x80108000, 0x80000000, 0x80008000, 0x100000, 32, 0x80100020, 0x108000, 0x100020, 0x80008020, 0, 
        0x80000000, 32768, 0x108020, 0x80100000, 0x100020, 0x80000020, 0, 0x108000, 32800, 0x80108000, 
        0x80100000, 32800, 0, 0x108020, 0x80100020, 0x100000, 0x80008020, 0x80100000, 0x80108000, 32768, 
        0x80100000, 0x80008000, 32, 0x80108020, 0x108020, 32, 32768, 0x80000000, 32800, 0x80108000, 
        0x100000, 0x80000020, 0x100020, 0x80008020, 0x80000020, 0x100020, 0x108000, 0, 0x80008000, 32800, 
        0x80000000, 0x80100020, 0x80108020, 0x108000
    };
    private static final int i[] = {
        520, 0x8020200, 0, 0x8020008, 0x8000200, 0, 0x20208, 0x8000200, 0x20008, 0x8000008, 
        0x8000008, 0x20000, 0x8020208, 0x20008, 0x8020000, 520, 0x8000000, 8, 0x8020200, 512, 
        0x20200, 0x8020000, 0x8020008, 0x20208, 0x8000208, 0x20200, 0x20000, 0x8000208, 8, 0x8020208, 
        512, 0x8000000, 0x8020200, 0x8000000, 0x20008, 520, 0x20000, 0x8020200, 0x8000200, 0, 
        512, 0x20008, 0x8020208, 0x8000200, 0x8000008, 512, 0, 0x8020008, 0x8000208, 0x20000, 
        0x8000000, 0x8020208, 8, 0x20208, 0x20200, 0x8000008, 0x8020000, 0x8000208, 520, 0x8020000, 
        0x20208, 8, 0x8020008, 0x20200
    };
    private static final int j[] = {
        0x802001, 8321, 8321, 128, 0x802080, 0x800081, 0x800001, 8193, 0, 0x802000, 
        0x802000, 0x802081, 129, 0, 0x800080, 0x800001, 1, 8192, 0x800000, 0x802001, 
        128, 0x800000, 8193, 8320, 0x800081, 1, 8320, 0x800080, 8192, 0x802080, 
        0x802081, 129, 0x800080, 0x800001, 0x802000, 0x802081, 129, 0, 0, 0x802000, 
        8320, 0x800080, 0x800081, 1, 0x802001, 8321, 8321, 128, 0x802081, 129, 
        1, 8192, 0x800001, 8193, 0x802080, 0x800081, 8193, 8320, 0x800000, 0x802001, 
        128, 0x800000, 8192, 0x802080
    };
    private static final int k[] = {
        256, 0x2080100, 0x2080000, 0x42000100, 0x80000, 256, 0x40000000, 0x2080000, 0x40080100, 0x80000, 
        0x2000100, 0x40080100, 0x42000100, 0x42080000, 0x80100, 0x40000000, 0x2000000, 0x40080000, 0x40080000, 0, 
        0x40000100, 0x42080100, 0x42080100, 0x2000100, 0x42080000, 0x40000100, 0, 0x42000000, 0x2080100, 0x2000000, 
        0x42000000, 0x80100, 0x80000, 0x42000100, 256, 0x2000000, 0x40000000, 0x2080000, 0x42000100, 0x40080100, 
        0x2000100, 0x40000000, 0x42080000, 0x2080100, 0x40080100, 256, 0x2000000, 0x42080000, 0x42080100, 0x80100, 
        0x42000000, 0x42080100, 0x2080000, 0, 0x40080000, 0x42000000, 0x80100, 0x2000100, 0x40000100, 0x80000, 
        0, 0x40080000, 0x2080100, 0x40000100
    };
    private static final int l[] = {
        0x20000010, 0x20400000, 16384, 0x20404010, 0x20400000, 16, 0x20404010, 0x400000, 0x20004000, 0x404010, 
        0x400000, 0x20000010, 0x400010, 0x20004000, 0x20000000, 16400, 0, 0x400010, 0x20004010, 16384, 
        0x404000, 0x20004010, 16, 0x20400010, 0x20400010, 0, 0x404010, 0x20404000, 16400, 0x404000, 
        0x20404000, 0x20000000, 0x20004000, 16, 0x20400010, 0x404000, 0x20404010, 0x400000, 16400, 0x20000010, 
        0x400000, 0x20004000, 0x20000000, 16400, 0x20000010, 0x20404010, 0x404000, 0x20400000, 0x404010, 0x20404000, 
        0, 0x20400010, 16, 16384, 0x20400000, 0x404010, 16384, 0x400010, 0x20004010, 0, 
        0x20404000, 0x20000000, 0x400010, 0x20004010
    };
    private static final int m[] = {
        0x200000, 0x4200002, 0x4000802, 0, 2048, 0x4000802, 0x200802, 0x4200800, 0x4200802, 0x200000, 
        0, 0x4000002, 2, 0x4000000, 0x4200002, 2050, 0x4000800, 0x200802, 0x200002, 0x4000800, 
        0x4000002, 0x4200000, 0x4200800, 0x200002, 0x4200000, 2048, 2050, 0x4200802, 0x200800, 2, 
        0x4000000, 0x200800, 0x4000000, 0x200800, 0x200000, 0x4000802, 0x4000802, 0x4200002, 0x4200002, 2, 
        0x200002, 0x4000000, 0x4000800, 0x200000, 0x4200800, 2050, 0x200802, 0x4200800, 2050, 0x4000002, 
        0x4200802, 0x4200000, 0x200800, 0, 2, 0x4200802, 0, 0x200802, 0x4200000, 2048, 
        0x4000002, 0x4000800, 2048, 0x200002
    };
    private static final int n[] = {
        0x10001040, 4096, 0x40000, 0x10041040, 0x10000000, 0x10001040, 64, 0x10000000, 0x40040, 0x10040000, 
        0x10041040, 0x41000, 0x10041000, 0x41040, 4096, 64, 0x10040000, 0x10000040, 0x10001000, 4160, 
        0x41000, 0x40040, 0x10040040, 0x10041000, 4160, 0, 0, 0x10040040, 0x10000040, 0x10001000, 
        0x41040, 0x40000, 0x41040, 0x40000, 0x10041000, 4096, 64, 0x10040040, 4096, 0x41040, 
        0x10001000, 64, 0x10000040, 0x10040000, 0x10040040, 0x10000000, 0x40000, 0x10001040, 0, 0x10041040, 
        0x40040, 0x10000040, 0x10040000, 0x10001000, 0x10001040, 0, 0x10041040, 0x41000, 0x41000, 4160, 
        4160, 0x40040, 0x10000000, 0x10041000
    };
    private int a[];

    public DESEngine()
    {
        a = null;
    }

    protected void desFunc(int ai[], byte abyte0[], int i1, byte abyte1[], int j1)
    {
        int k1 = (abyte0[i1 + 0] & 0xff) << 24 | (abyte0[i1 + 1] & 0xff) << 16 | (abyte0[i1 + 2] & 0xff) << 8 | abyte0[i1 + 3] & 0xff;
        i1 = (abyte0[i1 + 4] & 0xff) << 24 | (abyte0[i1 + 5] & 0xff) << 16 | (abyte0[i1 + 6] & 0xff) << 8 | abyte0[i1 + 7] & 0xff;
        int l1 = (k1 >>> 4 ^ i1) & 0xf0f0f0f;
        i1 ^= l1;
        k1 ^= l1 << 4;
        l1 = (k1 >>> 16 ^ i1) & 0xffff;
        i1 ^= l1;
        k1 ^= l1 << 16;
        l1 = (i1 >>> 2 ^ k1) & 0x33333333;
        k1 ^= l1;
        l1 = i1 ^ l1 << 2;
        int i2 = (l1 >>> 8 ^ k1) & 0xff00ff;
        i1 = k1 ^ i2;
        k1 = l1 ^ i2 << 8;
        k1 = (k1 >>> 31 & 1 | k1 << 1) & -1;
        l1 = (i1 ^ k1) & 0xaaaaaaaa;
        i1 ^= l1;
        k1 ^= l1;
        l1 = (i1 >>> 31 & 1 | i1 << 1) & -1;
        for (i1 = 0; i1 < 8; i1++)
        {
            int i3 = (k1 << 28 | k1 >>> 4) ^ ai[i1 * 4 + 0];
            int j2 = m[i3 & 0x3f];
            int k2 = k[i3 >>> 8 & 0x3f];
            int l2 = i[i3 >>> 16 & 0x3f];
            i3 = g[i3 >>> 24 & 0x3f];
            int j3 = ai[i1 * 4 + 1] ^ k1;
            l1 ^= i3 | (j2 | k2 | l2) | n[j3 & 0x3f] | l[j3 >>> 8 & 0x3f] | j[j3 >>> 16 & 0x3f] | h[j3 >>> 24 & 0x3f];
            i3 = (l1 << 28 | l1 >>> 4) ^ ai[i1 * 4 + 2];
            j2 = m[i3 & 0x3f];
            k2 = k[i3 >>> 8 & 0x3f];
            l2 = i[i3 >>> 16 & 0x3f];
            i3 = g[i3 >>> 24 & 0x3f];
            j3 = ai[i1 * 4 + 3] ^ l1;
            k1 ^= i3 | (j2 | k2 | l2) | n[j3 & 0x3f] | l[j3 >>> 8 & 0x3f] | j[j3 >>> 16 & 0x3f] | h[j3 >>> 24 & 0x3f];
        }

        i1 = k1 >>> 1 | k1 << 31;
        k1 = (l1 ^ i1) & 0xaaaaaaaa;
        l1 ^= k1;
        i1 ^= k1;
        k1 = l1 >>> 1 | l1 << 31;
        l1 = (k1 >>> 8 ^ i1) & 0xff00ff;
        i1 ^= l1;
        k1 ^= l1 << 8;
        l1 = (k1 >>> 2 ^ i1) & 0x33333333;
        i1 ^= l1;
        k1 ^= l1 << 2;
        l1 = (i1 >>> 16 ^ k1) & 0xffff;
        k1 ^= l1;
        i1 ^= l1 << 16;
        l1 = (i1 >>> 4 ^ k1) & 0xf0f0f0f;
        k1 ^= l1;
        i1 ^= l1 << 4;
        abyte1[j1 + 0] = (byte)(i1 >>> 24 & 0xff);
        abyte1[j1 + 1] = (byte)(i1 >>> 16 & 0xff);
        abyte1[j1 + 2] = (byte)(i1 >>> 8 & 0xff);
        abyte1[j1 + 3] = (byte)(i1 & 0xff);
        abyte1[j1 + 4] = (byte)(k1 >>> 24 & 0xff);
        abyte1[j1 + 5] = (byte)(k1 >>> 16 & 0xff);
        abyte1[j1 + 6] = (byte)(k1 >>> 8 & 0xff);
        abyte1[j1 + 7] = (byte)(k1 & 0xff);
    }

    protected int[] generateWorkingKey(boolean flag, byte abyte0[])
    {
        int ai[] = new int[32];
        boolean aflag[] = new boolean[56];
        boolean aflag1[] = new boolean[56];
        int i1 = 0;
        while (i1 < 56) 
        {
            byte byte0 = d[i1];
            byte byte1 = abyte0[byte0 >>> 3];
            boolean flag1;
            if ((b[byte0 & 7] & byte1) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            aflag[i1] = flag1;
            i1++;
        }
        for (int j1 = 0; j1 < 16; j1++)
        {
            int l1;
            int j2;
            int i3;
            if (flag)
            {
                l1 = j1 << 1;
            } else
            {
                l1 = 15 - j1 << 1;
            }
            i3 = l1 + 1;
            ai[i3] = 0;
            ai[l1] = 0;
            j2 = 0;
            while (j2 < 28) 
            {
                int j3 = e[j1] + j2;
                if (j3 < 28)
                {
                    aflag1[j2] = aflag[j3];
                } else
                {
                    aflag1[j2] = aflag[j3 - 28];
                }
                j2++;
            }
            j2 = 28;
            while (j2 < 56) 
            {
                int k3 = e[j1] + j2;
                if (k3 < 56)
                {
                    aflag1[j2] = aflag[k3];
                } else
                {
                    aflag1[j2] = aflag[k3 - 28];
                }
                j2++;
            }
            for (int k2 = 0; k2 < 24; k2++)
            {
                if (aflag1[f[k2]])
                {
                    ai[l1] = ai[l1] | c[k2];
                }
                if (aflag1[f[k2 + 24]])
                {
                    ai[i3] = ai[i3] | c[k2];
                }
            }

        }

        for (int k1 = 0; k1 != 32; k1 += 2)
        {
            int i2 = ai[k1];
            int l2 = ai[k1 + 1];
            ai[k1] = (0xfc0000 & i2) << 6 | (i2 & 0xfc0) << 10 | (0xfc0000 & l2) >>> 10 | (l2 & 0xfc0) >>> 6;
            ai[k1 + 1] = (i2 & 0x3f) << 16 | (0x3f000 & i2) << 12 | (0x3f000 & l2) >>> 4 | l2 & 0x3f;
        }

        return ai;
    }

    public String getAlgorithmName()
    {
        return "DES";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            if (((KeyParameter)cipherparameters).getKey().length > 8)
            {
                throw new IllegalArgumentException("DES key too long - should be 8 bytes");
            } else
            {
                a = generateWorkingKey(flag, ((KeyParameter)cipherparameters).getKey());
                return;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to DES init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public int processBlock(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        if (a == null)
        {
            throw new IllegalStateException("DES engine not initialised");
        }
        if (i1 + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j1 + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        } else
        {
            desFunc(a, abyte0, i1, abyte1, j1);
            return 8;
        }
    }

    public void reset()
    {
    }

}
