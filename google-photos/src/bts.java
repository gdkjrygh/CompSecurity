// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bts
    implements bvp
{

    private btq a;

    bts(btq btq1)
    {
        a = btq1;
        super();
    }

    public final void a()
    {
        btq.b(a, true);
    }

    public final void b()
    {
        btq.b(a, false);
    }

    public final void c()
    {
        btq.b(a, false);
    }
}
