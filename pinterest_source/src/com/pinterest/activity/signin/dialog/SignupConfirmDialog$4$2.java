// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

class this._cls1 extends ApiResponseHandler
{

    final this._cls1 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        cess._mth500(this._cls1.this);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        if ("1".equals(apiresponse.getData()))
        {
            cess._mth600(this._cls1.this);
            return;
        } else
        {
            cess._mth500(this._cls1.this);
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
