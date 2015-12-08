// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinLikesFragment

class nit> extends com.pinterest.api.remote.Response
{

    final PinLikesFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        PinLikesFragment.access$000(PinLikesFragment.this, throwable, apiresponse);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        onPeopleLoaded((UserFeed)feed);
    }

    ()
    {
        this$0 = PinLikesFragment.this;
        super();
    }
}
