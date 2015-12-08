// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.d.i;
import com.bumptech.glide.d.p;
import com.bumptech.glide.f.a;
import com.bumptech.glide.g.a.f;
import com.bumptech.glide.g.a.g;
import com.bumptech.glide.g.b.c;
import com.bumptech.glide.g.b.k;
import com.bumptech.glide.h.b;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.resource.d;

// Referenced classes of package com.bumptech.glide:
//            o, h, f

public class e
    implements Cloneable
{

    private boolean A;
    private Drawable B;
    private int C;
    protected final Class a;
    protected final Context b;
    protected final com.bumptech.glide.h c;
    protected final Class d;
    protected final p e;
    protected final i f;
    private a g;
    private Object h;
    private com.bumptech.glide.load.c i;
    private boolean j;
    private int k;
    private int l;
    private com.bumptech.glide.g.e m;
    private Float n;
    private e o;
    private Float p;
    private Drawable q;
    private Drawable r;
    private int s;
    private boolean t;
    private f u;
    private int v;
    private int w;
    private com.bumptech.glide.load.b.e x;
    private com.bumptech.glide.load.g y;
    private boolean z;

    e(Context context, Class class1, com.bumptech.glide.f.f f1, Class class2, com.bumptech.glide.h h1, p p1, i i1)
    {
        i = com.bumptech.glide.h.b.a();
        p = Float.valueOf(1.0F);
        s = 0;
        t = true;
        u = com.bumptech.glide.g.a.g.a();
        v = -1;
        w = -1;
        x = com.bumptech.glide.load.b.e.d;
        y = com.bumptech.glide.load.resource.d.b();
        b = context;
        a = class1;
        d = class2;
        c = h1;
        e = p1;
        f = i1;
        if (f1 != null)
        {
            class2 = new a(f1);
        } else
        {
            class2 = null;
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

    e(com.bumptech.glide.f.f f1, Class class1, e e1)
    {
        this(e1.b, e1.a, f1, class1, e1.c, e1.e, e1.f);
        h = e1.h;
        j = e1.j;
        i = e1.i;
        x = e1.x;
        t = e1.t;
    }

    private int a()
    {
        if (s == com.bumptech.glide.o.d)
        {
            return com.bumptech.glide.o.c;
        }
        if (s == com.bumptech.glide.o.c)
        {
            return com.bumptech.glide.o.b;
        } else
        {
            return com.bumptech.glide.o.a;
        }
    }

    private com.bumptech.glide.g.c a(k k1, float f1, int i1, com.bumptech.glide.g.d d1)
    {
        return com.bumptech.glide.g.a.a(g, h, i, b, i1, k1, f1, q, k, r, l, B, C, m, d1, c.(), y, d, t, u, w, v, x);
    }

    private com.bumptech.glide.g.c a(k k1, com.bumptech.glide.g.g g1)
    {
        if (o != null)
        {
            if (A)
            {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (o.u.equals(com.bumptech.glide.g.a.g.a()))
            {
                o.u = u;
            }
            if (o.s == 0)
            {
                o.s = a();
            }
            if (com.bumptech.glide.i.h.a(w, v) && !com.bumptech.glide.i.h.a(o.w, o.v))
            {
                o.a(w, v);
            }
            g1 = new com.bumptech.glide.g.g(g1);
            com.bumptech.glide.g.c c1 = a(k1, p.floatValue(), s, ((com.bumptech.glide.g.d) (g1)));
            A = true;
            k1 = o.a(k1, g1);
            A = false;
            g1.a(c1, k1);
            return g1;
        }
        if (n != null)
        {
            g1 = new com.bumptech.glide.g.g(g1);
            g1.a(a(k1, p.floatValue(), s, ((com.bumptech.glide.g.d) (g1))), a(k1, n.floatValue(), a(), ((com.bumptech.glide.g.d) (g1))));
            return g1;
        } else
        {
            return a(k1, p.floatValue(), s, ((com.bumptech.glide.g.d) (g1)));
        }
    }

    public e a(int i1)
    {
        k = i1;
        return this;
    }

    public e a(int i1, int j1)
    {
        if (!com.bumptech.glide.i.h.a(i1, j1))
        {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        } else
        {
            w = i1;
            v = j1;
            return this;
        }
    }

    public e a(Drawable drawable)
    {
        q = drawable;
        return this;
    }

    public e a(e e1)
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

    final e a(f f1)
    {
        if (f1 == null)
        {
            throw new NullPointerException("Animation factory must not be null!");
        } else
        {
            u = f1;
            return this;
        }
    }

    public e a(com.bumptech.glide.load.b b1)
    {
        if (g != null)
        {
            g.a(b1);
        }
        return this;
    }

    public e a(com.bumptech.glide.load.c c1)
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

    public e a(com.bumptech.glide.load.e e1)
    {
        if (g != null)
        {
            g.a(e1);
        }
        return this;
    }

    public e a(Object obj)
    {
        h = obj;
        j = true;
        return this;
    }

    public e a(boolean flag)
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

    public transient e a(com.bumptech.glide.load.g ag[])
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

    public k a(ImageView imageview)
    {
        com.bumptech.glide.i.h.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (z || imageview.getScaleType() == null) goto _L2; else goto _L1
_L1:
        a[imageview.getScaleType().ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 102
    //                   2 109
    //                   3 109
    //                   4 109;
           goto _L2 _L3 _L4 _L4 _L4
_L2:
        Class class1 = d;
        if (!com/bumptech/glide/load/resource/a/b.isAssignableFrom(class1)) goto _L6; else goto _L5
_L5:
        imageview = new com.bumptech.glide.g.b.d(imageview);
_L8:
        return a(((k) (imageview)));
_L3:
        c();
        continue; /* Loop/switch isn't completed */
_L4:
        b();
        continue; /* Loop/switch isn't completed */
_L6:
        if (android/graphics/Bitmap.equals(class1))
        {
            imageview = new com.bumptech.glide.g.b.b(imageview);
            continue; /* Loop/switch isn't completed */
        }
        if (!android/graphics/drawable/Drawable.isAssignableFrom(class1))
        {
            break; /* Loop/switch isn't completed */
        }
        imageview = new c(imageview);
        if (true) goto _L8; else goto _L7
_L7:
        throw new IllegalArgumentException((new StringBuilder("Unhandled class: ")).append(class1).append(", try .as*(Class).transcode(ResourceTranscoder)").toString());
        if (true) goto _L2; else goto _L9
_L9:
    }

    public final k a(k k1)
    {
        com.bumptech.glide.i.h.a();
        if (k1 == null)
        {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!j)
        {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        com.bumptech.glide.g.c c1 = k1.e();
        if (c1 != null)
        {
            c1.c();
            e.b(c1);
            c1.a();
        }
        if (s == 0)
        {
            s = com.bumptech.glide.o.c;
        }
        c1 = a(k1, ((com.bumptech.glide.g.g) (null)));
        k1.a(c1);
        f.a(k1);
        e.a(c1);
        return k1;
    }

    public e b(com.bumptech.glide.load.b.e e1)
    {
        x = e1;
        return this;
    }

    void b()
    {
    }

    void c()
    {
    }

    public Object clone()
    {
        return d();
    }

    public e d()
    {
        a a1;
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

    public e e()
    {
        return a(com.bumptech.glide.g.a.g.a());
    }
}
