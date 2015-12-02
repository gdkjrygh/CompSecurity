// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            cm, bj, dd

class cx
    implements cm
{

    final Object a;
    final int b;
    final cm c;
    volatile dd d;

    cx(Object obj, int i, cm cm1)
    {
        d = bj.g();
        a = obj;
        b = i;
        c = cm1;
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

    public cm getNext()
    {
        return c;
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
        return d;
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
        dd dd2 = d;
        d = dd1;
        dd2.a(dd1);
    }
}
