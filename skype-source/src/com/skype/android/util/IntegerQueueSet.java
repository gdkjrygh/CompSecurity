// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IntegerQueueSet extends LinkedHashSet
    implements Queue
{

    public IntegerQueueSet()
    {
    }

    private Integer b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        obj = (Integer)((Iterator) (obj)).next();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Integer) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private Integer c()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = null;
        Iterator iterator = iterator();
        if (iterator.hasNext())
        {
            integer = (Integer)iterator.next();
            iterator.remove();
        }
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = super.add(integer);
        this;
        JVM INSTR monitorexit ;
        return flag;
        integer;
        throw integer;
    }

    public final int[] a()
    {
        this;
        JVM INSTR monitorenter ;
        int ai[];
        Iterator iterator;
        ai = new int[size()];
        iterator = iterator();
        int i = 0;
_L2:
        if (i >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ((Integer)iterator.next()).intValue();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        clear();
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean add(Object obj)
    {
        return a((Integer)obj);
    }

    public Object element()
    {
        Integer integer = b();
        if (integer == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return integer;
        }
    }

    public boolean offer(Object obj)
    {
        obj = (Integer)obj;
        if (obj == null)
        {
            throw new NullPointerException("null element");
        } else
        {
            return a(((Integer) (obj)));
        }
    }

    public Object peek()
    {
        return b();
    }

    public Object poll()
    {
        return c();
    }

    public Object remove()
    {
        Integer integer = c();
        if (integer == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return integer;
        }
    }
}
