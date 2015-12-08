// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.util.Hashtable;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class GOST28147Engine
    implements BlockCipher
{

    private static byte d[] = {
        4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 
        1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 
        6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 
        5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 
        14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 
        10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 
        11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 
        13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 
        4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 
        8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 
        3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 
        2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 
        9, 2, 3, 14, 6, 11, 8, 12
    };
    private static byte e[] = {
        4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 
        11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 
        8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 
        11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 
        1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 
        11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 
        10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 
        0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 
        8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 
        7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 
        3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 
        2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 
        3, 14, 7, 10, 15, 4, 1, 8
    };
    private static byte f[] = {
        9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 
        14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 
        8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 
        13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 
        12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 
        10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 
        15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 
        15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 
        3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 
        9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 
        7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 
        11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 
        6, 2, 3, 9, 1, 7, 13, 4
    };
    private static byte g[] = {
        8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 
        10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 
        4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 
        6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 
        7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 
        0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 
        4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 
        10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 
        8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 
        7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 
        9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 
        8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 
        10, 2, 9, 6, 15, 13, 5, 12
    };
    private static byte h[] = {
        1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 
        8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 
        11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 
        6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 
        3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 
        0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 
        14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 
        1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 
        12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 
        6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 
        13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 
        12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 
        12, 6, 1, 11, 13, 9, 3, 8
    };
    private static byte i[] = {
        15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 
        14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 
        12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 
        9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 
        10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 
        14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 
        9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 
        10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 
        8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 
        4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 
        1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 
        5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 
        12, 3, 5, 9, 7, 13, 2, 14
    };
    private static byte j[] = {
        4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 
        1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 
        6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 
        5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 
        14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 
        10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 
        11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 
        13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 
        4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 
        8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 
        3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 
        2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 
        9, 2, 3, 14, 6, 11, 8, 12
    };
    private static byte k[] = {
        10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 
        14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 
        2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 
        10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 
        3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 
        7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 
        13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 
        2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 
        7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 
        5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 
        7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 
        9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 
        8, 6, 7, 14, 13, 0, 2, 12
    };
    private static Hashtable l = new Hashtable();
    private int a[];
    private boolean b;
    private byte c[];

    public GOST28147Engine()
    {
        a = null;
        c = d;
    }

    private void GOST28147Func(int ai[], byte abyte0[], int i1, byte abyte1[], int j1)
    {
        byte byte0 = 7;
        int k2 = bytesToint(abyte0, i1);
        int k1 = bytesToint(abyte0, i1 + 4);
        int l2;
        if (b)
        {
            l2 = 0;
            int l1 = k1;
            k1 = k2;
            int i3;
            do
            {
                i1 = k1;
                k2 = l1;
                i3 = byte0;
                if (l2 >= 3)
                {
                    break;
                }
                i1 = k1;
                k2 = 0;
                k1 = l1;
                for (l1 = k2; l1 < 8;)
                {
                    i3 = GOST28147_mainStep(i1, ai[l1]);
                    l1++;
                    k2 = i1;
                    i1 = k1 ^ i3;
                    k1 = k2;
                }

                l2++;
                l1 = k1;
                k1 = i1;
            } while (true);
            do
            {
                k1 = k2;
                k2 = i1;
                l2 = k1;
                if (i3 <= 0)
                {
                    break;
                }
                int i2 = GOST28147_mainStep(i1, ai[i3]);
                i3--;
                k2 = i1;
                i1 = k1 ^ i2;
            } while (true);
        } else
        {
            int j2 = 0;
            i1 = k2;
            for (; j2 < 8; j2 = k2)
            {
                l2 = GOST28147_mainStep(i1, ai[j2]);
                k2 = j2 + 1;
                j2 = i1;
                i1 = l2 ^ k1;
                k1 = j2;
            }

            j2 = 0;
            do
            {
                k2 = i1;
                l2 = k1;
                if (j2 >= 3)
                {
                    break;
                }
                for (k2 = 7; k2 >= 0 && (j2 != 2 || k2 != 0);)
                {
                    int j3 = GOST28147_mainStep(i1, ai[k2]);
                    k2--;
                    l2 = i1;
                    i1 = k1 ^ j3;
                    k1 = l2;
                }

                j2++;
            } while (true);
        }
        i1 = GOST28147_mainStep(k2, ai[0]);
        intTobytes(k2, abyte1, j1);
        intTobytes(l2 ^ i1, abyte1, j1 + 4);
    }

    private int GOST28147_mainStep(int i1, int j1)
    {
        i1 = j1 + i1;
        j1 = c[(i1 >> 0 & 0xf) + 0];
        byte byte0 = c[(i1 >> 4 & 0xf) + 16];
        byte byte1 = c[(i1 >> 8 & 0xf) + 32];
        byte byte2 = c[(i1 >> 12 & 0xf) + 48];
        byte byte3 = c[(i1 >> 16 & 0xf) + 64];
        byte byte4 = c[(i1 >> 20 & 0xf) + 80];
        byte byte5 = c[(i1 >> 24 & 0xf) + 96];
        i1 = (c[(i1 >> 28 & 0xf) + 112] << 28) + ((j1 << 0) + (byte0 << 4) + (byte1 << 8) + (byte2 << 12) + (byte3 << 16) + (byte4 << 20) + (byte5 << 24));
        return i1 >>> 21 | i1 << 11;
    }

    private static void addSBox(String s, byte abyte0[])
    {
        l.put(Strings.b(s), abyte0);
    }

    private int bytesToint(byte abyte0[], int i1)
    {
        return (abyte0[i1 + 3] << 24 & 0xff000000) + (abyte0[i1 + 2] << 16 & 0xff0000) + (abyte0[i1 + 1] << 8 & 0xff00) + (abyte0[i1] & 0xff);
    }

    private int[] generateWorkingKey(boolean flag, byte abyte0[])
    {
        b = flag;
        if (abyte0.length != 32)
        {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int ai[] = new int[8];
        for (int i1 = 0; i1 != 8; i1++)
        {
            ai[i1] = bytesToint(abyte0, i1 * 4);
        }

        return ai;
    }

    public static byte[] getSBox(String s)
    {
        s = (byte[])l.get(Strings.b(s));
        if (s == null)
        {
            throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"D-Test\", \"D-A\".");
        } else
        {
            return Arrays.c(s);
        }
    }

    private void intTobytes(int i1, byte abyte0[], int j1)
    {
        abyte0[j1 + 3] = (byte)(i1 >>> 24);
        abyte0[j1 + 2] = (byte)(i1 >>> 16);
        abyte0[j1 + 1] = (byte)(i1 >>> 8);
        abyte0[j1] = (byte)i1;
    }

    public String getAlgorithmName()
    {
        return "GOST28147";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithSBox)
        {
            cipherparameters = (ParametersWithSBox)cipherparameters;
            byte abyte0[] = cipherparameters.getSBox();
            if (abyte0.length != d.length)
            {
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            }
            c = Arrays.c(abyte0);
            if (cipherparameters.getParameters() != null)
            {
                a = generateWorkingKey(flag, ((KeyParameter)cipherparameters.getParameters()).getKey());
            }
        } else
        {
            if (cipherparameters instanceof KeyParameter)
            {
                a = generateWorkingKey(flag, ((KeyParameter)cipherparameters).getKey());
                return;
            }
            if (cipherparameters != null)
            {
                throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to GOST28147 init - ")).append(cipherparameters.getClass().getName()).toString());
            }
        }
    }

    public int processBlock(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        if (a == null)
        {
            throw new IllegalStateException("GOST28147 engine not initialised");
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
            GOST28147Func(a, abyte0, i1, abyte1, j1);
            return 8;
        }
    }

    public void reset()
    {
    }

    static 
    {
        addSBox("Default", d);
        addSBox("E-TEST", e);
        addSBox("E-A", f);
        addSBox("E-B", g);
        addSBox("E-C", h);
        addSBox("E-D", i);
        addSBox("D-TEST", j);
        addSBox("D-A", k);
    }
}
