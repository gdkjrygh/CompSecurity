// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction:
//            m

private static class b extends FilterInputStream
{

    private final ByteArrayOutputStream a = new ByteArrayOutputStream();
    private boolean b;

    static boolean a(b b1)
    {
        return b1.b;
    }

    public boolean a()
    {
        return b;
    }

    public InputStream b()
    {
        return new ByteArrayInputStream(a.toByteArray());
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i != -1)
        {
            a.write(i);
            return i;
        } else
        {
            b = true;
            return i;
        }
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = super.read(abyte0, i, j);
        if (j != -1)
        {
            a.write(abyte0, i, j);
            return j;
        } else
        {
            b = true;
            return j;
        }
    }

    protected (InputStream inputstream)
    {
        super(inputstream);
        b = false;
    }
}
