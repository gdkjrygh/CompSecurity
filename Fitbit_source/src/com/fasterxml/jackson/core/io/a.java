// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            c

abstract class a extends Reader
{

    protected static final int a = 0x10ffff;
    protected static final char b = 0;
    protected static final char c = 0;
    protected final c d;
    protected InputStream e;
    protected byte f[];
    protected int g;
    protected int h;
    protected char i[];

    protected a(c c1, InputStream inputstream, byte abyte0[], int j, int k)
    {
        i = null;
        d = c1;
        e = inputstream;
        f = abyte0;
        g = j;
        h = k;
    }

    public final void a()
    {
        byte abyte0[] = f;
        if (abyte0 != null)
        {
            f = null;
            d.a(abyte0);
        }
    }

    protected void a(char ac[], int j, int k)
        throws IOException
    {
        throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("read(buf,").append(j).append(",").append(k).append("), cbuf[").append(ac.length).append("]").toString());
    }

    protected void b()
        throws IOException
    {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public void close()
        throws IOException
    {
        InputStream inputstream = e;
        if (inputstream != null)
        {
            e = null;
            a();
            inputstream.close();
        }
    }

    public int read()
        throws IOException
    {
        if (i == null)
        {
            i = new char[1];
        }
        if (read(i, 0, 1) < 1)
        {
            return -1;
        } else
        {
            return i[0];
        }
    }
}
