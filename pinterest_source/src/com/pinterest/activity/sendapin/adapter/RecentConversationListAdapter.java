// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.conversation.view.RecentConversationCell;
import com.pinterest.api.model.Conversation;
import java.util.ArrayList;
import java.util.List;

public class RecentConversationListAdapter extends BaseAdapter
{

    private static final int TYPE_CONVERSATION = 0;
    private static final int TYPE_COUNT = 1;
    private Context _context;
    private List _conversations;

    public RecentConversationListAdapter(Context context)
    {
        _conversations = new ArrayList(0);
        _context = context;
    }

    public int getCount()
    {
        return _conversations.size();
    }

    public Conversation getItem(int i)
    {
        if (i >= 0 && i < _conversations.size())
        {
            return (Conversation)_conversations.get(i);
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
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Conversation conversation;
        if (i == 0)
        {
            viewgroup = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.FIRST;
        } else
        {
            viewgroup = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.MIDDLE;
        }
        view = RecentConversationCell.from(view, _context);
        conversation = getItem(i);
        if (conversation != null)
        {
            view.setConversation(conversation, viewgroup);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public void setRecentConversations(List list)
    {
        _conversations = list;
    }
}
