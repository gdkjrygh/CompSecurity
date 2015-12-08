// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
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
//            DefaultLogger, Kit, KitGroup, ActivityLifecycleManager, 
//            Onboarding, InitializationCallback, Logger, InitializationTask

public class Fabric
{

    static volatile Fabric a;
    static final Logger b = new DefaultLogger();
    final Logger c;
    final boolean d;
    private final Context e;
    private final Map f;
    private final ExecutorService g;
    private final Handler h;
    private final InitializationCallback i;
    private final InitializationCallback j;
    private final IdManager k;
    private ActivityLifecycleManager l;
    private WeakReference m;
    private AtomicBoolean n;

    Fabric(Context context, Map map, PriorityThreadPoolExecutor prioritythreadpoolexecutor, Handler handler, Logger logger, boolean flag, InitializationCallback initializationcallback, 
            IdManager idmanager)
    {
        e = context;
        f = map;
        g = prioritythreadpoolexecutor;
        h = handler;
        c = logger;
        d = flag;
        i = initializationcallback;
        n = new AtomicBoolean(false);
        j = a(map.size());
        k = idmanager;
    }

    static Fabric a()
    {
        if (a == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return a;
        }
    }

    public static transient Fabric a(Context context, Kit akit[])
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            c((new Builder(context)).a(akit).a());
        }
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static Kit a(Class class1)
    {
        return (Kit)a().f.get(class1);
    }

    static Map a(Collection collection)
    {
        return b(collection);
    }

    static AtomicBoolean a(Fabric fabric)
    {
        return fabric.n;
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
            Kit kit = (Kit)collection.next();
            map.put(kit.getClass(), kit);
            if (kit instanceof KitGroup)
            {
                a(map, ((KitGroup)kit).e());
            }
        } while (true);
    }

    private Activity b(Context context)
    {
        if (context instanceof Activity)
        {
            return (Activity)context;
        } else
        {
            return null;
        }
    }

    static InitializationCallback b(Fabric fabric)
    {
        return fabric.i;
    }

    private static Map b(Collection collection)
    {
        HashMap hashmap = new HashMap(collection.size());
        a(hashmap, collection);
        return hashmap;
    }

    private static void c(Fabric fabric)
    {
        a = fabric;
        fabric.i();
    }

    public static Logger g()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.c;
        }
    }

    public static boolean h()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.d;
        }
    }

    private void i()
    {
        a(b(e));
        l = new ActivityLifecycleManager(e);
        l.a(new ActivityLifecycleManager.Callbacks() {

            final Fabric a;

            public void a(Activity activity)
            {
                a.a(activity);
            }

            public void a(Activity activity, Bundle bundle)
            {
                a.a(activity);
            }

            public void b(Activity activity)
            {
                a.a(activity);
            }

            
            {
                a = Fabric.this;
                super();
            }
        });
        a(e);
    }

    public Fabric a(Activity activity)
    {
        m = new WeakReference(activity);
        return this;
    }

    InitializationCallback a(int i1)
    {
        return new InitializationCallback(i1) {

            final CountDownLatch a;
            final int b;
            final Fabric c;

            public void a(Exception exception)
            {
                Fabric.b(c).a(exception);
            }

            public void a(Object obj)
            {
                a.countDown();
                if (a.getCount() == 0L)
                {
                    Fabric.a(c).set(true);
                    Fabric.b(c).a(c);
                }
            }

            
            {
                c = Fabric.this;
                b = i1;
                super();
                a = new CountDownLatch(b);
            }
        };
    }

    void a(Context context)
    {
        Object obj = f();
        Onboarding onboarding = new Onboarding(((Collection) (obj)));
        obj = new ArrayList(((Collection) (obj)));
        Collections.sort(((List) (obj)));
        onboarding.a(context, this, InitializationCallback.d, k);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((Kit)iterator.next()).a(context, this, j, k)) { }
        onboarding.A();
        if (g().a("Fabric", 3))
        {
            context = (new StringBuilder("Initializing ")).append(d()).append(" [Version: ").append(c()).append("], with the following kits:\n");
        } else
        {
            context = null;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Kit kit = (Kit)((Iterator) (obj)).next();
            kit.c.a(onboarding.c);
            a(f, kit);
            kit.A();
            if (context != null)
            {
                context.append(kit.c()).append(" [Version: ").append(kit.d()).append("]\n");
            }
        } while (true);
        if (context != null)
        {
            g().a("Fabric", context.toString());
        }
    }

    void a(Map map, Kit kit)
    {
        DependsOn dependson = (DependsOn)kit.getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
        if (dependson != null)
        {
            Class aclass[] = dependson.a();
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
                        Kit kit1;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            kit1 = (Kit)iterator.next();
                        } while (!class1.isAssignableFrom(kit1.getClass()));
                        kit.c.a(kit1.c);
                    } while (true);
                }
                if ((Kit)map.get(class1) == null)
                {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
                kit.c.a(((Kit)map.get(class1)).c);
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

    public String c()
    {
        return "1.3.1.42";
    }

    public String d()
    {
        return "io.fabric.sdk.android:fabric";
    }

    public ExecutorService e()
    {
        return g;
    }

    public Collection f()
    {
        return f.values();
    }


    private class Builder
    {

        private final Context a;
        private Kit b[];
        private PriorityThreadPoolExecutor c;
        private Handler d;
        private Logger e;
        private boolean f;
        private String g;
        private String h;
        private InitializationCallback i;

        public transient Builder a(Kit akit[])
        {
            if (akit == null)
            {
                throw new IllegalArgumentException("Kits must not be null.");
            }
            if (akit.length == 0)
            {
                throw new IllegalArgumentException("Kits must not be empty.");
            }
            if (b != null)
            {
                throw new IllegalStateException("Kits already set.");
            } else
            {
                b = akit;
                return this;
            }
        }

        public Fabric a()
        {
            if (b == null)
            {
                throw new IllegalStateException("Kits must not be null.");
            }
            if (c == null)
            {
                c = PriorityThreadPoolExecutor.a();
            }
            if (d == null)
            {
                d = new Handler(Looper.getMainLooper());
            }
            Map map;
            IdManager idmanager;
            if (e == null)
            {
                if (f)
                {
                    e = new DefaultLogger(3);
                } else
                {
                    e = new DefaultLogger();
                }
            }
            if (h == null)
            {
                h = a.getPackageName();
            }
            if (i == null)
            {
                i = InitializationCallback.d;
            }
            map = Fabric.a(Arrays.asList(b));
            idmanager = new IdManager(a, h, g, map.values());
            return new Fabric(a, map, c, d, e, f, i, idmanager);
        }

        public Builder(Context context)
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

}
