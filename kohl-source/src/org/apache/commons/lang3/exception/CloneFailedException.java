// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.exception;


public class CloneFailedException extends RuntimeException
{

    private static final long serialVersionUID = 0x1329157L;

    public CloneFailedException(String s)
    {
        super(s);
    }

    public CloneFailedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public CloneFailedException(Throwable throwable)
    {
        super(throwable);
    }
}
