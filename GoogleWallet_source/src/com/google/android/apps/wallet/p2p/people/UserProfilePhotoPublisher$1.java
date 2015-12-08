// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.common.cache.Cache;

// Referenced classes of package com.google.android.apps.wallet.p2p.people:
//            UserProfilePhotoPublisher, UserProfilePhotoEvent

final class this._cls0
    implements RegistrationCallback
{

    final UserProfilePhotoPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        UserProfilePhotoEvent userprofilephotoevent1 = (UserProfilePhotoEvent)UserProfilePhotoPublisher.access$100(UserProfilePhotoPublisher.this).getIfPresent(UserProfilePhotoPublisher.access$000());
        EventBus eventbus = UserProfilePhotoPublisher.access$300(UserProfilePhotoPublisher.this);
        UserProfilePhotoEvent userprofilephotoevent;
        if (userprofilephotoevent1 != null)
        {
            userprofilephotoevent = userprofilephotoevent1;
        } else
        {
            userprofilephotoevent = new UserProfilePhotoEvent(UserProfilePhotoPublisher.access$200(UserProfilePhotoPublisher.this));
        }
        eventbus.post(obj, userprofilephotoevent);
        if (userprofilephotoevent1 == null)
        {
            UserProfilePhotoPublisher.access$400(UserProfilePhotoPublisher.this);
        }
    }

    ()
    {
        this$0 = UserProfilePhotoPublisher.this;
        super();
    }
}
