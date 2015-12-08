// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.BusinessType;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonArray;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialogView

class val.response extends BackgroundTask
{

    final val.response this$1;
    final ApiResponse val$response;

    public void run()
    {
        java.util.List _tmp = BusinessSignupDialogView.access$002(BusinessType.makeAll((PinterestJsonArray)val$response.getData()));
    }

    ()
    {
        this$1 = final_;
        val$response = ApiResponse.this;
        super();
    }
}
