// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
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

public class gya
{

    private static volatile gya d;
    private static gyk e = new gxz();
    public final ExecutorService a;
    public gxw b;
    public WeakReference c;
    private final Context f;
    private final Map g;
    private final gye h;
    private final gye i;
    private final IdManager j;
    private AtomicBoolean k;
    private gyk l;

    private gya(Context context, Map map, gzz gzz1, gyk gyk1, gye gye1, IdManager idmanager)
    {
        f = context;
        g = map;
        a = gzz1;
        l = gyk1;
        h = gye1;
        k = new AtomicBoolean(false);
        i = new gye(map.size()) {

            private CountDownLatch b;
            private int c;
            private gya d;

            public final void a()
            {
                b.countDown();
                if (b.getCount() == 0L)
                {
                    gya.a(d).set(true);
                    gya.b(d).a();
                }
            }

            public final void a(Exception exception)
            {
                gya.b(d).a(exception);
            }

            
            {
                d = gya.this;
                c = i1;
                super();
                b = new CountDownLatch(c);
            }
        };
        j = idmanager;
    }

    public static transient gya a(Context context, gyh agyh[])
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        gya;
        JVM INSTR monitorenter ;
        gyb gyb1;
        if (d == null)
        {
            gyb1 = new gyb(context);
            if (gyb1.b != null)
            {
                throw new IllegalStateException("Kits already set.");
            }
            break MISSING_BLOCK_LABEL_47;
        }
          goto _L3
        context;
        gya;
        JVM INSTR monitorexit ;
        throw context;
        gyb1.b = agyh;
        if (gyb1.c == null)
        {
            gyb1.c = gzz.a();
        }
        if (gyb1.d == null)
        {
            gyb1.d = new Handler(Looper.getMainLooper());
        }
        if (gyb1.e == null)
        {
            gyb1.e = new gxz();
        }
        if (gyb1.f == null)
        {
            gyb1.f = gyb1.a.getPackageName();
        }
        if (gyb1.g == null)
        {
            gyb1.g = gye.a;
        }
        if (gyb1.b != null) goto _L5; else goto _L4
_L4:
        context = new HashMap();
_L6:
        agyh = new IdManager(gyb1.a, gyb1.f, context.values());
        agyh = new gya(gyb1.a, context, gyb1.c, gyb1.e, gyb1.g, agyh);
        d = agyh;
        context = ((gya) (agyh)).f;
        if (!(context instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        context = (Activity)context;
_L7:
        agyh.a(((Activity) (context)));
        agyh.b = new gxw(((gya) (agyh)).f);
        ((gya) (agyh)).b.a(agyh. new gxy() {

            private gya a;

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
                a = gya.this;
                super();
            }
        });
        agyh.a(((gya) (agyh)).f);
_L3:
        gya;
        JVM INSTR monitorexit ;
_L2:
        return d;
_L5:
        agyh = Arrays.asList(gyb1.b);
        context = new HashMap(agyh.size());
        a(((Map) (context)), ((Collection) (agyh)));
          goto _L6
        context = null;
          goto _L7
    }

    public static gyh a(Class class1)
    {
        if (d == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return (gyh)d.g.get(class1);
        }
    }

    public static gyk a()
    {
        if (d == null)
        {
            return e;
        } else
        {
            return d.l;
        }
    }

    static AtomicBoolean a(gya gya1)
    {
        return gya1.k;
    }

    private void a(Context context)
    {
        Object obj = new gyd(context.getPackageCodePath());
        obj = a.submit(((java.util.concurrent.Callable) (obj)));
        Object obj1 = g.values();
        obj = new gyl(((java.util.concurrent.Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((gyl) (obj)).a(context, this, gye.a, j);
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((gyh)iterator.next()).a(context, this, i, j)) { }
        ((gyl) (obj)).j();
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
            gyh gyh1 = (gyh)((Iterator) (obj1)).next();
            gyh1.j.a(((gyl) (obj)).j);
            a(g, gyh1);
            gyh1.j();
            if (context != null)
            {
                context.append(gyh1.b()).append(" [Version: ").append(gyh1.a()).append("]\n");
            }
        } while (true);
        if (context != null)
        {
            a().a("Fabric", context.toString());
        }
    }

    private static void a(Map map, gyh gyh1)
    {
        gzs gzs1 = (gzs)gyh1.getClass().getAnnotation(gzs);
        if (gzs1 != null)
        {
            Class aclass[] = gzs1.a();
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
                        gyh gyh2;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            gyh2 = (gyh)iterator.next();
                        } while (!class1.isAssignableFrom(gyh2.getClass()));
                        gyh1.j.a(gyh2.j);
                    } while (true);
                }
                if ((gyh)map.get(class1) == null)
                {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
                gyh1.j.a(((gyh)map.get(class1)).j);
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
            gyh gyh1 = (gyh)collection.next();
            map.put(gyh1.getClass(), gyh1);
            if (gyh1 instanceof gyi)
            {
                a(map, ((gyi)gyh1).c());
            }
        } while (true);
    }

    static gye b(gya gya1)
    {
        return gya1.h;
    }

    public static boolean b()
    {
        if (d == null)
        {
            return false;
        } else
        {
            gya gya1 = d;
            return false;
        }
    }

    public static boolean c()
    {
        return d != null && d.k.get();
    }

    public final gya a(Activity activity)
    {
        c = new WeakReference(activity);
        return this;
    }

}
