// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            c, h, b, f, 
//            a, i, j

abstract class n extends android.support.v7.media.c
{
    static class a extends n
        implements h.a, h.g
    {

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
        private final e l;
        private h.e m;
        private h.c n;

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

        public c.d a(String s)
        {
            int i1 = b(s);
            if (i1 >= 0)
            {
                return new a(this, ((b)h.get(i1)).a);
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
                        ((g.f) (obj)).n();
                        return;
                    }
                }
            }
        }

        public void a(g.f f1)
        {
            if (f1.p() != this)
            {
                Object obj = android.support.v7.media.h.b(a, d);
                f1 = new c(f1, obj);
                android.support.v7.media.h.d.a(obj, f1);
                android.support.v7.media.h.f.a(obj, c);
                a(((c) (f1)));
                i.add(f1);
                android.support.v7.media.h.c(a, obj);
            } else
            {
                int i1 = f(android.support.v7.media.h.a(a, 0x800003));
                if (i1 >= 0 && ((b)h.get(i1)).b.equals(f1.o()))
                {
                    f1.n();
                    return;
                }
            }
        }

        protected void a(b b1)
        {
            a.a a1 = new a.a(b1.b, h(b1.a));
            a(b1, a1);
            b1.c = a1.a();
        }

        protected void a(b b1, a.a a1)
        {
            int i1 = android.support.v7.media.h.d.a(b1.a);
            if ((i1 & 1) != 0)
            {
                a1.a(j);
            }
            if ((i1 & 2) != 0)
            {
                a1.a(k);
            }
            a1.a(android.support.v7.media.h.d.b(b1.a));
            a1.b(android.support.v7.media.h.d.c(b1.a));
            a1.c(android.support.v7.media.h.d.d(b1.a));
            a1.d(android.support.v7.media.h.d.e(b1.a));
            a1.e(android.support.v7.media.h.d.f(b1.a));
        }

        protected void a(c c1)
        {
            android.support.v7.media.h.f.a(c1.b, c1.a.b());
            android.support.v7.media.h.f.a(c1.b, c1.a.h());
            android.support.v7.media.h.f.b(c1.b, c1.a.i());
            android.support.v7.media.h.f.c(c1.b, c1.a.k());
            android.support.v7.media.h.f.d(c1.b, c1.a.l());
            android.support.v7.media.h.f.e(c1.b, c1.a.j());
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

        public void b(g.f f1)
        {
            if (f1.p() != this)
            {
                int i1 = e(f1);
                if (i1 >= 0)
                {
                    f1 = (c)i.remove(i1);
                    android.support.v7.media.h.d.a(((c) (f1)).b, null);
                    android.support.v7.media.h.f.a(((c) (f1)).b, null);
                    android.support.v7.media.h.d(a, ((c) (f1)).b);
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

        public void c(g.f f1)
        {
            if (f1.p() != this)
            {
                int i1 = e(f1);
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

        public void d(g.f f1)
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
                    i1 = android.support.v7.media.h.d.d(obj);
                    if (i1 != b1.c.i())
                    {
                        b1.c = (new a.a(b1.c)).c(i1).a();
                        f();
                    }
                }
            }
        }

        protected int e(g.f f1)
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
            d.a a1 = new d.a();
            int j1 = h.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                a1.a(((b)h.get(i1)).c);
            }

            a(a1.a());
        }

        protected c g(Object obj)
        {
            obj = android.support.v7.media.h.d.g(obj);
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
            obj = android.support.v7.media.h.d.a(obj, a());
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
                m = new h.e();
            }
            m.a(a, 0x800003, obj);
        }

        protected Object j()
        {
            if (n == null)
            {
                n = new h.c();
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

        public a(Context context, e e1)
        {
            super(context);
            l = e1;
            a = android.support.v7.media.h.a(context);
            context = context.getResources();
            d = android.support.v7.media.h.a(a, context.getString(android.support.v7.mediarouter.R.string.mr_user_route_category_name), false);
            k();
        }
    }

    protected final class a.a extends c.d
    {

        final a a;
        private final Object b;

        public void a(int i)
        {
            h.d.a(b, i);
        }

        public void b(int i)
        {
            h.d.b(b, i);
        }

        public a.a(a a1, Object obj)
        {
            a = a1;
            super();
            b = obj;
        }
    }

    protected static final class a.b
    {

        public final Object a;
        public final String b;
        public android.support.v7.media.a c;

        public a.b(Object obj, String s)
        {
            a = obj;
            b = s;
        }
    }

    protected static final class a.c
    {

        public final g.f a;
        public final Object b;

        public a.c(g.f f, Object obj)
        {
            a = f;
            b = obj;
        }
    }

    private static class b extends a
        implements i.b
    {

        private i.a j;
        private i.d k;

        protected void a(a.b b1, a.a a1)
        {
            super.a(b1, a1);
            if (!i.e.a(b1.a))
            {
                a1.a(false);
            }
            if (b(b1))
            {
                a1.b(true);
            }
            b1 = i.e.b(b1.a);
            if (b1 != null)
            {
                a1.f(b1.getDisplayId());
            }
        }

        protected boolean b(a.b b1)
        {
            if (k == null)
            {
                k = new i.d();
            }
            return k.a(b1.a);
        }

        public void e(Object obj)
        {
            int l = f(obj);
            if (l >= 0)
            {
                a.b b1 = (a.b)h.get(l);
                obj = i.e.b(obj);
                if (obj != null)
                {
                    l = ((Display) (obj)).getDisplayId();
                } else
                {
                    l = -1;
                }
                if (l != b1.c.l())
                {
                    b1.c = (new a.a(b1.c)).f(l).a();
                    f();
                }
            }
        }

        protected void g()
        {
            super.g();
            if (j == null)
            {
                j = new i.a(a(), b());
            }
            i.a a1 = j;
            int l;
            if (f)
            {
                l = e;
            } else
            {
                l = 0;
            }
            a1.a(l);
        }

        protected Object h()
        {
            return i.a(this);
        }

        public b(Context context, e e1)
        {
            super(context, e1);
        }
    }

    private static class c extends b
    {

        protected void a(a.b b1, a.a a1)
        {
            super.a(b1, a1);
            b1 = android.support.v7.media.j.a.a(b1.a);
            if (b1 != null)
            {
                a1.c(b1.toString());
            }
        }

        protected void a(a.c c1)
        {
            super.a(c1);
            android.support.v7.media.j.b.a(c1.b, c1.a.c());
        }

        protected boolean b(a.b b1)
        {
            return android.support.v7.media.j.a.b(b1.a);
        }

        protected void g()
        {
            int k = 1;
            if (g)
            {
                h.a(a, b);
            }
            g = true;
            Object obj = a;
            int l = e;
            Object obj1 = b;
            if (!f)
            {
                k = 0;
            }
            android.support.v7.media.j.a(obj, l, obj1, k | 2);
        }

        protected void i(Object obj)
        {
            h.a(a, 0x800003, obj);
        }

        protected Object j()
        {
            return android.support.v7.media.j.a(a);
        }

        public c(Context context, e e1)
        {
            super(context, e1);
        }
    }

    static class d extends n
    {

        private static final ArrayList a;
        private final AudioManager b;
        private final b c = new b(this);
        private int d;

        static AudioManager a(d d1)
        {
            return d1.b;
        }

        static void b(d d1)
        {
            d1.f();
        }

        static int c(d d1)
        {
            return d1.d;
        }

        private void f()
        {
            Object obj = a().getResources();
            int i = b.getStreamMaxVolume(3);
            d = b.getStreamVolume(3);
            obj = (new a.a("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.R.string.mr_system_route_name))).a(a).b(3).a(0).e(1).d(i).c(d).a();
            a((new d.a()).a(((android.support.v7.media.a) (obj))).a());
        }

        public c.d a(String s)
        {
            if (s.equals("DEFAULT_ROUTE"))
            {
                return new a(this);
            } else
            {
                return null;
            }
        }

        static 
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            a = new ArrayList();
            a.add(intentfilter);
        }

        public d(Context context)
        {
            super(context);
            d = -1;
            b = (AudioManager)context.getSystemService("audio");
            context.registerReceiver(c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            f();
        }
    }

    final class d.a extends c.d
    {

        final d a;

        public void a(int i)
        {
            d.a(a).setStreamVolume(3, i, 0);
            d.b(a);
        }

        public void b(int i)
        {
            int j = d.a(a).getStreamVolume(3);
            if (Math.min(d.a(a).getStreamMaxVolume(3), Math.max(0, j + i)) != j)
            {
                d.a(a).setStreamVolume(3, j, 0);
            }
            d.b(a);
        }

        d.a(d d1)
        {
            a = d1;
            super();
        }
    }

    final class d.b extends BroadcastReceiver
    {

        final d a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
            {
                int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                if (i >= 0 && i != d.c(a))
                {
                    d.b(a);
                }
            }
        }

        d.b(d d1)
        {
            a = d1;
            super();
        }
    }

    public static interface e
    {

        public abstract g.f a(String s);
    }


    protected n(Context context)
    {
        super(context, new c.c(new ComponentName("android", android/support/v7/media/n.getName())));
    }

    public static n a(Context context, e e1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new c(context, e1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new b(context, e1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new a(context, e1);
        } else
        {
            return new d(context);
        }
    }

    public void a(g.f f)
    {
    }

    public void b(g.f f)
    {
    }

    public void c(g.f f)
    {
    }

    public void d(g.f f)
    {
    }
}
