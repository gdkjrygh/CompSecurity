// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nfz
    implements Runnable
{

    private ngg a;
    private nfy b;

    nfz(nfy nfy1, nfw nfw1, ngg ngg)
    {
        b = nfy1;
        a = ngg;
        super();
    }

    public final void run()
    {
        nfw.b(b.c).a(nfw.a(b.c).c(), a, b.c.a);
        nfw.a(b.c, null);
    }
}
