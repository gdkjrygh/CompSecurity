// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

public final class ayg
{

    public final jk a = new jk();
    private final AtomicReference b = new AtomicReference();

    public ayg()
    {
    }

    private baf c(Class class1, Class class2, Class class3)
    {
        baf baf2 = (baf)b.getAndSet(null);
        baf baf1 = baf2;
        if (baf2 == null)
        {
            baf1 = new baf();
        }
        baf1.a(class1, class2, class3);
        return baf1;
    }

    public final boolean a(Class class1, Class class2, Class class3)
    {
        class2 = c(class1, class2, class3);
        boolean flag;
        synchronized (a)
        {
            flag = a.containsKey(class2);
        }
        b.set(class2);
        return flag;
        class2;
        class1;
        JVM INSTR monitorexit ;
        throw class2;
    }

    public final apx b(Class class1, Class class2, Class class3)
    {
        class2 = c(class1, class2, class3);
        synchronized (a)
        {
            class3 = (apx)a.get(class2);
        }
        b.set(class2);
        return class3;
        class2;
        class1;
        JVM INSTR monitorexit ;
        throw class2;
    }
}
