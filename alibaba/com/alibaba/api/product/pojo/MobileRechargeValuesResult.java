// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.util.List;

// Referenced classes of package com.alibaba.api.product.pojo:
//            MobileRechargePromotion

public class MobileRechargeValuesResult
{
    public static class MobileRechargeValueVO
    {

        public String bigSaleStartTime;
        public String currency;
        public String currencyCode;
        public long denomination;
        public long discount;
        public float factor;
        public long payAmount;
        public long poundage;
        public long price;
        public String productId;
        public String promotionTag;

        public MobileRechargeValueVO()
        {
        }
    }


    public String countryCode;
    public String note;
    public List productList;
    public MobileRechargePromotion promotion;
    public String regular;

    public MobileRechargeValuesResult()
    {
    }
}
