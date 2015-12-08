// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;

public class Fee extends APIResource
{

    Integer amount;
    String application;
    String currency;
    String description;
    String type;

    public Fee()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getApplication()
    {
        return application;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDescription()
    {
        return description;
    }

    public String getType()
    {
        return type;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setApplication(String s)
    {
        application = s;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
