// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p.b.a;

// Referenced classes of package android.support.v7.media:
//            g, n, d, a, 
//            c, l, b, f, 
//            m

private static final class j
    implements j, j
{
    private final class a extends Handler
    {

        final g.d a;
        private final ArrayList b;

        private void a(g.b b1, int i1, Object obj)
        {
            g g1;
            g.a a1;
            g1 = b1.a;
            a1 = b1.b;
            0xff00 & i1;
            JVM INSTR lookupswitch 2: default 44
        //                       256: 45
        //                       512: 164;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            if (b1.a(((g.f) (obj = (g.f)obj))))
            {
                switch (i1)
                {
                default:
                    return;

                case 257: 
                    a1.a(g1, ((g.f) (obj)));
                    return;

                case 258: 
                    a1.b(g1, ((g.f) (obj)));
                    return;

                case 259: 
                    a1.c(g1, ((g.f) (obj)));
                    return;

                case 260: 
                    a1.f(g1, ((g.f) (obj)));
                    return;

                case 261: 
                    a1.g(g1, ((g.f) (obj)));
                    return;

                case 262: 
                    a1.d(g1, ((g.f) (obj)));
                    return;

                case 263: 
                    a1.e(g1, ((g.f) (obj)));
                    break;
                }
                return;
            }
              goto _L1
_L3:
            b1 = (g.e)obj;
            switch (i1)
            {
            default:
                return;

            case 513: 
                a1.a(g1, b1);
                return;

            case 514: 
                a1.b(g1, b1);
                return;

            case 515: 
                a1.c(g1, b1);
                break;
            }
            return;
        }

        private void b(int i1, Object obj)
        {
            switch (i1)
            {
            case 260: 
            case 261: 
            default:
                return;

            case 257: 
                g.d.c(a).a((g.f)obj);
                return;

            case 258: 
                g.d.c(a).b((g.f)obj);
                return;

            case 259: 
                g.d.c(a).c((g.f)obj);
                return;

            case 262: 
                g.d.c(a).d((g.f)obj);
                break;
            }
        }

        public void a(int i1, Object obj)
        {
            obtainMessage(i1, obj).sendToTarget();
        }

        public void handleMessage(Message message)
        {
            int j1;
            j1 = message.what;
            message = ((Message) (message.obj));
            b(j1, message);
            int i1 = g.d.b(a).size();
_L1:
            i1--;
            if (i1 < 0)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            g g1 = (g)((WeakReference)g.d.b(a).get(i1)).get();
            if (g1 != null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            g.d.b(a).remove(i1);
              goto _L1
            b.addAll(g1.c);
              goto _L1
            message;
            b.clear();
            throw message;
            int k1 = b.size();
            i1 = 0;
_L3:
            if (i1 >= k1)
            {
                break; /* Loop/switch isn't completed */
            }
            a((g.b)b.get(i1), j1, message);
            i1++;
            if (true) goto _L3; else goto _L2
_L2:
            b.clear();
            return;
        }

        private a()
        {
            a = g.d.this;
            super();
            b = new ArrayList();
        }

        a(g._cls1 _pcls1)
        {
            this();
        }
    }

    private final class b extends c.a
    {

        final g.d a;

        public void a(android.support.v7.media.c c1, d d1)
        {
            android.support.v7.media.g.d.a(a, c1, d1);
        }

        private b()
        {
            a = g.d.this;
            super();
        }

        b(g._cls1 _pcls1)
        {
            this();
        }
    }

    private final class c
    {

        final g.d a;
        private final m b;

        public void a()
        {
            b.a(android.support.v7.media.g.d.a(a));
        }
    }


    private final Context a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final nit> f = new <init>();
    private final b g = new b(null);
    private final a h = new a(null);
    private final p.b.a i;
    private final n j;
    private l k;
    private a l;
    private a m;
    private a n;
    private android.support.v7.media.b o;

    static c.a a(c.a a1)
    {
        return a1.f;
    }

    private String a(f f1, String s)
    {
        f1 = (new StringBuilder()).append(f1.c().flattenToShortString()).append(":").append(s).toString();
        if (b(f1) < 0)
        {
            return f1;
        }
        int i1 = 2;
        do
        {
            s = String.format(Locale.US, "%s_%d", new Object[] {
                f1, Integer.valueOf(i1)
            });
            if (b(s) < 0)
            {
                return s;
            }
            i1++;
        } while (true);
    }

    private void a(android.support.v7.media.c c1, d d1)
    {
        int i1 = c(c1);
        if (i1 >= 0)
        {
            a((a)d.get(i1), d1);
        }
    }

    static void a(d d1, android.support.v7.media.c c1, d d2)
    {
        d1.a(c1, d2);
    }

    private void a(a a1, d d1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (!a1.a(d1)) goto _L2; else goto _L1
_L1:
        if (d1 == null) goto _L4; else goto _L3
_L3:
        if (!d1.b()) goto _L6; else goto _L5
_L5:
        int i1;
        int j1;
        int l1;
        d1 = d1.a();
        l1 = d1.size();
        j1 = 0;
        i1 = 0;
_L8:
        int k1;
        flag1 = flag;
        k1 = i1;
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        android.support.v7.media.a a2 = (android.support.v7.media.a)d1.get(j1);
        Object obj = a2.a();
        int i2 = a1.a(((String) (obj)));
        if (i2 < 0)
        {
            obj = new <init>(a1, ((String) (obj)), a(a1, ((String) (obj))));
            ArrayList arraylist = b(a1);
            k1 = i1 + 1;
            arraylist.add(i1, obj);
            c.add(obj);
            ((c) (obj)).a(a2);
            if (android.support.v7.media.g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Route added: ").append(obj).toString());
            }
            h.a(257, obj);
            i1 = k1;
        } else
        if (i2 < i1)
        {
            Log.w("MediaRouter", (new StringBuilder()).append("Ignoring route descriptor with duplicate id: ").append(a2).toString());
        } else
        {
            a a3 = (ing)b(a1).get(i2);
            ArrayList arraylist1 = b(a1);
            k1 = i1 + 1;
            Collections.swap(arraylist1, i2, i1);
            i1 = a3.a(a2);
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_673;
            }
            if ((i1 & 1) != 0)
            {
                if (android.support.v7.media.g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route changed: ").append(a3).toString());
                }
                h.a(259, a3);
            }
            if ((i1 & 2) != 0)
            {
                if (android.support.v7.media.g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route volume changed: ").append(a3).toString());
                }
                h.a(260, a3);
            }
            if ((i1 & 4) != 0)
            {
                if (android.support.v7.media.g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route presentation display changed: ").append(a3).toString());
                }
                h.a(261, a3);
            }
            if (a3 != m)
            {
                break MISSING_BLOCK_LABEL_673;
            }
            flag = true;
            i1 = k1;
        }
_L9:
        j1++;
        if (true) goto _L8; else goto _L7
_L6:
        Log.w("MediaRouter", (new StringBuilder()).append("Ignoring invalid provider descriptor: ").append(d1).toString());
_L4:
        k1 = 0;
_L7:
        for (i1 = b(a1).size() - 1; i1 >= k1; i1--)
        {
            d1 = (b)b(a1).get(i1);
            d1.a(null);
            c.remove(d1);
        }

        a(flag1);
        for (i1 = b(a1).size() - 1; i1 >= k1; i1--)
        {
            d1 = (b)b(a1).remove(i1);
            if (android.support.v7.media.g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Route removed: ").append(d1).toString());
            }
            h.a(258, d1);
        }

        if (android.support.v7.media.g.e())
        {
            Log.d("MediaRouter", (new StringBuilder()).append("Provider changed: ").append(a1).toString());
        }
        h.a(515, a1);
_L2:
        return;
        i1 = k1;
          goto _L9
    }

    private void a(boolean flag)
    {
label0:
        {
            if (l != null && !c(l))
            {
                Log.i("MediaRouter", (new StringBuilder()).append("Clearing the default route because it is no longer selectable: ").append(l).toString());
                l = null;
            }
            if (l != null || c.isEmpty())
            {
                break label0;
            }
            Iterator iterator = c.iterator();
            a.a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (c)iterator.next();
            } while (!d(a1) || !c(a1));
            l = a1;
            Log.i("MediaRouter", (new StringBuilder()).append("Found default route: ").append(l).toString());
        }
        if (m != null && !c(m))
        {
            Log.i("MediaRouter", (new StringBuilder()).append("Unselecting the current route because it is no longer selectable: ").append(m).toString());
            e(null);
        }
        if (m == null)
        {
            e(f());
        } else
        if (flag)
        {
            g();
            return;
        }
    }

    private int b(String s)
    {
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (c((c)c.get(i1)).equals(s))
            {
                return i1;
            }
        }

        return -1;
    }

    static ArrayList b(c c1)
    {
        return c1.b;
    }

    private boolean b(b b1)
    {
        return b1.p() == j && b1.a("android.media.intent.category.LIVE_AUDIO") && !b1.a("android.media.intent.category.LIVE_VIDEO");
    }

    private int c(android.support.v7.media.c c1)
    {
        int j1 = d.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (android.support.v7.media.a((a)d.get(i1)) == c1)
            {
                return i1;
            }
        }

        return -1;
    }

    static n c(d d1)
    {
        return d1.j;
    }

    private boolean c(j j1)
    {
        return d(j1) != null && b(j1);
    }

    private boolean d(b b1)
    {
        return b1.p() == j && android.support.v7.media.a(b1).equals("DEFAULT_ROUTE");
    }

    private void e(a a1)
    {
        if (m != a1)
        {
            if (m != null)
            {
                if (android.support.v7.media.g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route unselected: ").append(m).toString());
                }
                h.a(263, m);
                if (n != null)
                {
                    n.c();
                    n.a();
                    n = null;
                }
            }
            m = a1;
            if (m != null)
            {
                n = a1.p().a(android.support.v7.media.a(a1));
                if (n != null)
                {
                    n.b();
                }
                if (android.support.v7.media.g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route selected: ").append(m).toString());
                }
                h.a(262, m);
            }
            g();
        }
    }

    private g f()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            g g1 = (c)iterator.next();
            if (g1 != l && b(g1) && c(g1))
            {
                return g1;
            }
        }

        return l;
    }

    private void g()
    {
        if (m != null)
        {
            f.a = m.k();
            f.b = m.l();
            f.c = m.j();
            f.d = m.i();
            f.e = m.h();
            int j1 = e.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((c)e.get(i1)).a();
            }

        }
    }

    public c.a a(String s)
    {
        int i1 = c(j);
        if (i1 >= 0)
        {
            c.a a1 = (j)d.get(i1);
            i1 = a1.a(s);
            if (i1 >= 0)
            {
                return (a)b(a1).get(i1);
            }
        }
        return null;
    }

    public g a(Context context)
    {
        int i1 = b.size();
label0:
        do
        {
            do
            {
                i1--;
                g g1;
                if (i1 >= 0)
                {
                    g1 = (g)((WeakReference)b.get(i1)).get();
                    if (g1 != null)
                    {
                        continue label0;
                    }
                    b.remove(i1);
                } else
                {
                    context = new g(context);
                    b.add(new WeakReference(context));
                    return context;
                }
            } while (true);
        } while (g1.b != context);
        return g1;
    }

    public void a()
    {
        k = new l(a, this);
        k.a();
    }

    public void a(android.support.v7.media.c c1)
    {
        if (c(c1) < 0)
        {
            k k1 = new <init>(c1);
            d.add(k1);
            if (android.support.v7.media.g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Provider added: ").append(k1).toString());
            }
            h.a(513, k1);
            a(k1, c1.e());
            c1.a(g);
            c1.a(o);
        }
    }

    public void a(o o1)
    {
        if (!c.contains(o1))
        {
            Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select removed route: ").append(o1).toString());
            return;
        }
        if (!b(o1))
        {
            Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select disabled route: ").append(o1).toString());
            return;
        } else
        {
            e(o1);
            return;
        }
    }

    public void a(e e1, int i1)
    {
        if (e1 == m && n != null)
        {
            n.a(i1);
        }
    }

    public boolean a(f f1, int i1)
    {
        int j1;
        int k1;
        k1 = c.size();
        j1 = 0;
_L3:
        a a1;
        if (j1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (c)c.get(j1);
          goto _L1
_L5:
        j1++;
        if (true) goto _L3; else goto _L2
_L1:
        if ((i1 & 1) != 0 && a1.g() || !a1.a(f1)) goto _L5; else goto _L4
_L4:
        return true;
_L2:
        return false;
    }

    public List b()
    {
        return c;
    }

    public void b(android.support.v7.media.c c1)
    {
        int i1 = c(c1);
        if (i1 >= 0)
        {
            c1.a(null);
            c1.a(null);
            c1 = (c)d.get(i1);
            a(c1, ((d) (null)));
            if (android.support.v7.media.g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Provider removed: ").append(c1).toString());
            }
            h.a(514, c1);
            d.remove(i1);
        }
    }

    public void b(d d1, int i1)
    {
        if (d1 == m && n != null)
        {
            n.b(i1);
        }
    }

    public b c()
    {
        if (l == null)
        {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        } else
        {
            return l;
        }
    }

    public l d()
    {
        if (m == null)
        {
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        } else
        {
            return m;
        }
    }

    public void e()
    {
        Object obj;
        boolean flag;
        int j1;
        boolean flag2;
        obj = new <init>();
        j1 = b.size();
        flag2 = false;
        flag = false;
_L2:
        g g1;
        boolean flag1;
        int l1;
        boolean flag3;
        l1 = j1 - 1;
        if (l1 < 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        g1 = (g)((WeakReference)b.get(l1)).get();
        if (g1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.remove(l1);
        flag1 = flag;
        flag3 = flag2;
_L4:
        j1 = l1;
        flag2 = flag3;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        i2 = g1.c.size();
        j1 = 0;
_L5:
        flag3 = flag2;
        flag1 = flag;
        if (j1 >= i2) goto _L4; else goto _L3
_L3:
        m m1 = (b)g1.c.get(j1);
        ((b) (obj)).a(m1.c);
        if ((m1.d & 1) != 0)
        {
            flag2 = true;
            flag = true;
        }
        if ((m1.d & 4) != 0)
        {
            flag = true;
        }
        j1++;
          goto _L5
          goto _L4
        if (flag)
        {
            obj = ((d) (obj)).a();
        } else
        {
            obj = android.support.v7.media.f.a;
        }
        if (o == null || !o.a().equals(obj) || o.b() != flag2) goto _L7; else goto _L6
_L6:
        return;
_L7:
        if (!((f) (obj)).b() || flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        o = null;
_L9:
        if (android.support.v7.media.g.e())
        {
            Log.d("MediaRouter", (new StringBuilder()).append("Updated discovery request: ").append(o).toString());
        }
        int k1 = d.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            android.support.v7.media.a((a)d.get(i1)).a(o);
            i1++;
        }
        if (true) goto _L6; else goto _L8
_L8:
        o = new android.support.v7.media.b(((f) (obj)), flag2);
          goto _L9
        if (true) goto _L6; else goto _L10
_L10:
    }

    c(Context context)
    {
        a = context;
        i = p.b.a.a(context);
        j = android.support.v7.media.n.a(context, this);
        a(j);
    }
}
