// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0 extends BaseApiResponseHandler
{

    final BaseBoardFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        BaseBoardFragment.access$1900(BaseBoardFragment.this, (PinterestJsonObject)apiresponse.getData());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        BaseBoardFragment.access$1900(BaseBoardFragment.this, (PinterestJsonObject)apiresponse.getData());
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
