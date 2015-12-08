// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.home.view.HomefeedBuilderPinGridCell;
import com.pinterest.activity.home.view.HomefeedBuilderSeeMoreCell;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.ui.ViewHelper;

public class HomefeedBuilderPinGridAdapter extends PinterestBaseAdapter
{

    protected com.pinterest.activity.home.HomefeedBuilderFragment.MODE _mode;

    public HomefeedBuilderPinGridAdapter()
    {
    }

    public int getItemViewType(int i)
    {
        if (getItem(i) instanceof Pin)
        {
            return TYPE.PIN.getValue();
        } else
        {
            return TYPE.INTEREST.getValue();
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        com.pinterest.api.model.Model model = getItem(i);
        Object obj;
        if (model instanceof Pin)
        {
            obj = HomefeedBuilderPinGridCell.from(view, ViewHelper.getContext(view, viewgroup));
            ((HomefeedBuilderPinGridCell) (obj)).setPin((Pin)getItem(i));
        } else
        {
            obj = view;
            if (model instanceof Interest)
            {
                return HomefeedBuilderSeeMoreCell.from(view, ViewHelper.getContext(view, viewgroup));
            }
        }
        return ((View) (obj));
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public void setMode(com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        _mode = mode;
    }

    private class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE INTEREST;
        public static final TYPE PIN;
        private final int value;

        public static TYPE valueOf(String s)
        {
            return (TYPE)Enum.valueOf(com/pinterest/activity/home/adapter/HomefeedBuilderPinGridAdapter$TYPE, s);
        }

        public static TYPE[] values()
        {
            return (TYPE[])$VALUES.clone();
        }

        public final int getValue()
        {
            return value;
        }

        static 
        {
            PIN = new TYPE("PIN", 0, 0);
            INTEREST = new TYPE("INTEREST", 1, 1);
            $VALUES = (new TYPE[] {
                PIN, INTEREST
            });
        }

        private TYPE(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

}
