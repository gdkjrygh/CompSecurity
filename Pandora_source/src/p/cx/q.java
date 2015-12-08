// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


public class q extends Exception
{

    private Throwable a;

    public q(Throwable throwable)
    {
        super(throwable.getMessage());
        a = throwable;
    }

    public Throwable a()
    {
        return a;
    }
}
