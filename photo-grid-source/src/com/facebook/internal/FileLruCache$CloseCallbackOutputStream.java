// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.OutputStream;

class callback extends OutputStream
{

    final innerStream callback;
    final OutputStream innerStream;

    public void close()
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
    {
        innerStream.flush();
    }

    public void write(int i)
    {
        innerStream.write(i);
    }

    public void write(byte abyte0[])
    {
        innerStream.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        innerStream.write(abyte0, i, j);
    }

    (OutputStream outputstream,  )
    {
        innerStream = outputstream;
        callback = ;
    }
}
