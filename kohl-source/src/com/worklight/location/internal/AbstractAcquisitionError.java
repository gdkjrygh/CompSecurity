// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;


public abstract class AbstractAcquisitionError
{

    protected final String message;

    public AbstractAcquisitionError(String s)
    {
        message = s;
    }

    public abstract Object getErrorCode();

    public String getMessage()
    {
        return message;
    }
}
