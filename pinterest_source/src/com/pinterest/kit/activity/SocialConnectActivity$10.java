// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.google.android.gms.auth.GoogleAuthUtil;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.signin.dialog.SignupFailureDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.DeepLinkLogging;
import com.pinterest.analytics.FunnelActions;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0 extends ApiResponseHandler
{

    final SocialConnectActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Events.post(new DialogEvent(new SignupFailureDialog(throwable, apiresponse, SocialConnectActivity.access$1400(SocialConnectActivity.this).(), null)));
    }

    public void onFinish()
    {
        ActivityHelper.setPostSignup(true);
        switch (SocialConnectActivity.access$1400(SocialConnectActivity.this).())
        {
        default:
            return;

        case 5: // '\005'
            GoogleAuthUtil.invalidateToken(SocialConnectActivity.this, SocialConnectActivity.access$1500(SocialConnectActivity.this));
            break;
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        MyUser.setAccessToken((String)apiresponse.getData());
        AnalyticsApi.a(FunnelActions.b(SocialConnectActivity.access$1400(SocialConnectActivity.this).()));
        Pinalytics.a(EventType.USER_CREATE, null, Pinalytics.b());
        (new DeepLinkLogging()).a(EventType.REFERRER_APP_SIGNUP);
        MyUserApi.a(SocialConnectActivity.access$900(SocialConnectActivity.this), SocialConnectActivity.access$1000(SocialConnectActivity.this));
    }

    alog(boolean flag)
    {
        this$0 = SocialConnectActivity.this;
        super(flag);
    }
}
