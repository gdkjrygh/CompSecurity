// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class val.email extends ApiResponseHandler
{

    final MainActivity this$0;
    final String val$email;

    public void onSuccess(ApiResponse apiresponse)
    {
        Application.showToast(Resources.string(0x7f07016b, new Object[] {
            val$email
        }));
    }

    _cls9()
    {
        this$0 = final_mainactivity;
        val$email = String.this;
        super();
    }
}
