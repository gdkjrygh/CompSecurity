// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;


public class OnErrorFailedException extends RuntimeException
{

    private static final long serialVersionUID = 0xfa2e62320074c675L;

    public OnErrorFailedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public OnErrorFailedException(Throwable throwable)
    {
        super(throwable.getMessage(), throwable);
    }
}
