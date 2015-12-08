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
//            c, f, i, a, 
//            e, l, h, p, 
//            o, k, m

public class d
{
    public static final class a
    {

        final Context a;
        l b[];
        p c;
        Handler d;
        o e;
        boolean f;
        String g;
        String h;
        i i;

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
    public final ExecutorService c;
    public b.a.a.a.a d;
    public WeakReference e;
    final o f;
    final boolean g;
    private final Context h;
    private final Map i;
    private final Handler j;
    private final i k;
    private final i l;
    private final t m;
    private AtomicBoolean n;

    private d(Context context, Map map, p p1, Handler handler, o o1, boolean flag, i i1, 
            t t1)
    {
        h = context;
        i = map;
        c = p1;
        j = handler;
        f = o1;
        g = flag;
        k = i1;
        n = new AtomicBoolean(false);
        l = new f(this, map.size());
        m = t1;
    }

    public static transient d a(Context context, l al[])
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        b/a/a/a/d;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a1 = new a(context);
            if (a1.b != null)
            {
                throw new IllegalStateException("Kits already set.");
            }
            break MISSING_BLOCK_LABEL_47;
        }
          goto _L3
        context;
        b/a/a/a/d;
        JVM INSTR monitorexit ;
        throw context;
        a1.b = al;
        if (a1.c == null)
        {
            a1.c = p.a();
        }
        if (a1.d == null)
        {
            a1.d = new Handler(Looper.getMainLooper());
        }
        if (a1.e != null) goto _L5; else goto _L4
_L4:
        if (!a1.f) goto _L7; else goto _L6
_L6:
        a1.e = new c();
_L5:
        if (a1.h == null)
        {
            a1.h = a1.a.getPackageName();
        }
        if (a1.i == null)
        {
            a1.i = i.d;
        }
        if (a1.b != null) goto _L9; else goto _L8
_L8:
        context = new HashMap();
_L10:
        al = new t(a1.a, a1.h, a1.g, context.values());
        al = new d(a1.a, context, a1.c, a1.d, a1.e, a1.f, a1.i, al);
        a = al;
        context = ((d) (al)).h;
        if (!(context instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_337;
        }
        context = (Activity)context;
_L11:
        al.a(((Activity) (context)));
        al.d = new b.a.a.a.a(((d) (al)).h);
        ((d) (al)).d.a(new e(al));
        al.a(((d) (al)).h);
_L3:
        b/a/a/a/d;
        JVM INSTR monitorexit ;
_L2:
        return a;
_L7:
        a1.e = new c((byte)0);
          goto _L5
_L9:
        al = Arrays.asList(a1.b);
        context = new HashMap(al.size());
        a(((Map) (context)), ((Collection) (al)));
          goto _L10
        context = null;
          goto _L11
    }

    public static l a(Class class1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (l)a.i.get(class1);
        }
    }

    public static o a()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.f;
        }
    }

    static AtomicBoolean a(d d1)
    {
        return d1.n;
    }

    private void a(Context context)
    {
        Object obj = new b.a.a.a.h(context.getPackageCodePath());
        obj = c.submit(((java.util.concurrent.Callable) (obj)));
        Object obj1 = i.values();
        obj = new b.a.a.a.p(((java.util.concurrent.Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((b.a.a.a.p) (obj)).a(context, this, i.d, m);
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((l)iterator.next()).a(context, this, l, m)) { }
        ((b.a.a.a.p) (obj)).k();
        if (a().a(3))
        {
            context = new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.3.6.79], with the following kits:\n");
        } else
        {
            context = null;
        }
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            l l1 = (l)((Iterator) (obj1)).next();
            l1.m.a(((b.a.a.a.p) (obj)).m);
            a(i, l1);
            l1.k();
            if (context != null)
            {
                context.append(l1.b()).append(" [Version: ").append(l1.a()).append("]\n");
            }
        } while (true);
        if (context != null)
        {
            a();
        }
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
                        l1.m.a(l2.m);
                    } while (true);
                }
                if ((l)map.get(class1) == null)
                {
                    throw new r("Referenced Kit was null, does the kit exist?");
                }
                l1.m.a(((l)map.get(class1)).m);
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
        return d1.k;
    }

    public static boolean b()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.g;
        }
    }

    public static boolean c()
    {
        return a != null && a.n.get();
    }

    public final d a(Activity activity)
    {
        e = new WeakReference(activity);
        return this;
    }

}
