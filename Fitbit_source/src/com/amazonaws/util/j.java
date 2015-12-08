// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.util;

import com.amazonaws.internal.e;
import java.io.IOException;
import java.io.InputStream;

public class j extends e
{

    private long a;

    public j(InputStream inputstream)
    {
        super(inputstream);
        a = 0L;
    }

    public long a()
    {
        return a;
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        long l1 = a;
        long l;
        if (i >= 0)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        a = l + l1;
        return i;
    }

    public int read(byte abyte0[], int i, int k)
        throws IOException
    {
        i = super.read(abyte0, i, k);
        long l1 = a;
        long l;
        if (i >= 0)
        {
            l = i;
        } else
        {
            l = 0L;
        }
        a = l + l1;
        return i;
    }
}
