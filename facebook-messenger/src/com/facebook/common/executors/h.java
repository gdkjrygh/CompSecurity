// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.content.Context;
import com.facebook.inject.d;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.common.executors:
//            d, DefaultExecutorService, ForUiThread, g

class h extends d
{

    private h()
    {
    }

    h(g g)
    {
        this();
    }

    public com.facebook.common.executors.d a()
    {
        return new com.facebook.common.executors.d((Context)a(android/content/Context), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}
