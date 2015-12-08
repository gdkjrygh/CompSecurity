// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.jce.exception.ExtException;

public class AnnotatedException extends Exception
    implements ExtException
{

    private Throwable _underlyingException;

    AnnotatedException(String s)
    {
        this(s, null);
    }

    AnnotatedException(String s, Throwable throwable)
    {
        super(s);
        _underlyingException = throwable;
    }

    public Throwable getCause()
    {
        return _underlyingException;
    }

    Throwable getUnderlyingException()
    {
        return _underlyingException;
    }
}
