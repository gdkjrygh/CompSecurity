// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            UserStoryCell

class nse extends com.pinterest.api.remote.owApiResponse
{

    final UserStoryCell this$0;

    public void onFailure()
    {
        User user = UserStoryCell.access$000(UserStoryCell.this);
        boolean flag;
        if (!UserStoryCell.access$000(UserStoryCell.this).getFollowing().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user.setFollowing(flag);
        updateFollowing();
    }

    public void onSuccess(User user)
    {
        UserStoryCell.access$002(UserStoryCell.this, user);
    }

    nse()
    {
        this$0 = UserStoryCell.this;
        super();
    }
}
