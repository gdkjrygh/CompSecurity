// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import com.pinterest.api.model.User;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.user.view:
//            FollowUserButton

class se extends com.pinterest.api.remote.piResponse
{

    final FollowUserButton this$0;

    public void onFailure()
    {
        User user = FollowUserButton.access$000(FollowUserButton.this);
        boolean flag;
        if (!Constants.isTrue(FollowUserButton.access$000(FollowUserButton.this).getExplicitFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user.setFollowing(flag);
        updateDisplay();
    }

    public void onFinish()
    {
        super.onFinish();
        setLoading(false);
        FollowUserButton.access$102(FollowUserButton.this, false);
    }

    public void onStart()
    {
        super.onStart();
        setLoading(true);
    }

    public void onSuccess(User user)
    {
    }

    se()
    {
        this$0 = FollowUserButton.this;
        super();
    }
}
