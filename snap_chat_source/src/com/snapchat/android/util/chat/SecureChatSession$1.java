// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import com.snapchat.android.Timber;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

static final class 
    implements RejectedExecutionHandler
{

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        Timber.f("SecureChatSession", (new StringBuilder("rejecting execution of runnable, shutdown=")).append(threadpoolexecutor.isShutdown()).toString(), new Object[0]);
    }

    ()
    {
    }
}
