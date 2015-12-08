// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.ChunkFactory;
import ar.com.hjg.pngj.chunks.a;
import ar.com.hjg.pngj.chunks.b;
import ar.com.hjg.pngj.chunks.e;
import ar.com.hjg.pngj.chunks.p;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package ar.com.hjg.pngj:
//            c, l, x, b, 
//            m, g, IChunkFactory, f

public final class d extends c
{

    protected m b;
    protected g c;
    protected int d;
    protected e e;
    protected final boolean f = false;
    private long g;
    private boolean h;
    private boolean i;
    private Set j;
    private long k;
    private long l;
    private long m;
    private IChunkFactory n;
    private b o;

    public d()
    {
        d = -1;
        e = null;
        g = 0L;
        h = true;
        i = false;
        j = new HashSet();
        k = 0L;
        l = 0L;
        m = 0L;
        o = b.d;
        n = new ChunkFactory();
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        return super.a(abyte0, i1, j1);
    }

    protected final f a(String s)
    {
        s = new l(s, b, c);
        s.a(f);
        return s;
    }

    protected final void a(int i1, String s, long l1)
    {
        if (!s.equals("IHDR")) goto _L2; else goto _L1
_L1:
        if (d >= 0) goto _L4; else goto _L3
_L3:
        d = 0;
_L6:
        super.a(i1, s, l1);
        return;
_L4:
        throw new x((new StringBuilder("unexpected chunk ")).append(s).toString());
_L2:
        if (s.equals("PLTE"))
        {
            if (d == 0 || d == 1)
            {
                d = 2;
            } else
            {
                throw new x((new StringBuilder("unexpected chunk ")).append(s).toString());
            }
        } else
        if (s.equals("IDAT"))
        {
            if (d >= 0 && d <= 4)
            {
                d = 4;
            } else
            {
                throw new x((new StringBuilder("unexpected chunk ")).append(s).toString());
            }
        } else
        if (s.equals("IEND"))
        {
            if (d >= 4)
            {
                d = 6;
            } else
            {
                throw new x((new StringBuilder("unexpected chunk ")).append(s).toString());
            }
        } else
        if (d <= 1)
        {
            d = 1;
        } else
        if (d <= 3)
        {
            d = 3;
        } else
        {
            d = 5;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a(ar.com.hjg.pngj.b b1)
    {
        boolean flag = true;
        super.a(b1);
        if (b1.a().c.equals("IHDR"))
        {
            p p1 = new p(null);
            p1.a(b1.a());
            p1.g();
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if ((p1.e() & 4) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((p1.e() & 1) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (p1.e() == 0 || p1.e() == 4)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            b = new m(p1.b(), p1.c(), p1.d(), flag1, flag3, flag2);
            if (p1.f() != 1)
            {
                flag = false;
            }
            if (flag)
            {
                c = new g(b);
            }
            e = new e(b);
        }
        if (b1.a == ar.com.hjg.pngj.b.a.a || i)
        {
            b1 = n.createChunk(b1.a(), b);
            e.a(b1, d);
        }
    }

    protected final boolean a()
    {
        return h;
    }

    public final boolean a(int i1, String s)
    {
        if (!super.a(i1, s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (ar.com.hjg.pngj.chunks.a.b(s))
        {
            return false;
        }
        if (k > 0L && (long)i1 + b() > k)
        {
            throw new x((new StringBuilder("Maximum total bytes to read exceeeded: ")).append(k).append(" offset:").append(b()).append(" len=").append(i1).toString());
        }
        if (j.contains(s) || l > 0L && (long)i1 > l || m > 0L && (long)i1 > m - g) goto _L1; else goto _L3
_L3:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ar.com.hjg.pngj.chunks.b.values().length];
                try
                {
                    a[b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (ar.com.hjg.pngj._cls1.a[o.ordinal()])
        {
        default:
            break;

        case 2: // '\002'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (!ar.com.hjg.pngj.chunks.a.d(s))
            {
                return true;
            }
            break;
        }
        break; /* Loop/switch isn't completed */
        do
        {
            return false;
        } while (true);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected final boolean b(String s)
    {
        return s.equals("IDAT");
    }

    public final void d()
    {
        if (d != 6)
        {
            d = 6;
        }
        super.d();
    }

    public final boolean e()
    {
        return d < 4;
    }

    public final l f()
    {
        f f1 = c();
        if (f1 instanceof l)
        {
            return (l)f1;
        } else
        {
            return null;
        }
    }

    public final m g()
    {
        return b;
    }

    public final g h()
    {
        return c;
    }

    public final void i()
    {
        k = 0x35b42f29L;
    }

    public final void j()
    {
        l = 0x1ee258L;
    }

    public final void k()
    {
        m = 0x4ca918L;
    }

    public final void l()
    {
        h = false;
    }
}
