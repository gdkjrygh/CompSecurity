// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gku
    implements Runnable
{

    private ehr a;
    private int b;
    private long c;
    private gkt d;

    gku(gkt gkt1, ehr ehr, int i, long l)
    {
        d = gkt1;
        a = ehr;
        b = i;
        c = l;
        super();
    }

    public final void run()
    {
        glj glj1 = gkt.a(d, a);
        glj1.d = b;
        if (glj1.a())
        {
            return;
        } else
        {
            glj1.c = false;
            gkt.a(d).a(a, (int)c);
            glj1.a(-1, -1);
            return;
        }
    }
}
