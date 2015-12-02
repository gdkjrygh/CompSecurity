// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            cx, cm, bj

final class cz extends cx
    implements cm
{

    volatile long e;
    cm f;
    cm g;

    cz(Object obj, int i, cm cm1)
    {
        super(obj, i, cm1);
        e = 0x7fffffffffffffffL;
        f = bj.h();
        g = bj.h();
    }

    public long getExpirationTime()
    {
        return e;
    }

    public cm getNextExpirable()
    {
        return f;
    }

    public cm getPreviousExpirable()
    {
        return g;
    }

    public void setExpirationTime(long l)
    {
        e = l;
    }

    public void setNextExpirable(cm cm1)
    {
        f = cm1;
    }

    public void setPreviousExpirable(cm cm1)
    {
        g = cm1;
    }
}
