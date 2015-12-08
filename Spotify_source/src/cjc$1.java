// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private cjc a;

    public final void run()
    {
        a.g = Thread.currentThread();
        a.a();
    }

    (cjc cjc1)
    {
        a = cjc1;
        super();
    }
}
