// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.CompletedAsyncResult;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.skype.android.app.signin:
//            LiveIdWebClient

static final class val.callback extends FutureTask
{

    final AsyncCallback val$callback;

    protected final void done()
    {
        super.done();
        if (val$callback == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        val$callback.done(new CompletedAsyncResult(get(), null));
        return;
        Throwable throwable;
        throwable;
        val$callback.done(new CompletedAsyncResult(throwable));
        return;
    }

    lt(Callable callable, AsyncCallback asynccallback)
    {
        val$callback = asynccallback;
        super(callable);
    }
}
