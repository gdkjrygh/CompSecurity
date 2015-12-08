// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import java.util.ArrayList;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            GiftCard

public class status
{

    private double amount;
    private double balance;
    private String fullCardNumber;
    private String pin;
    private int status;
    private ArrayList statusItems;

    public GiftCard build()
    {
        return new GiftCard(this, null);
    }

    public status setAmount(double d)
    {
        amount = d;
        return this;
    }

    public amount setBalance(double d)
    {
        balance = d;
        return this;
    }

    public balance setFullNumber(String s)
    {
        fullCardNumber = s;
        return this;
    }

    public fullCardNumber setPin(String s)
    {
        pin = s;
        return this;
    }

    public pin setStatus(int i)
    {
        status = i;
        return this;
    }

    public status setStatusItems(ArrayList arraylist)
    {
        statusItems = arraylist;
        return this;
    }







    public ()
    {
        fullCardNumber = "";
        pin = "";
        amount = 0.0D;
        balance = 0.0D;
        status = 0;
    }
}
