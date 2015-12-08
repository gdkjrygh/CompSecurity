// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.view.View;
import com.pinterest.activity.user.view.UserFollowedPinnersView;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls1 extends com.pinterest.api.remote.se
{

    final apter this$1;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (getView() == null)
        {
            return;
        }
        Object obj;
        boolean flag;
        if (feed.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(_seeAllPinnersBt, flag);
        obj = getView().getContext();
        feed = (UserFeed)feed;
        obj = new PeopleListAdapter(((android.content.Context) (obj)));
        ((PeopleListAdapter) (obj)).setDataSource(feed);
        _followedPinners.setAdapter(((android.widget.Adapter) (obj)));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
