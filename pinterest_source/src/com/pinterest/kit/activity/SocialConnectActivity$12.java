// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0 extends ApiResponseHandler
{

    final SocialConnectActivity this$0;

    public void onFinish()
    {
        super.onFinish();
        Events.post(new com.pinterest.base.(com.pinterest.base., false));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.USER_DISABLE_GPLUS, "0");
        Preferences.user().set("PREF_CONNETED_GPLUS", false);
    }

    _cls9(boolean flag)
    {
        this$0 = SocialConnectActivity.this;
        super(flag);
    }
}
