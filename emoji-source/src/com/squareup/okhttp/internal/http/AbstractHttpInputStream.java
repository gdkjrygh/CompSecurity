// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine

abstract class AbstractHttpInputStream extends InputStream
{

    private final OutputStream cacheBody;
    private final CacheRequest cacheRequest;
    protected boolean closed;
    protected final HttpEngine httpEngine;
    protected final InputStream in;

    AbstractHttpInputStream(InputStream inputstream, HttpEngine httpengine, CacheRequest cacherequest)
        throws IOException
    {
        in = inputstream;
        httpEngine = httpengine;
        if (cacherequest != null)
        {
            inputstream = cacherequest.getBody();
        } else
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            cacherequest = null;
        }
        cacheBody = inputstream;
        cacheRequest = cacherequest;
    }

    protected final void cacheWrite(byte abyte0[], int i, int j)
        throws IOException
    {
        if (cacheBody != null)
        {
            cacheBody.write(abyte0, i, j);
        }
    }

    protected final void checkNotClosed()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("stream closed");
        } else
        {
            return;
        }
    }

    protected final void endOfInput()
        throws IOException
    {
        if (cacheRequest != null)
        {
            cacheBody.close();
        }
        httpEngine.release(false);
    }

    public final int read()
        throws IOException
    {
        return Util.readSingleByte(this);
    }

    protected final void unexpectedEndOfInput()
    {
        if (cacheRequest != null)
        {
            cacheRequest.abort();
        }
        httpEngine.release(true);
    }
}
