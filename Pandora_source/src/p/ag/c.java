// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import java.io.IOException;
import java.io.InputStream;
import p.ab.l;
import p.ab.o;
import p.af.b;
import p.ap.a;
import p.q.e;
import p.s.k;
import p.x.g;

// Referenced classes of package p.ag:
//            a, b

public class c
    implements e
{
    static class a
    {

        public InputStream a(InputStream inputstream, byte abyte0[])
        {
            return new o(inputstream, abyte0);
        }

        a()
        {
        }
    }

    static class b
    {

        public p.ab.l.a a(InputStream inputstream)
            throws IOException
        {
            return (new l(inputstream)).b();
        }

        b()
        {
        }
    }


    private static final b a = new b();
    private static final a b = new a();
    private final e c;
    private final e d;
    private final p.t.c e;
    private final b f;
    private final a g;
    private String h;

    public c(e e1, e e2, p.t.c c1)
    {
        this(e1, e2, c1, a, b);
    }

    c(e e1, e e2, p.t.c c1, b b1, a a1)
    {
        c = e1;
        d = e2;
        e = c1;
        f = b1;
        g = a1;
    }

    private p.ag.a a(InputStream inputstream, int i, int j)
        throws IOException
    {
        inputstream = d.a(inputstream, i, j);
        if (inputstream != null)
        {
            p.af.b b1 = (p.af.b)inputstream.b();
            if (b1.e() > 1)
            {
                return new p.ag.a(null, inputstream);
            } else
            {
                return new p.ag.a(new p.ab.c(b1.b(), e), null);
            }
        } else
        {
            return null;
        }
    }

    private p.ag.a a(g g1, int i, int j, byte abyte0[])
        throws IOException
    {
        if (g1.a() != null)
        {
            return b(g1, i, j, abyte0);
        } else
        {
            return b(g1, i, j);
        }
    }

    private p.ag.a b(g g1, int i, int j)
        throws IOException
    {
        g1 = c.a(g1, i, j);
        if (g1 != null)
        {
            return new p.ag.a(g1, null);
        } else
        {
            return null;
        }
    }

    private p.ag.a b(g g1, int i, int j, byte abyte0[])
        throws IOException
    {
        InputStream inputstream = g.a(g1.a(), abyte0);
        inputstream.mark(2048);
        Object obj = f.a(inputstream);
        inputstream.reset();
        abyte0 = null;
        if (obj == p.ab.l.a.a)
        {
            abyte0 = a(inputstream, i, j);
        }
        obj = abyte0;
        if (abyte0 == null)
        {
            obj = b(new g(inputstream, g1.b()), i, j);
        }
        return ((p.ag.a) (obj));
    }

    public String a()
    {
        if (h == null)
        {
            h = (new StringBuilder()).append(d.a()).append(c.a()).toString();
        }
        return h;
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((g)obj, i, j);
    }

    public k a(g g1, int i, int j)
        throws IOException
    {
        p.ap.a a1;
        byte abyte0[];
        a1 = p.ap.a.a();
        abyte0 = a1.b();
        g1 = a(g1, i, j, abyte0);
        a1.a(abyte0);
        if (g1 != null)
        {
            return new p.ag.b(g1);
        } else
        {
            return null;
        }
        g1;
        a1.a(abyte0);
        throw g1;
    }

}
