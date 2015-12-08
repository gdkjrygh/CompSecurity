// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.util;

import java.io.OutputStream;

public class DebugOutputStream extends OutputStream
{

    private final OutputStream a;
    private long b;

    public void close()
    {
        a.close();
    }

    public void flush()
    {
        a.flush();
    }

    public void write(int i)
    {
        a.write(i);
        b = b + 1L;
    }

    public void write(byte abyte0[])
    {
        a.write(abyte0);
        b = b + (long)abyte0.length;
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
        b = b + (long)j;
    }
}
