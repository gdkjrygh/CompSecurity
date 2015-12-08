// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

abstract class a
{

    a()
    {
    }

    static int[] asInts(byte abyte0[])
    {
        return (new int[] {
            Pack.bigEndianToInt(abyte0, 0), Pack.bigEndianToInt(abyte0, 4), Pack.bigEndianToInt(abyte0, 8), Pack.bigEndianToInt(abyte0, 12)
        });
    }

    static void multiply(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = Arrays.c(abyte0);
        byte abyte3[] = new byte[16];
        for (int i = 0; i < 16; i++)
        {
            byte byte0 = abyte1[i];
            int j = 7;
            while (j >= 0) 
            {
                if ((1 << j & byte0) != 0)
                {
                    xor(abyte3, abyte2);
                }
                boolean flag;
                if ((abyte2[15] & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                shiftRight(abyte2);
                if (flag)
                {
                    abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
                }
                j--;
            }
        }

        System.arraycopy(abyte3, 0, abyte0, 0, 16);
    }

    static void multiplyP(int ai[])
    {
        boolean flag;
        if ((ai[3] & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shiftRight(ai);
        if (flag)
        {
            ai[0] = ai[0] ^ 0xe1000000;
        }
    }

    static void multiplyP8(int ai[])
    {
        for (int i = 8; i != 0; i--)
        {
            multiplyP(ai);
        }

    }

    static byte[] oneAsBytes()
    {
        byte abyte0[] = new byte[16];
        abyte0[0] = -128;
        return abyte0;
    }

    static int[] oneAsInts()
    {
        int ai[] = new int[4];
        ai[0] = 0x80000000;
        return ai;
    }

    static void shiftRight(byte abyte0[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = abyte0[j] & 0xff;
            abyte0[j] = (byte)(i | k >>> 1);
            j++;
            if (j != 16)
            {
                i = (k & 1) << 7;
            } else
            {
                return;
            }
        } while (true);
    }

    static void shiftRight(int ai[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = ai[j];
            ai[j] = i | k >>> 1;
            j++;
            if (j != 4)
            {
                i = k << 31;
            } else
            {
                return;
            }
        } while (true);
    }

    static void xor(byte abyte0[], byte abyte1[])
    {
        for (int i = 15; i >= 0; i--)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

    }

    static void xor(int ai[], int ai1[])
    {
        for (int i = 3; i >= 0; i--)
        {
            ai[i] = ai[i] ^ ai1[i];
        }

    }
}
