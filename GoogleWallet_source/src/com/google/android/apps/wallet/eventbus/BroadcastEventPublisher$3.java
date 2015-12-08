// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            BroadcastEventPublisher

final class this._cls0 extends BroadcastReceiver
{

    final BroadcastEventPublisher this$0;

    public final void onReceive(Context context, Intent intent)
    {
        Preconditions.checkNotNull(intent);
        context = ((Context) (translateIntent(intent)));
        if (!BroadcastEventPublisher.access$100(BroadcastEventPublisher.this).isPresent() || !Objects.equal(context, BroadcastEventPublisher.access$100(BroadcastEventPublisher.this).get()))
        {
            BroadcastEventPublisher.access$102(BroadcastEventPublisher.this, Optional.of(context));
            BroadcastEventPublisher.access$200(BroadcastEventPublisher.this);
        }
    }

    ()
    {
        this$0 = BroadcastEventPublisher.this;
        super();
    }
}
