// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.experience.Experiences;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXEndScreenFragment

class this._cls1 extends ApiResponseHandler
{

    final HomeFeedReady this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        pollHomeFeedReady();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        if (apiresponse.getCode() != 220)
        {
            Experiences.c().d(Experiences.a);
            NUXEndScreenFragment.access$000(_fld0);
            super.onSuccess(apiresponse);
            return;
        } else
        {
            pollHomeFeedReady();
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
