// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.concurrency.b;
import io.fabric.sdk.android.services.concurrency.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//            b, f, a, h, 
//            e, l, k, g, 
//            i

public class c
{
    public static final class a
    {

        final Context a;
        io.fabric.sdk.android.h b[];
        h c;
        Handler d;
        k e;
        boolean f;
        String g;
        String h;
        f i;

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


    static volatile c a;
    static final k b = new io.fabric.sdk.android.b((byte)0);
    public final ExecutorService c;
    public io.fabric.sdk.android.a d;
    public WeakReference e;
    final k f;
    final boolean g;
    private final Context h;
    private final Map i;
    private final Handler j;
    private final f k;
    private final f l;
    private final IdManager m;
    private AtomicBoolean n;

    private c(Context context, Map map, h h1, Handler handler, k k1, boolean flag, f f1, 
            IdManager idmanager)
    {
        h = context;
        i = map;
        c = h1;
        j = handler;
        f = k1;
        g = flag;
        k = f1;
        n = new AtomicBoolean(false);
        l = new f(map.size()) {

            final CountDownLatch a;
            final int b;
            final c c;

            public final void a()
            {
                a.countDown();
                if (a.getCount() == 0L)
                {
                    c.a(c).set(true);
                    io.fabric.sdk.android.c.b(c).a();
                }
            }

            public final void a(Exception exception)
            {
                io.fabric.sdk.android.c.b(c).a(exception);
            }

            
            {
                c = c.this;
                b = i1;
                super();
                a = new CountDownLatch(b);
            }
        };
        m = idmanager;
    }

    public static transient c a(Context context, io.fabric.sdk.android.h ah[])
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        io/fabric/sdk/android/c;
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
        io/fabric/sdk/android/c;
        JVM INSTR monitorexit ;
        throw context;
        a1.b = ah;
        if (a1.c == null)
        {
            a1.c = io.fabric.sdk.android.services.concurrency.h.a();
        }
        if (a1.d == null)
        {
            a1.d = new Handler(Looper.getMainLooper());
        }
        if (a1.e != null) goto _L5; else goto _L4
_L4:
        if (!a1.f) goto _L7; else goto _L6
_L6:
        a1.e = new io.fabric.sdk.android.b();
_L5:
        if (a1.h == null)
        {
            a1.h = a1.a.getPackageName();
        }
        if (a1.i == null)
        {
            a1.i = f.d;
        }
        if (a1.b != null) goto _L9; else goto _L8
_L8:
        context = new HashMap();
_L10:
        ah = new IdManager(a1.a, a1.h, a1.g, context.values());
        ah = new c(a1.a, context, a1.c, a1.d, a1.e, a1.f, a1.i, ah);
        a = ah;
        context = ((c) (ah)).h;
        if (!(context instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_337;
        }
        context = (Activity)context;
_L11:
        ah.a(((Activity) (context)));
        ah.d = new io.fabric.sdk.android.a(((c) (ah)).h);
        ((c) (ah)).d.a(ah. new a.b() {

            final c a;

            public final void a(Activity activity)
            {
                a.a(activity);
            }

            public final void b(Activity activity)
            {
                a.a(activity);
            }

            public final void c(Activity activity)
            {
                a.a(activity);
            }

            
            {
                a = c.this;
                super();
            }
        });
        ah.a(((c) (ah)).h);
_L3:
        io/fabric/sdk/android/c;
        JVM INSTR monitorexit ;
_L2:
        return a;
_L7:
        a1.e = new io.fabric.sdk.android.b((byte)0);
          goto _L5
_L9:
        ah = Arrays.asList(a1.b);
        context = new HashMap(ah.size());
        a(((Map) (context)), ((Collection) (ah)));
          goto _L10
        context = null;
          goto _L11
    }

    public static io.fabric.sdk.android.h a(Class class1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (io.fabric.sdk.android.h)a.i.get(class1);
        }
    }

    public static k a()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.f;
        }
    }

    static AtomicBoolean a(c c1)
    {
        return c1.n;
    }

    private void a(Context context)
    {
        Object obj = new e(context.getPackageCodePath());
        obj = c.submit(((java.util.concurrent.Callable) (obj)));
        Object obj1 = i.values();
        obj = new l(((java.util.concurrent.Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((l) (obj)).a(context, this, f.d, m);
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((io.fabric.sdk.android.h)iterator.next()).a(context, this, l, m)) { }
        ((l) (obj)).j();
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
            io.fabric.sdk.android.h h1 = (io.fabric.sdk.android.h)((Iterator) (obj1)).next();
            h1.m.a(((l) (obj)).m);
            a(i, h1);
            h1.j();
            if (context != null)
            {
                context.append(h1.b()).append(" [Version: ").append(h1.a()).append("]\n");
            }
        } while (true);
        if (context != null)
        {
            a().a("Fabric", context.toString());
        }
    }

    private static void a(Map map, io.fabric.sdk.android.h h1)
    {
        b b1 = (b)h1.getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/b);
        if (b1 != null)
        {
            Class aclass[] = b1.a();
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
                        io.fabric.sdk.android.h h2;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            h2 = (io.fabric.sdk.android.h)iterator.next();
                        } while (!class1.isAssignableFrom(h2.getClass()));
                        h1.m.a(h2.m);
                    } while (true);
                }
                if ((io.fabric.sdk.android.h)map.get(class1) == null)
                {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
                h1.m.a(((io.fabric.sdk.android.h)map.get(class1)).m);
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
            io.fabric.sdk.android.h h1 = (io.fabric.sdk.android.h)collection.next();
            map.put(h1.getClass(), h1);
            if (h1 instanceof i)
            {
                a(map, ((i)h1).c());
            }
        } while (true);
    }

    static f b(c c1)
    {
        return c1.k;
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

    public final c a(Activity activity)
    {
        e = new WeakReference(activity);
        return this;
    }

}
