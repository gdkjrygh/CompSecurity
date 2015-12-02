// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.u;
import com.facebook.common.executors.w;
import com.facebook.inject.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.base.c:
//            a, b

class t extends d
{

    final a a;

    private t(a a1)
    {
        a = a1;
        super();
    }

    t(a a1, b b1)
    {
        this(a1);
    }

    public u a()
    {
        return new w((Executor)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
