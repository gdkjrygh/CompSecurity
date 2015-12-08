// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.al;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Queue;
import p.ak.f;
import p.am.d;
import p.an.i;
import p.an.k;
import p.ap.h;
import p.q.g;
import p.s.c;
import p.x.j;

// Referenced classes of package p.al:
//            c, g, f, d

public final class b
    implements p.al.c, p.al.g, i
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
            return (a)Enum.valueOf(p/al/b$a, s1);
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


    private static final Queue a = p.ap.h.a(0);
    private p.s.k A;
    private p.s.c.c B;
    private long C;
    private a D;
    private final String b = String.valueOf(hashCode());
    private p.q.c c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private g i;
    private f j;
    private p.al.d k;
    private Object l;
    private Class m;
    private boolean n;
    private p.l.i o;
    private k p;
    private p.al.f q;
    private float r;
    private c s;
    private d t;
    private int u;
    private int v;
    private p.s.b w;
    private Drawable x;
    private Drawable y;
    private boolean z;

    private b()
    {
    }

    public static b a(f f1, Object obj, p.q.c c1, Context context, p.l.i i1, k k1, float f2, Drawable drawable, 
            int j1, Drawable drawable1, int l1, Drawable drawable2, int i2, p.al.f f3, p.al.d d1, 
            c c2, g g1, Class class1, boolean flag, d d2, int j2, int k2, 
            p.s.b b1)
    {
        b b3 = (b)a.poll();
        b b2 = b3;
        if (b3 == null)
        {
            b2 = new b();
        }
        b2.b(f1, obj, c1, context, i1, k1, f2, drawable, j1, drawable1, l1, drawable2, i2, f3, d1, c2, g1, class1, flag, d2, j2, k2, b1);
        return b2;
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

    private void a(p.s.k k1, Object obj)
    {
        boolean flag = p();
        D = p.al.a.d;
        A = k1;
        if (q == null || !q.a(obj, l, p, z, flag))
        {
            p.am.c c1 = t.a(z, flag);
            p.a(obj, c1);
        }
        q();
        if (Log.isLoggable("GenericRequest", 2))
        {
            a((new StringBuilder()).append("Resource ready in ").append(p.ap.d.a(C)).append(" size: ").append((double)k1.c() * 9.5367431640625E-07D).append(" fromCache: ").append(z).toString());
        }
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

    private void b(f f1, Object obj, p.q.c c1, Context context, p.l.i i1, k k1, float f2, 
            Drawable drawable, int j1, Drawable drawable1, int l1, Drawable drawable2, int i2, p.al.f f3, 
            p.al.d d1, c c2, g g1, Class class1, boolean flag, d d2, int j2, 
            int k2, p.s.b b1)
    {
        j = f1;
        l = obj;
        c = c1;
        d = drawable2;
        e = i2;
        h = context.getApplicationContext();
        o = i1;
        p = k1;
        r = f2;
        x = drawable;
        f = j1;
        y = drawable1;
        g = l1;
        q = f3;
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

    private void b(p.s.k k1)
    {
        s.a(k1);
        A = null;
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
            a((new StringBuilder()).append("Got onSizeReady in ").append(p.ap.d.a(C)).toString());
        }
        if (D == p.al.a.c)
        {
            D = a.b;
            i1 = Math.round(r * (float)i1);
            j1 = Math.round(r * (float)j1);
            p.r.c c1 = j.e().a(l, i1, j1);
            if (c1 == null)
            {
                a(new Exception((new StringBuilder()).append("Failed to load model: '").append(l).append("'").toString()));
                return;
            }
            p.ah.d d1 = j.f();
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder()).append("finished setup for calling load in ").append(p.ap.d.a(C)).toString());
            }
            z = true;
            B = s.a(c, i1, j1, c1, j, i, d1, o, n, w, this);
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
                a((new StringBuilder()).append("finished onSizeReady in ").append(p.ap.d.a(C)).toString());
                return;
            }
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

    public void a(p.s.k k1)
    {
        if (k1 == null)
        {
            a(new Exception((new StringBuilder()).append("Expected to receive a Resource<R> with an object of ").append(m).append(" inside, but instead got null.").toString()));
            return;
        }
        Object obj1 = k1.b();
        if (obj1 == null || !m.isAssignableFrom(obj1.getClass()))
        {
            b(k1);
            StringBuilder stringbuilder = (new StringBuilder()).append("Expected to receive an object of ").append(m).append(" but instead got ");
            Object obj;
            if (obj1 != null)
            {
                obj = obj1.getClass();
            } else
            {
                obj = "";
            }
            obj = stringbuilder.append(obj).append("{").append(obj1).append("}").append(" inside Resource{").append(k1).append("}.");
            if (obj1 != null)
            {
                k1 = "";
            } else
            {
                k1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            a(new Exception(((StringBuilder) (obj)).append(k1).toString()));
            return;
        }
        if (!n())
        {
            b(k1);
            D = p.al.a.d;
            return;
        } else
        {
            a(k1, obj1);
            return;
        }
    }

    public void b()
    {
        C = p.ap.d.a();
        if (l == null)
        {
            a(((Exception) (null)));
        } else
        {
            D = p.al.a.c;
            if (p.ap.h.a(u, v))
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
                a((new StringBuilder()).append("finished run method in ").append(p.ap.d.a(C)).toString());
                return;
            }
        }
    }

    void c()
    {
        D = p.al.a.f;
        if (B != null)
        {
            B.a();
            B = null;
        }
    }

    public void d()
    {
        p.ap.h.a();
        if (D == p.al.a.g)
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
        D = p.al.a.g;
    }

    public void e()
    {
        d();
        D = p.al.a.h;
    }

    public boolean f()
    {
        return D == a.b || D == p.al.a.c;
    }

    public boolean g()
    {
        return D == p.al.a.d;
    }

    public boolean h()
    {
        return g();
    }

    public boolean i()
    {
        return D == p.al.a.f || D == p.al.a.g;
    }

    public boolean j()
    {
        return D == a.e;
    }

}
