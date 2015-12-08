// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            n, h, b, f, 
//            a

static class k extends n
    implements k, k
{
    protected final class a extends c.d
    {

        final n.a a;
        private final Object b;

        public void a(int i1)
        {
            android.support.v7.media.h.d.a(b, i1);
        }

        public void b(int i1)
        {
            android.support.v7.media.h.d.b(b, i1);
        }

        public a(Object obj)
        {
            a = n.a.this;
            super();
            b = obj;
        }
    }

    protected static final class b
    {

        public final Object a;
        public final String b;
        public android.support.v7.media.a c;

        public b(Object obj, String s)
        {
            a = obj;
            b = s;
        }
    }

    protected static final class c
    {

        public final g.f a;
        public final Object b;

        public c(g.f f1, Object obj)
        {
            a = f1;
            b = obj;
        }
    }


    private static final ArrayList j;
    private static final ArrayList k;
    protected final Object a;
    protected final Object b = h();
    protected final Object c = i();
    protected final Object d;
    protected int e;
    protected boolean f;
    protected boolean g;
    protected final ArrayList h = new ArrayList();
    protected final ArrayList i = new ArrayList();
    private final i l;
    private i m;
    private i n;

    private boolean e(Object obj)
    {
        if (g(obj) == null && f(obj) < 0)
        {
            obj = new b(obj, j(obj));
            a(((b) (obj)));
            h.add(obj);
            return true;
        } else
        {
            return false;
        }
    }

    private String j(Object obj)
    {
        boolean flag;
        if (j() == obj)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = "DEFAULT_ROUTE";
        } else
        {
            obj = String.format(Locale.US, "ROUTE_%08x", new Object[] {
                Integer.valueOf(h(obj).hashCode())
            });
        }
        if (b(((String) (obj))) < 0)
        {
            return ((String) (obj));
        }
        int i1 = 2;
        do
        {
            String s = String.format(Locale.US, "%s_%d", new Object[] {
                obj, Integer.valueOf(i1)
            });
            if (b(s) < 0)
            {
                return s;
            }
            i1++;
        } while (true);
    }

    private void k()
    {
        boolean flag = false;
        for (Iterator iterator = android.support.v7.media.h.a(a).iterator(); iterator.hasNext();)
        {
            flag |= e(iterator.next());
        }

        if (flag)
        {
            f();
        }
    }

    public f a(String s)
    {
        int i1 = b(s);
        if (i1 >= 0)
        {
            return new a(((b)h.get(i1)).a);
        } else
        {
            return null;
        }
    }

    public void a(int i1, Object obj)
    {
        if (obj == android.support.v7.media.h.a(a, 0x800003))
        {
            c c1 = g(obj);
            if (c1 != null)
            {
                c1.a.n();
                return;
            }
            i1 = f(obj);
            if (i1 >= 0)
            {
                obj = (b)h.get(i1);
                obj = l.a(((b) (obj)).b);
                if (obj != null)
                {
                    ((b.b) (obj)).n();
                    return;
                }
            }
        }
    }

    public void a(n n1)
    {
        if (n1.p() != this)
        {
            Object obj = android.support.v7.media.h.b(a, d);
            n1 = new c(n1, obj);
            a(obj, n1);
            a(obj, c);
            a(((c) (n1)));
            i.add(n1);
            android.support.v7.media.h.c(a, obj);
        } else
        {
            int i1 = f(android.support.v7.media.h.a(a, 0x800003));
            if (i1 >= 0 && ((b)h.get(i1)).b.equals(n1.o()))
            {
                n1.n();
                return;
            }
        }
    }

    protected void a(b b1)
    {
        b b2 = new <init>(b1.b, h(b1.a));
        a(b1, b2);
        b1.c = b2.a();
    }

    protected void a(b b1, b b2)
    {
        int i1 = a(b1.a);
        if ((i1 & 1) != 0)
        {
            b2.a(j);
        }
        if ((i1 & 2) != 0)
        {
            b2.a(k);
        }
        b2.a(b(b1.a));
        b2.b(c(b1.a));
        b2.c(d(b1.a));
        b2.d(e(b1.a));
        b2.e(f(b1.a));
    }

    protected void a(c c1)
    {
        a(c1.b, c1.a.b());
        a(c1.b, c1.a.h());
        b(c1.b, c1.a.i());
        c(c1.b, c1.a.k());
        d(c1.b, c1.a.l());
        e(c1.b, c1.a.j());
    }

    public void a(Object obj)
    {
        if (e(obj))
        {
            f();
        }
    }

    public void a(Object obj, int i1)
    {
        obj = g(obj);
        if (obj != null)
        {
            ((c) (obj)).a.a(i1);
        }
    }

    public void a(Object obj, Object obj1)
    {
    }

    public void a(Object obj, Object obj1, int i1)
    {
    }

    protected int b(String s)
    {
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((b)h.get(i1)).b.equals(s))
            {
                return i1;
            }
        }

        return -1;
    }

    public void b(int i1, Object obj)
    {
    }

    public void b(android.support.v7.media.b b1)
    {
        boolean flag = false;
        int i1;
        if (b1 != null)
        {
            List list = b1.a().a();
            int k1 = list.size();
            int j1 = 0;
            i1 = 0;
            while (j1 < k1) 
            {
                String s = (String)list.get(j1);
                if (s.equals("android.media.intent.category.LIVE_AUDIO"))
                {
                    i1 |= 1;
                } else
                if (s.equals("android.media.intent.category.LIVE_VIDEO"))
                {
                    i1 |= 2;
                } else
                {
                    i1 = 0x800000 | i1;
                }
                j1++;
            }
            flag = b1.b();
        } else
        {
            i1 = 0;
        }
        if (e != i1 || f != flag)
        {
            e = i1;
            f = flag;
            g();
            k();
        }
    }

    public void b(k k1)
    {
        if (k1.p() != this)
        {
            int i1 = e(k1);
            if (i1 >= 0)
            {
                k1 = (c)i.remove(i1);
                a(((c) (k1)).b, null);
                a(((c) (k1)).b, null);
                android.support.v7.media.h.d(a, ((c) (k1)).b);
            }
        }
    }

    public void b(Object obj)
    {
        if (g(obj) == null)
        {
            int i1 = f(obj);
            if (i1 >= 0)
            {
                h.remove(i1);
                f();
            }
        }
    }

    public void b(Object obj, int i1)
    {
        obj = g(obj);
        if (obj != null)
        {
            ((c) (obj)).a.b(i1);
        }
    }

    public void c(b b1)
    {
        if (b1.p() != this)
        {
            int i1 = e(b1);
            if (i1 >= 0)
            {
                a((c)i.get(i1));
            }
        }
    }

    public void c(Object obj)
    {
        if (g(obj) == null)
        {
            int i1 = f(obj);
            if (i1 >= 0)
            {
                a((b)h.get(i1));
                f();
            }
        }
    }

    public void d(f f1)
    {
        if (f1.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        if (f1.p() == this)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((i1 = e(f1)) >= 0)
        {
            i(((c)i.get(i1)).b);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j1 = b(f1.o());
        if (j1 >= 0)
        {
            i(((b)h.get(j1)).a);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void d(Object obj)
    {
        if (g(obj) == null)
        {
            int i1 = f(obj);
            if (i1 >= 0)
            {
                b b1 = (b)h.get(i1);
                i1 = d(obj);
                if (i1 != b1.c.i())
                {
                    b1.c = (new <init>(b1.c)).c(i1).a();
                    f();
                }
            }
        }
    }

    protected int e(f f1)
    {
        int j1 = i.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((c)i.get(i1)).a == f1)
            {
                return i1;
            }
        }

        return -1;
    }

    protected int f(Object obj)
    {
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((b)h.get(i1)).a == obj)
            {
                return i1;
            }
        }

        return -1;
    }

    protected void f()
    {
        b.a a1 = new <init>();
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            a1.a(((b)h.get(i1)).c);
        }

        a(a1.a());
    }

    protected c g(Object obj)
    {
        obj = g(obj);
        if (obj instanceof c)
        {
            return (c)obj;
        } else
        {
            return null;
        }
    }

    protected void g()
    {
        if (g)
        {
            g = false;
            android.support.v7.media.h.a(a, b);
        }
        if (e != 0)
        {
            g = true;
            android.support.v7.media.h.b(a, e, b);
        }
    }

    protected Object h()
    {
        return android.support.v7.media.h.a(this);
    }

    protected String h(Object obj)
    {
        obj = a(obj, a());
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return "";
        }
    }

    protected Object i()
    {
        return android.support.v7.media.h.a(this);
    }

    protected void i(Object obj)
    {
        if (m == null)
        {
            m = new <init>();
        }
        m.a(a, 0x800003, obj);
    }

    protected Object j()
    {
        if (n == null)
        {
            n = new <init>();
        }
        return n.a(a);
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        j = new ArrayList();
        j.add(intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        k = new ArrayList();
        k.add(intentfilter);
    }

    public c.b(Context context, c.b b1)
    {
        super(context);
        l = b1;
        a = android.support.v7.media.h.a(context);
        context = context.getResources();
        d = android.support.v7.media.h.a(a, context.getString(android.support.v7.mediarouter.ring.mr_user_route_category_name), false);
        k();
    }
}
