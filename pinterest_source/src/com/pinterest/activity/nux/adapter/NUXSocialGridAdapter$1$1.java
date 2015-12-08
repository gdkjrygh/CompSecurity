// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.nux.adapter:
//            NUXSocialGridAdapter

class val.nextUserFeed
    implements Runnable
{

    final fyDataSetChanged this$1;
    final Feed val$nextUserFeed;

    public void run()
    {
        setSpinnerState(1);
        NUXSocialGridAdapter.access$002(_fld0, false);
        NUXSocialGridAdapter.access$100(_fld0).appendItems(val$nextUserFeed);
        if (val$nextUserFeed.getCount() == 0)
        {
            loadMore(position);
            return;
        } else
        {
            notifyDataSetChanged();
            return;
        }
    }

    A()
    {
        this$1 = final_a;
        val$nextUserFeed = Feed.this;
        super();
    }
}
