// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            ActionQueue

final class <init>
{

    final AsyncCallback callback;
    final Callable requestAction;
    final ActionQueue this$0;

    private (Callable callable, AsyncCallback asynccallback)
    {
        this$0 = ActionQueue.this;
        super();
        requestAction = callable;
        callback = asynccallback;
    }

    callback(Callable callable, AsyncCallback asynccallback, callback callback1)
    {
        this(callable, asynccallback);
    }
}
