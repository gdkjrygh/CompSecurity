// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            cx, cm, bj

final class da extends cx
    implements cm
{

    volatile long e;
    cm f;
    cm g;
    cm h;
    cm i;

    da(Object obj, int j, cm cm1)
    {
        super(obj, j, cm1);
        e = 0x7fffffffffffffffL;
        f = bj.h();
        g = bj.h();
        h = bj.h();
        i = bj.h();
    }

    public long getExpirationTime()
    {
        return e;
    }

    public cm getNextEvictable()
    {
        return h;
    }

    public cm getNextExpirable()
    {
        return f;
    }

    public cm getPreviousEvictable()
    {
        return i;
    }

    public cm getPreviousExpirable()
    {
        return g;
    }

    public void setExpirationTime(long l)
    {
        e = l;
    }

    public void setNextEvictable(cm cm1)
    {
        h = cm1;
    }

    public void setNextExpirable(cm cm1)
    {
        f = cm1;
    }

    public void setPreviousEvictable(cm cm1)
    {
        i = cm1;
    }

    public void setPreviousExpirable(cm cm1)
    {
        g = cm1;
    }
}
