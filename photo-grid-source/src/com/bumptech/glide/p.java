// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.d.e;
import com.bumptech.glide.d.i;
import com.bumptech.glide.d.j;
import com.bumptech.glide.d.o;
import com.bumptech.glide.h.a;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.c.b.g;
import com.bumptech.glide.load.c.s;

// Referenced classes of package com.bumptech.glide:
//            h, u, v, q, 
//            d, r, t

public final class p
    implements j
{

    private final Context a;
    private final i b;
    private final o c;
    private final com.bumptech.glide.d.p d;
    private final com.bumptech.glide.h e;
    private final u f;

    public p(Context context, i k, o o)
    {
        com.bumptech.glide.d.p p1 = new com.bumptech.glide.d.p();
        new e();
        this(context, k, o, p1);
    }

    private p(Context context, i k, o o, com.bumptech.glide.d.p p1)
    {
        a = context.getApplicationContext();
        b = k;
        c = o;
        d = p1;
        e = a(context);
        f = new u(this);
        context = com.bumptech.glide.d.e.a(context, new v(p1));
        if (h.c())
        {
            (new Handler(Looper.getMainLooper())).post(new q(this, k));
        } else
        {
            k.a(this);
        }
        k.a(context);
    }

    static Context a(p p1)
    {
        return p1.a;
    }

    private d a(Class class1)
    {
        s s = a(class1, a);
        s s1 = h.b(class1, a);
        if (s == null && s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(class1).append(". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class").toString());
        } else
        {
            return (d)new d(class1, s, s1, a, e, d, b, f);
        }
    }

    static Class a(Object obj)
    {
        if (obj != null)
        {
            return obj.getClass();
        } else
        {
            return null;
        }
    }

    static com.bumptech.glide.h b(p p1)
    {
        return p1.e;
    }

    static com.bumptech.glide.d.p c(p p1)
    {
        return p1.d;
    }

    static i d(p p1)
    {
        return p1.b;
    }

    static u e(p p1)
    {
        return p1.f;
    }

    public final d a(Integer integer)
    {
        return (d)((d)a(java/lang/Integer).b(com.bumptech.glide.h.a.a(a))).b(integer);
    }

    public final d a(String s)
    {
        return (d)a(java/lang/String).b(s);
    }

    public final r a(s s, Class class1)
    {
        return new r(this, s, class1);
    }

    public final t a(g g)
    {
        return new t(this, g);
    }

    public final void a()
    {
        e.h();
    }

    public final void a(int k)
    {
        e.(k);
    }

    public final void b()
    {
        h.a();
        d.b();
    }

    public final void c()
    {
        h.a();
        d.a();
    }

    public final void d_()
    {
        d.c();
    }
}
