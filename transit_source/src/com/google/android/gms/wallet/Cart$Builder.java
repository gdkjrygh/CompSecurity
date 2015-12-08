// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wallet:
//            Cart, LineItem

public final class <init>
{

    final Cart tG;

    public <init> addLineItem(LineItem lineitem)
    {
        tG.tF.add(lineitem);
        return this;
    }

    public Cart build()
    {
        return tG;
    }

    public tG setCurrencyCode(String s)
    {
        tG.tE = s;
        return this;
    }

    public tG setLineItems(List list)
    {
        tG.tF.clear();
        tG.tF.addAll(list);
        return this;
    }

    public tG setTotalPrice(String s)
    {
        tG.tD = s;
        return this;
    }

    private (Cart cart)
    {
        tG = cart;
        super();
    }

    tG(Cart cart, tG tg)
    {
        this(cart);
    }
}
