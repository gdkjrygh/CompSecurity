// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionExecutor

final class val.action
    implements ishedCallback
{

    final ActionExecutor this$0;
    final Callable val$action;
    final stractRequest val$request;

    public final void onFinished()
    {
        Preconditions.checkState(val$request.isFinished());
        ActionExecutor.access$000(ActionExecutor.this).get(val$action).remove(val$request);
    }

    stractRequest()
    {
        this$0 = final_actionexecutor;
        val$request = stractrequest;
        val$action = Callable.this;
        super();
    }
}
