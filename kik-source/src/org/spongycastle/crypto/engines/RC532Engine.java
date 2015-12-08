// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC5Parameters;

public class RC532Engine
    implements BlockCipher
{

    private int a;
    private int b[];
    private boolean c;

    public RC532Engine()
    {
        a = 12;
        b = null;
    }

    private static int a(int i, int j)
    {
        return i << (j & 0x1f) | i >>> 32 - (j & 0x1f);
    }

    private static int a(byte abyte0[], int i)
    {
        return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
    }

    private static void a(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >> 8);
        abyte0[j + 2] = (byte)(i >> 16);
        abyte0[j + 3] = (byte)(i >> 24);
    }

    private void a(byte abyte0[])
    {
        int l = 0;
        int ai[] = new int[(abyte0.length + 3) / 4];
        for (int i = 0; i != abyte0.length; i++)
        {
            int i1 = i / 4;
            ai[i1] = ai[i1] + ((abyte0[i] & 0xff) << (i % 4) * 8);
        }

        b = new int[(a + 1) * 2];
        b[0] = 0xb7e15163;
        for (int j = 1; j < b.length; j++)
        {
            b[j] = b[j - 1] - 0x61c88647;
        }

        int k;
        int j1;
        int k1;
        int l1;
        int i2;
        if (ai.length > b.length)
        {
            k = ai.length * 3;
        } else
        {
            k = b.length * 3;
        }
        j1 = 0;
        k1 = 0;
        l1 = 0;
        i2 = 0;
        for (; l < k; l++)
        {
            abyte0 = b;
            i2 = a(i2 + b[k1] + l1, 3);
            abyte0[k1] = i2;
            l1 = a(ai[j1] + i2 + l1, l1 + i2);
            ai[j1] = l1;
            k1 = (k1 + 1) % b.length;
            j1 = (j1 + 1) % ai.length;
        }

    }

    private static int b(int i, int j)
    {
        return i >>> (j & 0x1f) | i << 32 - (j & 0x1f);
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = true;
        if (c)
        {
            int i1 = a(abyte0, i) + b[0];
            int k = a(abyte0, i + 4) + b[1];
            for (i = ((flag) ? 1 : 0); i <= a; i++)
            {
                i1 = a(i1 ^ k, k) + b[i * 2];
                k = a(k ^ i1, i1) + b[i * 2 + 1];
            }

            a(i1, abyte1, j);
            a(k, abyte1, j + 4);
            return 8;
        }
        int l = a(abyte0, i);
        int j1 = a(abyte0, i + 4);
        for (i = a; i > 0; i--)
        {
            j1 = b(j1 - b[i * 2 + 1], l) ^ l;
            l = b(l - b[i * 2], j1) ^ j1;
        }

        a(l - b[0], abyte1, j);
        a(j1 - b[1], abyte1, j + 4);
        return 8;
    }

    public final String a()
    {
        return "RC5-32";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof RC5Parameters)
        {
            cipherparameters = (RC5Parameters)cipherparameters;
            a = cipherparameters.b();
            a(cipherparameters.a());
        } else
        if (cipherparameters instanceof KeyParameter)
        {
            a(((KeyParameter)cipherparameters).a());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC532 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
        c = flag;
    }

    public final int b()
    {
        return 8;
    }

    public final void c()
    {
    }
}
