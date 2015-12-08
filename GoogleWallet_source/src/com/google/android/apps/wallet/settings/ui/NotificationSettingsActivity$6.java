// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.view.View;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity, NotificationSoundPicker, TextAndButtonListRowDisplay

final class this._cls0
    implements android.view.otificationSettingsActivity._cls6
{

    final NotificationSettingsActivity this$0;

    public final void onClick(View view)
    {
        userSettingsPublisher.updateSetting(104, NotificationSettingsActivity.access$400(NotificationSettingsActivity.this).getRingtoneLocation());
        NotificationSettingsActivity.access$500(NotificationSettingsActivity.this).setTitle(getString(com.google.android.apps.walletnfcrel.ity.getString));
        NotificationSettingsActivity.access$500(NotificationSettingsActivity.this).setSubtitle(NotificationSettingsActivity.access$400(NotificationSettingsActivity.this).getRingtoneTitle());
    }

    ()
    {
        this$0 = NotificationSettingsActivity.this;
        super();
    }
}
