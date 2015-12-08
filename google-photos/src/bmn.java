// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bmn extends bmb
{

    final blw a;
    final noj b;
    final cag e;
    final bmp f;
    final mmr g;
    private final Context h;
    private final mti i = new bmo(this);

    bmn(bmb bmb1, Context context, blw blw1, noj noj1, cag cag1, bmp bmp1)
    {
        super(bmb1);
        h = (Context)b.a(context, "context", null);
        a = (blw)b.a(blw1, "display", null);
        b = (noj)b.a(noj1, "movieMakerProvider", null);
        e = (cag)b.a(cag1, "taskManager", null);
        f = bmp1;
        g = (mmr)olm.a(context, mmr);
    }

    public final void C_()
    {
        super.C_();
        e.b(i);
    }

    void b()
    {
        c.l(true);
        a.u();
        f.a(false);
    }

    public final void e()
    {
        super.e();
        e.a(i);
    }
}
