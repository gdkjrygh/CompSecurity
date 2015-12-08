// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghy
    implements Runnable
{

    private ghx a;

    ghy(ghx ghx1)
    {
        a = ghx1;
        super();
    }

    public final void run()
    {
        if (a.a == 4)
        {
            ghs.b(a.b, 0);
            ghs.a(a.b, 0);
            return;
        } else
        {
            ghs.b(a.b, a.a + 1);
            ghs.a(a.b, a.a + 1);
            return;
        }
    }
}
