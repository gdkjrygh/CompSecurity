// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.common.collect:
//            cj, MapMakerInternalMap, cr

class ct extends WeakReference
    implements cj
{

    final int a;
    final cj b;
    volatile cr c;

    ct(ReferenceQueue referencequeue, Object obj, int i, cj cj1)
    {
        super(obj, referencequeue);
        c = MapMakerInternalMap.unset();
        a = i;
        b = cj1;
    }

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return a;
    }

    public Object getKey()
    {
        return get();
    }

    public cj getNext()
    {
        return b;
    }

    public cj getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public cj getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public cj getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public cj getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public cr getValueReference()
    {
        return c;
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(cj cj1)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(cj cj1)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(cj cj1)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(cj cj1)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(cr cr1)
    {
        cr cr2 = c;
        c = cr1;
        cr2.a(cr1);
    }
}
