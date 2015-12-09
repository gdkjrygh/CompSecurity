// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;


// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            RegistrationCallback, BroadcastEventPublisher

final class this._cls0
    implements RegistrationCallback
{

    final BroadcastEventPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        if (BroadcastEventPublisher.access$400(BroadcastEventPublisher.this))
        {
            BroadcastEventPublisher.access$402(BroadcastEventPublisher.this, false);
            BroadcastEventPublisher.access$500(BroadcastEventPublisher.this);
        }
        BroadcastEventPublisher.access$200(BroadcastEventPublisher.this);
    }

    ()
    {
        this$0 = BroadcastEventPublisher.this;
        super();
    }
}
