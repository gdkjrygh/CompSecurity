// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class bmz extends bmb
{

    final bnm a;
    boolean b;
    private final bzv e;

    bmz(bmb bmb1, bzv bzv1, bnc bnc, bnl bnl, bnm bnm1)
    {
        super(bmb1);
        new bna(this, this, bnd);
        new bnb(this, this, new bxg[] {
            bxg.t
        });
        b = false;
        e = (bzv)b.a(bzv1, "saveVideoController", null);
        b.a(bnc, "display", null);
        b.a(bnl, "gservicesSettings", null);
        a = (bnm)b.a(bnm1, "initEditorFlow", null);
    }

    public final void b()
    {
        boolean flag = false;
        if (!b)
        {
            return;
        }
        b = false;
        c.k(false);
        bww bww1 = c;
        if (!bww1.b.G.e)
        {
            flag = true;
        }
        c.a(flag, "mPersistentState.isVideoRendering()");
        bww1.b.F = null;
        c.a(bvb.b);
        e.a(caf.c);
    }

    static 
    {
        bmz.getSimpleName();
    }
}
