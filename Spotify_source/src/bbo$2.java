// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private Exception a;
    private bbo b;

    public final void run()
    {
        bbo.a(b).a(a);
    }

    (bbo bbo1, Exception exception)
    {
        b = bbo1;
        a = exception;
        super();
    }
}
