// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.notifications.CustomLayoutNotificationFactory;

// Referenced classes of package com.accuweather.android:
//            MainApplication

public class PushApplication extends MainApplication
{

    public PushApplication()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        Logger.i(this, "oncreate");
        Object obj = AirshipConfigOptions.loadDefaultOptions(this);
        obj.analyticsEnabled = false;
        UAirship.takeOff(this, ((AirshipConfigOptions) (obj)));
        obj = new CustomLayoutNotificationFactory(this);
        obj.statusBarIconDrawableId = R.drawable.alert_img_small;
        obj.layout = R.layout.notification_template_base;
        obj.layoutIconDrawableId = R.drawable.alert_img_push;
        obj.layoutIconId = R.id.icon;
        obj.layoutSubjectId = R.id.title;
        obj.layoutMessageId = R.id.text2;
        Utilities.notifyResetGAWidgetAlarmService(getApplicationContext());
        UAirship.shared().getPushManager().setNotificationFactory(((com.urbanairship.push.notifications.NotificationFactory) (obj)));
    }
}
