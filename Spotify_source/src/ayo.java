// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public final class ayo
    implements ayx
{

    private final bda a;
    private final List b;
    private final HashMap c;
    private int d;
    private long e;
    private int f;
    private boolean g;
    private boolean h;

    public ayo(bda bda1)
    {
        this(bda1, (byte)0);
    }

    private ayo(bda bda1, byte byte0)
    {
        this(bda1, '\0');
    }

    private ayo(bda bda1, char c1)
    {
        a = bda1;
        b = new ArrayList();
        c = new HashMap();
    }

    private void c()
    {
        boolean flag1;
        boolean flag2 = false;
        int k = f;
        int i = 0;
        boolean flag = false;
        flag1 = false;
        while (i < b.size()) 
        {
            ayp ayp1 = (ayp)c.get(b.get(i));
            boolean flag3 = flag1 | ayp1.c;
            if (ayp1.d != -1L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            k = Math.max(k, ayp1.b);
            i++;
            flag1 = flag3;
        }
        bdm bdm1;
        long l;
        boolean flag4;
        if (!b.isEmpty() && (flag1 || flag) && (k == 2 || k == 1 && g))
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        g = flag4;
        if (!g || h) goto _L2; else goto _L1
_L1:
        bdm1 = bdm.a;
        synchronized (bdm1.b)
        {
            bdm1.c.add(Integer.valueOf(0));
            bdm1.d = Math.min(bdm1.d, 0);
        }
        h = true;
_L5:
        e = -1L;
        Object obj1;
        bdm bdm2;
        Exception exception1;
        int j;
        if (g)
        {
            for (i = ((flag2) ? 1 : 0); i < b.size(); i++)
            {
                obj = b.get(i);
                l = ((ayp)c.get(obj)).d;
                if (l != -1L && (e == -1L || l < e))
                {
                    e = l;
                }
            }

        }
        return;
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (g || !h || flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        bdm2 = bdm.a;
        obj1 = bdm2.b;
        obj1;
        JVM INSTR monitorenter ;
        bdm2.c.remove(Integer.valueOf(0));
        if (!bdm2.c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_403;
        }
        j = 0x7fffffff;
_L3:
        bdm2.d = j;
        bdm2.b.notifyAll();
        obj1;
        JVM INSTR monitorexit ;
        h = false;
        continue; /* Loop/switch isn't completed */
        j = ((Integer)bdm2.c.peek()).intValue();
          goto _L3
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a()
    {
        a.a(d);
    }

    public final void a(Object obj)
    {
        b.remove(obj);
        obj = (ayp)c.remove(obj);
        d = d - ((ayp) (obj)).a;
        c();
    }

    public final void a(Object obj, int i)
    {
        b.add(obj);
        c.put(obj, new ayp(i));
        d = d + i;
    }

    public final boolean a(Object obj, long l, long l1, boolean flag)
    {
        float f1;
        int i;
        boolean flag1;
        boolean flag2;
        int j;
        if (l1 == -1L)
        {
            i = 0;
        } else
        {
            l = l1 - l;
            if (l > 0x1c9c380L)
            {
                i = 0;
            } else
            if (l < 0xe4e1c0L)
            {
                i = 2;
            } else
            {
                i = 1;
            }
        }
        obj = (ayp)c.get(obj);
        if (((ayp) (obj)).b != i || ((ayp) (obj)).d != l1 || ((ayp) (obj)).c != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj.b = i;
            obj.d = l1;
            obj.c = flag;
        }
        j = a.b();
        f1 = (float)j / (float)d;
        if (f1 > 0.8F)
        {
            i = 0;
        } else
        if (f1 < 0.2F)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        if (f != i)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            f = i;
        }
        if (flag1 || flag2)
        {
            c();
        }
        return j < d && l1 != -1L && l1 <= e;
    }

    public final bda b()
    {
        return a;
    }
}
