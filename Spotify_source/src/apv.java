// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;

final class apv extends OutputStream
{

    private OutputStream a;
    private apz b;

    apv(OutputStream outputstream, apz apz1)
    {
        a = outputstream;
        b = apz1;
    }

    public final void close()
    {
        a.close();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }

    public final void flush()
    {
        a.flush();
    }

    public final void write(int i)
    {
        a.write(i);
    }

    public final void write(byte abyte0[])
    {
        a.write(abyte0);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
    }
}
