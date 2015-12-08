// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount

public class PayPalChargeAccount extends ChargeAccount
{

    private String email;

    public PayPalChargeAccount()
    {
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String s)
    {
        email = s;
    }
}
