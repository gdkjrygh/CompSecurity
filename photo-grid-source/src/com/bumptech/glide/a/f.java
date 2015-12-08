// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package com.bumptech.glide.a:
//            h, g

final class f
    implements Closeable
{

    private final InputStream a;
    private final Charset b;
    private byte c[];
    private int d;
    private int e;

    public f(InputStream inputstream, Charset charset)
    {
        this(inputstream, charset, (byte)0);
    }

    private f(InputStream inputstream, Charset charset, byte byte0)
    {
        if (inputstream == null || charset == null)
        {
            throw new NullPointerException();
        }
        if (!charset.equals(h.a))
        {
            throw new IllegalArgumentException("Unsupported encoding");
        } else
        {
            a = inputstream;
            b = charset;
            c = new byte[8192];
            return;
        }
    }

    static Charset a(f f1)
    {
        return f1.b;
    }

    private void c()
    {
        int i = a.read(c, 0, c.length);
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            d = 0;
            e = i;
            return;
        }
    }

    public final String a()
    {
        InputStream inputstream = a;
        inputstream;
        JVM INSTR monitorenter ;
        if (c == null)
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
        if (d >= e)
        {
            c();
        }
        i = d;
_L9:
        if (i == e) goto _L2; else goto _L1
_L1:
        if (c[i] != 10)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        Object obj;
        int j;
        if (i != d && c[i - 1] == 13)
        {
            j = i - 1;
        } else
        {
            j = i;
        }
        obj = new String(c, d, j - d, b.name());
        d = i + 1;
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new g(this, (e - d) + 80);
_L8:
        ((ByteArrayOutputStream) (obj)).write(c, d, e - d);
        e = -1;
        c();
        i = d;
_L6:
        if (i == e)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c[i] != 10) goto _L4; else goto _L3
_L3:
        if (i != d)
        {
            ((ByteArrayOutputStream) (obj)).write(c, d, i - d);
        }
        d = i + 1;
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

    public final boolean b()
    {
        return e == -1;
    }

    public final void close()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c = null;
                a.close();
            }
        }
        return;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
