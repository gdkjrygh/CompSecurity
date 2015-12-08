// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;


public class ServiceNotBoundException extends IllegalStateException
{

    private static final long serialVersionUID = 1L;

    public ServiceNotBoundException()
    {
    }

    public ServiceNotBoundException(String s)
    {
        super(s);
    }
}
