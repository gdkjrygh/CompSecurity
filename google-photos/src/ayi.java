// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ayi
{

    private final List a = new ArrayList();

    public ayi()
    {
    }

    public final List a(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ayj ayj1 = (ayj)iterator.next();
            if (ayj1.a(class1, class2))
            {
                arraylist.add(ayj1.b);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        class1;
        throw class1;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public final void a(anj anj, Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(new ayj(class1, class2, anj));
        this;
        JVM INSTR monitorexit ;
        return;
        anj;
        throw anj;
    }

    public final List b(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ayj ayj1 = (ayj)iterator.next();
            if (ayj1.a(class1, class2))
            {
                arraylist.add(ayj1.a);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        class1;
        throw class1;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public final void b(anj anj, Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(0, new ayj(class1, class2, anj));
        this;
        JVM INSTR monitorexit ;
        return;
        anj;
        throw anj;
    }
}
