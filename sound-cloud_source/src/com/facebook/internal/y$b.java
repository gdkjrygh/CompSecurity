// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.facebook.internal:
//            y

private static final class b extends OutputStream
{

    final OutputStream a;
    final  b;

    public final void close()
        throws IOException
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
        throws IOException
    {
        a.flush();
    }

    public final void write(int i)
        throws IOException
    {
        a.write(i);
    }

    public final void write(byte abyte0[])
        throws IOException
    {
        a.write(abyte0);
    }

    public final void write(byte abyte0[], int i, int j)
        throws IOException
    {
        a.write(abyte0, i, j);
    }

    (OutputStream outputstream,  )
    {
        a = outputstream;
        b = ;
    }
}
