// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


public class ValidationException extends RuntimeException
{

    public ValidationException()
    {
    }

    public ValidationException(String s)
    {
        super(s);
    }

    public ValidationException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ValidationException(Throwable throwable)
    {
        super(throwable);
    }
}
