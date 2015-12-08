// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.adapter;

import com.pinterest.adapter.PinterestBaseAdapter;
import java.util.List;

public class ExploreBaseAdapter extends PinterestBaseAdapter
{

    protected List _contextualItems;
    protected boolean _isLoading;
    protected List _recentCategories;

    public ExploreBaseAdapter()
    {
    }

    public final void finishedLoading()
    {
        _isLoading = false;
    }

    public boolean isLoading()
    {
        return _isLoading;
    }

    public final void setLoading(boolean flag)
    {
        _isLoading = flag;
    }

    public void setRecentCategories(List list)
    {
        _recentCategories = list;
        notifyDataSetChanged();
    }
}
