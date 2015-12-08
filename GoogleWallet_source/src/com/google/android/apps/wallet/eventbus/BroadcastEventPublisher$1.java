// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            BroadcastEventPublisher

final class this._cls0
    implements AsyncCallback
{

    final BroadcastEventPublisher this$0;

    public final void onFailure(Exception exception)
    {
        ThreadChecker _tmp = BroadcastEventPublisher.access$000(BroadcastEventPublisher.this);
        ThreadChecker.checkOnUiThread();
        WLog.e(BroadcastEventPublisher.access$300(), "Error getting initial event", exception);
    }

    public final void onSuccess(Object obj)
    {
        ThreadChecker _tmp = BroadcastEventPublisher.access$000(BroadcastEventPublisher.this);
        ThreadChecker.checkOnUiThread();
        if (!BroadcastEventPublisher.access$100(BroadcastEventPublisher.this).isPresent() && obj != null)
        {
            BroadcastEventPublisher.access$102(BroadcastEventPublisher.this, Optional.of(obj));
            BroadcastEventPublisher.access$200(BroadcastEventPublisher.this);
        }
    }

    ()
    {
        this$0 = BroadcastEventPublisher.this;
        super();
    }
}
