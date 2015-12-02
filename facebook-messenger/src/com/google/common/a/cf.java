// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            cg, cm, bj, cl, 
//            ch

final class cf extends AbstractQueue
{

    final cm a = new cg(this);

    cf()
    {
    }

    public cm a()
    {
        cm cm2 = a.getNextExpirable();
        cm cm1 = cm2;
        if (cm2 == a)
        {
            cm1 = null;
        }
        return cm1;
    }

    public boolean a(cm cm1)
    {
        bj.a(cm1.getPreviousExpirable(), cm1.getNextExpirable());
        bj.a(a.getPreviousExpirable(), cm1);
        bj.a(cm1, a);
        return true;
    }

    public cm b()
    {
        cm cm1 = a.getNextExpirable();
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
        for (cm cm1 = a.getNextExpirable(); cm1 != a; cm1 = cm2)
        {
            cm2 = cm1.getNextExpirable();
            bj.d(cm1);
        }

        a.setNextExpirable(a);
        a.setPreviousExpirable(a);
    }

    public boolean contains(Object obj)
    {
        return ((cm)obj).getNextExpirable() != cl.INSTANCE;
    }

    public boolean isEmpty()
    {
        return a.getNextExpirable() == a;
    }

    public Iterator iterator()
    {
        return new ch(this, a());
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
        cm cm1 = ((cm) (obj)).getPreviousExpirable();
        cm cm2 = ((cm) (obj)).getNextExpirable();
        bj.a(cm1, cm2);
        bj.d(((cm) (obj)));
        return cm2 != cl.INSTANCE;
    }

    public int size()
    {
        int i = 0;
        for (cm cm1 = a.getNextExpirable(); cm1 != a; cm1 = cm1.getNextExpirable())
        {
            i++;
        }

        return i;
    }
}
