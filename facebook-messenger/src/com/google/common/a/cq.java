// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.a:
//            co, cm, bj

final class cq extends co
    implements cm
{

    volatile long d;
    cm e;
    cm f;

    cq(ReferenceQueue referencequeue, Object obj, int i, cm cm1)
    {
        super(referencequeue, obj, i, cm1);
        d = 0x7fffffffffffffffL;
        e = bj.h();
        f = bj.h();
    }

    public long getExpirationTime()
    {
        return d;
    }

    public cm getNextExpirable()
    {
        return e;
    }

    public cm getPreviousExpirable()
    {
        return f;
    }

    public void setExpirationTime(long l)
    {
        d = l;
    }

    public void setNextExpirable(cm cm1)
    {
        e = cm1;
    }

    public void setPreviousExpirable(cm cm1)
    {
        f = cm1;
    }
}
