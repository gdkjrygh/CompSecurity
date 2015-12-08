// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.adapter.InterestsGridAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.ui.grid.AddGridCell;

public class MyUserInterestsGridAdapter extends InterestsGridAdapter
{

    private static final int CELL_TYPE_COUNT = 2;
    private static final int INDEX_CREATE_CELL = 0;
    private static final int STATIC_CELL_COUNT = 1;
    public static final int TYPE_CREATE_CELL = 1;
    public static final int TYPE_INTEREST_CELL = 0;

    public MyUserInterestsGridAdapter()
    {
    }

    public int getCount()
    {
        int j = super.getCount();
        int i = j;
        if (_dataSource != null)
        {
            i = j + 1;
        }
        return i;
    }

    public Interest getItem(int i)
    {
        if (i <= 0)
        {
            return null;
        } else
        {
            return (Interest)super.getItem(i - 1);
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

    public int getItemHeight(int i, int j, boolean flag)
    {
        if (!LocaleUtils.isLanguageEn() && i == 0)
        {
            return 0;
        } else
        {
            return super.getItemHeight(i, j, flag);
        }
    }

    public int getItemSpan(int i)
    {
        switch (getItemViewType(i))
        {
        default:
            return super.getItemSpan(i);

        case 1: // '\001'
            return 1;
        }
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        switch (getItemViewType(i))
        {
        default:
            return super.getView(i, view, viewgroup, flag);

        case 1: // '\001'
            return AddGridCell.from(view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
