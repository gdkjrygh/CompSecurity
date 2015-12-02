// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.common.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.util.ArrayList;

public class CalculateFreightResult
{
    public static class FreightItem
    {

        public String commitDay;
        public String company;
        public String currency;
        public String discount;
        public String discountType;
        public String domesticFreight;
        public Amount freightAmount;
        public Amount previewFreightAmount;
        public String saveMoney;
        public String sendGoodsCountry;
        public String sendGoodsCountryFullName;
        public String serviceName;
        public String time;
        public String totalFreight;

        public FreightItem()
        {
        }
    }


    public ArrayList freightResult;

    public CalculateFreightResult()
    {
    }
}
