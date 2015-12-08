// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.pinterest.activity.dynamicgrid.CarouselView;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.adapter:
//            PinGridAdapter

public class DynamicGridAdapter extends PinGridAdapter
{

    public static final int TYPE_COUNT = 4;
    public static final int TYPE_PIN = 0;
    public static final int TYPE_PIN_FEEDBACK = 3;
    public static final int TYPE_PIN_HIDDEN = 2;
    public static final int TYPE_STORY = 1;

    public DynamicGridAdapter()
    {
    }

    private CarouselView getCarouselView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        if (view == null || !(view instanceof CarouselView))
        {
            view = new CarouselView(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (CarouselView)view;
        }
        view.setStory(_dataSource.getStory(i), flag);
        if (_dataSource.getStory(i).getShouldAnimateOnAppear() && !flag)
        {
            _dataSource.getStory(i).setShouldAnimateOnAppear(false);
            view.setAlpha(0.1F);
            view.animate().alpha(1.0F).setDuration(Resources.integer(0x7f0d000c).intValue()).start();
        }
        return view;
    }

    public int getItemPaddingMode(int i)
    {
        switch (getItemViewType(i))
        {
        default:
            return super.getItemPaddingMode(i);

        case 1: // '\001'
            return 0;
        }
    }

    public int getItemSpan(int i)
    {
        if (_dataSource.isStory(i))
        {
            return 0x7fffffff;
        } else
        {
            return super.getItemSpan(i);
        }
    }

    public int getItemViewType(int i)
    {
        if (_dataSource.isStory(i))
        {
            return 1;
        }
        Pin pin = (Pin)getItem(_dataSource.getFeedIndex(i));
        if (pin != null && ModelHelper.isValid(pin.getHiddenState()) && pin.getHiddenState().intValue() > 0)
        {
            return !_isFeedbackExp ? 2 : 3;
        } else
        {
            return 0;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        switch (getItemViewType(i))
        {
        default:
            return super.getView(i, view, viewgroup, flag);

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
            return super.getView(_dataSource.getFeedIndex(i), view, viewgroup, flag);

        case 1: // '\001'
            return getCarouselView(i, view, viewgroup, flag);
        }
    }

    public int getViewTypeCount()
    {
        return 4;
    }
}
