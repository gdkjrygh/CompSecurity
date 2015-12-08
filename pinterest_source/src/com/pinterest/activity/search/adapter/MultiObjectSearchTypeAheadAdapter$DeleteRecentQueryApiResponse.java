// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

class <init> extends BaseApiResponseHandler
{

    final MultiObjectSearchTypeAheadAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
    }

    private ()
    {
        this$0 = MultiObjectSearchTypeAheadAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
