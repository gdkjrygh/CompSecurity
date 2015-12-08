// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;


public class MissingBackpressureException extends Exception
{

    private static final long serialVersionUID = 0x64a044776671d702L;

    public MissingBackpressureException()
    {
    }

    public MissingBackpressureException(String s)
    {
        super(s);
    }
}
