// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;

public class ContentLengthInputStream extends InputStream
{

    private static final int BUFFER_SIZE = 2048;
    private boolean closed;
    private long contentLength;
    private SessionInputBuffer in;
    private long pos;

    public ContentLengthInputStream(SessionInputBuffer sessioninputbuffer, long l)
    {
        pos = 0L;
        closed = false;
        in = null;
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("Content length may not be negative");
        } else
        {
            in = sessioninputbuffer;
            contentLength = l;
            return;
        }
    }

    public int available()
    {
        if (in instanceof BufferInfo)
        {
            return Math.min(((BufferInfo)in).length(), (int)(contentLength - pos));
        } else
        {
            return 0;
        }
    }

    public void close()
    {
        if (closed)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        byte abyte0[];
        if (pos >= contentLength)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        abyte0 = new byte[2048];
        int i;
        do
        {
            i = read(abyte0);
        } while (i >= 0);
        closed = true;
        return;
        Exception exception;
        exception;
        closed = true;
        throw exception;
    }

    public int read()
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        if (pos >= contentLength)
        {
            return -1;
        }
        int i = in.read();
        if (i == -1)
        {
            if (pos < contentLength)
            {
                throw new ConnectionClosedException((new StringBuilder("Premature end of Content-Length delimited message body (expected: ")).append(contentLength).append("; received: ").append(pos).toString());
            }
        } else
        {
            pos = pos + 1L;
        }
        return i;
    }

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        if (pos >= contentLength)
        {
            return -1;
        }
        int k = j;
        if (pos + (long)j > contentLength)
        {
            k = (int)(contentLength - pos);
        }
        i = in.read(abyte0, i, k);
        if (i == -1 && pos < contentLength)
        {
            throw new ConnectionClosedException((new StringBuilder("Premature end of Content-Length delimited message body (expected: ")).append(contentLength).append("; received: ").append(pos).toString());
        }
        if (i > 0)
        {
            pos = pos + (long)i;
        }
        return i;
    }

    public long skip(long l)
    {
        if (l <= 0L)
        {
            return 0L;
        }
        byte abyte0[] = new byte[2048];
        l = Math.min(l, contentLength - pos);
        long l1 = 0L;
        do
        {
            if (l <= 0L)
            {
                break;
            }
            int i = read(abyte0, 0, (int)Math.min(2048L, l));
            if (i == -1)
            {
                break;
            }
            l1 += i;
            l -= i;
        } while (true);
        return l1;
    }
}
