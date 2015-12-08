// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.exception;


public class AppException extends Exception
{

    private String message;

    public AppException(String s)
    {
        message = s;
    }
}
