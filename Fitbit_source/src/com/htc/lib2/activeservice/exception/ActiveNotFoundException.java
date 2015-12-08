// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice.exception;


public class ActiveNotFoundException extends Exception
{

    private static final String MSG_SERVICE_NOT_FOUND = "Active service cannot be found";
    private static final long serialVersionUID = 2L;

    public ActiveNotFoundException()
    {
        super("Active service cannot be found");
    }
}
