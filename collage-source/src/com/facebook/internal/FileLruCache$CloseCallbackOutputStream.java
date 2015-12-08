// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

private static class callback extends OutputStream
{

    final innerStream callback;
    final OutputStream innerStream;

    public void close()
        throws IOException
    {
        innerStream.close();
        callback.e();
        return;
        Exception exception;
        exception;
        callback.e();
        throw exception;
    }

    public void flush()
        throws IOException
    {
        innerStream.flush();
    }

    public void write(int i)
        throws IOException
    {
        innerStream.write(i);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        innerStream.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        innerStream.write(abyte0, i, j);
    }

    (OutputStream outputstream,  )
    {
        innerStream = outputstream;
        callback = ;
    }
}
