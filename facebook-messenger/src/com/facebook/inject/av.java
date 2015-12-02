// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.inject:
//            aw, aq

public class av
{

    private static ThreadLocal a = new aw();
    private final Map b;

    private av()
    {
        b = ik.a();
    }

    av(aw aw1)
    {
        this();
    }

    public static av a()
    {
        return (av)a.get();
    }

    public void a(Class class1)
    {
        AtomicInteger atomicinteger1 = (AtomicInteger)b.get(class1);
        AtomicInteger atomicinteger = atomicinteger1;
        if (atomicinteger1 == null)
        {
            atomicinteger = new AtomicInteger();
            b.put(class1, atomicinteger);
        }
        atomicinteger.incrementAndGet();
    }

    public void a(Set set, Class class1)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            Class class2 = (Class)set.next();
            if (c(class2))
            {
                throw new aq((new StringBuilder()).append("Scope violation. Should not call inject ").append(class1.getSimpleName()).append(" into ").append(class2.getSimpleName()).toString());
            }
        }

    }

    public void b(Class class1)
    {
        class1 = (AtomicInteger)b.get(class1);
        Preconditions.checkNotNull(class1, "Unbalanced call to push and pop");
        boolean flag;
        if (class1.decrementAndGet() >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
    }

    public boolean c(Class class1)
    {
        class1 = (AtomicInteger)b.get(class1);
        return class1 != null && class1.get() > 0;
    }

}
