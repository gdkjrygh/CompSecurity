// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.Context;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.bugreporter:
//            m, o, p

class s extends d
{

    final o a;

    private s(o o)
    {
        a = o;
        super();
    }

    s(o o, p p)
    {
        this(o);
    }

    public m a()
    {
        return new m((Context)e().a(android/content/Context), (Executor)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
