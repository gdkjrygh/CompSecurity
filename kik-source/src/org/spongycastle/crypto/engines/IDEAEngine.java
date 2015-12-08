// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class IDEAEngine
    implements BlockCipher
{

    private int a[];

    public IDEAEngine()
    {
        a = null;
    }

    private static int a(int i)
    {
        if (i >= 2) goto _L2; else goto _L1
_L1:
        int l = i;
_L4:
        return l;
_L2:
        int i1 = 0x10001 / i;
        int j = 0x10001 % i;
        int k = 1;
        l = i;
        i = i1;
label0:
        do
        {
label1:
            {
                if (j == 1)
                {
                    break label1;
                }
                int k1 = l / j;
                int j1 = l % j;
                k = k1 * i + k & 0xffff;
                l = k;
                if (j1 == 1)
                {
                    break label0;
                }
                l = j / j1;
                j %= j1;
                i = i + l * k & 0xffff;
                l = j1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return 1 - i & 0xffff;
    }

    private static int a(int i, int j)
    {
        if (i == 0)
        {
            i = 0x10001 - j;
        } else
        if (j == 0)
        {
            i = 0x10001 - i;
        } else
        {
            i *= j;
            j = i & 0xffff;
            int k = i >>> 16;
            if (j < k)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            i += j - k;
        }
        return i & 0xffff;
    }

    private static int a(byte abyte0[], int i)
    {
        return (abyte0[i] << 8 & 0xff00) + (abyte0[i + 1] & 0xff);
    }

    private static void a(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    private static void a(int ai[], byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = false;
        int k1 = a(abyte0, i);
        int i1 = a(abyte0, i + 2);
        int l = a(abyte0, i + 4);
        int k = a(abyte0, i + 6);
        int j1 = 0;
        for (i = ((flag) ? 1 : 0); i < 8; i++)
        {
            int l1 = j1 + 1;
            k1 = a(k1, ai[j1]);
            j1 = l1 + 1;
            l1 = i1 + ai[l1] & 0xffff;
            i1 = j1 + 1;
            l = ai[j1] + l & 0xffff;
            j1 = i1 + 1;
            k = a(k, ai[i1]);
            i1 = j1 + 1;
            int i2 = a(l ^ k1, ai[j1]);
            j1 = i1 + 1;
            i1 = a((l1 ^ k) + i2 & 0xffff, ai[i1]);
            i2 = i2 + i1 & 0xffff;
            k1 ^= i1;
            k ^= i2;
            i1 ^= l;
            l = i2 ^ l1;
        }

        i = j1 + 1;
        a(a(k1, ai[j1]), abyte1, j);
        j1 = i + 1;
        a(ai[i] + l, abyte1, j + 2);
        a(ai[j1] + i1, abyte1, j + 4);
        a(a(k, ai[j1 + 1]), abyte1, j + 6);
    }

    private static int[] a(byte abyte0[])
    {
        int ai[] = new int[52];
        byte abyte1[] = abyte0;
        if (abyte0.length < 16)
        {
            abyte1 = new byte[16];
            System.arraycopy(abyte0, 0, abyte1, 16 - abyte0.length, abyte0.length);
        }
        for (int i = 0; i < 8; i++)
        {
            ai[i] = a(abyte1, i * 2);
        }

        int j = 8;
        while (j < 52) 
        {
            if ((j & 7) < 6)
            {
                ai[j] = ((ai[j - 7] & 0x7f) << 9 | ai[j - 6] >> 7) & 0xffff;
            } else
            if ((j & 7) == 6)
            {
                ai[j] = ((ai[j - 7] & 0x7f) << 9 | ai[j - 14] >> 7) & 0xffff;
            } else
            {
                ai[j] = ((ai[j - 15] & 0x7f) << 9 | ai[j - 14] >> 7) & 0xffff;
            }
            j++;
        }
        return ai;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        } else
        {
            a(a, abyte0, i, abyte1, j);
            return 8;
        }
    }

    public final String a()
    {
        return "IDEA";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        int j = 48;
        int i = 1;
        if (cipherparameters instanceof KeyParameter)
        {
            cipherparameters = ((KeyParameter)cipherparameters).a();
            if (flag)
            {
                cipherparameters = a(((byte []) (cipherparameters)));
            } else
            {
                int ai[] = a(((byte []) (cipherparameters)));
                cipherparameters = new int[52];
                int l = a(ai[0]);
                int i1 = ai[1];
                int j1 = ai[2];
                int k = 4;
                cipherparameters[51] = a(ai[3]);
                cipherparameters[50] = 0 - j1 & 0xffff;
                cipherparameters[49] = 0 - i1 & 0xffff;
                cipherparameters[48] = l;
                for (; i < 8; i++)
                {
                    i1 = k + 1;
                    l = ai[k];
                    k = i1 + 1;
                    i1 = ai[i1];
                    j--;
                    cipherparameters[j] = i1;
                    j--;
                    cipherparameters[j] = l;
                    i1 = k + 1;
                    l = a(ai[k]);
                    k = i1 + 1;
                    i1 = ai[i1];
                    int l1 = k + 1;
                    int k1 = ai[k];
                    k = l1 + 1;
                    l1 = a(ai[l1]);
                    j--;
                    cipherparameters[j] = l1;
                    j--;
                    cipherparameters[j] = 0 - i1 & 0xffff;
                    j--;
                    cipherparameters[j] = 0 - k1 & 0xffff;
                    j--;
                    cipherparameters[j] = l;
                }

                l = k + 1;
                k = ai[k];
                i = l + 1;
                l = ai[l];
                j--;
                cipherparameters[j] = l;
                j--;
                cipherparameters[j] = k;
                k = i + 1;
                i = a(ai[i]);
                i1 = k + 1;
                k = ai[k];
                l = ai[i1];
                i1 = a(ai[i1 + 1]);
                j--;
                cipherparameters[j] = i1;
                j--;
                cipherparameters[j] = 0 - l & 0xffff;
                j--;
                cipherparameters[j] = 0 - k & 0xffff;
                cipherparameters[j - 1] = i;
            }
            a = cipherparameters;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to IDEA init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int b()
    {
        return 8;
    }

    public final void c()
    {
    }
}
