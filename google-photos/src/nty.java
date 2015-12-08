// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nty
    implements Runnable
{

    private ntw a;

    nty(ntw ntw1)
    {
        a = ntw1;
        super();
    }

    public final void run()
    {
        a.c = false;
        a.a.a(a.b);
    }
}
