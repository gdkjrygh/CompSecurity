// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements Runnable
{

    private Exception a;

    public final void run()
    {
        throw new RuntimeException(a);
    }

    ng.Exception(Exception exception)
    {
        a = exception;
        super();
    }
}
