// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class Jc
{
    public static interface a
    {

        public abstract boolean a(Object obj);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }

    public static interface c
    {

        public abstract Object a(Object obj);
    }


    private final c mKeyRetriever;
    private final ArrayList mList = new ArrayList();
    private final HashMap mMap = new HashMap();

    public Jc(c c1)
    {
        mKeyRetriever = c1;
    }

    private void d()
    {
        Collections.sort(mList);
        mMap.clear();
        Comparable comparable;
        for (Iterator iterator = mList.iterator(); iterator.hasNext(); mMap.put(mKeyRetriever.a(comparable), comparable))
        {
            comparable = (Comparable)iterator.next();
        }

    }

    public final Comparable a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = mList.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Comparable comparable;
        boolean flag;
        comparable = (Comparable)iterator.next();
        flag = a1.a(comparable);
        if (!flag) goto _L4; else goto _L3
_L3:
        a1 = comparable;
_L6:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        a1 = null;
        if (true) goto _L6; else goto _L5
_L5:
        a1;
        throw a1;
    }

    public final Comparable a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = (Comparable)mMap.get(obj);
        this;
        JVM INSTR monitorexit ;
        return ((Comparable) (obj));
        obj;
        throw obj;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        mList.clear();
        mMap.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mList.iterator(); iterator.hasNext(); b1.a((Comparable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_42;
        b1;
        throw b1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(Comparable comparable)
    {
        this;
        JVM INSTR monitorenter ;
        int i = Collections.binarySearch(mList, comparable);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        mList.remove(i);
_L1:
        mList.add(i, comparable);
        mMap.put(mKeyRetriever.a(comparable), comparable);
        this;
        JVM INSTR monitorexit ;
        return;
        i = -i - 1;
          goto _L1
        comparable;
        throw comparable;
    }

    public final void a(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        mList.clear();
        mList.addAll(collection);
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    public final void a(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = mList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Comparable comparable = (Comparable)iterator.next();
            if (set.contains(mKeyRetriever.a(comparable)))
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_62;
        set;
        throw set;
        d();
        this;
        JVM INSTR monitorexit ;
    }

    public final ArrayList b()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(mList);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(Comparable comparable)
    {
        this;
        JVM INSTR monitorenter ;
        comparable = (Comparable)mMap.remove(mKeyRetriever.a(comparable));
        if (comparable != null) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        mList.remove(i);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = Collections.binarySearch(mList, comparable);
        if (true) goto _L4; else goto _L3
_L3:
        comparable;
        throw comparable;
    }

    public final void b(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        mList.removeAll(collection);
        mList.addAll(collection);
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    public final boolean b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mMap.containsKey(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public final int c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mList.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }
}
