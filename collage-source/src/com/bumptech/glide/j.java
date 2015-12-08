// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.k;
import com.bumptech.glide.manager.l;
import java.io.File;

// Referenced classes of package com.bumptech.glide:
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
        private final com.bumptech.glide.load.b.l b;
        private final Class c;

        static com.bumptech.glide.load.b.l a(b b1)
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

        b(com.bumptech.glide.load.b.l l1, Class class1)
        {
            a = j.this;
            super();
            b = l1;
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
            class1 = (f)j.e(a.a).a(new f(j.a(a.a), j.b(a.a), c, b.a(a), b.b(a), class1, j.c(a.a), com.bumptech.glide.j.d(a.a), j.e(a.a)));
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
        implements com.bumptech.glide.manager.c.a
    {

        private final l a;

        public void a(boolean flag)
        {
            if (flag)
            {
                a.d();
            }
        }

        public d(l l1)
        {
            a = l1;
        }
    }


    private final Context a;
    private final g b;
    private final k c;
    private final l d;
    private final com.bumptech.glide.g e;
    private final c f;
    private a g;

    public j(Context context, g g1, k k)
    {
        this(context, g1, k, new l(), new com.bumptech.glide.manager.d());
    }

    j(Context context, g g1, k k, l l1, com.bumptech.glide.manager.d d1)
    {
        a = context.getApplicationContext();
        b = g1;
        c = k;
        d = l1;
        e = com.bumptech.glide.g.a(context);
        f = new c();
        context = d1.a(context, new d(l1));
        if (com.bumptech.glide.g.h.d())
        {
            (new Handler(Looper.getMainLooper())).post(new RequestManager._cls1(g1));
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

    private com.bumptech.glide.d a(Class class1)
    {
        com.bumptech.glide.load.b.l l1 = com.bumptech.glide.g.a(class1, a);
        com.bumptech.glide.load.b.l l2 = com.bumptech.glide.g.b(class1, a);
        if (class1 != null && l1 == null && l2 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(class1).append(". You must provide a Model of a type for").append(" which there is a registered ModelLoader, if you are using a custom model, you must first call").append(" Glide#register with a ModelLoaderFactory for your custom model class").toString());
        } else
        {
            return (com.bumptech.glide.d)f.a(new com.bumptech.glide.d(class1, l1, l2, a, e, d, b, f));
        }
    }

    static Class a(Object obj)
    {
        return b(obj);
    }

    static com.bumptech.glide.g b(j j1)
    {
        return j1.e;
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

    static l c(j j1)
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

    public com.bumptech.glide.d a(Uri uri)
    {
        return (com.bumptech.glide.d)h().a(uri);
    }

    public com.bumptech.glide.d a(File file)
    {
        return (com.bumptech.glide.d)i().a(file);
    }

    public com.bumptech.glide.d a(String s)
    {
        return (com.bumptech.glide.d)g().a(s);
    }

    public b a(com.bumptech.glide.load.b.l l1, Class class1)
    {
        return new b(l1, class1);
    }

    public void a()
    {
        e.h();
    }

    public void a(int k)
    {
        e.a(k);
    }

    public void b()
    {
        com.bumptech.glide.g.h.a();
        d.a();
    }

    public void c()
    {
        com.bumptech.glide.g.h.a();
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

    public com.bumptech.glide.d g()
    {
        return a(java/lang/String);
    }

    public com.bumptech.glide.d h()
    {
        return a(android/net/Uri);
    }

    public com.bumptech.glide.d i()
    {
        return a(java/io/File);
    }

    // Unreferenced inner class com/bumptech/glide/RequestManager$1

/* anonymous class */
    class RequestManager._cls1
        implements Runnable
    {

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
    }

}
