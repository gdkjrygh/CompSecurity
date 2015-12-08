// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;

final class atl
{

    private static final Queue a = bag.a(0);
    private int b;
    private int c;
    private Object d;

    private atl()
    {
    }

    static atl a(Object obj, int i, int j)
    {
        atl atl1;
        synchronized (a)
        {
            atl1 = (atl)a.poll();
        }
        obj1 = atl1;
        if (atl1 == null)
        {
            obj1 = new atl();
        }
        obj1.d = obj;
        obj1.c = i;
        obj1.b = j;
        return ((atl) (obj1));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a()
    {
        synchronized (a)
        {
            a.offer(this);
        }
        return;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof atl)
        {
            obj = (atl)obj;
            flag = flag1;
            if (c == ((atl) (obj)).c)
            {
                flag = flag1;
                if (b == ((atl) (obj)).b)
                {
                    flag = flag1;
                    if (d.equals(((atl) (obj)).d))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (b * 31 + c) * 31 + d.hashCode();
    }

}
