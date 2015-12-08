// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import b.a.a.a.a.b.x;
import b.a.a.a.a.c.n;
import b.a.a.a.a.c.w;
import b.a.a.a.a.c.z;
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

// Referenced classes of package b.a.a.a:
//            e, h, i, a, 
//            g, r, k, o, 
//            q, n, p

public class f
{

    static volatile f a;
    static final q b = new e((byte)0);
    final q c;
    final boolean d;
    private final Context e;
    private final Map f;
    private final ExecutorService g;
    private final Handler h;
    private final k i;
    private final k j;
    private final x k;
    private a l;
    private WeakReference m;
    private AtomicBoolean n;

    f(Context context, Map map, w w, Handler handler, q q1, boolean flag, k k1, 
            x x)
    {
        e = context;
        f = map;
        g = w;
        h = handler;
        c = q1;
        d = flag;
        i = k1;
        n = new AtomicBoolean(false);
        j = new h(this, map.size());
        k = x;
    }

    public static transient f a(Context context, o ao[])
    {
        Iterator iterator = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        b/a/a/a/f;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        ao = (new i(context)).a(ao).a();
        a = ao;
        context = ((f) (ao)).e;
        if (!(context instanceof Activity)) goto _L4; else goto _L3
_L3:
        context = (Activity)context;
_L6:
        r r1;
        Object obj;
        ao.a(((Activity) (context)));
        ao.l = new a(((f) (ao)).e);
        ((f) (ao)).l.a(new g(ao));
        context = ((f) (ao)).e;
        obj = ((f) (ao)).f.values();
        r1 = new r(((Collection) (obj)));
        obj = new ArrayList(((Collection) (obj)));
        Collections.sort(((List) (obj)));
        r1.a(context, ao, k.d, ((f) (ao)).k);
        for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); ((o)iterator1.next()).a(context, ao, ((f) (ao)).j, ((f) (ao)).k)) { }
        break MISSING_BLOCK_LABEL_202;
        context;
        b/a/a/a/f;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
        r1.u();
        context = iterator;
        if (c().a(3))
        {
            context = new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.3.1.42], with the following kits:\n");
        }
        iterator = ((List) (obj)).iterator();
_L8:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_319;
            }
            obj = (o)iterator.next();
            ((o) (obj)).c.a(r1.c);
            a(((f) (ao)).f, ((o) (obj)));
            ((o) (obj)).u();
        } while (context == null);
        context.append(((o) (obj)).c()).append(" [Version: ").append(((o) (obj)).d()).append("]\n");
        if (true) goto _L8; else goto _L7
_L7:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        c().a("Fabric", context.toString());
        b/a/a/a/f;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static o a(Class class1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (o)a.f.get(class1);
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

    private static void a(Map map, o o1)
    {
        n n1 = (n)o1.getClass().getAnnotation(b/a/a/a/a/c/n);
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
                        o o2;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            o2 = (o)iterator.next();
                        } while (!class1.isAssignableFrom(o2.getClass()));
                        o1.c.a(o2.c);
                    } while (true);
                }
                if ((o)map.get(class1) == null)
                {
                    throw new z("Referenced Kit was null, does the kit exist?");
                }
                o1.c.a(((o)map.get(class1)).c);
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
            o o1 = (o)collection.next();
            map.put(o1.getClass(), o1);
            if (o1 instanceof p)
            {
                a(map, ((p)o1).e());
            }
        } while (true);
    }

    static k b(f f1)
    {
        return f1.i;
    }

    public static q c()
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

    public final f a(Activity activity)
    {
        m = new WeakReference(activity);
        return this;
    }

    public final ExecutorService b()
    {
        return g;
    }

}
