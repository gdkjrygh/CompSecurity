// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

public class  extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.USER_PASSWORD_RESET_REQUEST, null);
        if (MyUser.get().getEmail() != null)
        {
            Application.showToast(String.format(Resources.string(0x7f0704bb), new Object[] {
                MyUser.get().getEmail()
            }));
        }
    }

    public ()
    {
    }
}
