// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.home.view.HomefeedBuilderGridCell;
import com.pinterest.activity.home.view.HomefeedBuilderOwnTopicGridCell;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Device;
import com.pinterest.schemas.event.InterestImpression;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.home.adapter:
//            HomefeedBuilderBaseAdapter

public class HomefeedBuilderGridAdapter extends HomefeedBuilderBaseAdapter
{

    protected static final int LOAD_MORE_INDEX;
    private boolean _isOwnTopic;

    public HomefeedBuilderGridAdapter()
    {
        _isOwnTopic = false;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        Interest interest;
        if (_isOwnTopic)
        {
            view = HomefeedBuilderOwnTopicGridCell.from(view, viewgroup);
        } else
        {
            view = HomefeedBuilderGridCell.from(view, viewgroup);
        }
        interest = (Interest)getItem(i);
        if (viewgroup != null)
        {
            viewgroup.getMeasuredWidth();
        }
        view.setInterest(interest, flag);
        view.setMode(_mode);
        view.setHandleFollow(false);
        if (!flag)
        {
            loadMore(i);
            viewgroup = new InterestImpression();
            viewgroup.setKey(interest.getKey());
            viewgroup.setImageSignature(interest.getImageSignature());
            viewgroup.setListPosition((short)i);
            _impressions.add(viewgroup);
        }
        return view;
    }

    public void setIsOwnTopic(boolean flag)
    {
        _isOwnTopic = flag;
    }

    protected boolean shouldLoadMore(int i)
    {
        while (_loading || i < getCount() - LOAD_MORE_INDEX) 
        {
            return false;
        }
        return true;
    }

    static 
    {
        int i;
        if (Device.isTablet())
        {
            i = 20;
        } else
        {
            i = 10;
        }
        LOAD_MORE_INDEX = i;
    }
}
