// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.calling.SeamlessCapabilityReceiver;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.wearable.CarReadReceiver;
import com.skype.android.app.wearable.WearReplyReceiver;
import com.skype.android.config.partner.CampaignReceiver;
import com.skype.android.push.RegisterReceiver;
import com.skype.android.service.ContactsAlarmReceiver;
import com.skype.android.service.GetAccountReceiver;
import com.skype.android.service.LocaleChangedReceiver;

// Referenced classes of package com.skype.android:
//            SkypeBroadcastReceiver

public interface SkypeBroadcastReceiverComponent
{

    public abstract void inject(SkypeBroadcastReceiver skypebroadcastreceiver);

    public abstract void inject(SeamlessCapabilityReceiver seamlesscapabilityreceiver);

    public abstract void inject(SnoozeNotificationHelper snoozenotificationhelper);

    public abstract void inject(CarReadReceiver carreadreceiver);

    public abstract void inject(WearReplyReceiver wearreplyreceiver);

    public abstract void inject(CampaignReceiver campaignreceiver);

    public abstract void inject(RegisterReceiver registerreceiver);

    public abstract void inject(ContactsAlarmReceiver contactsalarmreceiver);

    public abstract void inject(GetAccountReceiver getaccountreceiver);

    public abstract void inject(LocaleChangedReceiver localechangedreceiver);
}
