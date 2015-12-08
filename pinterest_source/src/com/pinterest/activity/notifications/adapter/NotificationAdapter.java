// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.notifications.view.style.BalancedCell;
import com.pinterest.activity.notifications.view.style.BalancedCellWithText;
import com.pinterest.api.model.Notification;

// Referenced classes of package com.pinterest.activity.notifications.adapter:
//            StoryAdapter

public class NotificationAdapter extends StoryAdapter
{

    protected static final int BALANCED_STYLE = 0;
    protected static final int BALANCED_WITH_TEXT = 1;

    public NotificationAdapter()
    {
    }

    public int getItemViewType(int i)
    {
        return ((Notification)getItem(i)).getNotificationStyle() != com.pinterest.api.model.Notification.Style.BAL_TXT ? 0 : 1;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public View updateListCell(View view, ViewGroup viewgroup, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition, int i)
    {
        if (getItemViewType(i) == 1)
        {
            view = BalancedCellWithText.from(view, viewgroup);
            view.setNotificationItem((Notification)getItem(i), cellposition);
            return view;
        } else
        {
            view = BalancedCell.from(view, viewgroup);
            view.setNotificationItem((Notification)getItem(i), cellposition);
            return view;
        }
    }
}
