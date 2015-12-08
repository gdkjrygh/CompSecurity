// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class ayh
{

    public final jk a = new jk();
    private final AtomicReference b = new AtomicReference();

    public ayh()
    {
    }

    public final List a(Class class1, Class class2)
    {
        Object obj = (baf)b.getAndSet(null);
        if (obj == null)
        {
            class1 = new baf(class1, class2);
        } else
        {
            ((baf) (obj)).a(class1, class2, null);
            class1 = ((Class) (obj));
        }
        synchronized (a)
        {
            obj = (List)a.get(class1);
        }
        b.set(class1);
        return ((List) (obj));
        class1;
        class2;
        JVM INSTR monitorexit ;
        throw class1;
    }
}
