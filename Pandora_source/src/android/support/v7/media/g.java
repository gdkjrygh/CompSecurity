// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            f, c, n, d, 
//            a, l, b, m

public final class g
{
    public static abstract class a
    {

        public void a(g g1, e e1)
        {
        }

        public void a(g g1, f f1)
        {
        }

        public void b(g g1, e e1)
        {
        }

        public void b(g g1, f f1)
        {
        }

        public void c(g g1, e e1)
        {
        }

        public void c(g g1, f f1)
        {
        }

        public void d(g g1, f f1)
        {
        }

        public void e(g g1, f f1)
        {
        }

        public void f(g g1, f f1)
        {
        }

        public void g(g g1, f f1)
        {
        }

        public a()
        {
        }
    }

    private static final class b
    {

        public final g a;
        public final a b;
        public android.support.v7.media.f c;
        public int d;

        public boolean a(f f1)
        {
            return (d & 2) != 0 || f1.a(c);
        }

        public b(g g1, a a1)
        {
            a = g1;
            b = a1;
            c = android.support.v7.media.f.a;
        }
    }

    public static abstract class c
    {

        public void a(Bundle bundle)
        {
        }

        public void a(String s, Bundle bundle)
        {
        }

        public c()
        {
        }
    }

    private static final class d
        implements l.a, n.e
    {

        private final Context a;
        private final ArrayList b = new ArrayList();
        private final ArrayList c = new ArrayList();
        private final ArrayList d = new ArrayList();
        private final ArrayList e = new ArrayList();
        private final m.a f = new m.a();
        private final b g = new b(this);
        private final a h = new a(this);
        private final p.b.a i;
        private final n j;
        private l k;
        private f l;
        private f m;
        private c.d n;
        private android.support.v7.media.b o;

        static m.a a(d d1)
        {
            return d1.f;
        }

        private String a(e e1, String s)
        {
            e1 = (new StringBuilder()).append(e1.c().flattenToShortString()).append(":").append(s).toString();
            if (b(e1) < 0)
            {
                return e1;
            }
            int i1 = 2;
            do
            {
                s = String.format(Locale.US, "%s_%d", new Object[] {
                    e1, Integer.valueOf(i1)
                });
                if (b(s) < 0)
                {
                    return s;
                }
                i1++;
            } while (true);
        }

        private void a(android.support.v7.media.c c1, android.support.v7.media.d d1)
        {
            int i1 = c(c1);
            if (i1 >= 0)
            {
                a((e)d.get(i1), d1);
            }
        }

        static void a(d d1, android.support.v7.media.c c1, android.support.v7.media.d d2)
        {
            d1.a(c1, d2);
        }

        private void a(e e1, android.support.v7.media.d d1)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
            if (!e1.a(d1)) goto _L2; else goto _L1
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
            android.support.v7.media.a a1 = (android.support.v7.media.a)d1.get(j1);
            Object obj = a1.a();
            int i2 = e1.a(((String) (obj)));
            if (i2 < 0)
            {
                obj = new f(e1, ((String) (obj)), a(e1, ((String) (obj))));
                ArrayList arraylist = e.b(e1);
                k1 = i1 + 1;
                arraylist.add(i1, obj);
                c.add(obj);
                ((f) (obj)).a(a1);
                if (g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route added: ").append(obj).toString());
                }
                h.a(257, obj);
                i1 = k1;
            } else
            if (i2 < i1)
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Ignoring route descriptor with duplicate id: ").append(a1).toString());
            } else
            {
                f f1 = (f)e.b(e1).get(i2);
                ArrayList arraylist1 = e.b(e1);
                k1 = i1 + 1;
                Collections.swap(arraylist1, i2, i1);
                i1 = f1.a(a1);
                if (i1 == 0)
                {
                    break MISSING_BLOCK_LABEL_673;
                }
                if ((i1 & 1) != 0)
                {
                    if (g.e())
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route changed: ").append(f1).toString());
                    }
                    h.a(259, f1);
                }
                if ((i1 & 2) != 0)
                {
                    if (g.e())
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route volume changed: ").append(f1).toString());
                    }
                    h.a(260, f1);
                }
                if ((i1 & 4) != 0)
                {
                    if (g.e())
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route presentation display changed: ").append(f1).toString());
                    }
                    h.a(261, f1);
                }
                if (f1 != m)
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
            for (i1 = e.b(e1).size() - 1; i1 >= k1; i1--)
            {
                d1 = (f)e.b(e1).get(i1);
                d1.a(null);
                c.remove(d1);
            }

            a(flag1);
            for (i1 = e.b(e1).size() - 1; i1 >= k1; i1--)
            {
                d1 = (f)e.b(e1).remove(i1);
                if (g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Route removed: ").append(d1).toString());
                }
                h.a(258, d1);
            }

            if (g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Provider changed: ").append(e1).toString());
            }
            h.a(515, e1);
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
                f f1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    f1 = (f)iterator.next();
                } while (!d(f1) || !c(f1));
                l = f1;
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
                if (f.c((f)c.get(i1)).equals(s))
                {
                    return i1;
                }
            }

            return -1;
        }

        static ArrayList b(d d1)
        {
            return d1.b;
        }

        private boolean b(f f1)
        {
            return f1.p() == j && f1.a("android.media.intent.category.LIVE_AUDIO") && !f1.a("android.media.intent.category.LIVE_VIDEO");
        }

        private int c(android.support.v7.media.c c1)
        {
            int j1 = d.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (e.a((e)d.get(i1)) == c1)
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

        private boolean c(f f1)
        {
            return f.d(f1) != null && f.b(f1);
        }

        private boolean d(f f1)
        {
            return f1.p() == j && f.a(f1).equals("DEFAULT_ROUTE");
        }

        private void e(f f1)
        {
            if (m != f1)
            {
                if (m != null)
                {
                    if (g.e())
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
                m = f1;
                if (m != null)
                {
                    n = f1.p().a(f.a(f1));
                    if (n != null)
                    {
                        n.b();
                    }
                    if (g.e())
                    {
                        Log.d("MediaRouter", (new StringBuilder()).append("Route selected: ").append(m).toString());
                    }
                    h.a(262, m);
                }
                g();
            }
        }

        private f f()
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext();)
            {
                f f1 = (f)iterator.next();
                if (f1 != l && b(f1) && c(f1))
                {
                    return f1;
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

        public f a(String s)
        {
            int i1 = c(j);
            if (i1 >= 0)
            {
                e e1 = (e)d.get(i1);
                i1 = e1.a(s);
                if (i1 >= 0)
                {
                    return (f)e.b(e1).get(i1);
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
                e e1 = new e(c1);
                d.add(e1);
                if (g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Provider added: ").append(e1).toString());
                }
                h.a(513, e1);
                a(e1, c1.e());
                c1.a(g);
                c1.a(o);
            }
        }

        public void a(f f1)
        {
            if (!c.contains(f1))
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select removed route: ").append(f1).toString());
                return;
            }
            if (!f.b(f1))
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Ignoring attempt to select disabled route: ").append(f1).toString());
                return;
            } else
            {
                e(f1);
                return;
            }
        }

        public void a(f f1, int i1)
        {
            if (f1 == m && n != null)
            {
                n.a(i1);
            }
        }

        public boolean a(android.support.v7.media.f f1, int i1)
        {
            int j1;
            int k1;
            k1 = c.size();
            j1 = 0;
_L3:
            f f2;
            if (j1 >= k1)
            {
                break; /* Loop/switch isn't completed */
            }
            f2 = (f)c.get(j1);
              goto _L1
_L5:
            j1++;
            if (true) goto _L3; else goto _L2
_L1:
            if ((i1 & 1) != 0 && f2.g() || !f2.a(f1)) goto _L5; else goto _L4
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
                c1 = (e)d.get(i1);
                a(c1, ((android.support.v7.media.d) (null)));
                if (g.e())
                {
                    Log.d("MediaRouter", (new StringBuilder()).append("Provider removed: ").append(c1).toString());
                }
                h.a(514, c1);
                d.remove(i1);
            }
        }

        public void b(f f1, int i1)
        {
            if (f1 == m && n != null)
            {
                n.b(i1);
            }
        }

        public f c()
        {
            if (l == null)
            {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            } else
            {
                return l;
            }
        }

        public f d()
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
            obj = new f.a();
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
            b b1 = (b)g1.c.get(j1);
            ((f.a) (obj)).a(b1.c);
            if ((b1.d & 1) != 0)
            {
                flag2 = true;
                flag = true;
            }
            if ((b1.d & 4) != 0)
            {
                flag = true;
            }
            j1++;
              goto _L5
              goto _L4
            if (flag)
            {
                obj = ((f.a) (obj)).a();
            } else
            {
                obj = android.support.v7.media.f.a;
            }
            if (o == null || !o.a().equals(obj) || o.b() != flag2) goto _L7; else goto _L6
_L6:
            return;
_L7:
            if (!((android.support.v7.media.f) (obj)).b() || flag2)
            {
                break; /* Loop/switch isn't completed */
            }
            if (o == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            o = null;
_L9:
            if (g.e())
            {
                Log.d("MediaRouter", (new StringBuilder()).append("Updated discovery request: ").append(o).toString());
            }
            int k1 = d.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                e.a((e)d.get(i1)).a(o);
                i1++;
            }
            if (true) goto _L6; else goto _L8
_L8:
            o = new android.support.v7.media.b(((android.support.v7.media.f) (obj)), flag2);
              goto _L9
            if (true) goto _L6; else goto _L10
_L10:
        }

        d(Context context)
        {
            a = context;
            i = p.b.a.a(context);
            j = android.support.v7.media.n.a(context, this);
            a(j);
        }
    }

    private final class d.a extends Handler
    {

        final d a;
        private final ArrayList b;

        private void a(b b1, int i, Object obj)
        {
            g g1;
            a a1;
            g1 = b1.a;
            a1 = b1.b;
            0xff00 & i;
            JVM INSTR lookupswitch 2: default 44
        //                       256: 45
        //                       512: 164;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            if (b1.a(((f) (obj = (f)obj))))
            {
                switch (i)
                {
                default:
                    return;

                case 257: 
                    a1.a(g1, ((f) (obj)));
                    return;

                case 258: 
                    a1.b(g1, ((f) (obj)));
                    return;

                case 259: 
                    a1.c(g1, ((f) (obj)));
                    return;

                case 260: 
                    a1.f(g1, ((f) (obj)));
                    return;

                case 261: 
                    a1.g(g1, ((f) (obj)));
                    return;

                case 262: 
                    a1.d(g1, ((f) (obj)));
                    return;

                case 263: 
                    a1.e(g1, ((f) (obj)));
                    break;
                }
                return;
            }
              goto _L1
_L3:
            b1 = (e)obj;
            switch (i)
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

        private void b(int i, Object obj)
        {
            switch (i)
            {
            case 260: 
            case 261: 
            default:
                return;

            case 257: 
                d.c(a).a((f)obj);
                return;

            case 258: 
                d.c(a).b((f)obj);
                return;

            case 259: 
                d.c(a).c((f)obj);
                return;

            case 262: 
                d.c(a).d((f)obj);
                break;
            }
        }

        public void a(int i, Object obj)
        {
            obtainMessage(i, obj).sendToTarget();
        }

        public void handleMessage(Message message)
        {
            int j;
            j = message.what;
            message = ((Message) (message.obj));
            b(j, message);
            int i = d.b(a).size();
_L1:
            i--;
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            g g1 = (g)((WeakReference)d.b(a).get(i)).get();
            if (g1 != null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            d.b(a).remove(i);
              goto _L1
            b.addAll(g1.c);
              goto _L1
            message;
            b.clear();
            throw message;
            int k = b.size();
            i = 0;
_L3:
            if (i >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            a((b)b.get(i), j, message);
            i++;
            if (true) goto _L3; else goto _L2
_L2:
            b.clear();
            return;
        }

        private d.a(d d1)
        {
            a = d1;
            super();
            b = new ArrayList();
        }

    }

    private final class d.b extends c.a
    {

        final d a;

        public void a(android.support.v7.media.c c1, android.support.v7.media.d d1)
        {
            d.a(a, c1, d1);
        }

        private d.b(d d1)
        {
            a = d1;
            super();
        }

    }

    private final class d.c
    {

        final d a;
        private final m b;

        public void a()
        {
            b.a(d.a(a));
        }
    }

    public static final class e
    {

        private final android.support.v7.media.c a;
        private final ArrayList b = new ArrayList();
        private final c.c c;
        private android.support.v7.media.d d;

        static android.support.v7.media.c a(e e1)
        {
            return e1.a;
        }

        static ArrayList b(e e1)
        {
            return e1.b;
        }

        int a(String s)
        {
            int j = b.size();
            for (int i = 0; i < j; i++)
            {
                if (f.a((f)b.get(i)).equals(s))
                {
                    return i;
                }
            }

            return -1;
        }

        public android.support.v7.media.c a()
        {
            g.d();
            return a;
        }

        boolean a(android.support.v7.media.d d1)
        {
            if (d != d1)
            {
                d = d1;
                return true;
            } else
            {
                return false;
            }
        }

        public String b()
        {
            return c.a();
        }

        public ComponentName c()
        {
            return c.b();
        }

        public String toString()
        {
            return (new StringBuilder()).append("MediaRouter.RouteProviderInfo{ packageName=").append(b()).append(" }").toString();
        }

        e(android.support.v7.media.c c1)
        {
            a = c1;
            c = c1.c();
        }
    }

    public static final class f
    {

        private final e a;
        private final String b;
        private final String c;
        private String d;
        private String e;
        private boolean f;
        private boolean g;
        private final ArrayList h = new ArrayList();
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private Display n;
        private int o;
        private Bundle p;
        private android.support.v7.media.a q;

        static String a(f f1)
        {
            return f1.b;
        }

        static boolean b(f f1)
        {
            return f1.f;
        }

        static String c(f f1)
        {
            return f1.c;
        }

        static android.support.v7.media.a d(f f1)
        {
            return f1.q;
        }

        int a(android.support.v7.media.a a1)
        {
            boolean flag = false;
            int j1 = 0;
            int i1 = ((flag) ? 1 : 0);
            if (q != a1)
            {
                q = a1;
                i1 = ((flag) ? 1 : 0);
                if (a1 != null)
                {
                    if (!g.a(d, a1.b()))
                    {
                        d = a1.b();
                        j1 = 1;
                    }
                    i1 = j1;
                    if (!g.a(e, a1.c()))
                    {
                        e = a1.c();
                        i1 = j1 | true;
                    }
                    j1 = i1;
                    if (f != a1.d())
                    {
                        f = a1.d();
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (g != a1.e())
                    {
                        g = a1.e();
                        i1 = j1 | 1;
                    }
                    j1 = i1;
                    if (!h.equals(a1.f()))
                    {
                        h.clear();
                        h.addAll(a1.f());
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (i != a1.g())
                    {
                        i = a1.g();
                        i1 = j1 | 1;
                    }
                    j1 = i1;
                    if (j != a1.h())
                    {
                        j = a1.h();
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (k != a1.k())
                    {
                        k = a1.k();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (l != a1.i())
                    {
                        l = a1.i();
                        j1 = i1 | 3;
                    }
                    i1 = j1;
                    if (m != a1.j())
                    {
                        m = a1.j();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (o != a1.l())
                    {
                        o = a1.l();
                        n = null;
                        j1 = i1 | 5;
                    }
                    i1 = j1;
                    if (!g.a(p, a1.m()))
                    {
                        p = a1.m();
                        i1 = j1 | 1;
                    }
                }
            }
            return i1;
        }

        public String a()
        {
            return c;
        }

        public void a(int i1)
        {
            g.d();
            g.a.a(this, Math.min(m, Math.max(0, i1)));
        }

        public boolean a(android.support.v7.media.f f1)
        {
            if (f1 == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            } else
            {
                g.d();
                return f1.a(h);
            }
        }

        public boolean a(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("category must not be null");
            }
            g.d();
            int j1 = h.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (((IntentFilter)h.get(i1)).hasCategory(s))
                {
                    return true;
                }
            }

            return false;
        }

        public String b()
        {
            return d;
        }

        public void b(int i1)
        {
            g.d();
            if (i1 != 0)
            {
                g.a.b(this, i1);
            }
        }

        public String c()
        {
            return e;
        }

        public boolean d()
        {
            return f;
        }

        public boolean e()
        {
            return g;
        }

        public boolean f()
        {
            g.d();
            return g.a.d() == this;
        }

        public boolean g()
        {
            g.d();
            return g.a.c() == this;
        }

        public int h()
        {
            return i;
        }

        public int i()
        {
            return j;
        }

        public int j()
        {
            return k;
        }

        public int k()
        {
            return l;
        }

        public int l()
        {
            return m;
        }

        public Bundle m()
        {
            return p;
        }

        public void n()
        {
            g.d();
            g.a.a(this);
        }

        String o()
        {
            return b;
        }

        android.support.v7.media.c p()
        {
            return a.a();
        }

        public String toString()
        {
            return (new StringBuilder()).append("MediaRouter.RouteInfo{ uniqueId=").append(c).append(", name=").append(d).append(", description=").append(e).append(", enabled=").append(f).append(", connecting=").append(g).append(", playbackType=").append(i).append(", playbackStream=").append(j).append(", volumeHandling=").append(k).append(", volume=").append(l).append(", volumeMax=").append(m).append(", presentationDisplayId=").append(o).append(", extras=").append(p).append(", providerPackageName=").append(a.b()).append(" }").toString();
        }

        f(e e1, String s, String s1)
        {
            o = -1;
            a = e1;
            b = s;
            c = s1;
        }
    }


    static d a;
    private static final boolean d = Log.isLoggable("MediaRouter", 3);
    final Context b;
    final ArrayList c = new ArrayList();

    g(Context context)
    {
        b = context;
    }

    public static g a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        d();
        if (a == null)
        {
            a = new d(context.getApplicationContext());
            a.a();
        }
        return a.a(context);
    }

    static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj1 != null && obj.equals(obj1);
    }

    private int b(a a1)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            if (((b)c.get(i)).b == a1)
            {
                return i;
            }
        }

        return -1;
    }

    static void d()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        } else
        {
            return;
        }
    }

    static boolean e()
    {
        return d;
    }

    public List a()
    {
        d();
        return a.b();
    }

    public void a(android.support.v7.media.c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("addProvider: ").append(c1).toString());
        }
        a.a(c1);
    }

    public void a(android.support.v7.media.f f1, a a1)
    {
        a(f1, a1, 0);
    }

    public void a(android.support.v7.media.f f1, a a1, int i)
    {
        boolean flag = true;
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("addCallback: selector=").append(f1).append(", callback=").append(a1).append(", flags=").append(Integer.toHexString(i)).toString());
        }
        int j = b(a1);
        if (j < 0)
        {
            a1 = new b(this, a1);
            c.add(a1);
        } else
        {
            a1 = (b)c.get(j);
        }
        j = 0;
        if ((~((b) (a1)).d & i) != 0)
        {
            a1.d = ((b) (a1)).d | i;
            j = 1;
        }
        if (!((b) (a1)).c.a(f1))
        {
            a1.c = (new f.a(((b) (a1)).c)).a(f1).a();
            i = ((flag) ? 1 : 0);
        } else
        {
            i = j;
        }
        if (i != 0)
        {
            a.e();
        }
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder()).append("removeCallback: callback=").append(a1).toString());
        }
        int i = b(a1);
        if (i >= 0)
        {
            c.remove(i);
            a.e();
        }
    }

    public boolean a(android.support.v7.media.f f1, int i)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            d();
            return a.a(f1, i);
        }
    }

    public f b()
    {
        d();
        return a.c();
    }

    public f c()
    {
        d();
        return a.d();
    }

}
