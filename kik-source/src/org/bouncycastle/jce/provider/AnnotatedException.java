// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.jce.exception.ExtException;

public class AnnotatedException extends Exception
    implements ExtException
{

    private Throwable a;

    AnnotatedException(String s)
    {
        this(s, null);
    }

    AnnotatedException(String s, Throwable throwable)
    {
        super(s);
        a = throwable;
    }

    public Throwable getCause()
    {
        return a;
    }
}
