// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.notification.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class NotificationSettingResult
{
    public static class SettingItem
        implements Serializable
    {

        public static final long MSG_TYPE_MESSAGE = 2L;
        public static final long MSG_TYPE_ORDER_MSG = 11L;
        public static final long MSG_TYPE_ORDER_STATUS = 5L;
        public static final long MSG_TYPE_PRICE_REDUCTION = 1L;
        public static final long MSG_TYPE_PROMOTION = 4L;
        public static final long MSG_TYPE_TREND_ALERT = 12L;
        public static final long TYPE_UPDATE_FREQUENCY = 1000L;
        public int cycleTime;
        public int endTime;
        public String local;
        public long messageTypeId;
        public int originTime;
        public char status;
        public long userSeq;

        public SettingItem()
        {
        }
    }


    public ArrayList userSettingList;

    public NotificationSettingResult()
    {
    }
}
