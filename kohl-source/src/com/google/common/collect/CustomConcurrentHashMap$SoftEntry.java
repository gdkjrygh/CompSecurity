// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.FinalizableSoftReference;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

private static class next extends FinalizableSoftReference
    implements ntry
{

    final int hash;
    final CustomConcurrentHashMap map;
    final ntry next;
    volatile ence valueReference;

    public void finalizeReferent()
    {
        notifyKeyReclaimed();
    }

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return hash;
    }

    public Object getKey()
    {
        return get();
    }

    public ntry getNext()
    {
        return next;
    }

    public ntry getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public ntry getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public ence getValueReference()
    {
        return valueReference;
    }

    public void notifyKeyReclaimed()
    {
        map.reclaimKey(this);
    }

    public void notifyValueReclaimed(ence ence)
    {
        map.reclaimValue(this, ence);
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(ntry ntry)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(ence ence)
    {
        ence ence1 = valueReference;
        valueReference = ence;
        ence1.clear();
    }

    ntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ntry ntry)
    {
        super(obj, r.queue);
        valueReference = CustomConcurrentHashMap.unset();
        map = customconcurrenthashmap;
        hash = i;
        next = ntry;
    }
}
