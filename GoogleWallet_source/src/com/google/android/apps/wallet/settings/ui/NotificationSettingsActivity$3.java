// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.settings.UserSettingsPublisher;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity

final class this._cls0
    implements ggleCallback
{

    final NotificationSettingsActivity this$0;

    public final void onToggle(boolean flag)
    {
        NotificationSettingsActivity.access$100(NotificationSettingsActivity.this, flag);
        userSettingsPublisher.updateSetting(100, flag);
    }

    ggleCallback()
    {
        this$0 = NotificationSettingsActivity.this;
        super();
    }
}
