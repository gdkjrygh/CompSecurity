// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.conversation.pojo;

import java.util.List;

public class NewMessageResult
{

    public String conversationId;
    public String currentMemberSeq;
    public List messages;
    public String productId;
    public String productImageUrl;
    public String productName;
    public MessageDetailResult.Receiver receiver;
    public String totalSize;

    public NewMessageResult()
    {
    }
}
