// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class brh extends bmb
{

    final brk a;
    final bnm b;
    boolean e;
    private final bzv f;

    brh(bmb bmb1, brk brk1, bzv bzv1, bnm bnm1)
    {
        super(bmb1);
        new bri(this, this, new bxg[] {
            bxg.t
        });
        e = false;
        a = (brk)b.a(brk1, "shareIntentStarter", null);
        f = (bzv)b.a(bzv1, "saveVideoController", null);
        f.a(new brj(this));
        b = (bnm)b.a(bnm1, "initEditorFlow", null);
    }

    public final void b()
    {
        if (!e)
        {
            return;
        } else
        {
            e = false;
            c.k(true);
            c.a(bvb.b);
            f.a(caf.b);
            return;
        }
    }
}
