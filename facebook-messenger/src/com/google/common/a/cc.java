// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            cd, cm, bj, cl, 
//            ce

final class cc extends AbstractQueue
{

    final cm a = new cd(this);

    cc()
    {
    }

    public cm a()
    {
        cm cm2 = a.getNextEvictable();
        cm cm1 = cm2;
        if (cm2 == a)
        {
            cm1 = null;
        }
        return cm1;
    }

    public boolean a(cm cm1)
    {
        bj.b(cm1.getPreviousEvictable(), cm1.getNextEvictable());
        bj.b(a.getPreviousEvictable(), cm1);
        bj.b(cm1, a);
        return true;
    }

    public cm b()
    {
        cm cm1 = a.getNextEvictable();
        if (cm1 == a)
        {
            return null;
        } else
        {
            remove(cm1);
            return cm1;
        }
    }

    public void clear()
    {
        cm cm2;
        for (cm cm1 = a.getNextEvictable(); cm1 != a; cm1 = cm2)
        {
            cm2 = cm1.getNextEvictable();
            bj.e(cm1);
        }

        a.setNextEvictable(a);
        a.setPreviousEvictable(a);
    }

    public boolean contains(Object obj)
    {
        return ((cm)obj).getNextEvictable() != cl.INSTANCE;
    }

    public boolean isEmpty()
    {
        return a.getNextEvictable() == a;
    }

    public Iterator iterator()
    {
        return new ce(this, a());
    }

    public boolean offer(Object obj)
    {
        return a((cm)obj);
    }

    public Object peek()
    {
        return a();
    }

    public Object poll()
    {
        return b();
    }

    public boolean remove(Object obj)
    {
        obj = (cm)obj;
        cm cm1 = ((cm) (obj)).getPreviousEvictable();
        cm cm2 = ((cm) (obj)).getNextEvictable();
        bj.b(cm1, cm2);
        bj.e(((cm) (obj)));
        return cm2 != cl.INSTANCE;
    }

    public int size()
    {
        int i = 0;
        for (cm cm1 = a.getNextEvictable(); cm1 != a; cm1 = cm1.getNextEvictable())
        {
            i++;
        }

        return i;
    }
}
