// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity, TextAndButtonListRowDisplay

final class val.setting
    implements ggleCallback
{

    final NotificationSettingsActivity this$0;
    final com.google.wallet.proto.api.ng val$setting;
    final TextAndButtonListRowDisplay val$viewHolder;

    public final void onToggle(boolean flag)
    {
        val$viewHolder.setSwitch(flag);
        userSettingsPublisher.updateSetting(val$setting.id.intValue(), flag);
        accessibilityUtil.announce(val$viewHolder.getView(), (new StringBuilder()).append(val$setting.title).append(" ").append(NotificationSettingsActivity.access$600(NotificationSettingsActivity.this, flag)).toString());
        if (val$setting.analyticsLabel != null)
        {
            analyticsUtil.sendToggleValue(flag, val$setting.analyticsLabel, new AnalyticsCustomDimension[0]);
        }
    }

    ggleCallback()
    {
        this$0 = final_notificationsettingsactivity;
        val$viewHolder = textandbuttonlistrowdisplay;
        val$setting = com.google.wallet.proto.api.ng.this;
        super();
    }
}
