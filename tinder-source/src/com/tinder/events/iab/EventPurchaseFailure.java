// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;


public class EventPurchaseFailure
{

    private String errorMessage;
    private String productId;

    public EventPurchaseFailure(String s)
    {
        productId = s;
    }

    public EventPurchaseFailure(String s, String s1)
    {
        productId = s;
        errorMessage = s1;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getProductId()
    {
        return productId;
    }

    public String toString()
    {
        return (new StringBuilder("EventPurchaseFailure{productId='")).append(productId).append('\'').append(", errorMessage='").append(errorMessage).append('\'').append('}').toString();
    }
}
