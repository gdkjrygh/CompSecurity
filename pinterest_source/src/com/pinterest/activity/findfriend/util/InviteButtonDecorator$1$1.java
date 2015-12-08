// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.findfriend.util:
//            InviteButtonDecorator, InviteUtil

class this._cls1 extends BaseApiResponseHandler
{

    final is._cls0 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
        InviteButtonDecorator.access$200(_fld0).startActivity(InviteButtonDecorator.access$100(_fld0));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (!(apiresponse instanceof PinterestJsonObject))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        apiresponse = (PinterestJsonObject)apiresponse;
        InviteButtonDecorator.access$002(_fld0, apiresponse.a("message", ""));
        apiresponse = apiresponse.a("invite_code", "");
        InviteButtonDecorator.access$200(_fld0).startActivity(InviteButtonDecorator.access$100(_fld0));
        UserApi.a(InviteButtonDecorator.access$300(_fld0), apiresponse, InviteUtil.getInviteSource(), InviteButtonDecorator.access$400(_fld0));
        return;
        apiresponse;
        PLog.error(apiresponse, "app not existed", new Object[0]);
        return;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
