// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.ui.TopicAnnotationCell;

public class LibraryTopicListAdapter extends PinterestBaseAdapter
{

    public static final int TOPIC_ID_FIRST = 1;
    public static final int TOPIC_ID_OTHER = 99;
    private int _selectedPosition;

    public LibraryTopicListAdapter()
    {
        _selectedPosition = -1;
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.getCount();
        }
    }

    public Interest getItem(int i)
    {
        if (_dataSource == null)
        {
            return null;
        } else
        {
            return (Interest)_dataSource.get(i);
        }
    }

    public volatile Model getItem(int i)
    {
        return getItem(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getSelectedPosition()
    {
        return _selectedPosition;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag3 = false;
        boolean flag = true;
        Interest interest = getItem(i);
        if (interest == null)
        {
            return view;
        }
        view = TopicAnnotationCell.get(view, viewgroup);
        viewgroup = interest.getName();
        boolean flag1;
        boolean flag2;
        if (_selectedPosition == i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i == getCount() - 1)
        {
            flag3 = true;
        }
        view.updateUI(viewgroup, flag1, flag2, flag3);
        if (i == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 99;
        }
        view.setId(i);
        return view;
    }

    public void setSelectedPosition(int i)
    {
        _selectedPosition = i;
        notifyDataSetChanged();
    }
}
