// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class e extends FilterOutputStream
{

    private long a;

    public e(OutputStream outputstream)
    {
        super(outputstream);
    }

    public long a()
    {
        return a;
    }

    public void write(int i)
    {
        out.write(i);
        a = a + 1L;
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        a = a + (long)j;
    }
}
