// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;


public class CheckoutClickEvent
{

    private Click click;

    public CheckoutClickEvent(Click click1)
    {
        click = click1;
    }

    public Click getClick()
    {
        return click;
    }
}
