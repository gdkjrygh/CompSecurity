// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kup
    implements Runnable
{

    private final kyw a;
    private final laa b;
    private final Runnable c;

    public kup(lan lan, kyw kyw1, laa laa1, Runnable runnable)
    {
        a = kyw1;
        b = laa1;
        c = runnable;
    }

    public final void run()
    {
        kyw kyw1 = a;
        boolean flag;
        if (b.c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a.a(b.a);
        } else
        {
            kyw kyw2 = a;
            lev lev = b.c;
            if (kyw2.d != null)
            {
                kyw2.d.a(lev);
            }
        }
        if (b.d)
        {
            a.a("intermediate-response");
        } else
        {
            a.b("done");
        }
        if (c != null)
        {
            c.run();
        }
    }
}
