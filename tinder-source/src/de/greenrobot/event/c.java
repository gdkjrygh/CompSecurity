// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            d, e, b, a, 
//            k, l, j, i, 
//            EventBusException, ThreadMode, g, h, 
//            f

public final class c
{
    static final class a
    {

        final List a = new ArrayList();
        boolean b;
        boolean c;
        l d;
        Object e;
        boolean f;

        a()
        {
        }
    }


    public static String a = "Event";
    private static final d c = new d();
    private static final Map d = new HashMap();
    final ExecutorService b;
    private final Map e;
    private final Map f;
    private final Map g;
    private final ThreadLocal h;
    private final e i;
    private final b j;
    private final de.greenrobot.event.a k;
    private final k l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;

    public c()
    {
        this(c);
    }

    public c(d d1)
    {
        h = new ThreadLocal() {

            final c a;

            protected final Object initialValue()
            {
                return new a();
            }

            
            {
                a = c.this;
                super();
            }
        };
        e = new HashMap();
        f = new HashMap();
        g = new ConcurrentHashMap();
        i = new e(this, Looper.getMainLooper());
        j = new b(this);
        k = new de.greenrobot.event.a(this);
        l = new k(d1.h);
        n = d1.a;
        o = d1.b;
        p = d1.c;
        q = d1.d;
        m = d1.e;
        r = d1.f;
        b = d1.g;
    }

    public static d a()
    {
        return new d();
    }

