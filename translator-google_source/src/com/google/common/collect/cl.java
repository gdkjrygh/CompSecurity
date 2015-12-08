// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cj, MapMakerInternalMap, cr

class cl
    implements cj
{

    final Object a;
    final int b;
    final cj c;
    volatile cr d;

    cl(Object obj, int i, cj cj1)
    {
        d = MapMakerInternalMap.unset();
        a = obj;
        b = i;
        c = cj1;
    }

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return b;
    }

    public Object getKey()
    {
        return a;
    }

    public cj getNext()
    {
        return c;
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
        return d;
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
        cr cr2 = d;
        d = cr1;
        cr2.a(cr1);
    }
}
