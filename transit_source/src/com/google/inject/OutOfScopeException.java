// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;


public final class OutOfScopeException extends RuntimeException
{

    public OutOfScopeException(String s)
    {
        super(s);
    }

    public OutOfScopeException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public OutOfScopeException(Throwable throwable)
    {
        super(throwable);
    }
}
