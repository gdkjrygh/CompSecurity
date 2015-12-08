// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cww
    implements Runnable
{

    private cwv a;

    cww(cwv cwv1)
    {
        a = cwv1;
        super();
    }

    public final void run()
    {
        if (cwv.a(a).c() || cwv.a(a).b() || cwv.a(a).a())
        {
            cwv.b(a).a();
        }
    }
}
