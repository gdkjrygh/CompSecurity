// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b.a.a.a.a.b.t;
import b.a.a.a.a.c.h;
import b.a.a.a.a.c.p;
import b.a.a.a.a.c.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package b.a.a.a:
//            c, f, a, e, 
//            h, p, i, l, 
//            o, k, m

public class d
{
    public static final class a
    {

        private final Context a;
        private l b[];
        private p c;
        private Handler d;
        private o e;
        private boolean f;
        private String g;
        private String h;
        private i i;

        public final transient a a(l al[])
        {
            if (al == null)
            {
                throw new IllegalArgumentException("Kits must not be null.");
            }
            if (al.length == 0)
            {
                throw new IllegalArgumentException("Kits must not be empty.");
            }
            if (b != null)
            {
                throw new IllegalStateException("Kits already set.");
            } else
            {
                b = al;
                return this;
            }
        }

        public final d a()
        {
            if (b == null)
            {
                throw new IllegalStateException("Kits must not be null.");
            }
            if (c == null)
            {
                c = p.a();
            }
            if (d == null)
            {
                d = new Handler(Looper.getMainLooper());
            }
            Map map;
            t t1;
            if (e == null)
            {
                if (f)
                {
                    e = new c();
                } else
                {
                    e = new c((byte)0);
                }
            }
            if (h == null)
            {
                h = a.getPackageName();
            }
            if (i == null)
            {
                i = i.d;
            }
            map = d.a(Arrays.asList(b));
            t1 = new t(a, h, g, map.values());
            return new d(a, map, c, d, e, f, i, t1);
        }

        public a(Context context)
        {
            if (context == null)
            {
                throw new IllegalArgumentException("Context must not be null.");
            } else
            {
                a = context.getApplicationContext();
                return;
            }
        }
    }


    static volatile d a;
    static final o b = new c((byte)0);
    final o c;
    final boolean d;
    private final Context e;
    private final Map f;
    private final ExecutorService g;
    private final Handler h;
    private final i i;
    private final i j;
    private final t k;
    private b.a.a.a.a l;
    private WeakReference m;
    private AtomicBoolean n;

    d(Context context, Map map, p p1, Handler handler, o o1, boolean flag, i i1, 
            t t)
    {
        e = context;
        f = map;
        g = p1;
        h = handler;
        c = o1;
        d = flag;
        i = i1;
        n = new AtomicBoolean(false);
        j = new f(this, map.size());
        k = t;
    }

    public static transient d a(Context context, l al[])
    {
        Iterator iterator = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        b/a/a/a/d;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        al = (new a(context)).a(al).a();
        a = al;
        context = ((d) (al)).e;
        if (!(context instanceof Activity)) goto _L4; else goto _L3
_L3:
        context = (Activity)context;
_L6:
        Object obj;
        Object obj1;
        al.a(((Activity) (context)));
        al.l = new b.a.a.a.a(((d) (al)).e);
        ((d) (al)).l.a(new e(al));
        context = ((d) (al)).e;
        obj = new b.a.a.a.h(context.getPackageCodePath());
        obj = ((d) (al)).g.submit(((java.util.concurrent.Callable) (obj)));
        obj1 = ((d) (al)).f.values();
        obj = new b.a.a.a.p(((java.util.concurrent.Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((b.a.a.a.p) (obj)).a(context, al, i.d, ((d) (al)).k);
        for (Iterator iterator1 = ((List) (obj1)).iterator(); iterator1.hasNext(); ((l)iterator1.next()).a(context, al, ((d) (al)).j, ((d) (al)).k)) { }
        break MISSING_BLOCK_LABEL_226;
        context;
        b/a/a/a/d;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
        ((b.a.a.a.p) (obj)).t();
        context = iterator;
        if (c().a(3))
        {
            context = new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.3.3.56], with the following kits:\n");
        }
        iterator = ((List) (obj1)).iterator();
_L8:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_343;
            }
            obj1 = (l)iterator.next();
            ((l) (obj1)).f.a(((b.a.a.a.p) (obj)).f);
            a(((d) (al)).f, ((l) (obj1)));
            ((l) (obj1)).t();
        } while (context == null);
        context.append(((l) (obj1)).b()).append(" [Version: ").append(((l) (obj1)).a()).append("]\n");
        if (true) goto _L8; else goto _L7
_L7:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        c();
        b/a/a/a/d;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static l a(Class class1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (l)a.f.get(class1);
        }
    }

    static Map a(Collection collection)
    {
        HashMap hashmap = new HashMap(collection.size());
        a(((Map) (hashmap)), collection);
        return hashmap;
    }

    static AtomicBoolean a(d d1)
    {
        return d1.n;
    }

    private static void a(Map map, l l1)
    {
        h h1 = (h)l1.getClass().getAnnotation(b/a/a/a/a/c/h);
        if (h1 != null)
        {
            Class aclass[] = h1.a();
            int j1 = aclass.length;
label0:
            for (int i1 = 0; i1 < j1; i1++)
            {
                Class class1 = aclass[i1];
                if (class1.isInterface())
                {
                    Iterator iterator = map.values().iterator();
                    do
                    {
                        l l2;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            l2 = (l)iterator.next();
                        } while (!class1.isAssignableFrom(l2.getClass()));
                        l1.f.a(l2.f);
                    } while (true);
                }
                if ((l)map.get(class1) == null)
                {
                    throw new r("Referenced Kit was null, does the kit exist?");
                }
                l1.f.a(((l)map.get(class1)).f);
            }

        }
    }

    private static void a(Map map, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            l l1 = (l)collection.next();
            map.put(l1.getClass(), l1);
            if (l1 instanceof m)
            {
                a(map, ((m)l1).c());
            }
        } while (true);
    }

    static i b(d d1)
    {
        return d1.i;
    }

    public static o c()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.c;
        }
    }

    public static boolean d()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.d;
        }
    }

    public final Activity a()
    {
        if (m != null)
        {
            return (Activity)m.get();
        } else
        {
            return null;
        }
    }

    public final d a(Activity activity)
    {
        m = new WeakReference(activity);
        return this;
    }

    public final ExecutorService b()
    {
        return g;
    }

}
