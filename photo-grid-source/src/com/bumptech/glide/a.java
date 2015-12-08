// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.d;
import com.bumptech.glide.load.resource.bitmap.f;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.w;

// Referenced classes of package com.bumptech.glide:
//            e, h

public class a extends com.bumptech.glide.e
{

    private final e g;
    private f h;
    private com.bumptech.glide.load.a i;
    private com.bumptech.glide.load.e j;
    private com.bumptech.glide.load.e k;

    a(com.bumptech.glide.f.f f1, Class class1, com.bumptech.glide.e e1)
    {
        super(f1, class1, e1);
        h = f.a;
        g = e1.c.a();
        i = e1.c.g();
        j = new w(g, i);
        k = new k(g, i);
    }

    public final a a()
    {
        super.e();
        return this;
    }

    public final a a(a a1)
    {
        super.a(a1);
        return this;
    }

    public final a a(com.bumptech.glide.load.b.e e1)
    {
        super.b(e1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(int l)
    {
        super.a(l);
        return this;
    }

    public final volatile com.bumptech.glide.e a(int l, int i1)
    {
        super.a(l, i1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public final volatile com.bumptech.glide.e a(com.bumptech.glide.e e1)
    {
        super.a(e1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(b b1)
    {
        super.a(b1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(c c1)
    {
        super.a(c1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(com.bumptech.glide.load.e e1)
    {
        super.a(e1);
        return this;
    }

    public final volatile com.bumptech.glide.e a(Object obj)
    {
        super.a(obj);
        return this;
    }

    public final volatile com.bumptech.glide.e a(boolean flag)
    {
        super.a(flag);
        return this;
    }

    public final volatile com.bumptech.glide.e a(g ag[])
    {
        super.a(ag);
        return this;
    }

    public final com.bumptech.glide.g.b.k a(ImageView imageview)
    {
        return super.a(imageview);
    }

    public final volatile com.bumptech.glide.e b(com.bumptech.glide.load.b.e e1)
    {
        super.b(e1);
        return this;
    }

    final void b()
    {
        super.a(new d[] {
            c.d()
        });
    }

    final void c()
    {
        super.a(new d[] {
            c.c()
        });
    }

    public Object clone()
    {
        return (a)super.d();
    }

    public final volatile com.bumptech.glide.e d()
    {
        return (a)super.d();
    }

    public final volatile com.bumptech.glide.e e()
    {
        super.e();
        return this;
    }
}
