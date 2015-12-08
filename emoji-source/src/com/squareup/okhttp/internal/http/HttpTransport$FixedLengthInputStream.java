// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheRequest;
import java.net.ProtocolException;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            AbstractHttpInputStream, HttpTransport, HttpEngine

private static class endOfInput extends AbstractHttpInputStream
{

    private long bytesRemaining;

    public int available()
        throws IOException
    {
        checkNotClosed();
        if (bytesRemaining == 0L)
        {
            return 0;
        } else
        {
            return (int)Math.min(in.available(), bytesRemaining);
        }
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        if (bytesRemaining != 0L && !HttpTransport.access$200(httpEngine, this))
        {
            unexpectedEndOfInput();
        }
        closed = true;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        Util.checkOffsetAndCount(abyte0.length, i, j);
        checkNotClosed();
        if (bytesRemaining == 0L)
        {
            i = -1;
        } else
        {
            j = in.read(abyte0, i, (int)Math.min(j, bytesRemaining));
            if (j == -1)
            {
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
            bytesRemaining = bytesRemaining - (long)j;
            cacheWrite(abyte0, i, j);
            i = j;
            if (bytesRemaining == 0L)
            {
                endOfInput();
                return j;
            }
        }
        return i;
    }

    public (InputStream inputstream, CacheRequest cacherequest, HttpEngine httpengine, long l)
        throws IOException
    {
        super(inputstream, httpengine, cacherequest);
        bytesRemaining = l;
        if (bytesRemaining == 0L)
        {
            endOfInput();
        }
    }
}
