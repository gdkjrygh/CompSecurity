// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupBoardFragment

class this._cls0 extends com.pinterest.api.remote.ardFragment._cls2
{

    final UnauthSignupBoardFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, (new StringBuilder("Pins missing from board data: ")).append(apiresponse.toString()).toString(), new Object[0]);
        UnauthSignupBoardFragment.access$000(UnauthSignupBoardFragment.this);
    }

    (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = UnauthSignupBoardFragment.this;
        super(feedapiresponsehandler);
    }
}
