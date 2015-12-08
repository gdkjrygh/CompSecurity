// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheRequest;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            AbstractHttpInputStream, HttpEngine

final class UnknownLengthHttpInputStream extends AbstractHttpInputStream
{

    private boolean inputExhausted;

    UnknownLengthHttpInputStream(InputStream inputstream, CacheRequest cacherequest, HttpEngine httpengine)
        throws IOException
    {
        super(inputstream, httpengine, cacherequest);
    }

    public int available()
        throws IOException
    {
        checkNotClosed();
        if (in == null)
        {
            return 0;
        } else
        {
            return in.available();
        }
    }

    public void close()
        throws IOException
    {
        if (!closed)
        {
            closed = true;
            if (!inputExhausted)
            {
                unexpectedEndOfInput();
                return;
            }
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        Util.checkOffsetAndCount(abyte0.length, i, j);
        checkNotClosed();
        if (in == null || inputExhausted)
        {
            return -1;
        }
        j = in.read(abyte0, i, j);
        if (j == -1)
        {
            inputExhausted = true;
            endOfInput();
            return -1;
        } else
        {
            cacheWrite(abyte0, i, j);
            return j;
        }
    }
}
