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

    public String acquireEndDateString;
    public String acquireStartDate;
    public String activityDesc;
    public String activityName;
    public int availableNum;
    public long consumeValidTime;
    public Amount denominationAmount;
    public long id;
    public boolean isAcquirable;
    public int numPerBuyer;
    public long sellerAdminSeq;

    public ()
    {
    }
}
