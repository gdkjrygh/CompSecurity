// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import p.aa.d;
import p.ai.g;
import p.ai.m;
import p.al.c;
import p.al.f;
import p.an.k;
import p.ao.a;
import p.ap.h;
import p.s.b;

// Referenced classes of package p.l:
//            g, i

public class e
    implements Cloneable
{

    private boolean A;
    private Drawable B;
    private int C;
    protected final Class a;
    protected final Context b;
    protected final p.l.g c;
    protected final Class d;
    protected final m e;
    protected final g f;
    private p.ak.a g;
    private Object h;
    private p.q.c i;
    private boolean j;
    private int k;
    private int l;
    private f m;
    private Float n;
    private e o;
    private Float p;
    private Drawable q;
    private Drawable r;
    private i s;
    private boolean t;
    private p.am.d u;
    private int v;
    private int w;
    private b x;
    private p.q.g y;
    private boolean z;

    e(Context context, Class class1, p.ak.f f1, Class class2, p.l.g g1, m m1, g g2)
    {
        Object obj = null;
        super();
        i = p.ao.a.a();
        p = Float.valueOf(1.0F);
        s = null;
        t = true;
        u = p.am.e.a();
        v = -1;
        w = -1;
        x = b.d;
        y = p.aa.d.b();
        b = context;
        a = class1;
        d = class2;
        c = g1;
        e = m1;
        f = g2;
        class2 = obj;
        if (f1 != null)
        {
            class2 = new p.ak.a(f1);
        }
        g = class2;
        if (context == null)
        {
            throw new NullPointerException("Context can't be null");
        }
        if (class1 != null && f1 == null)
        {
            throw new NullPointerException("LoadProvider must not be null");
        } else
        {
            return;
        }
    }

    e(p.ak.f f1, Class class1, e e1)
    {
        this(e1.b, e1.a, f1, class1, e1.c, e1.e, e1.f);
        h = e1.h;
        j = e1.j;
        i = e1.i;
        x = e1.x;
        t = e1.t;
    }

    private c a(k k1, float f1, i i1, p.al.d d1)
    {
        return p.al.b.a(g, h, i, b, i1, k1, f1, q, k, r, l, B, C, m, d1, c.b(), y, d, t, u, w, v, x);
    }

    private c a(k k1, p.al.h h1)
    {
        if (o != null)
        {
            if (A)
            {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (o.u.equals(p.am.e.a()))
            {
                o.u = u;
            }
            if (o.s == null)
            {
                o.s = a();
            }
            if (p.ap.h.a(w, v) && !p.ap.h.a(o.w, o.v))
            {
                o.b(w, v);
            }
            h1 = new p.al.h(h1);
            c c1 = a(k1, p.floatValue(), s, ((p.al.d) (h1)));
            A = true;
            k1 = o.a(k1, h1);
            A = false;
            h1.a(c1, k1);
            return h1;
        }
        if (n != null)
        {
            h1 = new p.al.h(h1);
            h1.a(a(k1, p.floatValue(), s, ((p.al.d) (h1))), a(k1, n.floatValue(), a(), ((p.al.d) (h1))));
            return h1;
        } else
        {
            return a(k1, p.floatValue(), s, ((p.al.d) (h1)));
        }
    }

    private i a()
    {
        if (s == p.l.i.d)
        {
            return p.l.i.c;
        }
        if (s == p.l.i.c)
        {
            return p.l.i.b;
        } else
        {
            return p.l.i.a;
        }
    }

    private c b(k k1)
    {
        if (s == null)
        {
            s = p.l.i.c;
        }
        return a(k1, null);
    }

    public k a(ImageView imageview)
    {
        p.ap.h.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (z || imageview.getScaleType() == null) goto _L2; else goto _L1
_L1:
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.l._cls2.a[imageview.getScaleType().ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 89
    //                   2 96
    //                   3 96
    //                   4 96;
           goto _L2 _L3 _L4 _L4 _L4
_L2:
        return a(c.a(imageview, d));
_L3:
        e();
        continue; /* Loop/switch isn't completed */
_L4:
        d();
        if (true) goto _L2; else goto _L5
_L5:
    }

    public k a(k k1)
    {
        p.ap.h.a();
        if (k1 == null)
        {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!j)
        {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        c c1 = k1.a();
        if (c1 != null)
        {
            c1.d();
            e.b(c1);
            c1.a();
        }
        c1 = b(k1);
        k1.a(c1);
        f.a(k1);
        e.a(c1);
        return k1;
    }

    e a(p.am.d d1)
    {
        if (d1 == null)
        {
            throw new NullPointerException("Animation factory must not be null!");
        } else
        {
            u = d1;
            return this;
        }
    }

    public e b(int i1)
    {
        k = i1;
        return this;
    }

    public e b(int i1, int j1)
    {
        if (!p.ap.h.a(i1, j1))
        {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        } else
        {
            w = i1;
            v = j1;
            return this;
        }
    }

    public e b(Drawable drawable)
    {
        q = drawable;
        return this;
    }

    public e b(Object obj)
    {
        h = obj;
        j = true;
        return this;
    }

    public e b(p.ah.d d1)
    {
        if (g != null)
        {
            g.a(d1);
        }
        return this;
    }

    public e b(f f1)
    {
        m = f1;
        return this;
    }

    public e b(i i1)
    {
        s = i1;
        return this;
    }

    public e b(p.q.b b1)
    {
        if (g != null)
        {
            g.a(b1);
        }
        return this;
    }

    public e b(p.q.c c1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("Signature must not be null");
        } else
        {
            i = c1;
            return this;
        }
    }

    public e b(p.q.e e1)
    {
        if (g != null)
        {
            g.a(e1);
        }
        return this;
    }

    public e b(b b1)
    {
        x = b1;
        return this;
    }

    public e b(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
        return this;
    }

    public transient e b(p.q.g ag[])
    {
        z = true;
        if (ag.length == 1)
        {
            y = ag[0];
            return this;
        } else
        {
            y = new p.q.d(ag);
            return this;
        }
    }

    public p.al.a c(int i1, int j1)
    {
        p.al.e e1 = new p.al.e(c.g(), i1, j1);
        c.g().post(new Runnable(e1) {

            final p.al.e a;
            final e b;

            public void run()
            {
                if (!a.isCancelled())
                {
                    b.a(a);
                }
            }

            
            {
                b = e.this;
                a = e2;
                super();
            }
        });
        return e1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return f();
    }

    void d()
    {
    }

    void e()
    {
    }

    public e f()
    {
        p.ak.a a1;
        e e1;
        e1 = (e)super.clone();
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        a1 = g.g();
_L1:
        e1.g = a1;
        return e1;
        a1 = null;
          goto _L1
        CloneNotSupportedException clonenotsupportedexception;
        clonenotsupportedexception;
        throw new RuntimeException(clonenotsupportedexception);
    }
}
