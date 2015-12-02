// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class PromotionProductRemindListResult
{
    public static class RemindInfo
        implements Serializable
    {

        public long productId;
        public String startTime;

        public RemindInfo()
        {
        }
    }


    public static final int VERSION = 1;
    public ArrayList seckillProductList;

    public PromotionProductRemindListResult()
    {
    }
}
