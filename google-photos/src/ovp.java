// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class ovp
    implements ovr, ovs
{

    ovr a;
    private final List b = new CopyOnWriteArrayList();

    ovp()
    {
    }

    public final ovg a(long l)
    {
        if (a != null)
        {
            return a.a(l);
        } else
        {
            return null;
        }
    }

    public final ovg a(long l, boolean flag)
    {
        if (a != null)
        {
            return a.a(l, flag);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
    }

    public final void a(Exception exception)
    {
        Iterator iterator;
        synchronized (b)
        {
            iterator = b.iterator();
        }
        for (; iterator.hasNext(); ((ovs)iterator.next()).a(exception)) { }
        break MISSING_BLOCK_LABEL_51;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(ovg ovg)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ovs)iterator.next()).a(ovg)) { }
    }

    public final void a(ovr ovr1)
    {
        Iterator iterator;
        synchronized (b)
        {
            iterator = b.iterator();
        }
        for (; iterator.hasNext(); ((ovs)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_51;
        exception;
        ovr1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(ovs ovs1)
    {
        boolean flag;
        synchronized (b)
        {
            b.add(ovs1);
            flag = g();
        }
        if (flag)
        {
            ovs1.a(this);
        }
        return;
        ovs1;
        list;
        JVM INSTR monitorexit ;
        throw ovs1;
    }

    public final ovr b(ovr ovr1)
    {
        ovr ovr2 = a;
        if (a != null)
        {
            a.b(this);
        }
        a = ovr1;
        if (a != null)
        {
            a.a(this);
        }
        return ovr2;
    }

    public final void b(ovs ovs1)
    {
        b.remove(ovs1);
    }

    public final boolean g()
    {
        if (a != null)
        {
            return a.g();
        } else
        {
            return false;
        }
    }
}
