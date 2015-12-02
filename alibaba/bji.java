// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class bji
{

    private static final List d = new ArrayList();
    Object a;
    bjn b;
    bji c;

    private bji(Object obj, bjn bjn)
    {
        a = obj;
        b = bjn;
    }

    static bji a(bjn bjn, Object obj)
    {
        List list = d;
        list;
        JVM INSTR monitorenter ;
        int i = d.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        bji bji1;
        bji1 = (bji)d.remove(i - 1);
        bji1.a = obj;
        bji1.b = bjn;
        bji1.c = null;
        list;
        JVM INSTR monitorexit ;
        return bji1;
        list;
        JVM INSTR monitorexit ;
        return new bji(obj, bjn);
        bjn;
        list;
        JVM INSTR monitorexit ;
        throw bjn;
    }

    static void a(bji bji1)
    {
        bji1.a = null;
        bji1.b = null;
        bji1.c = null;
        synchronized (d)
        {
            if (d.size() < 10000)
            {
                d.add(bji1);
            }
        }
        return;
        bji1;
        list;
        JVM INSTR monitorexit ;
        throw bji1;
    }

}
