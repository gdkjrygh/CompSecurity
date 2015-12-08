// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ap;

import java.io.OutputStream;

public final class d extends OutputStream
{

    public int a[];
    public int b;
    public int c;
    private byte d[];
    private int e;

    public d()
    {
        b = 0;
        c = 0;
        b = 0;
        c = 0;
        e = 0;
        d = new byte[16];
        a = new int[1];
    }

    private static int a(int i, int j, int k, int l)
    {
        for (int i1 = j - k; i1 < i; i1 = j - k)
        {
            i1 = j >> l;
            if (i1 <= 0)
            {
                throw new IllegalArgumentException((new StringBuilder(63)).append("Incorrect size [").append(j).append("] and rightShiftAmount [").append(l).append("]").toString());
            }
            j += i1;
        }

        return j;
    }

    private void b(int i)
    {
        if (d.length - i >= b)
        {
            e = e + 1;
        } else
        {
            byte byte0;
            if (e >= 64)
            {
                byte0 = 1;
                if (e >= 128)
                {
                    byte0 = 2;
                }
            } else
            {
                byte0 = 0;
            }
            i = a(i, d.length, b, byte0);
            if (i > d.length)
            {
                byte abyte0[] = new byte[i];
                System.arraycopy(d, 0, abyte0, 0, b);
                d = abyte0;
                e = 0;
                return;
            }
        }
    }

    public final void a(int i)
    {
        int j = a(1, a.length, c, 0);
        if (j > a.length)
        {
            int ai[] = new int[j];
            System.arraycopy(a, 0, ai, 0, c);
            a = ai;
        }
        int ai1[] = a;
        j = c;
        c = j + 1;
        ai1[j] = i;
    }

    public final void a(OutputStream outputstream, int i, int j)
    {
        outputstream.write(d, i, j);
    }

    public final void write(int i)
    {
        b(1);
        byte abyte0[] = d;
        int j = b;
        b = j + 1;
        abyte0[j] = (byte)(i & 0xff);
    }

    public final void write(byte abyte0[])
    {
        b(abyte0.length);
        System.arraycopy(abyte0, 0, d, b, abyte0.length);
        b = b + abyte0.length;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        b(j);
        System.arraycopy(abyte0, i, d, b, j);
        b = b + j;
    }
}
