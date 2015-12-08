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

    final Cart aiN;

    public <init> addLineItem(LineItem lineitem)
    {
        aiN.aiM.add(lineitem);
        return this;
    }

    public Cart build()
    {
        return aiN;
    }

    public aiN setCurrencyCode(String s)
    {
        aiN.aiL = s;
        return this;
    }

    public aiN setLineItems(List list)
    {
        aiN.aiM.clear();
        aiN.aiM.addAll(list);
        return this;
    }

    public aiN setTotalPrice(String s)
    {
        aiN.aiK = s;
        return this;
    }

    private (Cart cart)
    {
        aiN = cart;
        super();
    }

    aiN(Cart cart, aiN ain)
    {
        this(cart);
    }
}
