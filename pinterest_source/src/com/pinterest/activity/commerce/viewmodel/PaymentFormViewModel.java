// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.viewmodel;

import com.pinterest.model.commerce.UserCard;

public class PaymentFormViewModel
{

    private String cardNumber;
    private String cvv;
    private String expMonth;
    private String expYear;

    public PaymentFormViewModel(UserCard usercard)
    {
        cardNumber = usercard.getLast4();
        expMonth = String.valueOf(usercard.getExpMonth());
        expYear = String.valueOf(usercard.getExpYear());
    }

    public PaymentFormViewModel(String s, String s1, String s2, String s3)
    {
        cardNumber = s;
        expMonth = s1;
        expYear = s2;
        cvv = s3;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getCvv()
    {
        return cvv;
    }

    public String getExpMonth()
    {
        return expMonth;
    }

    public String getExpYear()
    {
        return expYear;
    }

    public void setCardNumber(String s)
    {
        cardNumber = s;
    }

    public void setCvv(String s)
    {
        cvv = s;
    }

    public void setExpMonth(String s)
    {
        expMonth = s;
    }

    public void setExpYear(String s)
    {
        expYear = s;
    }
}
