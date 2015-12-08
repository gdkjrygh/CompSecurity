// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;


public class mPrompt
{

    private String mPrompt;
    private String quantityStatusCode;

    public String getPrompt()
    {
        return mPrompt;
    }

    public String getQuantityStatusCode()
    {
        return quantityStatusCode;
    }

    public (String s)
    {
        quantityStatusCode = s;
    }

    public quantityStatusCode(String s, String s1)
    {
        quantityStatusCode = s;
        mPrompt = s1;
    }
}
