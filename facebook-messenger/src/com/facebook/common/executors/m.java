// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

// Referenced classes of package com.facebook.common.executors:
//            l

class m extends l
    implements RunnableFuture
{

    public m(Handler handler, Runnable runnable, Object obj)
    {
        super(handler, runnable, obj);
    }

    public m(Handler handler, Callable callable)
    {
        super(handler, callable);
    }
}
