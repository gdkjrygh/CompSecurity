// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class TinderPurchase
{

    public String createDate;
    public String productId;
    public String productType;
    public String purchaseId;
    public String purchaseType;

    public TinderPurchase(String s, String s1, String s2, String s3, String s4)
    {
        purchaseId = s;
        purchaseType = s1;
        productId = s2;
        productType = s3;
        createDate = s4;
    }

    public String toString()
    {
        return (new StringBuilder("[id:")).append(purchaseId).append(", productId:").append(productId).append(", productType:").append(productType).append(", purchasetype:").append(purchaseType).append(", createDate:").append(createDate).append(']').toString();
    }
}
