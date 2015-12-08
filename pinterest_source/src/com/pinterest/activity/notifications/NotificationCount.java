// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.base.Events;

public class NotificationCount
{

    private static int _unseenConversationCount;
    private static int _unseenNetworkStoryCount;
    private static int _unseenYourStoryCount;

    public NotificationCount()
    {
    }

    public static int getTotalUnseenCount()
    {
        return getUnseenYourStoryCount() + getUnseenConversationCount() + getUnseenNetworkStoryCount();
    }

    public static int getUnseenConversationCount()
    {
        return _unseenConversationCount;
    }

    public static int getUnseenNetworkStoryCount()
    {
        return _unseenNetworkStoryCount;
    }

    public static int getUnseenYourStoryCount()
    {
        return _unseenYourStoryCount;
    }

    public static void setCounts(int i, int j, int k)
    {
        _unseenNetworkStoryCount = i;
        _unseenYourStoryCount = j;
        _unseenConversationCount = k;
        Events.post(new UpdateEvent());
    }

    public static void setUnseenConversationCount(int i)
    {
        _unseenConversationCount = i;
        Events.post(new UpdateEvent());
    }

    public static void setUnseenNetworkStoryCount(int i)
    {
        _unseenNetworkStoryCount = i;
        Events.post(new UpdateEvent());
    }

    public static void setUnseenYourStoryCount(int i)
    {
        _unseenYourStoryCount = i;
        Events.post(new UpdateEvent());
    }

    private class UpdateEvent
    {

        public UpdateEvent()
        {
        }
    }

}
