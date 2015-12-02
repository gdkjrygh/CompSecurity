// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import com.facebook.analytics.av;
import com.facebook.common.time.c;
import com.facebook.debug.log.b;
import com.google.common.a.hy;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.analytics.e:
//            i, j, f, h, 
//            d, b, g, c, 
//            e

public class a
    implements i
{

    private static final Class a = com/facebook/analytics/e/a;
    private final av b;
    private final ConcurrentMap c;
    private final String d = System.getProperty("scenario", null);
    private final Executor e;
    private final com.facebook.common.time.a f;
    private boolean g;
    private long h;
    private long i;
    private Boolean j;

    public a(av av1, Executor executor, com.facebook.common.time.a a1)
    {
        g = true;
        h = 0L;
        i = 0L;
        b = (av)Preconditions.checkNotNull(av1);
        e = (Executor)Preconditions.checkNotNull(executor);
        f = (com.facebook.common.time.a)Preconditions.checkNotNull(a1);
        c = (new hy()).a(25).a(300L, TimeUnit.SECONDS).n();
        try
        {
            av1 = (String)Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] {
                java/lang/String
            }).invoke(null, new Object[] {
                "persist.facebook.LogPerf"
            });
        }
        // Misplaced declaration of an exception variable
        catch (av av1)
        {
            av1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (av av1)
        {
            av1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (av av1)
        {
            av1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (av av1)
        {
            av1 = null;
        }
        if (av1 != null)
        {
            if (av1.equals("1"))
            {
                a(true);
            } else
            if (av1.equals("0"))
            {
                a(false);
                return;
            }
        }
    }

    private long a(long l)
    {
        long l1 = l;
        if (l == -1L)
        {
            l1 = f.a();
        }
        return l1;
    }

    static String a(a a1, String s, String s1)
    {
        return a1.a(s, s1);
    }

    private String a(j j1, String s)
    {
        return a(j1.a, s);
    }

    private String a(String s, String s1)
    {
        if (s1 == null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s1).append(":").append(s).toString();
        }
    }

    static ConcurrentMap a(a a1)
    {
        return a1.c;
    }

    static void a(a a1, j j1, h h1, long l, Map map)
    {
        a1.a(j1, h1, l, map);
    }

    static void a(a a1, j j1, String s, long l, boolean flag, Map map)
    {
        a1.a(j1, s, l, flag, map);
    }

    private void a(j j1, h h1, long l, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (j1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f f1 = new f(j1.a, j1.b, h1.toString(), j1.a(), l, d);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); f1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        break MISSING_BLOCK_LABEL_114;
        j1;
        throw j1;
        long l1;
        long l2;
        b.a(f1);
        l2 = f1.b();
        if (j1.b() == 0L)
        {
            j1.a(l2);
        }
        l1 = l2 - j1.b();
        j1.a(l2);
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        if (h1 == h.STOP)
        {
            map = new f(j1.a, j1.b, h.CLIENT_TTI.toString(), l1, l, d);
            b.a(map);
        }
_L4:
        if (!a() || !com.facebook.debug.log.b.b(3)) goto _L1; else goto _L5
_L5:
        if (h1 == h.STOP)
        {
            l = l1;
        } else
        {
            l = 0L;
        }
        com.facebook.debug.log.b.b(a, "Name: %s; Timestamp (ms): %d; Elapsed (ms): %d", new Object[] {
            j1.a, Long.valueOf(l2), Long.valueOf(l)
        });
          goto _L1
    }

    private void a(j j1, String s, long l, boolean flag, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        s = a(j1, s);
        if (c.containsKey(s)) goto _L2; else goto _L1
_L1:
        c.put(s, j1);
        a(j1, h.START, l, map);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        a((j)c.get(s), h.START, l, map);
        if (true) goto _L4; else goto _L3
_L3:
        j1;
        throw j1;
    }

    private void a(String s, String s1, long l, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        l = a(l);
        e.execute(new d(this, s, s1, l, map));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void a(String s, String s1, long l, boolean flag, Map map)
    {
        l = a(l);
        e.execute(new com.facebook.analytics.e.b(this, s, s1, flag, l, map));
    }

    private boolean b()
    {
        boolean flag1 = true;
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        long l = h;
        if (l != 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (i <= 0L)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        l = i;
_L5:
        Exception exception;
        if (l - h <= 2000L)
        {
            flag1 = false;
        }
        if (flag1) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i <= 0L) goto _L1; else goto _L4
_L4:
        j = Boolean.valueOf(flag1);
        flag = flag1;
          goto _L1
        exception;
        throw exception;
        l = com.facebook.common.time.c.b().a();
          goto _L5
        flag = j.booleanValue();
          goto _L1
    }

    static boolean b(a a1)
    {
        return a1.b();
    }

    public void a(g g1)
    {
        a(g1, false);
    }

    public void a(g g1, boolean flag)
    {
        long l = a(g1.d());
        if (!flag && g1.c() < 1.0D && !c.containsKey(a(g1.a(), g1.b())) && a(g1.c()))
        {
            return;
        } else
        {
            e.execute(new com.facebook.analytics.e.c(this, g1, flag, l));
            return;
        }
    }

    public void a(String s)
    {
        a(s, ((String) (null)), -1L, false, null);
    }

    public void a(String s, double d1)
    {
        this;
        JVM INSTR monitorenter ;
        a(s, null, d1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(String s, String s1, double d1)
    {
        this;
        JVM INSTR monitorenter ;
        long l = f.a();
        e.execute(new e(this, s, s1, d1, l));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        g = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected boolean a(double d1)
    {
        return Math.random() > d1;
    }

    public void b(g g1)
    {
        a(g1.a(), g1.b(), g1.e(), g1.j());
    }

    public void b(String s)
    {
        a(s, ((String) (null)), -1L, null);
    }

}
