// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;


// Referenced classes of package com.dominos.android.sdk.common.dom.useraccounts:
//            CreditCardToken

public class isDefault
{

    private String billingZip;
    private String cardType;
    private int expirationMonth;
    private int expirationYear;
    private String id;
    private boolean isDefault;
    private boolean isExpired;
    private String lastFour;
    private String nickName;

    public CreditCardToken build()
    {
        return new CreditCardToken(this, null);
    }

    public isDefault setBillingZip(String s)
    {
        billingZip = s;
        return this;
    }

    public billingZip setCardType(String s)
    {
        cardType = s;
        return this;
    }

    public cardType setDefault(boolean flag)
    {
        isDefault = flag;
        return this;
    }

    public isDefault setExpirationMonth(int i)
    {
        expirationMonth = i;
        return this;
    }

    public expirationMonth setExpirationYear(int i)
    {
        expirationYear = i;
        return this;
    }

    public expirationYear setExpired(boolean flag)
    {
        isExpired = flag;
        return this;
    }

    public isExpired setId(String s)
    {
        id = s;
        return this;
    }

    public id setLastFour(String s)
    {
        lastFour = s;
        return this;
    }

    public lastFour setNickName(String s)
    {
        nickName = s;
        return this;
    }










    public ()
    {
        isDefault = false;
    }
}
