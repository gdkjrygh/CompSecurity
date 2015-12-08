// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.b;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kik.a.f.f.y;
import kik.a.f.f.z;
import org.c.b;
import org.c.c;

public final class kik.a.f.b.a
{
    final class a extends TimerTask
    {

        final kik.a.f.b.a a;
        private final z b;

        public final void run()
        {
            boolean flag2 = false;
            if (!b.a(System.currentTimeMillis())) goto _L2; else goto _L1
_L1:
            Object obj = kik.a.f.b.a.a(a);
            obj;
            JVM INSTR monitorenter ;
            boolean flag;
            boolean flag1;
            if (b.k() <= 0 && kik.a.f.b.a.b(a).contains(b.l_()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag) goto _L4; else goto _L3
_L3:
            if (kik.a.f.b.a.c(a).remove(b))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1) goto _L6; else goto _L5
_L5:
            flag1 = flag2;
            if (!kik.a.f.b.a.d(a).remove(b)) goto _L7; else goto _L6
_L7:
            if (flag1) goto _L4; else goto _L8
_L8:
            kik.a.f.b.a.e(a).remove(b);
_L4:
            obj;
            JVM INSTR monitorexit ;
            Exception exception;
            if (flag)
            {
                kik.a.f.b.a.f(a).schedule(a. new a(b), 500L);
                return;
            } else
            {
                b.b(101);
                return;
            }
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            kik.a.f.b.a.a(a, b);
            return;
_L6:
            flag1 = true;
            if (true) goto _L7; else goto _L9
_L9:
        }

        public a(z z1)
        {
            a = kik.a.f.b.a.this;
            super();
            b = z1;
        }
    }


    private static final b a = org.c.c.a("LifeCycleManager");
    private final Object b = new Object();
    private LinkedList c;
    private LinkedList d;
    private LinkedList e;
    private Set f;
    private final long g = 500L;
    private final Timer h = new Timer("StanzaLifecycleTimer");

    public kik.a.f.b.a()
    {
        c = new LinkedList();
        d = new LinkedList();
        e = new LinkedList();
        f = new HashSet();
    }

    static Object a(kik.a.f.b.a a1)
    {
        return a1.b;
    }

    static void a(kik.a.f.b.a a1, z z1)
    {
        a1.b(z1);
    }

    static Set b(kik.a.f.b.a a1)
    {
        return a1.f;
    }

    private void b(z z1)
    {
        if (z1.k() <= 0 || z1.h() && z1.k() < 2)
        {
            long l = z1.c(System.currentTimeMillis());
            if (l >= 0L)
            {
                h.schedule(new a(z1), l + 500L);
            }
        }
    }

    static LinkedList c(kik.a.f.b.a a1)
    {
        return a1.c;
    }

    static LinkedList d(kik.a.f.b.a a1)
    {
        return a1.d;
    }

    static LinkedList e(kik.a.f.b.a a1)
    {
        return a1.e;
    }

    static Timer f(kik.a.f.b.a a1)
    {
        return a1.h;
    }

    public final void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
_L1:
        Object obj1;
        do
        {
            if (d.isEmpty())
            {
                break MISSING_BLOCK_LABEL_61;
            }
            obj1 = (z)d.remove();
            if (!((z) (obj1)).c())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            c.add(obj1);
        } while (true);
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((z) (obj1)).b(108);
          goto _L1
        for (; !e.isEmpty(); ((z)e.remove()).b(101)) { }
        f.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(z z1)
    {
label0:
        {
            z1.d(System.currentTimeMillis());
            synchronized (b)
            {
                ListIterator listiterator = c.listIterator();
                do
                {
                    if (!listiterator.hasNext())
                    {
                        break label0;
                    }
                } while (!z1.a((z)listiterator.next()));
                (new StringBuilder("Discarding duplicate stanza: ")).append(z1);
                z1.b(109);
            }
            return;
        }
        ListIterator listiterator1 = d.listIterator();
        do
        {
            if (!listiterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_131;
            }
        } while (!z1.a((z)listiterator1.next()));
        (new StringBuilder("Discarding duplicate stanza: ")).append(z1);
        z1.b(109);
        obj;
        JVM INSTR monitorexit ;
        return;
        z1;
        obj;
        JVM INSTR monitorexit ;
        throw z1;
        b(z1);
        c.add(z1);
        obj;
        JVM INSTR monitorexit ;
    }

    public final boolean a(String s)
    {
label0:
        {
            synchronized (b)
            {
                ListIterator listiterator = c.listIterator();
                do
                {
                    if (!listiterator.hasNext())
                    {
                        break label0;
                    }
                } while (!((z)listiterator.next()).l_().equals(s));
                listiterator.remove();
            }
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final z b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        z z1 = (z)c.poll();
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        d.add(z1);
        obj;
        JVM INSTR monitorexit ;
        return z1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        ListIterator listiterator;
        f.remove(s);
        listiterator = d.listIterator();
_L4:
        if (!listiterator.hasNext()) goto _L2; else goto _L1
_L1:
        z z1 = (z)listiterator.next();
        if (!s.equals(z1.l_())) goto _L4; else goto _L3
_L3:
        listiterator.remove();
        s = z1;
_L6:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s.a(1);
        if (s instanceof y)
        {
            e.add((y)s);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c(String s)
    {
        synchronized (b)
        {
            f.add(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final y d(String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        ListIterator listiterator = e.listIterator();
_L4:
        if (!listiterator.hasNext()) goto _L2; else goto _L1
_L1:
        y y1 = (y)listiterator.next();
        if (!s.equals(y1.l_())) goto _L4; else goto _L3
_L3:
        listiterator.remove();
        s = y1;
_L6:
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
