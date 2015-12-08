// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dqw
    implements Runnable
{

    private dqv a;

    dqw(dqv dqv1)
    {
        a = dqv1;
        super();
    }

    public final void run()
    {
        if (a.b != null)
        {
            a.d = false;
            a.b = null;
            a.e.d(a.g);
        }
    }
}
