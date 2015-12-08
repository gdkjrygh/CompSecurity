// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.Interest;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.InterestGridCell;
import java.util.HashMap;

// Referenced classes of package com.pinterest.adapter:
//            PinterestBaseAdapter

public class InterestsGridAdapter extends PinterestBaseAdapter
{

    private boolean _bounceOnTouch;

    public InterestsGridAdapter()
    {
    }

    public int getItemHeight(int i, int j, boolean flag)
    {
        _cachedItemHeights.put(Integer.valueOf(i), Integer.valueOf(j));
        return j;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        view = InterestGridCell.from(view, ViewHelper.getContext(view, viewgroup));
        view.setInterest((Interest)getItem(i), (Integer)_cachedItemHeights.get(Integer.valueOf(i)), flag);
        view.setBounceOnTouch(_bounceOnTouch);
        view.setDimOnTouch(true);
        if (!flag)
        {
            loadMore(i);
        }
        return view;
    }

    public void setBounceOnTouch(boolean flag)
    {
        _bounceOnTouch = flag;
    }
}
