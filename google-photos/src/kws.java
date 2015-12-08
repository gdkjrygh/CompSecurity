// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kws
    implements Runnable
{

    private kwr a;

    kws(kwr kwr1)
    {
        a = kwr1;
        super();
    }

    public final void run()
    {
        a.d = Thread.currentThread();
        a.a();
    }
}
