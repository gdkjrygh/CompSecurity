// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static class next extends WeakReference
    implements ntry
{

    final int hash;
    final ntry next;
    volatile ence valueReference;

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public final int getHash()
    {
        return hash;
    }

    public final Object getKey()
    {
        return get();
    }

    public final ntry getNext()
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

    public final ence getValueReference()
    {
        return valueReference;
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

    public final void setValueReference(ence ence)
    {
        ence ence1 = valueReference;
        valueReference = ence;
        ence1.clear(ence);
    }

    ntry(ReferenceQueue referencequeue, Object obj, int i, ntry ntry)
    {
        super(obj, referencequeue);
        valueReference = MapMakerInternalMap.unset();
        hash = i;
        next = ntry;
    }
}
