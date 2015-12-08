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

    final Cart auI;

    public <init> addLineItem(LineItem lineitem)
    {
        auI.auH.add(lineitem);
        return this;
    }

    public Cart build()
    {
        return auI;
    }

    public auI setCurrencyCode(String s)
    {
        auI.auG = s;
        return this;
    }

    public auI setLineItems(List list)
    {
        auI.auH.clear();
        auI.auH.addAll(list);
        return this;
    }

    public auI setTotalPrice(String s)
    {
        auI.auF = s;
        return this;
    }

    private (Cart cart)
    {
        auI = cart;
        super();
    }

    auI(Cart cart, auI aui)
    {
        this(cart);
    }
}
