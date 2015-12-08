// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            SettingsActivity, TextAndButtonListRowDisplay

final class this._cls0
    implements OnActionListener
{

    final SettingsActivity this$0;

    private void onAction(Void void1)
    {
        android.view.View view;
        int i;
        boolean flag;
        if (!emailSettingDisplay.isSwitchOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        analyticsUtil.sendToggleValue(flag, "EmailUpdates", new AnalyticsCustomDimension[0]);
        emailSettingDisplay.setSwitch(flag);
        userSettingsPublisher.updateSetting(101, flag);
        void1 = accessibilityUtil;
        view = emailSettingDisplay.getView();
        if (flag)
        {
            i = com.google.android.apps.walletnfcrel.iew_email_updates_enabled_description;
        } else
        {
            i = com.google.android.apps.walletnfcrel.iew_email_updates_disabled_description;
        }
        void1.announce(view, i);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    yUtil()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
