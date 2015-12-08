// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class njf extends omp
{

    private nga a;
    private nin b;
    private mpk c;
    private mpj d;

    public njf()
    {
        d = new njg(this);
    }

    static nin a(njf njf1)
    {
        return njf1.b;
    }

    static nga b(njf njf1)
    {
        return njf1.a;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            bundle = super.q.getString("AccountName");
            bundle = ((min)olm.a(O_(), min)).a(bundle, null, null, a(p.bz));
            bundle.putExtra("com.google.android.gms.plus.OVERRIDE_THEME", 1);
            bundle.putExtra("com.google.android.gms.plus.GPSRC", "gpac0");
            c.a(aa.S, bundle);
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        c = (new mpk(af)).a(aa.S, d);
        a = (nga)olm.a(ad, nga);
        b = (nin)ae.a(nin);
    }
}
