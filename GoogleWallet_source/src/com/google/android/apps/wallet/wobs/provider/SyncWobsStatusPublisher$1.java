// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            SyncWobsStatusPublisher

final class this._cls0
    implements RegistrationCallback
{

    final SyncWobsStatusPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        SyncWobsStatusPublisher.access$100(SyncWobsStatusPublisher.this).post(SyncWobsStatusPublisher.access$000(SyncWobsStatusPublisher.this));
    }

    ()
    {
        this$0 = SyncWobsStatusPublisher.this;
        super();
    }
}
