// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.ArrayDeque;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            ActionQueue

final class k
    implements AsyncCallback
{

    final ActionQueue this$0;
    final AsyncCallback val$callback;

    public final void onFailure(Exception exception)
    {
        ActionQueue.access$100(ActionQueue.this).remove();
        val$callback.onFailure(exception);
    }

    public final void onSuccess(Object obj)
    {
        ActionQueue.access$100(ActionQueue.this).remove();
        val$callback.onSuccess(obj);
    }

    k()
    {
        this$0 = final_actionqueue;
        val$callback = AsyncCallback.this;
        super();
    }
}