    private static List a(Class class1)
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        Object obj1 = (List)d.get(class1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj1 = new ArrayList();
        obj = class1;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        ((List) (obj1)).add(obj);
        a(((List) (obj1)), ((Class) (obj)).getInterfaces());
        obj = ((Class) (obj)).getSuperclass();
          goto _L1
        d.put(class1, obj1);
        obj = obj1;
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    private void a(l l1, Object obj)
    {
        l1.b.a.invoke(l1.a, new Object[] {
            obj
        });
_L1:
        return;
        InvocationTargetException invocationtargetexception;
        invocationtargetexception;
        Throwable throwable = invocationtargetexception.getCause();
        if (obj instanceof i)
        {
            if (n)
            {
                Log.e(a, (new StringBuilder("SubscriberExceptionEvent subscriber ")).append(l1.a.getClass()).append(" threw an exception").toString(), throwable);
                l1 = (i)obj;
                Log.e(a, (new StringBuilder("Initial event ")).append(((i) (l1)).c).append(" caused exception in ").append(((i) (l1)).d).toString(), ((i) (l1)).b);
                return;
            }
        } else
        {
            if (m)
            {
                throw new EventBusException("Invoking subscriber failed", throwable);
            }
            if (n)
            {
                Log.e(a, (new StringBuilder("Could not dispatch event: ")).append(obj.getClass()).append(" to subscribing class ").append(l1.a.getClass()).toString(), throwable);
            }
            if (p)
            {
                c(new i(this, throwable, obj, l1.a));
                return;
            }
        }
          goto _L1
        l1;
        throw new IllegalStateException("Unexpected exception", l1);
    }

    private void a(l l1, Object obj, boolean flag)
    {
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ThreadMode.values().length];
                try
                {
                    a[ThreadMode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ThreadMode.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ThreadMode.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ThreadMode.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[l1.b.b.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 75
    //                   2 82
    //                   3 165
    //                   4 239;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalStateException((new StringBuilder("Unknown thread mode: ")).append(l1.b.b).toString());
_L2:
        a(l1, obj);
        return;
_L3:
        Object obj1;
        if (flag)
        {
            a(l1, obj);
            return;
        }
        obj1 = i;
        l1 = de.greenrobot.event.g.a(l1, obj);
        obj1;
        JVM INSTR monitorenter ;
        ((e) (obj1)).a.a(l1);
        if (!((e) (obj1)).b)
        {
            obj1.b = true;
            if (!((e) (obj1)).sendMessage(((e) (obj1)).obtainMessage()))
            {
                throw new EventBusException("Could not send handler message");
            }
        }
          goto _L6
        l1;
        obj1;
        JVM INSTR monitorexit ;
        throw l1;
_L6:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!flag) goto _L8; else goto _L7
_L7:
        obj1 = j;
        l1 = de.greenrobot.event.g.a(l1, obj);
        obj1;
        JVM INSTR monitorenter ;
        ((b) (obj1)).a.a(l1);
        if (!((b) (obj1)).c)
        {
            obj1.c = true;
            ((b) (obj1)).b.b.execute(((Runnable) (obj1)));
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        l1;
        obj1;
        JVM INSTR monitorexit ;
        throw l1;
_L8:
        a(l1, obj);
        return;
_L5:
        de.greenrobot.event.a a1 = k;
        l1 = de.greenrobot.event.g.a(l1, obj);
        a1.a.a(l1);
        a1.b.b.execute(a1);
        return;
    }

    private static void a(List list, Class aclass[])
    {
        int j1 = aclass.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Class class1 = aclass[i1];
            if (!list.contains(class1))
            {
                list.add(class1);
                a(list, class1.getInterfaces());
            }
        }

    }

    private boolean a(Object obj, a a1, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        class1 = (CopyOnWriteArrayList)e.get(class1);
        this;
        JVM INSTR monitorexit ;
        if (class1 == null || class1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        class1 = class1.iterator();
_L2:
        l l1;
        if (!class1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = (l)class1.next();
        a1.e = obj;
        a1.d = l1;
        boolean flag;
        a(l1, obj, a1.c);
        flag = a1.f;
        a1.e = null;
        a1.d = null;
        a1.f = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        return true;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a1.e = null;
        a1.d = null;
        a1.f = false;
        throw obj;
        return false;
    }

    final void a(g g1)
    {
        Object obj = g1.a;
        l l1 = g1.b;
        de.greenrobot.event.g.a(g1);
        if (l1.d)
        {
            a(l1, obj);
        }
    }

    public final void a(Object obj, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = l.a(obj.getClass()).iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Class class1;
        l l1;
        j j1 = (j)iterator.next();
        class1 = j1.c;
        obj1 = (CopyOnWriteArrayList)e.get(class1);
        l1 = new l(obj, j1);
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj1 = new CopyOnWriteArrayList();
        e.put(class1, obj1);
_L6:
        int k1 = ((CopyOnWriteArrayList) (obj1)).size();
        boolean flag1;
        Object obj2;
        for (int i1 = 0; i1 > k1; i1++)
        {
            break MISSING_BLOCK_LABEL_152;
        }

        if (i1 == k1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (l1.c <= ((l)((CopyOnWriteArrayList) (obj1)).get(i1)).c)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        ((CopyOnWriteArrayList) (obj1)).add(i1, l1);
        obj2 = (List)f.get(obj);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        obj1 = new ArrayList();
        f.put(obj, obj1);
        ((List) (obj1)).add(class1);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        synchronized (g)
        {
            obj2 = g.get(class1);
        }
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(l1, obj2, flag1);
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
_L4:
        if (!((CopyOnWriteArrayList) (obj1)).contains(l1)) goto _L6; else goto _L5
_L5:
        throw new EventBusException((new StringBuilder("Subscriber ")).append(obj.getClass()).append(" already registered to event ").append(class1).toString());
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f.containsKey(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public final void b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = (List)f.get(obj);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj1)).iterator();
_L12:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2;
        obj2 = (Class)((Iterator) (obj1)).next();
        obj2 = (List)e.get(obj2);
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = ((List) (obj2)).size();
        int j1 = 0;
_L10:
        if (j1 >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        l l1 = (l)((List) (obj2)).get(j1);
        if (l1.a != obj) goto _L6; else goto _L5
_L5:
        l1.d = false;
        ((List) (obj2)).remove(j1);
        j1--;
        i1--;
          goto _L6
_L4:
        f.remove(obj);
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(a, (new StringBuilder("Subscriber to unregister was not registered before: ")).append(obj.getClass()).toString());
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        throw obj;
_L6:
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void c(Object obj)
    {
        a a1;
        List list;
        a1 = (a)h.get();
        list = a1.a;
        list.add(obj);
        if (a1.b)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        boolean flag;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.c = flag;
        a1.b = true;
        if (a1.f)
        {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
          goto _L1
_L8:
        boolean flag1;
        if (flag1) goto _L1; else goto _L2
_L2:
        Class class1;
        if (o)
        {
            Log.d(a, (new StringBuilder("No subscribers registered for event ")).append(class1).toString());
        }
        if (!q || class1 == de/greenrobot/event/f || class1 == de/greenrobot/event/i) goto _L1; else goto _L3
_L3:
        c(new f(this, obj));
_L1:
        if (list.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = list.remove(0);
        class1 = obj.getClass();
        if (!r) goto _L5; else goto _L4
_L4:
        List list1;
        int j1;
        list1 = a(class1);
        j1 = list1.size();
        int i1;
        i1 = 0;
        flag1 = false;
_L6:
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 |= a(obj, a1, (Class)list1.get(i1));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        flag1 = a(obj, a1, class1);
        if (true) goto _L8; else goto _L7
_L7:
        a1.b = false;
        a1.c = false;
        return;
        obj;
        a1.b = false;
        a1.c = false;
        throw obj;
    }

    public final void d(Object obj)
    {
        synchronized (g)
        {
            g.put(obj.getClass(), obj);
        }
        c(obj);
        return;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final boolean e(Object obj)
    {
        Map map = g;
        map;
        JVM INSTR monitorenter ;
        Class class1 = obj.getClass();
        if (!obj.equals(g.get(class1)))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        g.remove(class1);
        return true;
        map;
        JVM INSTR monitorexit ;
        return false;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

}
