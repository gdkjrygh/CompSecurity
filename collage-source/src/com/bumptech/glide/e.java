// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.e.f;
import com.bumptech.glide.f.a;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.resource.d;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.b.j;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.g;

// Referenced classes of package com.bumptech.glide:
//            i, g

public class e
    implements Cloneable
{

    private boolean A;
    private Drawable B;
    private int C;
    protected final Class a;
    protected final Context b;
    protected final com.bumptech.glide.g c;
    protected final Class d;
    protected final l e;
    protected final com.bumptech.glide.manager.g f;
    private com.bumptech.glide.e.a g;
    private Object h;
    private com.bumptech.glide.load.c i;
    private boolean j;
    private int k;
    private int l;
    private com.bumptech.glide.request.e m;
    private Float n;
    private e o;
    private Float p;
    private Drawable q;
    private Drawable r;
    private i s;
    private boolean t;
    private com.bumptech.glide.request.a.d u;
    private int v;
    private int w;
    private b x;
    private com.bumptech.glide.load.g y;
    private boolean z;

    e(Context context, Class class1, f f1, Class class2, com.bumptech.glide.g g1, l l1, com.bumptech.glide.manager.g g2)
    {
        Object obj = null;
        super();
        i = com.bumptech.glide.f.a.a();
        p = Float.valueOf(1.0F);
        s = null;
        t = true;
        u = com.bumptech.glide.request.a.e.a();
        v = -1;
        w = -1;
        x = b.d;
        y = com.bumptech.glide.load.resource.d.b();
        b = context;
        a = class1;
        d = class2;
        c = g1;
        e = l1;
        f = g2;
        class2 = obj;
        if (f1 != null)
        {
            class2 = new com.bumptech.glide.e.a(f1);
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

    e(f f1, Class class1, e e1)
    {
        this(e1.b, e1.a, f1, class1, e1.c, e1.e, e1.f);
        h = e1.h;
        j = e1.j;
        i = e1.i;
        x = e1.x;
        t = e1.t;
    }

    private i a()
    {
        if (s == com.bumptech.glide.i.d)
        {
            return com.bumptech.glide.i.c;
        }
        if (s == com.bumptech.glide.i.c)
        {
            return com.bumptech.glide.i.b;
        } else
        {
            return com.bumptech.glide.i.a;
        }
    }

    private c a(j j1, float f1, i i1, com.bumptech.glide.request.d d1)
    {
        return com.bumptech.glide.request.b.a(g, h, i, b, i1, j1, f1, q, k, r, l, B, C, m, d1, c.b(), y, d, t, u, w, v, x);
    }

    private c a(j j1, g g1)
    {
        if (o != null)
        {
            if (A)
            {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (o.u.equals(com.bumptech.glide.request.a.e.a()))
            {
                o.u = u;
            }
            if (o.s == null)
            {
                o.s = a();
            }
            if (com.bumptech.glide.g.h.a(w, v) && !com.bumptech.glide.g.h.a(o.w, o.v))
            {
                o.b(w, v);
            }
            g1 = new g(g1);
            c c1 = a(j1, p.floatValue(), s, ((com.bumptech.glide.request.d) (g1)));
            A = true;
            j1 = o.a(j1, g1);
            A = false;
            g1.a(c1, j1);
            return g1;
        }
        if (n != null)
        {
            g1 = new g(g1);
            g1.a(a(j1, p.floatValue(), s, ((com.bumptech.glide.request.d) (g1))), a(j1, n.floatValue(), a(), ((com.bumptech.glide.request.d) (g1))));
            return g1;
        } else
        {
            return a(j1, p.floatValue(), s, ((com.bumptech.glide.request.d) (g1)));
        }
    }

    private c b(j j1)
    {
        if (s == null)
        {
            s = com.bumptech.glide.i.c;
        }
        return a(j1, null);
    }

    e a(com.bumptech.glide.request.a.d d1)
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

    public j a(ImageView imageview)
    {
        com.bumptech.glide.g.h.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (z || imageview.getScaleType() == null) goto _L2; else goto _L1
_L1:
        static class _cls1
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

        com.bumptech.glide._cls1.a[imageview.getScaleType().ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 89
    //                   2 96
    //                   3 96
    //                   4 96;
           goto _L2 _L3 _L4 _L4 _L4
_L2:
        return a(c.a(imageview, d));
_L3:
        g();
        continue; /* Loop/switch isn't completed */
_L4:
        f();
        if (true) goto _L2; else goto _L5
_L5:
    }

    public j a(j j1)
    {
        com.bumptech.glide.g.h.a();
        if (j1 == null)
        {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!j)
        {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        c c1 = j1.a();
        if (c1 != null)
        {
            c1.d();
            e.b(c1);
            c1.a();
        }
        c1 = b(j1);
        j1.a(c1);
        f.a(j1);
        e.a(c1);
        return j1;
    }

    public e b(int i1, int j1)
    {
        if (!com.bumptech.glide.g.h.a(i1, j1))
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

    public e b(e e1)
    {
        if (equals(e1))
        {
            throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
        } else
        {
            o = e1;
            return this;
        }
    }

    public e b(i i1)
    {
        s = i1;
        return this;
    }

    public e b(com.bumptech.glide.load.b b1)
    {
        if (g != null)
        {
            g.a(b1);
        }
        return this;
    }

    public e b(com.bumptech.glide.load.c c1)
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

    public e b(com.bumptech.glide.load.e e1)
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

    public e b(com.bumptech.glide.request.e e1)
    {
        m = e1;
        return this;
    }

    public e b(Object obj)
    {
        h = obj;
        j = true;
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

    public transient e b(com.bumptech.glide.load.g ag[])
    {
        z = true;
        if (ag.length == 1)
        {
            y = ag[0];
            return this;
        } else
        {
            y = new com.bumptech.glide.load.d(ag);
            return this;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return h();
    }

    public e d(int i1)
    {
        l = i1;
        return this;
    }

    public e e(int i1)
    {
        C = i1;
        return this;
    }

    public e f(int i1)
    {
        k = i1;
        return this;
    }

    void f()
    {
    }

    void g()
    {
    }

    public e h()
    {
        com.bumptech.glide.e.a a1;
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

    public e i()
    {
        return a(com.bumptech.glide.request.a.e.a());
    }

    public e j()
    {
        return b(new com.bumptech.glide.load.g[] {
            com.bumptech.glide.load.resource.d.b()
        });
    }

    // Unreferenced inner class com/bumptech/glide/GenericRequestBuilder$1

/* anonymous class */
    class GenericRequestBuilder._cls1
        implements Runnable
    {

        final RequestFutureTarget a;
        final e b;

        public void run()
        {
            if (!a.isCancelled())
            {
                b.a(a);
            }
        }
    }

}
