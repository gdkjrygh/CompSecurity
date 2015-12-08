// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public class brl extends bmb
{

    private static final String e = brl.getSimpleName();
    private static final int f[] = {
        22, 20
    };
    public final blq a;
    final bsm b;
    private final bsr g = new brm(this, "UploadUserMusic");
    private final bws h;
    private final bqa i;
    private final btq j;
    private final bra k;
    private final noq l;
    private final int m;
    private final noz n;

    brl(bmb bmb1, Bundle bundle, bws bws1, cag cag, bqa bqa1, btq btq1, bra bra1, 
            Context context, noj noj, can can, cap cap, cah cah, blw blw, noq noq1)
    {
        super(bmb1);
        new brn(this, this, new bxg[] {
            bxg.t
        });
        h = (bws)b.a(bws1, "soundtrackUsageRecorder", null);
        i = (bqa)b.a(bqa1, "playerController", null);
        j = (btq)b.a(btq1, "updateCoverFlow", null);
        k = (bra)b.a(bra1, "progressController", null);
        l = (noq)b.a(noq1, "durationEventLogger", null);
        m = ((mmr)olm.a(context, mmr)).d();
        n = noz.a(context, 3, e, new String[0]);
        a = new blq(this, bundle, context, noj, cag, can, cap, cah, blw);
        b = (new bsp()).a(btq1.b).a(g).a(a.a).a(btq1.e).a(this, e, bundle, cag).a(new bro(this));
    }

    static int a(brl brl1)
    {
        return brl1.m;
    }

    static noz b(brl brl1)
    {
        return brl1.n;
    }

    static bra c(brl brl1)
    {
        return brl1.k;
    }

    static String d()
    {
        return e;
    }

    static noq d(brl brl1)
    {
        return brl1.l;
    }

    static int[] f()
    {
        return f;
    }

    public final void b()
    {
        c();
        c.a(c.b.a, "runningModeState", bxf.d, "Save storyboad only allowed in CLOUD_READY state");
        j.b();
        cqc cqc1 = c.b.v;
        if (cqc1.b() && TextUtils.isEmpty(cqc1.c))
        {
            h.a(cqc1, 10);
        }
        i.k();
        i.m();
        k.a(e);
        if (c.x() == bxd.b)
        {
            b.a(e);
            return;
        } else
        {
            k.b(e);
            return;
        }
    }

}
