// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            du

final class dv
    implements d
{

    final AtomicInteger a = new AtomicInteger(0);
    final du b;

    dv(du du)
    {
        b = du;
        super();
    }

    public final Object apply(Object obj)
    {
        return Integer.valueOf(a.getAndIncrement());
    }
}
