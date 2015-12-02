// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;

// Referenced classes of package com.alibaba.api.product.pojo:
//            ProductDetail

public static class 
    implements Serializable
{

    public Amount discountAmount;
    public Amount fixedAmount;
    public String name;
    public long promotionId;
    public int promotionLeftDays;
    public int promotionLeftHours;
    public int promotionLeftMinutes;
    public int promotionLeftSecs;
    public String type;

    public ()
    {
    }
}
