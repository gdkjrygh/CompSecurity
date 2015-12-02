// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.common.a:
//            cm, bj, dd

class co extends SoftReference
    implements cm
{

    final int a;
    final cm b;
    volatile dd c;

    co(ReferenceQueue referencequeue, Object obj, int i, cm cm1)
    {
        super(obj, referencequeue);
        c = bj.g();
        a = i;
        b = cm1;
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

    public cm getNext()
    {
        return b;
    }

    public cm getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public cm getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public cm getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public cm getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public dd getValueReference()
    {
        return c;
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(cm cm1)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(cm cm1)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(cm cm1)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(cm cm1)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(dd dd1)
    {
        dd dd2 = c;
        c = dd1;
        dd2.a(dd1);
    }
}
