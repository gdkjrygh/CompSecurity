// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cgu
    implements Runnable
{

    private boolean a;
    private boolean b;
    private cgp c;

    cgu(cgp cgp1, boolean flag, boolean flag1)
    {
        c = cgp1;
        a = flag;
        b = flag1;
        super();
    }

    public final void run()
    {
        cgp.a(c, a, b);
        if (cgp.i(c) == this)
        {
            cgp.a(c, null);
        }
    }
}
