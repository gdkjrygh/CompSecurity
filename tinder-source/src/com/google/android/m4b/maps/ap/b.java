// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ap;

import java.io.InputStream;

public final class b extends InputStream
{

    private int a;
    private byte b[];
    private int c;
    private int d;
    private InputStream e;

    public b(InputStream inputstream, int i)
    {
        e = inputstream;
        a = i;
        b = new byte[Math.min(i, 4096)];
    }

    private boolean a()
    {
        if (a <= 0)
        {
            return false;
        }
        if (c >= d)
        {
            d = e.read(b, 0, Math.min(a, b.length));
            if (d <= 0)
            {
                a = 0;
                return false;
            }
            c = 0;
        }
        return true;
    }

    public final int available()
    {
        return d - c;
    }

    public final int read()
    {
        if (!a())
        {
            return -1;
        } else
        {
            a = a - 1;
            byte abyte0[] = b;
            int i = c;
            c = i + 1;
            return abyte0[i] & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (!a())
        {
            return -1;
        } else
        {
            j = Math.min(j, d - c);
            System.arraycopy(b, c, abyte0, i, j);
            c = c + j;
            a = a - j;
            return j;
        }
    }
}
