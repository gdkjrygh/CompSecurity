// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import com.pinterest.api.model.MyUser;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            EmailNotificationsSettingsFragment

class this._cls0
    implements com.pinterest.base.onsSettingsFragment._cls1
{

    final EmailNotificationsSettingsFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.ttingsFragment._cls1 _pcls1)
    {
        if (MyUser.get() != null)
        {
            EmailNotificationsSettingsFragment.access$000(EmailNotificationsSettingsFragment.this, MyUser.getJsonUserSettings());
        }
    }

    ()
    {
        this$0 = EmailNotificationsSettingsFragment.this;
        super();
    }
}
