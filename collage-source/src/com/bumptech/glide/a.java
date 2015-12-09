// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.d;
import com.bumptech.glide.load.resource.bitmap.f;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.request.b.j;

// Referenced classes of package com.bumptech.glide:
//            e, g, i

public class a extends com.bumptech.glide.e
{

    private final c g;
    private f h;
    private com.bumptech.glide.load.a i;
    private e j;
    private e k;

    a(com.bumptech.glide.e.f f1, Class class1, com.bumptech.glide.e e1)
    {
        super(f1, class1, e1);
        h = f.a;
        g = e1.c.a();
        i = e1.c.g();
        j = new p(g, i);
        k = new h(g, i);
    }

    public a a()
    {
        return a(new d[] {
            c.c()
        });
    }

    public a a(int l)
    {
        super.f(l);
        return this;
    }

    public a a(int l, int i1)
    {
        super.b(l, i1);
        return this;
    }

    public a a(Drawable drawable)
    {
        super.b(drawable);
        return this;
    }

    public a a(a a1)
    {
        super.b(a1);
        return this;
    }

    public a a(com.bumptech.glide.e e1)
    {
        super.b(e1);
        return this;
    }

    public a a(i l)
    {
        super.b(l);
        return this;
    }

    public a a(b b1)
    {
        super.b(b1);
        return this;
    }

    public a a(com.bumptech.glide.load.c c1)
    {
        super.b(c1);
        return this;
    }

    public a a(e e1)
    {
        super.b(e1);
        return this;
    }

    public a a(com.bumptech.glide.load.engine.b b1)
    {
        super.b(b1);
        return this;
    }

    public a a(com.bumptech.glide.request.e e1)
    {
        super.b(e1);
        return this;
    }

    public a a(Object obj)
    {
        super.b(obj);
        return this;
    }

    public a a(boolean flag)
    {
        super.b(flag);
        return this;
    }

    public transient a a(g ag[])
    {
        super.b(ag);
        return this;
    }

    public transient a a(d ad[])
    {
        super.b(ad);
        return this;
    }

    public j a(ImageView imageview)
    {
        return super.a(imageview);
    }

    public a b()
    {
        return a(new d[] {
            c.d()
        });
    }

    public a b(int l)
    {
        super.e(l);
        return this;
    }

    public com.bumptech.glide.e b(int l, int i1)
    {
        return a(l, i1);
    }

    public com.bumptech.glide.e b(Drawable drawable)
    {
        return a(drawable);
    }

    public com.bumptech.glide.e b(com.bumptech.glide.e e1)
    {
        return a(e1);
    }

    public com.bumptech.glide.e b(i l)
    {
        return a(l);
    }

    public com.bumptech.glide.e b(b b1)
    {
        return a(b1);
    }

    public com.bumptech.glide.e b(com.bumptech.glide.load.c c1)
    {
        return a(c1);
    }

    public com.bumptech.glide.e b(e e1)
    {
        return a(e1);
    }

    public com.bumptech.glide.e b(com.bumptech.glide.load.engine.b b1)
    {
        return a(b1);
    }

    public com.bumptech.glide.e b(com.bumptech.glide.request.e e1)
    {
        return a(e1);
    }

    public com.bumptech.glide.e b(Object obj)
    {
        return a(obj);
    }

    public com.bumptech.glide.e b(boolean flag)
    {
        return a(flag);
    }

    public com.bumptech.glide.e b(g ag[])
    {
        return a(ag);
    }

    public a c()
    {
        super.i();
        return this;
    }

    public a c(int l)
    {
        super.d(l);
        return this;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return e();
    }

    public a d()
    {
        super.j();
        return this;
    }

    public com.bumptech.glide.e d(int l)
    {
        return c(l);
    }

    public a e()
    {
        return (a)super.h();
    }

    public com.bumptech.glide.e e(int l)
    {
        return b(l);
    }

    public com.bumptech.glide.e f(int l)
    {
        return a(l);
    }

    void f()
    {
        b();
    }

    void g()
    {
        a();
    }

    public com.bumptech.glide.e h()
    {
        return e();
    }

    public com.bumptech.glide.e i()
    {
        return c();
    }

    public com.bumptech.glide.e j()
    {
        return d();
    }
}
