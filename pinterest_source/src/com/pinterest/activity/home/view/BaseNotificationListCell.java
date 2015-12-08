// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.ui.ViewHelper;

public class BaseNotificationListCell extends LinearLayout
{

    protected View _divider;
    protected View _unseenMark;

    public BaseNotificationListCell(Context context)
    {
        this(context, null);
    }

    public BaseNotificationListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BaseNotificationListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
    }

    public void updateBackground(CellPosition cellposition, int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateBackground(cellposition, flag);
    }

    public void updateBackground(CellPosition cellposition, boolean flag)
    {
        updateViewState(flag);
        switch (_cls1..SwitchMap.com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition[cellposition.ordinal()])
        {
        default:
            ViewHelper.setVisibility(_divider, 0);
            return;

        case 1: // '\001'
            ViewHelper.setVisibility(_divider, 8);
            break;
        }
    }

    protected void updateViewState(boolean flag)
    {
        View view = _unseenMark;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(view, flag);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$home$view$BaseNotificationListCell$CellPosition[];

        static 
        {
            $SwitchMap$com$pinterest$activity$home$view$BaseNotificationListCell$CellPosition = new int[CellPosition.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$home$view$BaseNotificationListCell$CellPosition[CellPosition.LAST.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$home$view$BaseNotificationListCell$CellPosition[CellPosition.MIDDLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class CellPosition extends Enum
    {

        private static final CellPosition $VALUES[];
        public static final CellPosition FIRST;
        public static final CellPosition LAST;
        public static final CellPosition MIDDLE;

        public static CellPosition valueOf(String s)
        {
            return (CellPosition)Enum.valueOf(com/pinterest/activity/home/view/BaseNotificationListCell$CellPosition, s);
        }

        public static CellPosition[] values()
        {
            return (CellPosition[])$VALUES.clone();
        }

        static 
        {
            FIRST = new CellPosition("FIRST", 0);
            MIDDLE = new CellPosition("MIDDLE", 1);
            LAST = new CellPosition("LAST", 2);
            $VALUES = (new CellPosition[] {
                FIRST, MIDDLE, LAST
            });
        }

        private CellPosition(String s, int i)
        {
            super(s, i);
        }
    }

}
