// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.h;
import com.c.a.a.i;
import java.io.Closeable;
import java.io.IOException;

// Referenced classes of package com.c.a:
//            r

public abstract class B
    implements Closeable
{

    public B()
    {
    }

    public abstract r a();

    public abstract long b()
        throws IOException;

    public abstract h c()
        throws IOException;

    public void close()
        throws IOException
    {
        c().close();
    }

    public final byte[] d()
        throws IOException
    {
        h h1;
        long l;
        l = b();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder("Cannot buffer entire body for content length: ")).append(l).toString());
        }
        h1 = c();
        Object obj = h1.m();
        i.a(h1);
        if (l != -1L && l != (long)obj.length)
        {
            throw new IOException("Content-Length and stream length disagree");
        } else
        {
            return ((byte []) (obj));
        }
        obj;
        i.a(h1);
        throw obj;
    }
}
