// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class aoc
    implements aob.a
{

    final List a;
    final Object b;

    aoc()
    {
        this(new Object());
    }

    aoc(Object obj)
    {
        a = new ArrayList();
        b = obj;
    }

    public final void a(aob.c c)
    {
        ArrayList arraylist;
        synchronized (b)
        {
            arraylist = new ArrayList(a);
            a.clear();
        }
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext();)
        {
            aob.a a1 = (aob.a)((Iterator) (obj)).next();
            try
            {
                a1.a(c);
            }
            catch (Exception exception)
            {
                anK.a(exception);
            }
        }

        break MISSING_BLOCK_LABEL_79;
        c;
        obj;
        JVM INSTR monitorexit ;
        throw c;
    }
}
