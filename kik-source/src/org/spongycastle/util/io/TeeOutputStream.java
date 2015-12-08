// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.io;

import java.io.OutputStream;

public class TeeOutputStream extends OutputStream
{

    private OutputStream a;
    private OutputStream b;

    public TeeOutputStream(OutputStream outputstream, OutputStream outputstream1)
    {
        a = outputstream;
        b = outputstream1;
    }

    public void close()
    {
        a.close();
        b.close();
    }

    public void flush()
    {
        a.flush();
        b.flush();
    }

    public void write(int i)
    {
        a.write(i);
        b.write(i);
    }

    public void write(byte abyte0[])
    {
        a.write(abyte0);
        b.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
        b.write(abyte0, i, j);
    }
}
