// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.HttpResponseException;

public class ClientLoginResponseException extends HttpResponseException
{

    private static final long serialVersionUID = 0x45085391c816c270L;
    private final transient ClientLogin.ErrorInfo details;

    ClientLoginResponseException(com.google.api.client.http.HttpResponseException.Builder builder, ClientLogin.ErrorInfo errorinfo)
    {
        super(builder);
        details = errorinfo;
    }

    public final ClientLogin.ErrorInfo getDetails()
    {
        return details;
    }
}
