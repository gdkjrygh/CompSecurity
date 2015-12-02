// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.a:
//            co, cm, bj

final class cp extends co
    implements cm
{

    cm d;
    cm e;

    cp(ReferenceQueue referencequeue, Object obj, int i, cm cm1)
    {
        super(referencequeue, obj, i, cm1);
        d = bj.h();
        e = bj.h();
    }

    public cm getNextEvictable()
    {
        return d;
    }

    public cm getPreviousEvictable()
    {
        return e;
    }

    public void setNextEvictable(cm cm1)
    {
        d = cm1;
    }

    public void setPreviousEvictable(cm cm1)
    {
        e = cm1;
    }
}
