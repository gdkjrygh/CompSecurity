// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;


public class ApiMapperException extends Exception
{

    public ApiMapperException(String s)
    {
        super(s);
    }

    public ApiMapperException(Throwable throwable)
    {
        super("Failed mapping body of request/response", throwable);
    }
}
