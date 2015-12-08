// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            EmailNotificationsSettingsFragment

class this._cls0 extends ApiResponseHandler
{

    final EmailNotificationsSettingsFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        MyUser.saveUserSettingsMe(apiresponse);
        EmailNotificationsSettingsFragment.access$300(EmailNotificationsSettingsFragment.this, apiresponse);
    }

    ()
    {
        this$0 = EmailNotificationsSettingsFragment.this;
        super();
    }
}
