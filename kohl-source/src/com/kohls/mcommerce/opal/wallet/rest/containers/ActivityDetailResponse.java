// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import com.kohls.mcommerce.opal.wallet.rest.responses.ResponseBase;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            RewardDetail, TransactionDetail

public class ActivityDetailResponse extends ResponseBase
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private List errors;
    private String loyaltyId;
    private RewardDetail reward;
    private boolean success;
    private TransactionDetail transaction;
    private String uniqueResponseId;

    public ActivityDetailResponse()
    {
    }

    public List getErrors()
    {
        return errors;
    }

    public String getLoyaltyId()
    {
        return loyaltyId;
    }

    public RewardDetail getReward()
    {
        return reward;
    }

    public TransactionDetail getTransaction()
    {
        return transaction;
    }

    public String getUniqueResponseId()
    {
        return uniqueResponseId;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setErrors(List list)
    {
        errors = list;
    }

    public void setLoyaltyId(String s)
    {
        loyaltyId = s;
    }

    public void setReward(RewardDetail rewarddetail)
    {
        reward = rewarddetail;
    }

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    public void setTransaction(TransactionDetail transactiondetail)
    {
        transaction = transactiondetail;
    }

    public void setUniqueResponseId(String s)
    {
        uniqueResponseId = s;
    }
}
