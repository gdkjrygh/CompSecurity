// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public final class osu
{

    public int a;
    private final PriorityQueue b = new PriorityQueue(5);
    private final PriorityQueue c = new PriorityQueue(5, Collections.reverseOrder());

    public osu()
    {
        a = 1;
    }

    private void a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (b.size() >= a) goto _L2; else goto _L1
_L1:
        osw osw1 = (osw)c.poll();
        if (osw1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        b.add(osw1);
        osw1.c = false;
        osw1.b.a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Exception exception;
        if (b.isEmpty())
        {
            flag = false;
        }
        p.b(flag);
        osw1 = (osw)c.peek();
        if (osw1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        osw osw2 = (osw)b.peek();
        if (osw1.a > osw2.a && !osw2.c)
        {
            osw2.c = true;
            osw2.b.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    private osw d(osv osv1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            osw osw1 = (osw)iterator.next();
            if (osw1.b == osv1)
            {
                return osw1;
            }
        }

        for (Iterator iterator1 = c.iterator(); iterator1.hasNext();)
        {
            osw osw2 = (osw)iterator1.next();
            if (osw2.b == osv1)
            {
                return osw2;
            }
        }

        return null;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = a;
        if (i > j) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = i;
        while (b.size() < a && !c.isEmpty()) 
        {
            osw osw1 = (osw)c.poll();
            b.add(osw1);
            osw1.b.a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(osv osv1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        osw osw1;
        p.a(osv1);
        osw1 = d(osv1);
        if (osw1 != null) goto _L2; else goto _L1
_L1:
        c.add(new osw(this, i, osv1));
_L5:
        a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (osw1.a == i) goto _L4; else goto _L3
_L3:
        if (!c.contains(osw1))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        c.remove(osw1);
        c.add(new osw(this, i, osv1));
          goto _L5
        osv1;
        throw osv1;
        b.remove(osw1);
        b.add(new osw(this, i, osv1));
          goto _L5
    }

    public final boolean a(osv osv1)
    {
        this;
        JVM INSTR monitorenter ;
        osv1 = d(osv1);
        if (osv1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = b.contains(osv1);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        osv1;
        throw osv1;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = a;
        if (i < j) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Exception exception;
        boolean flag;
        if (b.size() <= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a = i;
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public final void b(osv osv1)
    {
        this;
        JVM INSTR monitorenter ;
        p.a(osv1);
        osv1 = d(osv1);
        if (osv1 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (b.remove(osv1))
        {
            c.add(osv1);
            a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        osv1;
        throw osv1;
    }

    public final void c(osv osv1)
    {
        this;
        JVM INSTR monitorenter ;
        p.a(osv1);
        osv1 = d(osv1);
        if (osv1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b.remove(osv1);
        c.remove(osv1);
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        osv1;
        throw osv1;
    }
}
