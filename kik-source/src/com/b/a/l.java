// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class l extends FilterInputStream
{

    private int a;

    public l(InputStream inputstream, int i)
    {
        super(inputstream);
        a = i;
    }

    public final int available()
    {
        return Math.min(super.available(), a);
    }

    public final int read()
    {
        int i;
        if (a <= 0)
        {
            i = -1;
        } else
        {
            int j = super.read();
            i = j;
            if (j >= 0)
            {
                a = a - 1;
                return j;
            }
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (a <= 0)
        {
            i = -1;
        } else
        {
            j = super.read(abyte0, i, Math.min(j, a));
            i = j;
            if (j >= 0)
            {
                a = a - j;
                return j;
            }
        }
        return i;
    }

    public final long skip(long l1)
    {
        l1 = super.skip(Math.min(l1, a));
        if (l1 >= 0L)
        {
            a = (int)((long)a - l1);
        }
        return l1;
    }
}
