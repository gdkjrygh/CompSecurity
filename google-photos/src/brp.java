// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class brp extends bmb
{

    final noj a;
    final int b;
    boolean e;
    private final brk f;

    brp(bmb bmb1, brk brk1, noj noj1, int i)
    {
        super(bmb1);
        new brq(this, this, new bxg[] {
            bxg.t
        });
        e = false;
        f = (brk)b.a(brk1, "shareIntentStarter", null);
        a = (noj)b.a(noj1, "movieMakerProvider", null);
        b = i;
    }

    public final void b()
    {
        if (e)
        {
            e = false;
            c.k(true);
            if (c.b.P)
            {
                f.a();
                return;
            }
        }
    }
}
