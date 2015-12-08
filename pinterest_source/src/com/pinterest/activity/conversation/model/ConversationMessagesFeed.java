// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.model;

import com.pinterest.api.model.ConversationMessage;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ConversationMessagesFeed extends Feed
{

    private List persistedItems;

    public ConversationMessagesFeed()
    {
        persistedItems = Collections.emptyList();
    }

    public ConversationMessagesFeed(String s, PinterestJsonObject pinterestjsonobject, String s1)
    {
        super(pinterestjsonobject, s1);
        persistedItems = Collections.emptyList();
        s = ConversationMessage.makeAll(s, pinterestjsonobject.e("data"));
        setItems(s);
        persistedItems = new ArrayList(s);
    }

    public ConversationMessagesFeed(List list)
    {
        persistedItems = Collections.emptyList();
        setItems(list);
    }

    protected String getItemId(ConversationMessage conversationmessage)
    {
        return conversationmessage.getUid();
    }

    protected volatile String getItemId(Model model)
    {
        return getItemId((ConversationMessage)model);
    }

    protected List getPersistedItems()
    {
        return new ArrayList(persistedItems);
    }

    public ConversationMessagesFeed merge(ConversationMessagesFeed conversationmessagesfeed)
    {
        if (conversationmessagesfeed == null)
        {
            return this;
        }
        ConversationMessagesFeed conversationmessagesfeed1 = new ConversationMessagesFeed();
        int j = 0;
        int i = 0;
        int k;
        do
        {
            k = i;
            if (i >= getCount())
            {
                break;
            }
            k = i;
            if (j >= conversationmessagesfeed.getCount())
            {
                break;
            }
            ConversationMessage conversationmessage = (ConversationMessage)get(i);
            ConversationMessage conversationmessage1 = (ConversationMessage)conversationmessagesfeed.get(j);
            k = i;
            if (!conversationmessage.getCreatedAt().before(conversationmessage1.getCreatedAt()))
            {
                if (conversationmessage.getCreatedAt().after(conversationmessage1.getCreatedAt()))
                {
                    conversationmessagesfeed1.appendItem(conversationmessage);
                    i++;
                    continue;
                }
                k = i;
                if (conversationmessage.getConversationId().equals(conversationmessage1.getConversationId()))
                {
                    k = i + 1;
                }
            }
            conversationmessagesfeed1.appendItem(conversationmessage1);
            j++;
            i = k;
        } while (true);
        do
        {
            i = j;
            if (k >= getCount())
            {
                break;
            }
            conversationmessagesfeed1.appendItem(get(k));
            k++;
        } while (true);
        for (; i < conversationmessagesfeed.getCount(); i++)
        {
            conversationmessagesfeed1.appendItem(conversationmessagesfeed.get(i));
        }

        if (getBaseUrl() != null)
        {
            conversationmessagesfeed1.setBaseUrl(getBaseUrl());
            conversationmessagesfeed1.setBookmark(getBookmark());
        } else
        {
            conversationmessagesfeed1.setBaseUrl(conversationmessagesfeed.getBaseUrl());
            conversationmessagesfeed1.setBookmark(conversationmessagesfeed.getBookmark());
        }
        return conversationmessagesfeed1;
    }
}
