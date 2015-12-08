// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import okio.e;

// Referenced classes of package com.squareup.okhttp:
//            r

public abstract class w
    implements Closeable
{

    public w()
    {
    }

    private byte[] f()
        throws IOException
    {
        e e1;
        long l;
        l = b();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder("Cannot buffer entire body for content length: ")).append(l).toString());
        }
        e1 = c();
        Object obj = e1.q();
        k.a(e1);
        if (l != -1L && l != (long)obj.length)
        {
            throw new IOException("Content-Length and stream length disagree");
        } else
        {
            return ((byte []) (obj));
        }
        obj;
        k.a(e1);
        throw obj;
    }

    public abstract r a();

    public abstract long b()
        throws IOException;

    public abstract e c()
        throws IOException;

    public void close()
        throws IOException
    {
        c().close();
    }

    public final InputStream d()
        throws IOException
    {
        return c().e();
    }

    public final String e()
        throws IOException
    {
        byte abyte0[] = f();
        r r1 = a();
        Charset charset;
        if (r1 != null)
        {
            charset = k.c;
            if (r1.b != null)
            {
                charset = Charset.forName(r1.b);
            }
        } else
        {
            charset = k.c;
        }
        return new String(abyte0, charset.name());
    }
}
