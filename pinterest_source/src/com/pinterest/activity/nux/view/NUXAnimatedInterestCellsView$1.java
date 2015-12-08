// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import com.pinterest.activity.nux.fragment.NUXEndScreenFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXAnimatedInterestCellsView

class this._cls0
    implements Runnable
{

    final NUXAnimatedInterestCellsView this$0;

    public void run()
    {
        InterestsApi.a(MyUser.getUid(), -1, new com.pinterest.api.remote.sponse(_followedInterestsHandler), com/pinterest/activity/nux/fragment/NUXEndScreenFragment.getName());
    }

    ()
    {
        this$0 = NUXAnimatedInterestCellsView.this;
        super();
    }
}
