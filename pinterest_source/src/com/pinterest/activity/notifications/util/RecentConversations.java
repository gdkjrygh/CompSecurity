// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.util;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.kit.data.DiskCache;
import java.util.ArrayList;
import java.util.List;

public class RecentConversations
{

    private static final int MAX_RECENT_COUNT = 25;
    private static RecentConversations _instance;
    private BaseApiResponseHandler _onConversationsLoaded;
    private List _recentConvs;

    private RecentConversations()
    {
        _recentConvs = new ArrayList(25);
        _onConversationsLoaded = new _cls1();
    }

    public static List get()
    {
        return instance()._recentConvs;
    }

    public static boolean hasRecent()
    {
        return instance()._recentConvs != null && instance()._recentConvs.size() > 0;
    }

    public static RecentConversations instance()
    {
        if (_instance == null)
        {
            _instance = new RecentConversations();
        }
        return _instance;
    }

    public static void loadCachedConversations()
    {
        Object obj;
        if (instance()._recentConvs.size() <= 0)
        {
            if ((obj = DiskCache.getJsonArray("RECENT_CONVERSATIONS")) != null)
            {
                obj = new ConversationFeed(((PinterestJsonArray) (obj)), null);
                instance()._recentConvs = ((ConversationFeed) (obj)).getItems();
                return;
            }
        }
    }

    public static void refresh()
    {
        instance().refreshFromServer();
    }

    public void refreshFromServer()
    {
        ConversationApi.a(_onConversationsLoaded, null);
    }


    private class _cls1 extends ApiResponseHandler
    {

        final RecentConversations this$0;

        public void onSuccess(final ApiResponse data)
        {
            super.onSuccess(data);
            data = ((ApiResponse) (data.getData()));
            if (data instanceof PinterestJsonArray)
            {
                ConversationFeed conversationfeed = new ConversationFeed((PinterestJsonArray)data, getBaseUrl());
                _recentConvs.clear();
                _recentConvs.addAll(conversationfeed.getItems());
                class _cls1 extends BackgroundTask
                {

                    final _cls1 this$1;
                    final Object val$data;

                    public void run()
                    {
                        DiskCache.setJsonArray("RECENT_CONVERSATIONS", (PinterestJsonArray)data);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    data = obj;
                    super();
                }
                }

                (new _cls1()).execute();
            }
        }

        _cls1()
        {
            this$0 = RecentConversations.this;
            super();
        }
    }

}
