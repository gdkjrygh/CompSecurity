// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import com.kohls.mcommerce.opal.wallet.rest.responses.ResponseBase;
import java.util.List;

public class WalletBaseResponse extends ResponseBase
{

    private List errors;
    private boolean success;
    private String uniqueResponseId;

    public WalletBaseResponse()
    {
    }

    public List getErrors()
    {
        return errors;
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

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    public void setUniqueResponseId(String s)
    {
        uniqueResponseId = s;
    }
}
