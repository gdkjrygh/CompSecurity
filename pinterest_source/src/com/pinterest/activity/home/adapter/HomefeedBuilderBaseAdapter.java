// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.adapter;

import com.pinterest.adapter.PinterestBaseAdapter;
import java.util.ArrayList;

public class HomefeedBuilderBaseAdapter extends PinterestBaseAdapter
{

    protected ArrayList _impressions;
    protected com.pinterest.activity.home.HomefeedBuilderFragment.MODE _mode;

    public HomefeedBuilderBaseAdapter()
    {
        _impressions = new ArrayList();
    }

    public void clearImpressions()
    {
        _impressions.clear();
    }

    public ArrayList getImpressions()
    {
        return _impressions;
    }

    public void setMode(com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        _mode = mode;
    }
}
