// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bne extends bmb
{

    final bnm a;
    final bnh b;
    boolean e;
    private final bzv f;

    bne(bmb bmb1, bzv bzv1, bnm bnm1, bnh bnh1)
    {
        super(bmb1);
        new bnf(this, this, new bxg[] {
            bxg.t
        });
        e = false;
        f = (bzv)p.b(bzv1, "saveVideoController");
        f.a(new bng(this));
        a = (bnm)p.b(bnm1, "initEditorFlow");
        b = (bnh)p.b(bnh1, "callbacks");
    }

    void b()
    {
        if (!e)
        {
            return;
        }
        bvb bvb1;
        caf caf1;
        if (c.b.ae)
        {
            bvb1 = bvb.d;
        } else
        {
            bvb1 = bvb.b;
        }
        if (c.b.ae)
        {
            caf1 = caf.d;
        } else
        {
            caf1 = caf.b;
        }
        e = false;
        c.a(bvb1);
        f.a(caf1);
    }
}
