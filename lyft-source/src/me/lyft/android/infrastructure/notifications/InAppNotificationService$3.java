// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.notifications;

import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.notifications.LyftNotificationsResponseDTO;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SecureObserver;

// Referenced classes of package me.lyft.android.infrastructure.notifications:
//            InAppNotificationService

class this._cls0 extends SecureObserver
{

    final InAppNotificationService this$0;

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((LyftNotificationsResponseDTO)obj);
    }

    public void onSafeNext(LyftNotificationsResponseDTO lyftnotificationsresponsedto)
    {
        super.onSafeNext(lyftnotificationsresponsedto);
        InAppNotificationService.access$100(InAppNotificationService.this, lyftnotificationsresponsedto);
        InAppNotificationService.access$200(InAppNotificationService.this).onNext(Unit.create());
    }

    nseDTO()
    {
        this$0 = InAppNotificationService.this;
        super();
    }
}
