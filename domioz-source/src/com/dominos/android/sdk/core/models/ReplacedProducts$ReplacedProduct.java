// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;


public class productCode
{

    private String errorMessage;
    private String productCode;

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setErrorMessage(String s)
    {
        errorMessage = s;
    }

    public void setProductCode(String s)
    {
        productCode = s;
    }

    public String toString()
    {
        return (new StringBuilder("Product{productCode='")).append(productCode).append('\'').append(", errorMessage='").append(errorMessage).append('\'').append('}').toString();
    }

    public (String s, String s1)
    {
        errorMessage = s;
        productCode = s1;
    }
}
