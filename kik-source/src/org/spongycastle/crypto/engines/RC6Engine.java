// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class RC6Engine
    implements BlockCipher
{

    private int a[];
    private boolean b;

    public RC6Engine()
    {
        a = null;
    }

    private static int a(int i, int j)
    {
        return i << j | i >>> -j;
    }

    private static int a(byte abyte0[], int i)
    {
        int k = 0;
        for (int j = 3; j >= 0; j--)
        {
            k = (k << 8) + (abyte0[j + i] & 0xff);
        }

        return k;
    }

    private static void a(int i, byte abyte0[], int j)
    {
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            abyte0[i + j] = (byte)k;
            k >>>= 8;
        }

    }

    private void a(byte abyte0[])
    {
        int l = 0;
        int ai[] = new int[((abyte0.length + 4) - 1) / 4];
        for (int i = abyte0.length - 1; i >= 0; i--)
        {
            ai[i / 4] = (ai[i / 4] << 8) + (abyte0[i] & 0xff);
        }

        a = new int[44];
        a[0] = 0xb7e15163;
        for (int j = 1; j < a.length; j++)
        {
            a[j] = a[j - 1] - 0x61c88647;
        }

        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        if (ai.length > a.length)
        {
            k = ai.length * 3;
        } else
        {
            k = a.length * 3;
        }
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
        for (; l < k; l++)
        {
            abyte0 = a;
            l1 = a(l1 + a[j1] + k1, 3);
            abyte0[j1] = l1;
            k1 = a(ai[i1] + l1 + k1, k1 + l1);
            ai[i1] = k1;
            j1 = (j1 + 1) % a.length;
            i1 = (i1 + 1) % ai.length;
        }

    }

    private static int b(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        int j1 = a(abyte0, i);
        int k = a(abyte0, i + 4);
        int l = a(abyte0, i + 8);
        i = a(abyte0, i + 12);
        int k1 = a[0];
        i += a[1];
        int i1 = 1;
        k += k1;
        while (i1 <= 20) 
        {
            int i2 = a((k * 2 + 1) * k, 5);
            int j2 = a((i * 2 + 1) * i, 5);
            k1 = a(j1 ^ i2, j2);
            int l1 = a[i1 * 2];
            l = a(l ^ j2, i2);
            i2 = a[i1 * 2 + 1];
            i1++;
            j1 = k;
            k = l + i2;
            k1 = l1 + k1;
            l = i;
            i = k1;
        }
        i1 = a[42];
        k1 = a[43];
        a(j1 + i1, abyte1, j);
        a(k, abyte1, j + 4);
        a(l + k1, abyte1, j + 8);
        a(i, abyte1, j + 12);
        return 16;
    }

    private int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = a(abyte0, i);
        int i1 = a(abyte0, i + 4);
        int j1 = a(abyte0, i + 8);
        int l = a(abyte0, i + 12);
        i = j1 - a[43];
        k -= a[42];
        for (j1 = 20; j1 > 0;)
        {
            int k1 = a((k * 2 + 1) * k, 5);
            int i2 = a((i * 2 + 1) * i, 5);
            i1 = b(i1 - a[j1 * 2 + 1], k1);
            l = b(l - a[j1 * 2], i2);
            j1--;
            k1 = l ^ k1;
            l = i;
            i = i1 ^ i2;
            i1 = k;
            k = k1;
        }

        j1 = a[1];
        int l1 = a[0];
        a(k, abyte1, j);
        a(i1 - l1, abyte1, j + 4);
        a(i, abyte1, j + 8);
        a(l - j1, abyte1, j + 12);
        return 16;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (b)
        {
            return b(abyte0, i, abyte1, j);
        } else
        {
            return c(abyte0, i, abyte1, j);
        }
    }

    public final String a()
    {
        return "RC6";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC6 init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            cipherparameters = (KeyParameter)cipherparameters;
            b = flag;
            a(cipherparameters.a());
            return;
        }
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
    }
}
