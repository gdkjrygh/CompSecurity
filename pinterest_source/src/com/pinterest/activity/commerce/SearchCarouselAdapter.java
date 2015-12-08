// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.dynamicgrid.EndStoryCell;
import com.pinterest.activity.dynamicgrid.PinMiniCell;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import java.util.List;

public class SearchCarouselAdapter extends BaseAdapter
{

    public static final int PIN_HEIGHT = (int)Resources.dimension(0x7f0a007d);
    public static final int PIN_WIDTH = (int)Resources.dimension(0x7f0a007e);
    public static final int TYPE_COUNT = 2;
    public static final int TYPE_END = 1;
    public static final int TYPE_PIN = 0;
    protected List _items;
    private String _lastQuery;
    private DynamicStory _story;
    private int _visibleCount;

    public SearchCarouselAdapter()
    {
        _visibleCount = 0;
    }

    public int getCount()
    {
        if (_items != null)
        {
            return _items.size() + 1;
        } else
        {
            return 0;
        }
    }

    public Pin getItem(int i)
    {
        if (_items != null && i < _items.size())
        {
            return (Pin)_items.get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != getCount() - 1 ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Pin pin;
        pin = getItem(i);
        switch (getItemViewType(i))
        {
        default:
            view = EndStoryCell.from(view, viewgroup);
            view.setStory(_story);
            view.setTitleText(Resources.string(0x7f07014f));
            view.setTitleColor(Resources.color(0x7f0e0051));
            view.setBackground(0x7f020270);
            view.setOverrideClickListener(new _cls1());
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_135;
        }
_L1:
        if (i == 0)
        {
            i = Constants.MARGIN_HALF;
        } else
        {
            i = 0;
        }
        view.setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(PIN_WIDTH + Constants.MARGIN_HALF + i, PIN_HEIGHT));
        view.setPadding(i, 0, Constants.MARGIN_HALF, 0);
        _visibleCount = _visibleCount + 1;
        return view;
        view = PinMiniCell.from(view, viewgroup);
        view.setPin((Pin)pin, false);
        view.setStory(_story);
        view.setMode(com.pinterest.activity.dynamicgrid.PinMiniCell.MODE.SEARCH);
          goto _L1
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public int getVisibleCount()
    {
        return _visibleCount;
    }

    public void setDataSource(DynamicStory dynamicstory, String s)
    {
        if (dynamicstory == null)
        {
            return;
        } else
        {
            _story = dynamicstory;
            _lastQuery = s;
            _items = dynamicstory.getObjects();
            return;
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SearchCarouselAdapter this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.SEARCH_PIN_COMMERCE, _lastQuery));
        }

        _cls1()
        {
            this$0 = SearchCarouselAdapter.this;
            super();
        }
    }

}
