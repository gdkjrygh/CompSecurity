// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghv
    implements Runnable
{

    private ghu a;

    ghv(ghu ghu1)
    {
        a = ghu1;
        super();
    }

    public final void run()
    {
        ghs.a(a.a, true);
        if (ghs.b(a.a))
        {
            ghs.c(a.a);
            return;
        } else
        {
            ghs.a(a.a, 0);
            return;
        }
    }
}
