// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lang.Object
    implements Runnable
{

    private boolean a;
    private xm b;

    public final void run()
    {
        b.f = true;
        if (a)
        {
            b.a();
        }
    }

    >(xm xm1, boolean flag)
    {
        b = xm1;
        a = flag;
        super();
    }
}
