// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderConfirmResult

public static class 
    implements Serializable
{

    public Amount discountAmount;
    public String isMobileSpecial;
    public Amount orderLimitAmount;
    public long promotionId;
    public String promotionName;

    public ()
    {
    }
}
