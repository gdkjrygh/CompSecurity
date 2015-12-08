// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;


public class EventBillingError
{

    private int code;
    private Throwable exception;

    public EventBillingError(int i, Throwable throwable)
    {
        code = i;
        exception = throwable;
    }

    public int getCode()
    {
        return code;
    }

    public Throwable getException()
    {
        return exception;
    }

    public String toString()
    {
        return (new StringBuilder("EventBillingError{code=")).append(code).append(", exception=").append(exception).append('}').toString();
    }
}
