// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.findfriend.util:
//            InviteUtil

final class val.phoneNumber extends BaseApiResponseHandler
{

    final Activity val$activity;
    final String val$phoneNumber;
    final String val$tag;

    private Intent getSMSIntent(String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((new StringBuilder("sms:")).append(s).toString()));
        intent.putExtra("sms_body", s1);
        intent.putExtra("exit_on_sent", true);
        return intent;
    }

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        String s;
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (!(apiresponse instanceof PinterestJsonObject))
        {
            break MISSING_BLOCK_LABEL_64;
        }
        apiresponse = (PinterestJsonObject)apiresponse;
        s = apiresponse.a("message", "");
        UserApi.a("register_invite_sms", apiresponse.a("invite_code", ""), InviteUtil.getInviteSource(), val$tag);
        val$activity.startActivityForResult(getSMSIntent(val$phoneNumber, s), 106);
        return;
        apiresponse;
        Application.showToast(0x7f070567);
        return;
    }

    _cls9()
    {
        val$tag = s;
        val$activity = activity1;
        val$phoneNumber = s1;
        super();
    }
}
