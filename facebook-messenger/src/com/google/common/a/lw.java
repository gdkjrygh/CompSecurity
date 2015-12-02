// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            lj, lk

abstract class lw extends AbstractSet
{

    final lj b;

    private lw(lj lj1)
    {
        b = lj1;
        super();
    }

    lw(lj lj1, lk lk)
    {
        this(lj1);
    }

    public void clear()
    {
        b.a.clear();
    }

    public boolean isEmpty()
    {
        return b.a.isEmpty();
    }
}
