// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.tab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;

public class TabBarUtils
{

    public TabBarUtils()
    {
    }

    public static int handleClick(ViewGroup viewgroup, View view, int i, TabBar.Listener listener)
    {
        int j = ((Integer)view.getTag()).intValue();
        if (listener != null)
        {
            if (j == i)
            {
                listener.onTabReselected(j);
            } else
            {
                listener.onTabSelected(j);
            }
        }
        ((Checkable)view).setChecked(true);
        return resetTabs(viewgroup, view);
    }

    public static void initTabs(ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
    {
        int k = viewgroup.getChildCount();
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            View view = viewgroup.getChildAt(j);
            if (!(view instanceof Checkable))
            {
                continue;
            }
            if (i == 0)
            {
                ((Checkable)view).setChecked(true);
                view.setSelected(true);
            }
            view.setTag(Integer.valueOf(i));
            view.setOnClickListener(onclicklistener);
            i++;
        }

    }

    public static int resetTabs(ViewGroup viewgroup, View view)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = viewgroup.getChildAt(i);
            if ((view1 instanceof Checkable) && view1 != view)
            {
                ((Checkable)view1).setChecked(false);
                view1.setSelected(false);
            }
        }

        if (view == null)
        {
            return -1;
        } else
        {
            return ((Integer)view.getTag()).intValue();
        }
    }

    public static int setCurrentTab(ViewGroup viewgroup, int i, int j)
    {
        View view = viewgroup.findViewWithTag(Integer.valueOf(j));
        if (view == null || i == j)
        {
            return j;
        }
        if (view instanceof Checkable)
        {
            ((Checkable)view).setChecked(true);
        }
        view.setSelected(true);
        resetTabs(viewgroup, view);
        return j;
    }
}
