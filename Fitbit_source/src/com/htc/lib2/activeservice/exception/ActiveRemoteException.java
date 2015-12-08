// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice.exception;


public class ActiveRemoteException extends RuntimeException
{

    private static final String MSG_SERVICE_NOT_FOUND = "Remote active service exception.";
    private static final long serialVersionUID = 3L;

    public ActiveRemoteException()
    {
        super("Remote active service exception.");
    }
}
