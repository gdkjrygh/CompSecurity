// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsPublisher, UserSettingsEvent

final class this._cls0
    implements AsyncCallback
{

    final UserSettingsPublisher this$0;

    private void onSuccess(com.google.wallet.proto.api.SettingsResponse settingsresponse)
    {
        if (settingsresponse == null || settingsresponse.settings == null)
        {
            return;
        } else
        {
            UserSettingsPublisher.access$200(UserSettingsPublisher.this).post(new UserSettingsEvent(settingsresponse.settings));
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.SettingsResponse)obj);
    }

    onse()
    {
        this$0 = UserSettingsPublisher.this;
        super();
    }
}
