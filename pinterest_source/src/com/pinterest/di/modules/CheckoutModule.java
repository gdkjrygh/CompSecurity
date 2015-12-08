// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.pinterest.activity.commerce.CheckoutFragment;

public class CheckoutModule
{

    private CheckoutFragment a;

    public CheckoutModule(CheckoutFragment checkoutfragment)
    {
        a = checkoutfragment;
    }

    final CheckoutFragment a()
    {
        return a;
    }
}
