// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.CommentFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinCommentsFragment

class <init> extends com.pinterest.api.remote.piResponse
{

    final PinCommentsFragment this$0;

    public String getPinUid()
    {
        return PinCommentsFragment.access$300(PinCommentsFragment.this).getId();
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (_footerView != null)
        {
            _footerView.setState(1);
        }
    }

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        super.onFailure(throwable, pinterestjsonobject);
        if (_footerView != null)
        {
            _footerView.setState(1);
        }
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        PinCommentsFragment.access$100(PinCommentsFragment.this, (CommentFeed)feed);
        if (_footerView != null)
        {
            _footerView.setState(1);
        }
    }

    ()
    {
        this$0 = PinCommentsFragment.this;
        super();
    }
}
