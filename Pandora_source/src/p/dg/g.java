// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import com.pandora.radio.data.o;
import com.pandora.radio.util.NetworkUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p.cw.c;
import p.df.a;

class g
{

    private static g f;
    private String a;
    private final LinkedList b = new LinkedList();
    private final LinkedList c = new LinkedList();
    private final LinkedList d = new LinkedList();
    private final c e;

    private g(c c1)
    {
        a = null;
        e = c1;
    }

    private int a(int i, List list)
    {
        boolean flag;
        flag = false;
        if (list == null)
        {
            return 0;
        }
        list;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        long l1 = i;
        Iterator iterator = list.iterator();
        i = ((flag) ? 1 : 0);
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Long)iterator.next()).longValue() >= l - l1)
        {
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static g a(c c1)
    {
        p/dg/g;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new g(c1);
        }
        c1 = f;
        p/dg/g;
        JVM INSTR monitorexit ;
        return c1;
        c1;
        p/dg/g;
        JVM INSTR monitorexit ;
        throw c1;
    }

    private boolean h()
    {
        return e() >= 3;
    }

    void a()
    {
        f = null;
    }

    void a(Long long1)
    {
        synchronized (b)
        {
            b.addLast(long1);
            if (b.size() > 3)
            {
                b.removeFirst();
            }
        }
        return;
        long1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw long1;
    }

    void a(String s)
    {
        synchronized (c)
        {
            c.addLast(Long.valueOf(System.currentTimeMillis()));
            p.df.a.c("NetworkState", (new StringBuilder()).append("TRACK [").append(s).append("] incremented AUDIO ERROR COUNT: ").append(c.size()).toString());
            if (c.size() > 100)
            {
                c.removeFirst();
            }
        }
        return;
        s;
        linkedlist;
        JVM INSTR monitorexit ;
        throw s;
    }

    int b()
    {
        LinkedList linkedlist = b;
        linkedlist;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = e.u().c();
        if (b.size() != 0)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Iterator iterator;
        Exception exception;
        int i;
        int j;
        if (flag)
        {
            i = 15;
        } else
        {
            i = 45;
        }
        linkedlist;
        JVM INSTR monitorexit ;
        return i;
        iterator = b.iterator();
        i = 0;
        while (iterator.hasNext()) 
        {
            Long long1 = (Long)iterator.next();
            i = (int)((long)i + long1.longValue());
        }
        j = i / b.size();
        if (flag)
        {
            i = 15;
        } else
        {
            i = 30;
        }
        i = Math.max(i, j / 1000);
        linkedlist;
        JVM INSTR monitorexit ;
        return i;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    String c()
    {
        boolean flag1 = "high".equals(e.j().v());
        String s;
        boolean flag;
        if (!h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e.u().c())
        {
            if (flag)
            {
                if (flag1)
                {
                    s = "highQuality";
                } else
                {
                    s = "mediumQuality";
                }
            } else
            if (flag1)
            {
                s = "mediumQuality";
            } else
            {
                s = "lowQuality";
            }
        } else
        if (flag)
        {
            if (flag1)
            {
                s = "mediumQuality";
            } else
            {
                s = "lowQuality";
            }
        } else
        {
            s = "lowQuality";
        }
        if (a != null && !a.equals(s))
        {
            p.df.a.c("NetworkState", "TRACK - audio quality changed from %s to %s", new Object[] {
                a, s
            });
            synchronized (b)
            {
                b.clear();
            }
        }
        a = s;
        return s;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean d()
    {
        return a(0x1d4c0, c) > 4;
    }

    int e()
    {
        return a(0x927c0, c);
    }

    void f()
    {
        synchronized (d)
        {
            d.addLast(Long.valueOf(System.currentTimeMillis()));
            p.df.a.c("NetworkState", (new StringBuilder()).append("incremented API ERROR COUNT: ").append(d.size()).toString());
            if (d.size() > 100)
            {
                d.removeFirst();
            }
        }
        return;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean g()
    {
        return a(0x1d4c0, d) > 4;
    }
}
