// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class iq
{

    public static long a(InputStream inputstream, OutputStream outputstream, boolean flag)
        throws IOException
    {
        return b(inputstream, outputstream, flag);
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    private static long b(InputStream inputstream, OutputStream outputstream, boolean flag)
        throws IOException
    {
        byte abyte0[];
        long l;
        abyte0 = new byte[1024];
        l = 0L;
_L1:
        int i = inputstream.read(abyte0, 0, 1024);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l += i;
        outputstream.write(abyte0, 0, i);
          goto _L1
        Exception exception;
        exception;
        if (flag)
        {
            a(inputstream);
            a(outputstream);
        }
        throw exception;
        if (flag)
        {
            a(inputstream);
            a(outputstream);
        }
        return l;
    }
}
