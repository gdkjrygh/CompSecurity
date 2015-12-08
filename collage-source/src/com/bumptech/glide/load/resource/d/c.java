// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.g.a;
import com.bumptech.glide.load.b.g;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.c.b;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a, b

public class c
    implements e
{
    static class a
    {

        public InputStream a(InputStream inputstream, byte abyte0[])
        {
            return new n(inputstream, abyte0);
        }

        a()
        {
        }
    }

    static class b
    {

        public com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType a(InputStream inputstream)
            throws IOException
        {
            return (new ImageHeaderParser(inputstream)).b();
        }

        b()
        {
        }
    }


    private static final b a = new b();
    private static final a b = new a();
    private final e c;
    private final e d;
    private final com.bumptech.glide.load.engine.a.c e;
    private final b f;
    private final a g;
    private String h;

    public c(e e1, e e2, com.bumptech.glide.load.engine.a.c c1)
    {
        this(e1, e2, c1, a, b);
    }

    c(e e1, e e2, com.bumptech.glide.load.engine.a.c c1, b b1, a a1)
    {
        c = e1;
        d = e2;
        e = c1;
        f = b1;
        g = a1;
    }

    private com.bumptech.glide.load.resource.d.a a(g g1, int i, int k, byte abyte0[])
        throws IOException
    {
        if (g1.a() != null)
        {
            return b(g1, i, k, abyte0);
        } else
        {
            return b(g1, i, k);
        }
    }

    private com.bumptech.glide.load.resource.d.a a(InputStream inputstream, int i, int k)
        throws IOException
    {
        inputstream = d.a(inputstream, i, k);
        if (inputstream != null)
        {
            com.bumptech.glide.load.resource.c.b b1 = (com.bumptech.glide.load.resource.c.b)inputstream.b();
            if (b1.e() > 1)
            {
                return new com.bumptech.glide.load.resource.d.a(null, inputstream);
            } else
            {
                return new com.bumptech.glide.load.resource.d.a(new com.bumptech.glide.load.resource.bitmap.c(b1.b(), e), null);
            }
        } else
        {
            return null;
        }
    }

    private com.bumptech.glide.load.resource.d.a b(g g1, int i, int k)
        throws IOException
    {
        g1 = c.a(g1, i, k);
        if (g1 != null)
        {
            return new com.bumptech.glide.load.resource.d.a(g1, null);
        } else
        {
            return null;
        }
    }

    private com.bumptech.glide.load.resource.d.a b(g g1, int i, int k, byte abyte0[])
        throws IOException
    {
        InputStream inputstream = g.a(g1.a(), abyte0);
        inputstream.mark(2048);
        Object obj = f.a(inputstream);
        inputstream.reset();
        abyte0 = null;
        if (obj == com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF)
        {
            abyte0 = a(inputstream, i, k);
        }
        obj = abyte0;
        if (abyte0 == null)
        {
            obj = b(new g(inputstream, g1.b()), i, k);
        }
        return ((com.bumptech.glide.load.resource.d.a) (obj));
    }

    public j a(g g1, int i, int k)
        throws IOException
    {
        com.bumptech.glide.g.a a1;
        byte abyte0[];
        a1 = com.bumptech.glide.g.a.a();
        abyte0 = a1.b();
        g1 = a(g1, i, k, abyte0);
        a1.a(abyte0);
        if (g1 != null)
        {
            return new com.bumptech.glide.load.resource.d.b(g1);
        } else
        {
            return null;
        }
        g1;
        a1.a(abyte0);
        throw g1;
    }

    public volatile j a(Object obj, int i, int k)
        throws IOException
    {
        return a((g)obj, i, k);
    }

    public String a()
    {
        if (h == null)
        {
            h = (new StringBuilder()).append(d.a()).append(c.a()).toString();
        }
        return h;
    }

}
