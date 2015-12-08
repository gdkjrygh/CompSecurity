// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.notifications.view.NetworkStoryListCell;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Story;

// Referenced classes of package com.pinterest.activity.notifications.adapter:
//            StoryAdapter

public class NetworkStoryAdapter extends StoryAdapter
{

    public NetworkStoryAdapter()
    {
    }

    private boolean shouldShowTimestamp(int i)
    {
        if (i == 0)
        {
            return true;
        }
        return !ModelHelper.isSameDay(((Story)getItem(i)).getLastUpdateTs().longValue(), ((Story)getItem(i - 1)).getLastUpdateTs().longValue());
    }

    public View updateListCell(View view, ViewGroup viewgroup, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition, int i)
    {
        view = NetworkStoryListCell.from(view, viewgroup);
        view.setStoryItem((Story)getItem(i), cellposition);
        if (shouldShowTimestamp(i))
        {
            view.showTimestamp(cellposition);
        }
        return view;
    }
}
