// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.RC5Parameters;

public class RC564Engine
    implements BlockCipher
{

    private int a;
    private long b[];
    private boolean c;

    public RC564Engine()
    {
        a = 12;
        b = null;
    }

    private static long a(long l, long l1)
    {
        return l << (int)(l1 & 63L) | l >>> (int)(64L - (63L & l1));
    }

    private static long a(byte abyte0[], int i)
    {
        long l = 0L;
        for (int j = 7; j >= 0; j--)
        {
            l = (l << 8) + (long)(abyte0[j + i] & 0xff);
        }

        return l;
    }

    private static void a(long l, byte abyte0[], int i)
    {
        for (int j = 0; j < 8; j++)
        {
            abyte0[j + i] = (byte)(int)l;
            l >>>= 8;
        }

    }

    private void a(byte abyte0[])
    {
        int l = 0;
        long al[] = new long[(abyte0.length + 7) / 8];
        for (int i = 0; i != abyte0.length; i++)
        {
            int i1 = i / 8;
            al[i1] = al[i1] + ((long)(abyte0[i] & 0xff) << (i % 8) * 8);
        }

        b = new long[(a + 1) * 2];
        b[0] = 0xb7e151628aed2a6bL;
        for (int j = 1; j < b.length; j++)
        {
            b[j] = b[j - 1] - 0x61c8864680b583ebL;
        }

        int k;
        int j1;
        int k1;
        long l1;
        long l2;
        if (al.length > b.length)
        {
            k = al.length * 3;
        } else
        {
            k = b.length * 3;
        }
        l1 = 0L;
        l2 = 0L;
        j1 = 0;
        k1 = 0;
        for (; l < k; l++)
        {
            abyte0 = b;
            l2 = a(l2 + b[k1] + l1, 3L);
            abyte0[k1] = l2;
            l1 = a(al[j1] + l2 + l1, l1 + l2);
            al[j1] = l1;
            k1 = (k1 + 1) % b.length;
            j1 = (j1 + 1) % al.length;
        }

    }

    private static long b(long l, long l1)
    {
        return l >>> (int)(l1 & 63L) | l << (int)(64L - (63L & l1));
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = true;
        if (c)
        {
            long l = a(abyte0, i);
            long l2 = b[0] + l;
            l = a(abyte0, i + 8) + b[1];
            for (i = ((flag) ? 1 : 0); i <= a; i++)
            {
                l2 = a(l2 ^ l, l) + b[i * 2];
                l = a(l ^ l2, l2) + b[i * 2 + 1];
            }

            a(l2, abyte1, j);
            a(l, abyte1, j + 8);
            return 16;
        }
        long l1 = a(abyte0, i);
        long l3 = a(abyte0, i + 8);
        for (i = a; i > 0; i--)
        {
            l3 = b(l3 - b[i * 2 + 1], l1) ^ l1;
            l1 = b(l1 - b[i * 2], l3) ^ l3;
        }

        a(l1 - b[0], abyte1, j);
        a(l3 - b[1], abyte1, j + 8);
        return 16;
    }

    public final String a()
    {
        return "RC5-64";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof RC5Parameters))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC564 init - ")).append(cipherparameters.getClass().getName()).toString());
        } else
        {
            cipherparameters = (RC5Parameters)cipherparameters;
            c = flag;
            a = cipherparameters.b();
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
