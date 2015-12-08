// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.f.f;
import com.bumptech.glide.g.b.h;
import com.bumptech.glide.g.b.k;
import com.bumptech.glide.i.d;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.load.b.i;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.c.s;
import com.bumptech.glide.load.g;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.g:
//            c, f, b, d, 
//            e

public final class a
    implements h, com.bumptech.glide.g.c, com.bumptech.glide.g.f
{

    private static final Queue a = com.bumptech.glide.i.h.a(0);
    private x A;
    private i B;
    private long C;
    private int D;
    private final String b = String.valueOf(hashCode());
    private c c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private g i;
    private f j;
    private com.bumptech.glide.g.d k;
    private Object l;
    private Class m;
    private boolean n;
    private int o;
    private k p;
    private com.bumptech.glide.g.e q;
    private float r;
    private com.bumptech.glide.load.b.f s;
    private com.bumptech.glide.g.a.f t;
    private int u;
    private int v;
    private e w;
    private Drawable x;
    private Drawable y;
    private boolean z;

    private a()
    {
    }

    public static a a(f f1, Object obj, c c1, Context context, int i1, k k1, float f2, Drawable drawable, 
            int j1, Drawable drawable1, int l1, Drawable drawable2, int i2, com.bumptech.glide.g.e e1, com.bumptech.glide.g.d d1, 
            com.bumptech.glide.load.b.f f3, g g1, Class class1, boolean flag, com.bumptech.glide.g.a.f f4, int j2, int k2, 
            e e2)
    {
        a a2 = (a)a.poll();
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
        }
        a1.j = f1;
        a1.l = obj;
        a1.c = c1;
        a1.d = drawable2;
        a1.e = i2;
        a1.h = context.getApplicationContext();
        a1.o = i1;
        a1.p = k1;
        a1.r = f2;
        a1.x = drawable;
        a1.f = j1;
        a1.y = drawable1;
        a1.g = l1;
        a1.q = e1;
        a1.k = d1;
        a1.s = f3;
        a1.i = g1;
        a1.m = class1;
        a1.n = flag;
        a1.t = f4;
        a1.u = j2;
        a1.v = k2;
        a1.w = e2;
        a1.D = b.a;
        if (obj != null)
        {
            a("ModelLoader", f1.e(), "try .using(ModelLoader)");
            a("Transcoder", f1.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            a("Transformation", g1, "try .transform(UnitTransformation.get())");
            if (e2.a())
            {
                a("SourceEncoder", f1.c(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else
            {
                a("SourceDecoder", f1.b(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (e2.a() || e2.b())
            {
                a("CacheDecoder", f1.a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (e2.b())
            {
                a("Encoder", f1.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
        return a1;
    }

    private void a(String s1)
    {
        (new StringBuilder()).append(s1).append(" this: ").append(b);
    }

    private static void a(String s1, Object obj, String s2)
    {
        if (obj == null)
        {
            s1 = new StringBuilder(s1);
            s1.append(" must not be null");
            s1.append(", ");
            s1.append(s2);
            throw new NullPointerException(s1.toString());
        } else
        {
            return;
        }
    }

    private void b(x x1)
    {
        com.bumptech.glide.load.b.f.a(x1);
        A = null;
    }

    private Drawable i()
    {
        if (x == null && f > 0)
        {
            x = h.getResources().getDrawable(f);
        }
        return x;
    }

    private boolean j()
    {
        return k == null || k.b(this);
    }

    private boolean k()
    {
        return k == null || !k.i();
    }

    public final void a()
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

    public final void a(int i1, int j1)
    {
        if (Log.isLoggable("GenericRequest", 2))
        {
            a((new StringBuilder("Got onSizeReady in ")).append(com.bumptech.glide.i.d.a(C)).toString());
        }
        if (D == com.bumptech.glide.g.b.c)
        {
            D = b.b;
            i1 = Math.round(r * (float)i1);
            j1 = Math.round(r * (float)j1);
            com.bumptech.glide.load.a.c c1 = j.e().a(l, i1, j1);
            if (c1 == null)
            {
                a(new Exception((new StringBuilder("Failed to load model: '")).append(l).append("'").toString()));
                return;
            }
            com.bumptech.glide.load.resource.e.c c2 = j.f();
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder("finished setup for calling load in ")).append(com.bumptech.glide.i.d.a(C)).toString());
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
                a((new StringBuilder("finished onSizeReady in ")).append(com.bumptech.glide.i.d.a(C)).toString());
                return;
            }
        }
    }

    public final void a(x x1)
    {
        if (x1 == null)
        {
            a(new Exception((new StringBuilder("Expected to receive a Resource<R> with an object of ")).append(m).append(" inside, but instead got null.").toString()));
        } else
        {
            Object obj1 = x1.b();
            if (obj1 == null || !m.isAssignableFrom(obj1.getClass()))
            {
                b(x1);
                StringBuilder stringbuilder = (new StringBuilder("Expected to receive an object of ")).append(m).append(" but instead got ");
                Object obj;
                if (obj1 != null)
                {
                    obj = obj1.getClass();
                } else
                {
                    obj = "";
                }
                obj = stringbuilder.append(obj).append("{").append(obj1).append("} inside Resource{").append(x1).append("}.");
                if (obj1 != null)
                {
                    x1 = "";
                } else
                {
                    x1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                }
                a(new Exception(((StringBuilder) (obj)).append(x1).toString()));
                return;
            }
            boolean flag;
            if (k == null || k.a(this))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                b(x1);
                D = com.bumptech.glide.g.b.d;
                return;
            }
            boolean flag1 = k();
            D = com.bumptech.glide.g.b.d;
            A = x1;
            if (q == null || !q.b())
            {
                com.bumptech.glide.g.a.d d1 = t.a(z, flag1);
                p.a(obj1, d1);
            }
            if (k != null)
            {
                k.c(this);
            }
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder("Resource ready in ")).append(com.bumptech.glide.i.d.a(C)).append(" size: ").append((double)x1.c() * 9.5367431640625E-07D).append(" fromCache: ").append(z).toString());
                return;
            }
        }
    }

    public final void a(Exception exception)
    {
label0:
        {
            Log.isLoggable("GenericRequest", 3);
            D = com.bumptech.glide.g.b.e;
            if (q != null)
            {
                com.bumptech.glide.g.e e1 = q;
                k();
                if (e1.a())
                {
                    break label0;
                }
            }
            if (j())
            {
                Drawable drawable;
                Drawable drawable1;
                if (l == null)
                {
                    if (d == null && e > 0)
                    {
                        d = h.getResources().getDrawable(e);
                    }
                    drawable1 = d;
                } else
                {
                    drawable1 = null;
                }
                drawable = drawable1;
                if (drawable1 == null)
                {
                    if (y == null && g > 0)
                    {
                        y = h.getResources().getDrawable(g);
                    }
                    drawable = y;
                }
                drawable1 = drawable;
                if (drawable == null)
                {
                    drawable1 = i();
                }
                p.a(exception, drawable1);
            }
        }
    }

    public final void b()
    {
        C = com.bumptech.glide.i.d.a();
        if (l == null)
        {
            a(((Exception) (null)));
        } else
        {
            D = com.bumptech.glide.g.b.c;
            if (com.bumptech.glide.i.h.a(u, v))
            {
                a(u, v);
            } else
            {
                p.a(this);
            }
            if (!f())
            {
                boolean flag;
                if (D == com.bumptech.glide.g.b.e)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag && j())
                {
                    p.c(i());
                }
            }
            if (Log.isLoggable("GenericRequest", 2))
            {
                a((new StringBuilder("finished run method in ")).append(com.bumptech.glide.i.d.a(C)).toString());
                return;
            }
        }
    }

    public final void c()
    {
        com.bumptech.glide.i.h.a();
        if (D == com.bumptech.glide.g.b.g)
        {
            return;
        }
        D = com.bumptech.glide.g.b.f;
        if (B != null)
        {
            B.a();
            B = null;
        }
        if (A != null)
        {
            b(A);
        }
        if (j())
        {
            p.b(i());
        }
        D = com.bumptech.glide.g.b.g;
    }

    public final void d()
    {
        c();
        D = h;
    }

    public final boolean e()
    {
        return D == b.b || D == com.bumptech.glide.g.b.c;
    }

    public final boolean f()
    {
        return D == com.bumptech.glide.g.b.d;
    }

    public final boolean g()
    {
        return f();
    }

    public final boolean h()
    {
        return D == com.bumptech.glide.g.b.f || D == com.bumptech.glide.g.b.g;
    }

}
