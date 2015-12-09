// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.settings.api.SettingsApi;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity

final class this._cls0
    implements OnActionListener
{

    final NotificationSettingsActivity this$0;

    private void onAction(Void void1)
    {
        startActivity(SettingsApi.createLowBalanceSettingsActivityIntentForSettings(NotificationSettingsActivity.this));
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    ()
    {
        this$0 = NotificationSettingsActivity.this;
        super();
    }
}
