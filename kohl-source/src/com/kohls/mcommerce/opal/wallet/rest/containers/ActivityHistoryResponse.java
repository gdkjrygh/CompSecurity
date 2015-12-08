// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import com.kohls.mcommerce.opal.wallet.rest.responses.ResponseBase;
import java.io.Serializable;
import java.util.List;

public class ActivityHistoryResponse extends ResponseBase
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private List errors;
    private List rewards;
    private boolean success;
    private List transactions;
    private String uniqueResponseId;

    public ActivityHistoryResponse()
    {
    }

    public List getErrors()
    {
        return errors;
    }

    public List getRewards()
    {
        return rewards;
    }

    public List getTransactions()
    {
        return transactions;
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

    public void setRewards(List list)
    {
        rewards = list;
    }

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    public void setTransactions(List list)
    {
        transactions = list;
    }

    public void setUniqueResponseId(String s)
    {
        uniqueResponseId = s;
    }
}
