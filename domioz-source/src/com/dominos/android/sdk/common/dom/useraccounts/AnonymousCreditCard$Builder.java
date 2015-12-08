// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import com.dominos.android.sdk.common.dom.order.CreditCardType;

// Referenced classes of package com.dominos.android.sdk.common.dom.useraccounts:
//            AnonymousCreditCard

public class isDefault
{

    private double amount;
    private CreditCardType creditCardType;
    private String fullCardNumber;
    private boolean isDefault;
    private String month;
    private String nickname;
    private String securityCode;
    private String year;
    private String zip;

    public AnonymousCreditCard build()
    {
        return new AnonymousCreditCard(this, null);
    }

    public isDefault setAmount(double d)
    {
        amount = d;
        return this;
    }

    public amount setDefault(boolean flag)
    {
        isDefault = flag;
        return this;
    }

    public isDefault setFullNumber(String s)
    {
        fullCardNumber = s;
        return this;
    }

    public fullCardNumber setMonth(String s)
    {
        month = s;
        return this;
    }

    public month setNickname(String s)
    {
        nickname = s;
        return this;
    }

    public nickname setSecurityCode(String s)
    {
        securityCode = s;
        return this;
    }

    public securityCode setType(CreditCardType creditcardtype)
    {
        creditCardType = creditcardtype;
        return this;
    }

    public creditCardType setYear(String s)
    {
        year = s;
        return this;
    }

    public year setZip(String s)
    {
        zip = s;
        return this;
    }










    public Q()
    {
        fullCardNumber = "";
        month = "";
        year = "";
        securityCode = "";
        zip = "";
        nickname = "";
        amount = 0.0D;
        creditCardType = CreditCardType.fromString("");
        isDefault = false;
    }
}
