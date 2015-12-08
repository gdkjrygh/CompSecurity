// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            ExecutorDelivery

class a
    implements Executor
{

    final Handler a;
    final ExecutorDelivery b;

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    (ExecutorDelivery executordelivery, Handler handler)
    {
        b = executordelivery;
        a = handler;
        super();
    }
}
