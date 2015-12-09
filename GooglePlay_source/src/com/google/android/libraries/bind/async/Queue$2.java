// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.async:
//            Queue, AsyncUtil

final class this._cls0
    implements Executor
{

    final Queue this$0;

    public final void execute(Runnable runnable)
    {
        if (!AsyncUtil.isMainThread())
        {
            runnable.run();
            return;
        } else
        {
            Queue.this.execute(runnable);
            return;
        }
    }

    l()
    {
        this$0 = Queue.this;
        super();
    }
}
