// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;

// Referenced classes of package com.alibaba.api.flashdeal.pojo:
//            FlashdealProductListNewResult

public static class productId
    implements Serializable
{

    public long canOrderStock;
    public long discount;
    public boolean isSoldOut;
    public String originalPriceCurrency;
    public String ppStartDate;
    public String priceCurrency;
    public long productId;
    public long promotionId;
    public String promotionImgUrl;
    public String promotionType;
    public long sellerAdminSeq;
    public int stock;
    public String subject;

    public ()
    {
        productId = -1L;
    }
}
