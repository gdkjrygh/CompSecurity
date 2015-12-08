// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.util.proto.Protos;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEventPublisher

final class this._cls0
    implements EventHandler
{

    final ClaimablePurchaseRecordEventPublisher this$0;

    private void handleEvent(com.google.wallet.proto.ndle.SystemNotification systemnotification)
    {
        if (Protos.valuesEqual(systemnotification.type, 4))
        {
            invalidate();
            ClaimablePurchaseRecordEventPublisher.access$000(ClaimablePurchaseRecordEventPublisher.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((com.google.wallet.proto.ndle.SystemNotification)obj);
    }

    Notification()
    {
        this$0 = ClaimablePurchaseRecordEventPublisher.this;
        super();
    }
}
