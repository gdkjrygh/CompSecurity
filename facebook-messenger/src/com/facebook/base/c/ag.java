// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.n;
import com.facebook.inject.d;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ag extends d
{

    final a a;

    private ag(a a1)
    {
        a = a1;
        super();
    }

    ag(a a1, b b1)
    {
        this(a1);
    }

    public n a()
    {
        return new n((ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
