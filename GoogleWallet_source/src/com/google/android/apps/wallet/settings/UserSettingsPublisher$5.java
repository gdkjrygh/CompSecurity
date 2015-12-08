// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsPublisher, UserSettingsEvent

final class this._cls0
    implements AsyncCallback
{

    final UserSettingsPublisher this$0;

    private void onSuccess(com.google.wallet.proto.api.SettingsResponse settingsresponse)
    {
        UserSettingsPublisher.access$402(UserSettingsPublisher.this, false);
        if (settingsresponse.callError != null)
        {
            settingsresponse = new UserSettingsEvent(settingsresponse.callError);
        } else
        {
            settingsresponse = new UserSettingsEvent(settingsresponse.settings);
        }
        UserSettingsPublisher.access$200(UserSettingsPublisher.this).post(settingsresponse);
    }

    public final void onFailure(Exception exception)
    {
        UserSettingsPublisher.access$402(UserSettingsPublisher.this, false);
        WLog.efmt(UserSettingsPublisher.access$500(), "Exception in RPC trying to retrieve Settings from xBar: %s", new Object[] {
            exception
        });
        UserSettingsPublisher.access$200(UserSettingsPublisher.this).post(new UserSettingsEvent(exception));
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
