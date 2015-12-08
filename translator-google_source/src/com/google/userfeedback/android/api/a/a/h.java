// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a;

import java.io.OutputStream;

public final class h extends OutputStream
{

    public int a[];
    public int b;
    public int c;
    private byte d[];

    public h()
    {
        b = 0;
        c = 0;
        b = 0;
        c = 0;
        d = new byte[16];
        a = new int[1];
    }

    private static int a(int i, int j, int k)
    {
        for (k = j - k; k < i;)
        {
            k += j;
            j <<= 1;
        }

        return j;
    }

    private void b(int i)
    {
        i = a(i, d.length, b);
        if (i > d.length)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(d, 0, abyte0, 0, b);
            d = abyte0;
        }
    }

    public final void a(int i)
    {
        int j = a(1, a.length, c);
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
        abyte0[j] = (byte)i;
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
