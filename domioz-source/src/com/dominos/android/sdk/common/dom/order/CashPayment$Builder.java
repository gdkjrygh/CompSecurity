// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;


// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            CashPayment

public class 
{

    private double amount;

    public CashPayment build()
    {
        return new CashPayment(amount, null);
    }

    public amount setAmount(double d)
    {
        amount = d;
        return this;
    }

    public ()
    {
    }
}
