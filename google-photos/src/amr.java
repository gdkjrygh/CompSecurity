// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class amr
    implements Closeable
{

    final Charset a;
    int b;
    private final InputStream c;
    private byte d[];
    private int e;

    private amr(InputStream inputstream, int i, Charset charset)
    {
        if (inputstream == null || charset == null)
        {
            throw new NullPointerException();
        }
        if (!charset.equals(amt.a))
        {
            throw new IllegalArgumentException("Unsupported encoding");
        } else
        {
            c = inputstream;
            a = charset;
            d = new byte[8192];
            return;
        }
    }

    public amr(InputStream inputstream, Charset charset)
    {
        this(inputstream, 8192, charset);
    }

    private void b()
    {
        int i = c.read(d, 0, d.length);
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            e = 0;
            b = i;
            return;
        }
    }

    public final String a()
    {
        InputStream inputstream = c;
        inputstream;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            throw new IOException("LineReader is closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
        int i;
        if (e >= b)
        {
            b();
        }
        i = e;
_L9:
        if (i == b) goto _L2; else goto _L1
_L1:
        if (d[i] != 10)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        Object obj;
        int j;
        if (i != e && d[i - 1] == 13)
        {
            j = i - 1;
        } else
        {
            j = i;
        }
        obj = new String(d, e, j - e, a.name());
        e = i + 1;
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new ams(this, (b - e) + 80);
_L8:
        ((ByteArrayOutputStream) (obj)).write(d, e, b - e);
        b = -1;
        b();
        i = e;
_L6:
        if (i == b)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d[i] != 10) goto _L4; else goto _L3
_L3:
        if (i != e)
        {
            ((ByteArrayOutputStream) (obj)).write(d, e, i - e);
        }
        e = i + 1;
        obj = ((ByteArrayOutputStream) (obj)).toString();
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        i++;
          goto _L9
    }

    public final void close()
    {
        synchronized (c)
        {
            if (d != null)
            {
                d = null;
                c.close();
            }
        }
        return;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
