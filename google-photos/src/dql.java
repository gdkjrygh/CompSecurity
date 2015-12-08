// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class dql
{

    private final SparseArray a = new SparseArray();
    private final TreeMap b = new TreeMap();

    dql()
    {
    }

    public final ekp a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        ekp ekp1 = (ekp)a.get(i);
        this;
        JVM INSTR monitorexit ;
        return ekp1;
        Exception exception;
        exception;
        throw exception;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b.clear();
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, ekp ekp1)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(i, ekp1);
        b.put(Long.valueOf(ekp1.d()), Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return;
        ekp1;
        throw ekp1;
    }

    final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b.headMap(Long.valueOf(l), true);
        Integer integer;
        for (Iterator iterator = ((NavigableMap) (obj)).values().iterator(); iterator.hasNext(); a.remove(integer.intValue()))
        {
            integer = (Integer)iterator.next();
        }

        break MISSING_BLOCK_LABEL_70;
        obj;
        throw obj;
        ((NavigableMap) (obj)).clear();
        this;
        JVM INSTR monitorexit ;
    }
}
