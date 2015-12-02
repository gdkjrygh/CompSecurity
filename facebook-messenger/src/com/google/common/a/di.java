// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.a:
//            df, cm, bj

final class di extends df
    implements cm
{

    volatile long d;
    cm e;
    cm f;
    cm g;
    cm h;

    di(ReferenceQueue referencequeue, Object obj, int i, cm cm1)
    {
        super(referencequeue, obj, i, cm1);
        d = 0x7fffffffffffffffL;
        e = bj.h();
        f = bj.h();
        g = bj.h();
        h = bj.h();
    }

    public long getExpirationTime()
    {
        return d;
    }

    public cm getNextEvictable()
    {
        return g;
    }

    public cm getNextExpirable()
    {
        return e;
    }

    public cm getPreviousEvictable()
    {
        return h;
    }

    public cm getPreviousExpirable()
    {
        return f;
    }

    public void setExpirationTime(long l)
    {
        d = l;
    }

    public void setNextEvictable(cm cm1)
    {
        g = cm1;
    }

    public void setNextExpirable(cm cm1)
    {
        e = cm1;
    }

    public void setPreviousEvictable(cm cm1)
    {
        h = cm1;
    }

    public void setPreviousExpirable(cm cm1)
    {
        f = cm1;
    }
}
