// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

public final class fyf
    implements mti, omb, opn, opv
{

    final fyh a;
    public mtj b;
    public mmr c;
    private final ar d;
    private ngc e;
    private fyc f;
    private mmv g;

    public fyf(ar ar1, opd opd1, fyh fyh)
    {
        d = ar1;
        a = fyh;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (ngc)olm1.a(ngc);
        f = (fyc)olm1.a(fyc);
        g = (mmv)olm1.a(mmv);
        c = (mmr)olm1.a(mmr);
        b = ((mtj)olm1.a(mtj)).a(this);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("AccountUpdateResponseTask".equals(s) && mue1 != null && !mue1.c())
        {
            int i = c.d();
            s = g.a(i).b("account_name");
            mue1 = f.b(i);
            if (mue1 != fyd.a)
            {
                e.a(d.c(), c.d());
                if (mue1 == fyd.b)
                {
                    (new android.app.AlertDialog.Builder(d)).setTitle(String.format(d.getString(b.qV), new Object[] {
                        s
                    })).setMessage(d.getString(b.qU)).setNegativeButton(0x104000a, null).setPositiveButton(d.getString(b.qW), new fyg(this)).create().show();
                    return;
                }
                if (mue1 == fyd.c)
                {
                    (new android.app.AlertDialog.Builder(d)).setTitle(String.format(d.getString(b.qT), new Object[] {
                        s
                    })).setMessage(d.getString(b.qS)).setPositiveButton(0x104000a, null).create().show();
                    return;
                }
            }
        }
    }

    public final void c()
    {
        b.b(this);
    }
}
