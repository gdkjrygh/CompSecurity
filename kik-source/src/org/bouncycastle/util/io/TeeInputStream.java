// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io;

import java.io.InputStream;
import java.io.OutputStream;

public class TeeInputStream extends InputStream
{

    private final InputStream a;
    private final OutputStream b;

    public void close()
    {
        a.close();
        b.close();
    }

    public int read()
    {
        int i = a.read();
        if (i >= 0)
        {
            b.write(i);
        }
        return i;
    }

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        j = a.read(abyte0, i, j);
        if (j > 0)
        {
            b.write(abyte0, i, j);
        }
        return j;
    }
}
