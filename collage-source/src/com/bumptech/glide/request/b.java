// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e.f;
import com.bumptech.glide.i;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.g;
import com.bumptech.glide.request.a.d;
import com.bumptech.glide.request.b.h;
import com.bumptech.glide.request.b.j;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.request:
//            c, f, e, d

public final class b
    implements h, com.bumptech.glide.request.c, com.bumptech.glide.request.f
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        private static final a i[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/bumptech/glide/request/b$a, s1);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("PENDING", 0);
            b = new a("RUNNING", 1);
            c = new a("WAITING_FOR_SIZE", 2);
            d = new a("COMPLETE", 3);
            e = new a("FAILED", 4);
            f = new a("CANCELLED", 5);
            g = new a("CLEARED", 6);
            h = new a("PAUSED", 7);
            i = (new a[] {
                a, b, c, d, e, f, g, h
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final Queue a = com.bumptech.glide.g.h.a(0);
    private com.bumptech.glide.load.engine.j A;
    private com.bumptech.glide.load.engine.c.c B;
    private long C;
    private a D;
    private final String b = String.valueOf(hashCode());
    private com.bumptech.glide.load.c c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private g i;
    private f j;
    private com.bumptech.glide.request.d k;
    private Object l;
    private Class m;
    private boolean n;
    private i o;
    private j p;
    private e q;
    private float r;
    private c s;
    private d t;
    private int u;
    private int v;
    private com.bumptech.glide.load.engine.b w;
    private Drawable x;
    private Drawable y;
    private boolean z;

    private b()
    {
    }

    public static b a(f f1, Object obj, com.bumptech.glide.load.c c1, Context context, i i1, j j1, float f2, Drawable drawable, 
            int k1, Drawable drawable1, int l1, Drawable drawable2, int i2, e e1, com.bumptech.glide.request.d d1, 
            c c2, g g1, Class class1, boolean flag, d d2, int j2, int k2, 
            com.bumptech.glide.load.engine.b b1)
    {
        b b3 = (b)a.poll();
        b b2 = b3;
        if (b3 == null)
        {
            b2 = new b();
        }
        b2.b(f1, obj, c1, context, i1, j1, f2, drawable, k1, drawable1, l1, drawable2, i2, e1, d1, c2, g1, class1, flag, d2, j2, k2, b1);
        return b2;
    }

    private void a(com.bumptech.glide.load.engine.j j1, Object obj)
    {
        boolean flag = p();
        D = com.bumptech.glide.request.a.d;
        A = j1;
        if (q == null || !q.a(obj, l, p, z, flag))
        {
            com.bumptech.glide.request.a.c c1 = t.a(z, flag);
            p.a(obj, c1);
        }
        q();
        if (Log.isLoggable("GenericRequest", 2))
        {
            a((new StringBuilder()).append("Resource ready in ").append(com.bumptech.glide.g.d.a(C)).append(" size: ").append((double)j1.c() * 9.5367431640625E-07D).append(" fromCache: ").append(z).toString());
        }
    }

    private void a(String s1)
    {
        Log.v("GenericRequest", (new StringBuilder()).append(s1).append(" this: ").append(b).toString());
    }

    private static void a(String s1, Object obj, String s2)
    {
        if (obj == null)
        {
            s1 = new StringBuilder(s1);
            s1.append(" must not be null");
            if (s2 != null)
            {
                s1.append(", ");
                s1.append(s2);
            }
            throw new NullPointerException(s1.toString());
        } else
        {
            return;
        }
    }

    private void b(f f1, Object obj, com.bumptech.glide.load.c c1, Context context, i i1, j j1, float f2, 
            Drawable drawable, int k1, Drawable drawable1, int l1, Drawable drawable2, int i2, e e1, 
            com.bumptech.glide.request.d d1, c c2, g g1, Class class1, boolean flag, d d2, int j2, 
            int k2, com.bumptech.glide.load.engine.b b1)
    {
        j = f1;
        l = obj;
        c = c1;
        d = drawable2;
        e = i2;
        h = context.getApplicationContext();
        o = i1;
        p = j1;
        r = f2;
        x = drawable;
        f = k1;
        y = drawable1;
        g = l1;
        q = e1;
        k = d1;
        s = c2;
        i = g1;
        m = class1;
        n = flag;
        t = d2;
        u = j2;
        v = k2;
        w = b1;
        D = a.a;
        if (obj != null)
        {
            a("ModelLoader", f1.e(), "try .using(ModelLoader)");
            a("Transcoder", f1.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            a("Transformation", g1, "try .transform(UnitTransformation.get())");
            if (b1.a())
            {
                a("SourceEncoder", f1.c(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else
            {
                a("SourceDecoder", f1.b(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (b1.a() || b1.b())
            {
                a("CacheDecoder", f1.a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (b1.b())
            {
                a("Encoder", f1.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    private void b(com.bumptech.glide.load.engine.j j1)
    {
        s.a(j1);
        A = null;
    }

    private void b(Exception exception)
    {
        if (!o())
        {
            return;
        }
        Drawable drawable;
        Drawable drawable1;
        if (l == null)
        {
            drawable1 = k();
        } else
        {
            drawable1 = null;
        }
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = l();
        }
        drawable1 = drawable;
        if (drawable == null)
        {
            drawable1 = m();
        }
        p.a(exception, drawable1);
    }

    private Drawable k()
    {
        if (d == null && e > 0)
        {
            d = h.getResources().getDrawable(e);
        }
        return d;
    }

    private Drawable l()
    {
        if (y == null && g > 0)
        {
            y = h.getResources().getDrawable(g);
        }
        return y;
    }

    private Drawable m()
    {
        if (x == null && f > 0)
        {
            x = h.getResources().getDrawable(f);
        }
        return x;
    }

    private boolean n()
    {
        return k == null || k.a(this);
    }

    private boolean o()
    {
        return k == null || k.b(this);
    }

    private boolean p()
    {
        return k == null || !k.c();
    }

    private void q()
    {
        if (k != null)
        {
            k.c(this);
        }
    }

    public void a()
    {
        j = null;
        l = null;
        h = null;
        p = null;
        x = null;
        y = null;
        d = null;
        q = null;
        k = null;
        i = null;
        t = null;
        z = false;
        B = null;
        a.offer(this);
    }

    public void a(int i1, int j1)
    {
        if (Log.isLoggable("GenericRequest", 2))
        {
            a((new StringBuilder()).append("Got onSizeReady in ").append(com.bumptech.glide.g.d.a(C)).toString());
        }
        if (D == com.bumptech.glide.request.a.c)
        {
            D = a.b;
            i1 = Math.round(r * (float)i1);
            j1 = Math.round(r * (float)j1);
            com.bumptech.glide.load.a.c c1 = j.e().a(l, i1, j1);
            if (c1 == null)
            {
                a(new Exception((new StringBuilder()).append("Failed to load model: '").append(l).append("'").toString()));
                return;
            }
            com.bumptech.glide.load.resource.e.c c2 = j.f();
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder()).append("finished setup for calling load in ").append(com.bumptech.glide.g.d.a(C)).toString());
            }
            z = true;
            B = s.a(c, i1, j1, c1, j, i, c2, o, n, w, this);
            boolean flag;
            if (A != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z = flag;
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder()).append("finished onSizeReady in ").append(com.bumptech.glide.g.d.a(C)).toString());
                return;
            }
        }
    }

    public void a(com.bumptech.glide.load.engine.j j1)
    {
        if (j1 == null)
        {
            a(new Exception((new StringBuilder()).append("Expected to receive a Resource<R> with an object of ").append(m).append(" inside, but instead got null.").toString()));
            return;
        }
        Object obj1 = j1.b();
        if (obj1 == null || !m.isAssignableFrom(obj1.getClass()))
        {
            b(j1);
            StringBuilder stringbuilder = (new StringBuilder()).append("Expected to receive an object of ").append(m).append(" but instead got ");
            Object obj;
            if (obj1 != null)
            {
                obj = obj1.getClass();
            } else
            {
                obj = "";
            }
            obj = stringbuilder.append(obj).append("{").append(obj1).append("}").append(" inside Resource{").append(j1).append("}.");
            if (obj1 != null)
            {
                j1 = "";
            } else
            {
                j1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            a(new Exception(((StringBuilder) (obj)).append(j1).toString()));
            return;
        }
        if (!n())
        {
            b(j1);
            D = com.bumptech.glide.request.a.d;
            return;
        } else
        {
            a(j1, obj1);
            return;
        }
    }

    public void a(Exception exception)
    {
        if (Log.isLoggable("GenericRequest", 3))
        {
            Log.d("GenericRequest", "load failed", exception);
        }
        D = a.e;
        if (q == null || !q.a(exception, l, p, p()))
        {
            b(exception);
        }
    }

    public void b()
    {
        C = com.bumptech.glide.g.d.a();
        if (l == null)
        {
            a(((Exception) (null)));
        } else
        {
            D = com.bumptech.glide.request.a.c;
            if (com.bumptech.glide.g.h.a(u, v))
            {
                a(u, v);
            } else
            {
                p.a(this);
            }
            if (!g() && !j() && o())
            {
                p.b(m());
            }
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder()).append("finished run method in ").append(com.bumptech.glide.g.d.a(C)).toString());
                return;
            }
        }
    }

    void c()
    {
        D = com.bumptech.glide.request.a.f;
        if (B != null)
        {
            B.a();
            B = null;
        }
    }

    public void d()
    {
        com.bumptech.glide.g.h.a();
        if (D == com.bumptech.glide.request.a.g)
        {
            return;
        }
        c();
        if (A != null)
        {
            b(A);
        }
        if (o())
        {
            p.a(m());
        }
        D = com.bumptech.glide.request.a.g;
    }

    public void e()
    {
        d();
        D = com.bumptech.glide.request.a.h;
    }

    public boolean f()
    {
        return D == a.b || D == com.bumptech.glide.request.a.c;
    }

    public boolean g()
    {
        return D == com.bumptech.glide.request.a.d;
    }

    public boolean h()
    {
        return g();
    }

    public boolean i()
    {
        return D == com.bumptech.glide.request.a.f || D == com.bumptech.glide.request.a.g;
    }

    public boolean j()
    {
        return D == a.e;
    }

}
