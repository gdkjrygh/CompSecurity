// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;


public class EventPurchaseRestoreFailed
{

    private String error;
    private boolean showErrorToUser;
    private String sku;

    public EventPurchaseRestoreFailed(String s, String s1, boolean flag)
    {
        sku = s;
        error = s1;
        showErrorToUser = flag;
    }

    public EventPurchaseRestoreFailed(String s, boolean flag)
    {
        error = s;
        showErrorToUser = flag;
    }

    public String getError()
    {
        return error;
    }

    public String getSku()
    {
        return sku;
    }

    public boolean showErrorToUser()
    {
        return showErrorToUser;
    }
}
