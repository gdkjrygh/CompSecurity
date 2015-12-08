// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package com.mopub.common:
//            DiskLruCacheUtil, i

final class h
    implements Closeable
{

    private final InputStream a;
    private final Charset b;
    private byte c[];
    private int d;
    private int e;

    public h(InputStream inputstream, int j, Charset charset)
    {
        if (inputstream == null || charset == null)
        {
            throw new NullPointerException();
        }
        if (j < 0)
        {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(DiskLruCacheUtil.a))
        {
            throw new IllegalArgumentException("Unsupported encoding");
        } else
        {
            a = inputstream;
            b = charset;
            c = new byte[j];
            return;
        }
    }

    public h(InputStream inputstream, Charset charset)
    {
        this(inputstream, 8192, charset);
    }

    static Charset a(h h1)
    {
        return h1.b;
    }

    private void a()
    {
        int j = a.read(c, 0, c.length);
        if (j == -1)
        {
            throw new EOFException();
        } else
        {
            d = 0;
            e = j;
            return;
        }
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

    public final String readLine()
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
        int j;
        if (d >= e)
        {
            a();
        }
        j = d;
_L9:
        if (j == e) goto _L2; else goto _L1
_L1:
        if (c[j] != 10)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        Object obj;
        int k;
        if (j != d && c[j - 1] == 13)
        {
            k = j - 1;
        } else
        {
            k = j;
        }
        obj = new String(c, d, k - d, b.name());
        d = j + 1;
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new i(this, (e - d) + 80);
_L8:
        ((ByteArrayOutputStream) (obj)).write(c, d, e - d);
        e = -1;
        a();
        j = d;
_L6:
        if (j == e)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c[j] != 10) goto _L4; else goto _L3
_L3:
        if (j != d)
        {
            ((ByteArrayOutputStream) (obj)).write(c, d, j - d);
        }
        d = j + 1;
        obj = ((ByteArrayOutputStream) (obj)).toString();
        inputstream;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        j++;
          goto _L9
    }
}
