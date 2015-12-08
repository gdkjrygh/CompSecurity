// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.activity.signin.dialog.LoginFailureDialog;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class e extends com.pinterest.api.remote.nse
{

    final SocialConnectActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        boolean flag = true;
        if (SocialConnectActivity.access$1100(SocialConnectActivity.this).a() != 5) goto _L2; else goto _L1
_L1:
        if (apiresponse.getCode() != 30) goto _L4; else goto _L3
_L3:
        getGPlusOneTimeCode();
_L7:
        if (!flag)
        {
            Events.post(new DialogEvent(new LoginFailureDialog(throwable, apiresponse)));
        }
        return;
_L4:
        if (apiresponse.getCode() == 180)
        {
            SocialConnectActivity.access$1200(SocialConnectActivity.this);
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (SocialConnectActivity.access$1100(SocialConnectActivity.this).a() == 3 && SocialConnectActivity.access$1300(SocialConnectActivity.this, apiresponse.getCode()))
        {
            onFacebookSignup();
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onStart()
    {
        super.onStart();
        Events.post(new DialogEvent(new LoadingDialog()));
    }

    public void onTokenSaved()
    {
        MyUserApi.a(SocialConnectActivity.access$900(SocialConnectActivity.this), SocialConnectActivity.access$1000(SocialConnectActivity.this));
    }

    alog()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
