// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import java.io.FilterInputStream;
import java.io.InputStream;

final class c extends FilterInputStream
{

    private int a;

    private c(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
    }

    c(InputStream inputstream, byte byte0)
    {
        this(inputstream);
    }

    static int a(c c1)
    {
        return c1.a;
    }

    public final int read()
    {
        int i = super.read();
        if (i != -1)
        {
            a = a + 1;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            a = a + i;
        }
        return i;
    }
}
