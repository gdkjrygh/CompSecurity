// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount

public class CreditCardChargeAccount extends ChargeAccount
{

    private String lastFour;
    private String type;

    public CreditCardChargeAccount()
    {
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getType()
    {
        return type;
    }

    public void setLastFour(String s)
    {
        lastFour = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
