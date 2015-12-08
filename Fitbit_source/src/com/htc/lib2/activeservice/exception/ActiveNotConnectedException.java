// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice.exception;


public class ActiveNotConnectedException extends RuntimeException
{

    private static final String MSG_SERVICE_NOT_CONNECTED = "Active service is disconnected.";
    private static final long serialVersionUID = 1L;

    public ActiveNotConnectedException()
    {
        super("Active service is disconnected.");
    }
}
