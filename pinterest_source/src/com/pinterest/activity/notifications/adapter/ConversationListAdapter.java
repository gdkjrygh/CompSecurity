// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.conversation.view.ConversationNotificationCell;
import com.pinterest.activity.conversation.view.CreateMessageListCell;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.model.Conversation;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.ui.text.PButton;

public class ConversationListAdapter extends BaseAdapter
{

    private static final int TYPE_CONVERSATION = 1;
    private static final int TYPE_COUNT = 2;
    private static final int TYPE_CREATE_MESSAGE = 0;
    private Context _context;
    private ConversationFeed _dataSource;
    private Handler _handler;
    protected LoadMoreListener _listener;
    protected boolean _loading;

    public ConversationListAdapter(Context context)
    {
        _dataSource = new ConversationFeed(null, null);
        _context = context;
        _handler = new Handler();
    }

    public final void finishedLoading()
    {
        _loading = false;
    }

    public int getCount()
    {
        return _dataSource.getCount() + 1;
    }

    public ConversationFeed getDataSource()
    {
        return _dataSource;
    }

    public Object getItem(int i)
    {
        if (i > 0)
        {
            return _dataSource.get(i - 1);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            viewgroup = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.FIRST;
        } else
        if (i == getCount() - 1)
        {
            viewgroup = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.LAST;
        } else
        {
            viewgroup = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.MIDDLE;
        }
        if (getItemViewType(i) != 0) goto _L2; else goto _L1
_L1:
        view = CreateMessageListCell.from(view, _context);
        view.setFocusable(false);
        ((PButton)view.findViewById(0x7f0f0352)).setOnClickListener(new _cls1());
_L4:
        loadMoreIfNeeded(i);
        return view;
_L2:
        view = ConversationNotificationCell.from(view, _context);
        Conversation conversation = (Conversation)getItem(i);
        if (conversation != null)
        {
            view.setConversation(conversation, viewgroup);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEmpty()
    {
        return getCount() <= 1;
    }

    protected final void loadMoreIfNeeded(int i)
    {
        if (_listener != null && i == getCount() - 1 && !_loading)
        {
            _loading = true;
            _listener.loadMore();
        }
    }

    public void setDataSource(final ConversationFeed dataSource)
    {
        _handler.post(new _cls2());
    }

    public void setListener(LoadMoreListener loadmorelistener)
    {
        _listener = loadmorelistener;
    }


/*
    static ConversationFeed access$002(ConversationListAdapter conversationlistadapter, ConversationFeed conversationfeed)
    {
        conversationlistadapter._dataSource = conversationfeed;
        return conversationfeed;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ConversationListAdapter this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.CONVERSATION_CREATE));
        }

        _cls1()
        {
            this$0 = ConversationListAdapter.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ConversationListAdapter this$0;
        final ConversationFeed val$dataSource;

        public void run()
        {
            _dataSource = dataSource;
            notifyDataSetChanged();
        }

        _cls2()
        {
            this$0 = ConversationListAdapter.this;
            dataSource = conversationfeed;
            super();
        }
    }

}
