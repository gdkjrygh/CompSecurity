// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.graphics.Bitmap;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;

class this._cls1 extends BaseApiResponseHandler
{

    final l.ss this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast("Report failed, try again.");
        super.onFailure(throwable, apiresponse);
    }

    public void onFinish()
    {
        ss.recycle();
    }

    public void onStart()
    {
        Application.showToast("Sending report...");
        super.onStart();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Application.showToast("Report sent!");
        super.onSuccess(apiresponse);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
