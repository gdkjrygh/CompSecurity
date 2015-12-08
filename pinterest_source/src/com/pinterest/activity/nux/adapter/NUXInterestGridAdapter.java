// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.nux.view.NUXInterestGridCell;
import com.pinterest.adapter.InterestsGridAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.ui.ViewHelper;
import java.util.ArrayList;
import java.util.HashMap;

public class NUXInterestGridAdapter extends InterestsGridAdapter
{

    private ArrayList _checkedInterests;

    public NUXInterestGridAdapter()
    {
    }

    public void clearInterests()
    {
        _checkedInterests.clear();
    }

    public boolean containsInterest(Interest interest)
    {
        return _checkedInterests.contains(interest);
    }

    public ArrayList getCheckedInterests()
    {
        return _checkedInterests;
    }

    public int getCheckedSize()
    {
        return _checkedInterests.size();
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        view = NUXInterestGridCell.from(view, ViewHelper.getContext(view, viewgroup));
        viewgroup = (Interest)getItem(i);
        if (viewgroup != null)
        {
            view.setChecked(_checkedInterests.contains(viewgroup));
            view.setInterest(viewgroup, (Integer)_cachedItemHeights.get(Integer.valueOf(i)), flag);
        }
        if (!flag)
        {
            loadMore(i);
        }
        return view;
    }

    public boolean isInterestChecked(Interest interest)
    {
        return _checkedInterests.contains(interest);
    }

    public void setCheckedInterests(ArrayList arraylist)
    {
        _checkedInterests = arraylist;
    }

    public void toggleCheckInterest(Interest interest)
    {
        if (_checkedInterests.contains(interest))
        {
            _checkedInterests.remove(interest);
            return;
        } else
        {
            _checkedInterests.add(interest);
            return;
        }
    }
}
