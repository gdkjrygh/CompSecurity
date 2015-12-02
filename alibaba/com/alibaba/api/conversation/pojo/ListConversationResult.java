// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.conversation.pojo;

import java.util.Date;
import java.util.List;

public class ListConversationResult
{
    public static class Conversation
    {

        public String conversationId;
        public String lastMessageContent;
        public String lastMessageId;
        public boolean lastMessageIsOwn;
        public Date lastMessageTime;
        public String receiverName;
        public long unreadCount;

        public Conversation()
        {
        }
    }


    public List conversations;
    public long currentPage;
    public long pageSize;
    public long totalSize;

    public ListConversationResult()
    {
    }
}
