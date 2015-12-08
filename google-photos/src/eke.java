// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class eke extends Exception
{

    public final Exception a;

    public eke(Exception exception)
    {
        super(exception);
        a = exception;
    }

    public eke(String s)
    {
        super(s);
        a = null;
    }

    public eke(String s, Exception exception)
    {
        super(s, exception);
        a = exception;
    }

    public Throwable getCause()
    {
        return a;
    }
}
