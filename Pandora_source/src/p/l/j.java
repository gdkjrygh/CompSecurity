// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import p.ai.d;
import p.ai.g;
import p.ai.h;
import p.ai.l;
import p.ai.m;

// Referenced classes of package p.l:
//            g, d, e, f

public class j
    implements h
{
    public static interface a
    {

        public abstract void a(e e1);
    }

    public final class b
    {

        final j a;
        private final p.x.j b;
        private final Class c;

        static p.x.j a(b b1)
        {
            return b1.b;
        }

        static Class b(b b1)
        {
            return b1.c;
        }

        public a a(Object obj)
        {
            return new a(this, obj);
        }

        b(p.x.j j2, Class class1)
        {
            a = j.this;
            super();
            b = j2;
            c = class1;
        }
    }

    public final class b.a
    {

        final b a;
        private final Object b;
        private final Class c;
        private final boolean d = true;

        public f a(Class class1)
        {
            class1 = (f)j.e(a.a).a(new f(j.a(a.a), j.b(a.a), c, b.a(a), b.b(a), class1, j.c(a.a), p.l.j.d(a.a), j.e(a.a)));
            if (d)
            {
                class1.b(b);
            }
            return class1;
        }

        b.a(b b1, Object obj)
        {
            a = b1;
            super();
            b = obj;
            c = j.a(obj);
        }
    }

    class c
    {

        final j a;

        public e a(e e1)
        {
            if (j.f(a) != null)
            {
                j.f(a).a(e1);
            }
            return e1;
        }

        c()
        {
            a = j.this;
            super();
        }
    }

    private static class d
        implements p.ai.c.a
    {

        private final m a;

        public void a(boolean flag)
        {
            if (flag)
            {
                a.d();
            }
        }

        public d(m m1)
        {
            a = m1;
        }
    }


    private final Context a;
    private final g b;
    private final l c;
    private final m d;
    private final p.l.g e;
    private final c f;
    private a g;

    public j(Context context, g g1, l l)
    {
        this(context, g1, l, new m(), new p.ai.d());
    }

    j(Context context, g g1, l l, m m1, p.ai.d d1)
    {
        a = context.getApplicationContext();
        b = g1;
        c = l;
        d = m1;
        e = p.l.g.a(context);
        f = new c();
        context = d1.a(context, new d(m1));
        if (p.ap.h.d())
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(g1) {

                final g a;
                final j b;

                public void run()
                {
                    a.a(b);
                }

            
            {
                b = j.this;
                a = g1;
                super();
            }
            });
        } else
        {
            g1.a(this);
        }
        g1.a(context);
    }

    static Context a(j j1)
    {
        return j1.a;
    }

    static Class a(Object obj)
    {
        return b(obj);
    }

    private p.l.d a(Class class1)
    {
        p.x.j j1 = p.l.g.a(class1, a);
        p.x.j j2 = p.l.g.b(class1, a);
        if (class1 != null && j1 == null && j2 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(class1).append(". You must provide a Model of a type for").append(" which there is a registered ModelLoader, if you are using a custom model, you must first call").append(" Glide#register with a ModelLoaderFactory for your custom model class").toString());
        } else
        {
            return (p.l.d)f.a(new p.l.d(class1, j1, j2, a, e, d, b, f));
        }
    }

    private static Class b(Object obj)
    {
        if (obj != null)
        {
            return obj.getClass();
        } else
        {
            return null;
        }
    }

    static p.l.g b(j j1)
    {
        return j1.e;
    }

    static m c(j j1)
    {
        return j1.d;
    }

    static g d(j j1)
    {
        return j1.b;
    }

    static c e(j j1)
    {
        return j1.f;
    }

    static a f(j j1)
    {
        return j1.g;
    }

    public p.l.d a(Uri uri)
    {
        return (p.l.d)h().a(uri);
    }

    public p.l.d a(String s)
    {
        return (p.l.d)g().a(s);
    }

    public b a(p.x.j j1, Class class1)
    {
        return new b(j1, class1);
    }

    public void a()
    {
        e.i();
    }

    public void a(int i)
    {
        e.a(i);
    }

    public void b()
    {
        p.ap.h.a();
        d.a();
    }

    public void c()
    {
        p.ap.h.a();
        d.b();
    }

    public void d()
    {
        c();
    }

    public void e()
    {
        b();
    }

    public void f()
    {
        d.c();
    }

    public p.l.d g()
    {
        return a(java/lang/String);
    }

    public p.l.d h()
    {
        return a(android/net/Uri);
    }
}
