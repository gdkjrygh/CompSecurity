// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;


public class EventPurchaseFlowError
{

    private String error;
    private String sku;

    public EventPurchaseFlowError(String s, String s1)
    {
        sku = s;
        error = s1;
    }

    public String getError()
    {
        return error;
    }

    public String getSku()
    {
        return sku;
    }

    public String toString()
    {
        return (new StringBuilder("EventPurchaseFlowError{sku='")).append(sku).append('\'').append(", error='").append(error).append('\'').append('}').toString();
    }
}
