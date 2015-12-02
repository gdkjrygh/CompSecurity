// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;

// Referenced classes of package com.alibaba.api.flashdeal.pojo:
//            FlashdealProductListResult

public static class productId
    implements Serializable
{

    public long canOrderStock;
    public productId currencyPrice;
    public long discount;
    public boolean isSoldOut;
    public String ppStartDate;
    public String productDetailUrl;
    public long productId;
    public String productName;
    public long promotionId;
    public String promotionImgUrl;
    public int stock;

    public ()
    {
        productId = -1L;
    }
}
