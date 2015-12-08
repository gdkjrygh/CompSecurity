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
//            AbstractHttpInputStream, HttpTransport, HttpEngine, ResponseHeaders, 
//            RawHeaders

private static class transport extends AbstractHttpInputStream
{

    private static final int NO_CHUNK_YET = -1;
    private int bytesRemainingInChunk;
    private boolean hasMoreChunks;
    private final HttpTransport transport;

    private void readChunkSize()
        throws IOException
    {
        if (bytesRemainingInChunk != -1)
        {
            Util.readAsciiLine(in);
        }
        String s = Util.readAsciiLine(in);
        int i = s.indexOf(";");
        Object obj = s;
        if (i != -1)
        {
            obj = s.substring(0, i);
        }
        try
        {
            bytesRemainingInChunk = Integer.parseInt(((String) (obj)).trim(), 16);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new ProtocolException((new StringBuilder()).append("Expected a hex chunk size but was ").append(((String) (obj))).toString());
        }
        if (bytesRemainingInChunk == 0)
        {
            hasMoreChunks = false;
            obj = httpEngine.responseHeaders.getHeaders();
            RawHeaders.readHeaders(HttpTransport.access$400(transport), ((RawHeaders) (obj)));
            httpEngine.receiveHeaders(((RawHeaders) (obj)));
            endOfInput();
        }
    }

    public int available()
        throws IOException
    {
        checkNotClosed();
        if (!hasMoreChunks || bytesRemainingInChunk == -1)
        {
            return 0;
        } else
        {
            return Math.min(in.available(), bytesRemainingInChunk);
        }
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        if (hasMoreChunks && !HttpTransport.access$200(httpEngine, this))
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
        if (!hasMoreChunks)
        {
            return -1;
        }
        if (bytesRemainingInChunk == 0 || bytesRemainingInChunk == -1)
        {
            readChunkSize();
            if (!hasMoreChunks)
            {
                return -1;
            }
        }
        j = in.read(abyte0, i, Math.min(j, bytesRemainingInChunk));
        if (j == -1)
        {
            unexpectedEndOfInput();
            throw new IOException("unexpected end of stream");
        } else
        {
            bytesRemainingInChunk = bytesRemainingInChunk - j;
            cacheWrite(abyte0, i, j);
            return j;
        }
    }

    (InputStream inputstream, CacheRequest cacherequest, HttpTransport httptransport)
        throws IOException
    {
        super(inputstream, HttpTransport.access$300(httptransport), cacherequest);
        bytesRemainingInChunk = -1;
        hasMoreChunks = true;
        transport = httptransport;
    }
}
