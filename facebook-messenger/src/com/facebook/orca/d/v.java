// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.executors.a;
import com.facebook.inject.d;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.d:
//            e, ae, s, t

class v extends d
{

    final s a;

    private v(s s)
    {
        a = s;
        super();
    }

    v(s s, t t)
    {
        this(s);
    }

    public e a()
    {
        return new e((a)a(com/facebook/common/executors/a), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread), (ae)a(com/facebook/orca/d/ae), (Handler)a(android/os/Handler, com/facebook/common/executors/ForUiThread));
    }

    public Object b()
    {
        return a();
    }
}
