// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            UserStoryCell

class this._cls0
    implements com.pinterest.base.scriber
{

    final UserStoryCell this$0;

    public void onEventMainThread(com.pinterest.api.model. )
    {
        if (UserStoryCell.access$000(UserStoryCell.this) != null && UserStoryCell.access$000(UserStoryCell.this).equals(.getUser()))
        {
            UserStoryCell.access$000(UserStoryCell.this).setFollowing(.getUser().getFollowing().booleanValue());
            updateFollowing();
        }
    }

    ()
    {
        this$0 = UserStoryCell.this;
        super();
    }
}
