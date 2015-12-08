// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class CardDetails
    implements Comparable
{

    private String addressid;
    private String cardId;
    private String cardMM;
    private String cardNumber;
    private String cardYY;
    private String cvv;
    private boolean isDefault;
    private String type;
    private String url;

    public CardDetails()
    {
    }

    public int compareTo(CardDetails carddetails)
    {
        if (carddetails.isDefault() == isDefault)
        {
            return 0;
        }
        return !isDefault ? -1 : 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((CardDetails)obj);
    }

    public String getAddressid()
    {
        return addressid;
    }

    public String getCardId()
    {
        return cardId;
    }

    public String getCardMM()
    {
        return cardMM;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getCardYY()
    {
        return cardYY;
    }

    public String getCvv()
    {
        return cvv;
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

    public void setAddressid(String s)
    {
        addressid = s;
    }

    public void setCardId(String s)
    {
        cardId = s;
    }

    public void setCardMM(String s)
    {
        cardMM = s;
    }

    public void setCardNumber(String s)
    {
        cardNumber = s;
    }

    public void setCardYY(String s)
    {
        cardYY = s;
    }

    public void setCvv(String s)
    {
        cvv = s;
    }

    public void setDefault(boolean flag)
    {
        isDefault = flag;
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
