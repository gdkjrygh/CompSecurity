// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderBaseFragment

class val.interest extends ApiResponseHandler
{

    final HomefeedBuilderBaseFragment this$0;
    final Interest val$interest;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        throwable = val$interest;
        boolean flag;
        if (!val$interest.getFollowing().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        throwable.setFollowing(Boolean.valueOf(flag));
    }

    public void onFinish()
    {
        super.onFinish();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        ModelHelper.setInterest(val$interest);
        Events.post(new com.pinterest.api.model.t._cls1.val.interest(val$interest, val$interest.getFollowing()));
        updateFollowingCount();
    }

    ()
    {
        this$0 = final_homefeedbuilderbasefragment;
        val$interest = Interest.this;
        super();
    }
}
