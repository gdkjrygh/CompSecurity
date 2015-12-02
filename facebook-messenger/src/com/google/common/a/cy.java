// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            cx, cm, bj

final class cy extends cx
    implements cm
{

    cm e;
    cm f;

    cy(Object obj, int i, cm cm1)
    {
        super(obj, i, cm1);
        e = bj.h();
        f = bj.h();
    }

    public cm getNextEvictable()
    {
        return e;
    }

    public cm getPreviousEvictable()
    {
        return f;
    }

    public void setNextEvictable(cm cm1)
    {
        e = cm1;
    }

    public void setPreviousEvictable(cm cm1)
    {
        f = cm1;
    }
}
