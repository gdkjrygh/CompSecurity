// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.concurrency.d;
import io.fabric.sdk.android.services.concurrency.j;
import io.fabric.sdk.android.services.concurrency.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//            b, i, j, a, 
//            m, f, l, h, 
//            e

public class c
{

    static volatile c a;
    static final io.fabric.sdk.android.l b = new b();
    final io.fabric.sdk.android.l c;
    final boolean d;
    private final Context e;
    private final Map f;
    private final ExecutorService g;
    private final Handler h;
    private final f i;
    private final f j;
    private final n k;
    private a l;
    private WeakReference m;
    private AtomicBoolean n;

    c(Context context, Map map, j j1, Handler handler, io.fabric.sdk.android.l l1, boolean flag, f f1, 
            n n1)
    {
        e = context;
        f = map;
        g = j1;
        h = handler;
        c = l1;
        d = flag;
        i = f1;
        n = new AtomicBoolean(false);
        j = a(map.size());
        k = n1;
    }

    static c a()
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return a;
        }
    }

    public static transient c a(Context context, i ai[])
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        io/fabric/sdk/android/c;
        JVM INSTR monitorenter ;
    /* block-local class not found */
    class a {}

        if (a == null)
        {
            c((new a(context)).a(ai).a());
        }
        io/fabric/sdk/android/c;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        io/fabric/sdk/android/c;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static i a(Class class1)
    {
        return (i)a().f.get(class1);
    }

    static Map a(Collection collection)
    {
        return b(collection);
    }

    static AtomicBoolean a(c c1)
    {
        return c1.n;
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
            i i1 = (i)collection.next();
            map.put(i1.getClass(), i1);
            if (i1 instanceof io.fabric.sdk.android.j)
            {
                a(map, ((io.fabric.sdk.android.j)i1).getKits());
            }
        } while (true);
    }

    static f b(c c1)
    {
        return c1.i;
    }

    private static Map b(Collection collection)
    {
        HashMap hashmap = new HashMap(collection.size());
        a(hashmap, collection);
        return hashmap;
    }

    private Activity c(Context context)
    {
        if (context instanceof Activity)
        {
            return (Activity)context;
        } else
        {
            return null;
        }
    }

    private static void c(c c1)
    {
        a = c1;
        c1.j();
    }

    public static io.fabric.sdk.android.l h()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.c;
        }
    }

    public static boolean i()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.d;
        }
    }

    private void j()
    {
        a(c(e));
        l = new a(e);
        l.a(new _cls1());
        a(e);
    }

    public c a(Activity activity)
    {
        m = new WeakReference(activity);
        return this;
    }

    f a(int i1)
    {
        return new _cls2(i1);
    }

    void a(Context context)
    {
        Object obj = b(context);
        Object obj1 = g();
        obj = new m(((Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((m) (obj)).injectParameters(context, this, io.fabric.sdk.android.f.d, k);
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((i)iterator.next()).injectParameters(context, this, j, k)) { }
        ((m) (obj)).initialize();
        if (h().a("Fabric", 3))
        {
            context = (new StringBuilder("Initializing ")).append(d()).append(" [Version: ").append(c()).append("], with the following kits:\n");
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
            i i1 = (i)((Iterator) (obj1)).next();
            i1.initializationTask.a(((m) (obj)).initializationTask);
            a(f, i1);
            i1.initialize();
            if (context != null)
            {
                context.append(i1.getIdentifier()).append(" [Version: ").append(i1.getVersion()).append("]\n");
            }
        } while (true);
        if (context != null)
        {
            h().a("Fabric", context.toString());
        }
    }

    void a(Map map, i i1)
    {
        d d1 = (d)i1.getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/d);
        if (d1 != null)
        {
            Class aclass[] = d1.a();
            int l1 = aclass.length;
label0:
            for (int k1 = 0; k1 < l1; k1++)
            {
                Class class1 = aclass[k1];
                if (class1.isInterface())
                {
                    Iterator iterator = map.values().iterator();
                    do
                    {
                        i j1;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            j1 = (i)iterator.next();
                        } while (!class1.isAssignableFrom(j1.getClass()));
                        i1.initializationTask.a(j1.initializationTask);
                    } while (true);
                }
                if ((i)map.get(class1) == null)
                {
                    throw new l("Referenced Kit was null, does the kit exist?");
                }
                i1.initializationTask.a(((i)map.get(class1)).initializationTask);
            }

        }
    }

    public Activity b()
    {
        if (m != null)
        {
            return (Activity)m.get();
        } else
        {
            return null;
        }
    }

    Future b(Context context)
    {
        context = new e(context.getPackageCodePath());
        return f().submit(context);
    }

    public String c()
    {
        return "1.3.4.60";
    }

    public String d()
    {
        return "io.fabric.sdk.android:fabric";
    }

    public a e()
    {
        return l;
    }

    public ExecutorService f()
    {
        return g;
    }

    public Collection g()
    {
        return f.values();
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
