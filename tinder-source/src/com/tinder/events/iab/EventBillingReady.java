// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;


public class EventBillingReady
{

    private boolean isSuccess;

    public EventBillingReady(boolean flag)
    {
        isSuccess = flag;
    }

    public boolean isSuccess()
    {
        return isSuccess;
    }
}
