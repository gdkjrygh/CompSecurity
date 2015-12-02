// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.conversation.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MessageDetailResult
    implements Serializable
{
    public static class DetailTemp
        implements Serializable
    {

        public List returnValue;
        public long valueCount;

        public DetailTemp()
        {
        }
    }

    public static class MessageDetail
        implements Serializable
    {

        public String content;
        public String gmtModified;
        public String haveFile;
        public String id;
        public String imageFS2;
        public String imageFilePath;
        public boolean isFirstUnRead;
        public String isRead;
        public String largeImage;
        public String messageId;
        public String messageType;
        public String orderId;
        public String originalImage;
        public String productId;
        public String productImageUrl;
        public String productName;
        public String receiverMemberSeq;
        public String sendStatus;
        public String senderMemberSeq;
        public String senderName;
        public Date senderTime;
        public String smallImage;

        public MessageDetail()
        {
            sendStatus = "send_ok";
            isFirstUnRead = false;
        }
    }

    public static class Receiver
        implements Serializable
    {

        public String memberLevel;
        public String memberSeq;
        public String storeName;
        public String totalScore;
        public String userName;

        public Receiver()
        {
        }
    }


    public String currentMemberSeq;
    public long currentPage;
    public DetailTemp msgListResult;
    public long pageSize;
    public Receiver receiver;

    public MessageDetailResult()
    {
    }
}
