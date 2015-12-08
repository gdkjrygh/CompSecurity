// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bzb
    implements Runnable
{

    private bza a;

    bzb(bza bza1)
    {
        a = bza1;
        super();
    }

    public final void run()
    {
        a.d();
        a.f();
        a.g();
        a.c();
    }
}
