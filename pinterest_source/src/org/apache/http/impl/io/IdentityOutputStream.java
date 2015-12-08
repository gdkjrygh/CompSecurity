// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

public class IdentityOutputStream extends OutputStream
{

    private boolean closed;
    private final SessionOutputBuffer out;

    public IdentityOutputStream(SessionOutputBuffer sessionoutputbuffer)
    {
        closed = false;
        if (sessionoutputbuffer == null)
        {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else
        {
            out = sessionoutputbuffer;
            return;
        }
    }

    public void close()
    {
        if (!closed)
        {
            closed = true;
            out.flush();
        }
    }

    public void flush()
    {
        out.flush();
    }

    public void write(int i)
    {
        if (closed)
        {
            throw new IOException("Attempted write to closed stream.");
        } else
        {
            out.write(i);
            return;
        }
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (closed)
        {
            throw new IOException("Attempted write to closed stream.");
        } else
        {
            out.write(abyte0, i, j);
            return;
        }
    }
}
