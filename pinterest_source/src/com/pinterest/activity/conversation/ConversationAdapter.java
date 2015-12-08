// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.activity.conversation.view.ConversationListCell;
import com.pinterest.api.model.ConversationMessage;
import com.pinterest.kit.time.FuzzyDateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ConversationAdapter extends BaseAdapter
    implements ListAdapter
{

    private static final long TIME_INTERVAL_TIMESTAMPS = 0x5265c00L;
    private ConversationMessagesFeed _conversationFeed;
    private final LayoutInflater _li;
    private SimpleDateFormat sdf;
    private boolean shouldShowSpinner;

    public ConversationAdapter(Context context)
    {
        sdf = new SimpleDateFormat("MMMM d");
        shouldShowSpinner = false;
        _conversationFeed = new ConversationMessagesFeed();
        _li = LayoutInflater.from(context);
    }

    private String getSimpleFuzzyDate(Date date)
    {
        long l = (new Date()).getTime();
        long l1 = date.getTime();
        if (TimeUnit.DAYS.convert(l - l1, TimeUnit.MILLISECONDS) > 6L)
        {
            return sdf.format(date);
        } else
        {
            return FuzzyDateFormatter.a(date);
        }
    }

    private boolean shouldShowDate(int i, ConversationMessage conversationmessage)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i > 0)
        {
            ConversationMessage conversationmessage1 = (ConversationMessage)getItem(i - 1);
            if (conversationmessage1 != null)
            {
                return conversationmessage.getCreatedAt().getTime() - conversationmessage1.getCreatedAt().getTime() > 0x5265c00L;
            }
        }
        return flag;
    }

    public void addMessage(ConversationMessage conversationmessage)
    {
        _conversationFeed.prependItem(conversationmessage);
        notifyDataSetChanged();
    }

    public void appendFeed(ConversationMessagesFeed conversationmessagesfeed)
    {
        _conversationFeed.appendItems(conversationmessagesfeed);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return _conversationFeed.getCount();
    }

    public Object getItem(int i)
    {
        int j = getCount();
        return _conversationFeed.get(j - i - 1);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public String getNextUrl()
    {
        return _conversationFeed.getNextUrl();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag1 = false;
        boolean flag;
        if (view == null)
        {
            view = (ConversationListCell)_li.inflate(0x7f030145, viewgroup, false);
        } else
        {
            view = (ConversationListCell)view;
            view.prepareForReuse();
        }
        viewgroup = (ConversationMessage)getItem(i);
        view.setConversationMessage(viewgroup);
        flag = flag1;
        if (i == 0)
        {
            flag = flag1;
            if (shouldShowSpinner)
            {
                flag = true;
            }
        }
        view.setLoadingSpinnerVisibility(flag);
        if (shouldShowDate(i, viewgroup))
        {
            viewgroup = getSimpleFuzzyDate(viewgroup.getCreatedAt());
        } else
        {
            viewgroup = null;
        }
        view.setDate(viewgroup);
        return view;
    }

    public void mergeFeed(ConversationMessagesFeed conversationmessagesfeed)
    {
        _conversationFeed = _conversationFeed.merge(conversationmessagesfeed);
        notifyDataSetChanged();
    }

    public void replaceFeed(ConversationMessagesFeed conversationmessagesfeed)
    {
        _conversationFeed = conversationmessagesfeed;
        notifyDataSetChanged();
    }

    public void setShowSpinner(boolean flag)
    {
        shouldShowSpinner = flag;
        notifyDataSetChanged();
    }
}
