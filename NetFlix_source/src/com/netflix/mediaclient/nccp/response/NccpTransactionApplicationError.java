// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp.response;

import com.netflix.mediaclient.nccp.NccpResponse;

public final class NccpTransactionApplicationError
    implements NccpResponse
{

    private Throwable cause;
    private String name;

    public NccpTransactionApplicationError(Throwable throwable, String s)
    {
        cause = throwable;
        name = s;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public boolean getStatus()
    {
        return false;
    }

    public String getTransaction()
    {
        return name;
    }
}
