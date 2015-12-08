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

    final Cart asy;

    public <init> addLineItem(LineItem lineitem)
    {
        asy.asx.add(lineitem);
        return this;
    }

    public Cart build()
    {
        return asy;
    }

    public asy setCurrencyCode(String s)
    {
        asy.asw = s;
        return this;
    }

    public asy setLineItems(List list)
    {
        asy.asx.clear();
        asy.asx.addAll(list);
        return this;
    }

    public asy setTotalPrice(String s)
    {
        asy.asv = s;
        return this;
    }

    private (Cart cart)
    {
        asy = cart;
        super();
    }

    asy(Cart cart, asy asy1)
    {
        this(cart);
    }
}
