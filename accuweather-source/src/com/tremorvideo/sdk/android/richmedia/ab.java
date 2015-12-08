// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            b, i, ag, ak, 
//            ad, af, ah, ac, 
//            al, ae, aj, k, 
//            e, z, a, l, 
//            aa, n

public abstract class ab
{
    protected class a
    {

        public k a;
        public k b;
        public float c;
        final ab d;

        protected a()
        {
            d = ab.this;
            super();
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/ab$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("Normal", 0);
            b = new b("Smaller", 1);
            c = new b("Larger", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    public float a;
    public float b;
    protected com.tremorvideo.sdk.android.richmedia.b c;
    protected i d;
    protected int e;
    protected List f;
    protected z g;
    protected boolean h;
    protected boolean i;
    protected int j;
    protected b k;

    public ab(z z1)
    {
        c = new com.tremorvideo.sdk.android.richmedia.b(this);
        j = 0;
        k = b.a;
        g = z1;
        d = new i();
    }

    public static ab a(z z1, int i1)
        throws Exception
    {
        if (i1 == 0x125cdd26)
        {
            return new ag(z1);
        }
        if (i1 == 0x55e9b1c8)
        {
            return new ak(z1);
        }
        if (i1 == 0x5543b163)
        {
            return new ad(z1);
        }
        if (i1 == 0x55e213ea)
        {
            return new af(z1);
        }
        if (i1 == 0x130c6851)
        {
            return new ah(z1);
        }
        if (i1 == 0x4e3fcdbf)
        {
            return new ac(z1);
        }
        if (i1 == 0x1345f6ba)
        {
            return new al(z1);
        }
        if (i1 == 0x7aa6085f)
        {
            return new ae(z1);
        }
        if (i1 == 0x629b2a5a)
        {
            return new aj(z1);
        } else
        {
            throw new Exception((new StringBuilder()).append("Loading Scene Object: Unknown type: ").append(i1).toString());
        }
    }

    protected RectF a(aa aa, long l1, RectF rectf)
    {
        if (c.a(0) != null)
        {
            b.a a1 = c.a(0);
            rectf.left = com.tremorvideo.sdk.android.richmedia.b.a(a1.a(g).b(aa, l1), a1.a()).x;
        }
        if (c.a(1) != null)
        {
            Object obj = c.a(1);
            obj = com.tremorvideo.sdk.android.richmedia.b.a(((b.a) (obj)).a(g).b(aa, l1), ((b.a) (obj)).a());
            float f1 = rectf.left;
            rectf.right = (((PointF) (obj)).x + f1) - rectf.left;
        }
        if (c.a(2) != null)
        {
            b.a a2 = c.a(2);
            rectf.top = com.tremorvideo.sdk.android.richmedia.b.a(a2.a(g).b(aa, l1), a2.a()).y;
        }
        if (c.a(3) != null)
        {
            b.a a3 = c.a(3);
            aa = com.tremorvideo.sdk.android.richmedia.b.a(a3.a(g).b(aa, l1), a3.a());
            float f2 = rectf.top;
            rectf.bottom = (((PointF) (aa)).y + f2) - rectf.top;
        }
        return rectf;
    }

    protected a a(long l1)
    {
        a a1 = new a();
        Iterator iterator = f.iterator();
        long l4 = 0x8000000000000000L;
        long l2 = 0x7fffffffffffffffL;
        while (iterator.hasNext()) 
        {
            k k1 = (k)iterator.next();
            long l3 = l4;
            if (k1.a() <= l1)
            {
                l3 = l4;
                if (k1.a() >= l4)
                {
                    a1.a = k1;
                    l3 = k1.a();
                }
            }
            if (k1.a() >= l1 && k1.a() <= l2)
            {
                a1.b = k1;
                l2 = k1.a();
            }
            l4 = l3;
        }
        if (a1.b == null)
        {
            a1.b = a1.a;
        }
        if (a1.a != null && a1.b != null)
        {
            float f1 = a1.b.a() - a1.a.a();
            if (f1 == 0.0F)
            {
                a1.c = 0.0F;
            } else
            {
                a1.c = (float)(l1 - a1.a.a()) / f1;
            }
            return a1;
        } else
        {
            return null;
        }
    }

    public i.a a(i.c c1)
    {
        return d.a(c1);
    }

    public i.a a(boolean flag)
    {
        if (flag)
        {
            return d.a(i.c.e);
        } else
        {
            return null;
        }
    }

    public void a(int i1)
    {
        j = i1;
    }

    public void a(aa aa, long l1)
    {
    }

    public void a(e e1)
    {
        int i1 = 0;
        k k1;
        int j1;
        try
        {
            e = e1.a();
            if (g.f().e() > 1)
            {
                k = b.values()[e1.b()];
            }
            c.a(e1);
            d.a(e1, g.f().e());
            j1 = e1.b();
            f = new ArrayList(j1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            return;
        }
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = h();
        k1.a(e1);
        f.add(k1);
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_81;
_L1:
        if (d.a(i.c.d) == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        h = true;
_L4:
        if (d.a(i.c.k) != null)
        {
            i = true;
            return;
        }
        break MISSING_BLOCK_LABEL_160;
        h = false;
        if (true) goto _L4; else goto _L3
_L3:
        i = false;
        return;
    }

    public void a(n n, long l1)
    {
    }

    public boolean a()
    {
        return d.a();
    }

    public boolean a(int i1, int j1)
    {
        return false;
    }

    public i.a b(boolean flag)
    {
        return d.a(i.c.j);
    }

    public i b()
    {
        return d;
    }

    public l b(aa aa, long l1)
    {
        aa = c(aa, l1);
        aa.a = ((l) (aa)).a + a;
        aa.b = ((l) (aa)).b + b;
        return aa;
    }

    public i.a c(boolean flag)
    {
        return d.a(i.c.k);
    }

    protected l c(aa aa, long l1)
    {
        return l.h;
    }

    public z c()
    {
        return g;
    }

    public boolean d()
    {
        return h;
    }

    protected boolean d(boolean flag)
    {
        if (j == -1)
        {
            flag = false;
        } else
        if (j == 1)
        {
            return true;
        }
        return flag;
    }

    public boolean e()
    {
        return i;
    }

    public void f()
    {
    }

    public i.a g()
    {
        return d.a(i.c.d);
    }

    protected abstract k h();

    public void i()
    {
    }
}
