// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.ui.megaphone.MegaphoneView;

// Referenced classes of package com.pinterest.activity.home:
//            HomeFragment

class this._cls1 extends ApiResponseHandler
{

    final is._cls0 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Application.showToast(apiresponse.getMessageDisplay());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        HomeFragment.access$1100(_fld0).hide();
        HomeFragment.access$1200(_fld0);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
