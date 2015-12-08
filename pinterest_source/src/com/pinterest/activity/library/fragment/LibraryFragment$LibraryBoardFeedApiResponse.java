// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0 extends com.pinterest.api.remote.eedApiResponse
{

    final LibraryFragment this$0;

    public void onFinish()
    {
        super.inish();
        if (LibraryFragment.access$3000(LibraryFragment.this) != null)
        {
            LibraryFragment.access$3100(LibraryFragment.this).setRefreshing(false);
        }
        LibraryFragment.access$3202(LibraryFragment.this, false);
    }

    public void onSuccess(Feed feed)
    {
        super.uccess(feed);
        if (feed == null || feed.getCode() != 0)
        {
            return;
        } else
        {
            LibraryFragment.access$2400(LibraryFragment.this);
            LibraryFragment.access$2900(LibraryFragment.this, (LibraryFeed)feed);
            return;
        }
    }

    Y(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = LibraryFragment.this;
        super(feedapiresponsehandler);
    }
}
