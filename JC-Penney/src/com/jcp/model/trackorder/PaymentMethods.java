// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

// Referenced classes of package com.jcp.model.trackorder:
//            Address

public class PaymentMethods
    implements Serializable
{

    private Address address;
    private String amount;
    private String balance;
    private String cardNumber;
    private String cvvNumber;
    private String expiryMonth;
    private String expiryYear;
    private String id;
    private boolean isDefault;
    private String lastFour;
    private String status;
    private String type;
    private String url;

    public PaymentMethods()
    {
    }

    public Address getAddress()
    {
        return address;
    }

    public String getAmount()
    {
        return amount;
    }

    public String getBalance()
    {
        return balance;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getCvvNumber()
    {
        return cvvNumber;
    }

    public String getExpiryMonth()
    {
        return expiryMonth;
    }

    public String getExpiryYear()
    {
        return expiryYear;
    }

    public String getId()
    {
        return id;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getStatus()
    {
        return status;
    }

    public String getType()
    {
        return type;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setAmount(String s)
    {
        amount = s;
    }

    public void setBalance(String s)
    {
        balance = s;
    }

    public void setCardNumber(String s)
    {
        cardNumber = s;
    }

    public void setCvvNumber(String s)
    {
        cvvNumber = s;
    }

    public void setDefault(boolean flag)
    {
        isDefault = flag;
    }

    public void setExpiryMonth(String s)
    {
        expiryMonth = s;
    }

    public void setExpiryYear(String s)
    {
        expiryYear = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLastFour(String s)
    {
        lastFour = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
