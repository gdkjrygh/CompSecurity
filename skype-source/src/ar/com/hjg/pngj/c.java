// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.a;
import ar.com.hjg.pngj.chunks.d;
import java.util.Arrays;

// Referenced classes of package ar.com.hjg.pngj:
//            i, x, b, r, 
//            f, e, w

public class c
    implements i
{

    protected final boolean a;
    private byte b[];
    private int c;
    private boolean d;
    private boolean e;
    private int f;
    private long g;
    private f h;
    private b i;
    private long j;

    public c()
    {
        this((byte)0);
    }

    private c(byte byte0)
    {
        b = new byte[8];
        c = 0;
        d = false;
        e = false;
        f = 0;
        g = 0L;
        a = true;
        d = false;
    }

    public int a(byte abyte0[], int k, int l)
    {
        if (!e) goto _L2; else goto _L1
_L1:
        k = -1;
_L4:
        return k;
_L2:
        if (l == 0)
        {
            return 0;
        }
        if (l < 0)
        {
            throw new x((new StringBuilder("Bad len: ")).append(l).toString());
        }
        if (!d)
        {
            break; /* Loop/switch isn't completed */
        }
label0:
        {
            if (i != null && !i.b())
            {
                break label0;
            }
            int k1 = 8 - c;
            int i1 = k1;
            if (k1 > l)
            {
                i1 = l;
            }
            System.arraycopy(abyte0, k, b, c, i1);
            c = c + i1;
            l = i1 + 0;
            g = g + (long)i1;
            k = l;
            if (c == 8)
            {
                f = f + 1;
                a(r.c(b, 0), ar.com.hjg.pngj.chunks.a.a(b, 4, 4), g - 8L);
                c = 0;
                return l;
            }
        }
        if (true) goto _L4; else goto _L3
        k = i.a(abyte0, k, l);
_L6:
        g = g + (long)k;
        return k + 0;
_L3:
        int l1 = 8 - c;
        int j1 = l1;
        if (l1 > l)
        {
            j1 = l;
        }
        System.arraycopy(abyte0, k, b, c, j1);
        c = c + j1;
        k = j1;
        if (c == 8)
        {
            if (!Arrays.equals(b, ar.com.hjg.pngj.r.a()))
            {
                throw new x("Bad PNG signature");
            }
            c = 0;
            d = true;
            k = j1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected f a(String s)
    {
        return new f(s);
    }

    protected void a(int k, String s, long l)
    {
        if (s.equals("IDAT"))
        {
            j = j + (long)k;
        }
        boolean flag1 = a();
        boolean flag2 = a(k, s);
        boolean flag3 = b(s);
        boolean flag = false;
        if (h != null)
        {
            f f1 = h;
            if (f1.b.b())
            {
                flag = false;
            } else
            if (s.equals(f1.c))
            {
                flag = true;
            } else
            if (f1.b.a())
            {
                if (!f1.b.b())
                {
                    f1.d();
                }
                flag = false;
            } else
            {
                throw new x((new StringBuilder("Unexpected chunk ")).append(s).append(" while ").append(f1.c).append(" set is not done").toString());
            }
        }
        if (flag3 && !flag2)
        {
            if (!flag)
            {
                if (h != null)
                {
                    throw new x("too many IDAT (or idatlike) chunks");
                }
                h = a(s);
            }
            i = new e(k, s, l, h) {

                final c c;

                protected final void d()
                {
                    c.a(this);
                }

            
            {
                c = c.this;
                super(k, s, l, f1);
            }
            };
        } else
        {
            b.a a1;
            if (flag2)
            {
                a1 = b.a.c;
            } else
            {
                a1 = ar.com.hjg.pngj.b.a.a;
            }
            i = new b(k, s, l, a1) {

                final c c;

                protected final void b(byte abyte0[], int i1, int j1)
                {
                    throw new w("should never happen");
                }

                protected final void d()
                {
                    c.a(this);
                }

            
            {
                c = c.this;
                super(k, s, l, a1);
            }
            };
            if (!flag1)
            {
                i.c();
                return;
            }
        }
    }

    protected void a(b b1)
    {
        if (f == 1 && !"IHDR".equals(b1.a().c))
        {
            throw new x((new StringBuilder("Bad first chunk: ")).append(b1.a().c).append(" expected: IHDR").toString());
        }
        if (b1.a().c.equals("IEND"))
        {
            e = true;
        }
    }

    protected boolean a()
    {
        return true;
    }

    protected boolean a(int k, String s)
    {
        return false;
    }

    public final long b()
    {
        return g;
    }

    protected boolean b(String s)
    {
        return false;
    }

    public final f c()
    {
        return h;
    }

    public void d()
    {
        if (h != null)
        {
            h.d();
        }
        e = true;
    }
}
