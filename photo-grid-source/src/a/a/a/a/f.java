// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.x;
import a.a.a.a.a.c.n;
import a.a.a.a.a.c.w;
import a.a.a.a.a.c.z;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package a.a.a.a:
//            e, h, i, a, 
//            g, k, t, l, 
//            p, s, o, q

public class f
{

    static volatile f a;
    static final s b = new e((byte)0);
    final s c;
    final boolean d;
    private final Context e;
    private final Map f;
    private final ExecutorService g;
    private final Handler h;
    private final l i;
    private final l j;
    private final x k;
    private a l;
    private WeakReference m;
    private AtomicBoolean n;

    f(Context context, Map map, w w, Handler handler, s s1, boolean flag, l l1, 
            x x)
    {
        e = context;
        f = map;
        g = w;
        h = handler;
        c = s1;
        d = flag;
        i = l1;
        n = new AtomicBoolean(false);
        j = new h(this, map.size());
        k = x;
    }

    public static transient f a(Context context, p ap[])
    {
        Iterator iterator = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        a/a/a/a/f;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        ap = (new i(context)).a(ap).a();
        a = ap;
        context = ((f) (ap)).e;
        if (!(context instanceof Activity)) goto _L4; else goto _L3
_L3:
        context = (Activity)context;
_L6:
        Object obj;
        Object obj1;
        ap.a(((Activity) (context)));
        ap.l = new a(((f) (ap)).e);
        ((f) (ap)).l.a(new g(ap));
        context = ((f) (ap)).e;
        obj = new k(context.getPackageCodePath());
        obj = ((f) (ap)).g.submit(((java.util.concurrent.Callable) (obj)));
        obj1 = ((f) (ap)).f.values();
        obj = new t(((java.util.concurrent.Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((t) (obj)).a(context, ap, l.d, ((f) (ap)).k);
        for (Iterator iterator1 = ((List) (obj1)).iterator(); iterator1.hasNext(); ((p)iterator1.next()).a(context, ap, ((f) (ap)).j, ((f) (ap)).k)) { }
        break MISSING_BLOCK_LABEL_226;
        context;
        a/a/a/a/f;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
        ((t) (obj)).t();
        context = iterator;
        if (d().a(3))
        {
            context = new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.3.6.79], with the following kits:\n");
        }
        iterator = ((List) (obj1)).iterator();
_L8:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_343;
            }
            obj1 = (p)iterator.next();
            ((p) (obj1)).f.a(((t) (obj)).f);
            a(((f) (ap)).f, ((p) (obj1)));
            ((p) (obj1)).t();
        } while (context == null);
        context.append(((p) (obj1)).b()).append(" [Version: ").append(((p) (obj1)).a()).append("]\n");
        if (true) goto _L8; else goto _L7
_L7:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        d();
        a/a/a/a/f;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static p a(Class class1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (p)a.f.get(class1);
        }
    }

    static Map a(Collection collection)
    {
        HashMap hashmap = new HashMap(collection.size());
        a(((Map) (hashmap)), collection);
        return hashmap;
    }

    static AtomicBoolean a(f f1)
    {
        return f1.n;
    }

    private static void a(Map map, p p1)
    {
        n n1 = (n)p1.getClass().getAnnotation(a/a/a/a/a/c/n);
        if (n1 != null)
        {
            Class aclass[] = n1.a();
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
                        p p2;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            p2 = (p)iterator.next();
                        } while (!class1.isAssignableFrom(p2.getClass()));
                        p1.f.a(p2.f);
                    } while (true);
                }
                if ((p)map.get(class1) == null)
                {
                    throw new z("Referenced Kit was null, does the kit exist?");
                }
                p1.f.a(((p)map.get(class1)).f);
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
            p p1 = (p)collection.next();
            map.put(p1.getClass(), p1);
            if (p1 instanceof q)
            {
                a(map, ((q)p1).c());
            }
        } while (true);
    }

    static l b(f f1)
    {
        return f1.i;
    }

    public static s d()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.c;
        }
    }

    public static boolean e()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.d;
        }
    }

    public final f a(Activity activity)
    {
        m = new WeakReference(activity);
        return this;
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

    public final a b()
    {
        return l;
    }

    public final ExecutorService c()
    {
        return g;
    }

}
