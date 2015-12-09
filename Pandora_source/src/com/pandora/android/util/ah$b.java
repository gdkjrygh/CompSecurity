// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.pandora.android.util:
//            ah

private static class a extends OutputStream
{

    private final OutputStream a;

    public void close()
        throws IOException
    {
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public void flush()
        throws IOException
    {
        a.flush();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }

    public void write(int i)
        throws IOException
    {
        a.write(i);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        a.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        a.write(abyte0, i, j);
    }

    (OutputStream outputstream)
    {
        a = outputstream;
    }
}
