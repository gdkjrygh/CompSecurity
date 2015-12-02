// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    final Exception a;
    final cgj b;

    public final void run()
    {
        throw new RuntimeException(a);
    }

    (cgj cgj1, Exception exception)
    {
        b = cgj1;
        a = exception;
        super();
    }
}
