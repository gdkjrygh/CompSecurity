// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0 extends ApiResponseHandler
{

    final UpdatedAccountSettingsFragment this$0;

    public void onFinish()
    {
        super.onFinish();
        UpdatedAccountSettingsFragment.access$000(UpdatedAccountSettingsFragment.this, com.pinterest.base.gsFragment);
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        Pinalytics.a(EventType.USER_DISABLE_GPLUS, "0");
        Preferences.user().set("PREF_CONNETED_GPLUS", false);
    }

    (boolean flag)
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super(flag);
    }
}
