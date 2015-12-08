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

    final Cart abf;

    public <init> addLineItem(LineItem lineitem)
    {
        abf.abe.add(lineitem);
        return this;
    }

    public Cart build()
    {
        return abf;
    }

    public abf setCurrencyCode(String s)
    {
        abf.abd = s;
        return this;
    }

    public abf setLineItems(List list)
    {
        abf.abe.clear();
        abf.abe.addAll(list);
        return this;
    }

    public abf setTotalPrice(String s)
    {
        abf.abc = s;
        return this;
    }

    private (Cart cart)
    {
        abf = cart;
        super();
    }

    abf(Cart cart, abf abf1)
    {
        this(cart);
    }
}
