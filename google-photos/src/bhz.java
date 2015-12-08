// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bhz
    implements Runnable
{

    private bhy a;

    bhz(bhy bhy1)
    {
        a = bhy1;
        super();
    }

    public final void run()
    {
        if (bhy.a(a) && !bhy.b(a))
        {
            bhy.a(a, true);
            a.f();
        }
    }
}
