// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;

// Referenced classes of package com.alibaba.api.flashdeal.pojo:
//            FlashdealExpiredProductListResult

public static class productId
    implements Serializable
{

    public long discount;
    public String originalPriceCurrency;
    public String ppStartDate;
    public String priceCurrency;
    public String productDetailUrl;
    public long productId;
    public long promotionId;
    public String promotionImgUrl;
    public int stock;
    public String subject;

    public ()
    {
        productId = -1L;
    }
}
