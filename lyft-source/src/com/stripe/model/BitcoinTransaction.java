// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;

public class BitcoinTransaction extends APIResource
{

    Integer amount;
    Integer bitcoinAmount;
    Long created;
    String currency;
    String customer;
    String id;
    String receiver;

    public BitcoinTransaction()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Integer getBitcoinAmount()
    {
        return bitcoinAmount;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getCustomer()
    {
        return customer;
    }

    public String getId()
    {
        return id;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setBitcoinAmount(Integer integer)
    {
        bitcoinAmount = integer;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setReceiver(String s)
    {
        receiver = s;
    }
}
