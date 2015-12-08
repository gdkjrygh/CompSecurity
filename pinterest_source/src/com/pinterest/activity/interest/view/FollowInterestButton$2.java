// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Interest;

// Referenced classes of package com.pinterest.activity.interest.view:
//            FollowInterestButton

class this._cls0 extends ApiResponseHandler
{

    final FollowInterestButton this$0;

    public void onFinish()
    {
        _pendingApiResponse = false;
        setLoading(false);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        boolean flag;
        if (apiresponse instanceof String)
        {
            flag = Boolean.valueOf((String)apiresponse).booleanValue();
        } else
        {
            flag = false;
        }
        _interest.setFollowing(Boolean.valueOf(flag));
        FollowInterestButton.access$000(FollowInterestButton.this);
        FollowInterestButton.access$100(FollowInterestButton.this);
    }

    A()
    {
        this$0 = FollowInterestButton.this;
        super();
    }
}
