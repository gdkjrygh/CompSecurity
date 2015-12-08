// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hlb
    implements omb, opv
{

    final ar a;
    mtj b;
    mmr c;
    boolean d;
    private ekb e;
    private dgk f;
    private noz g;

    hlb(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    static void a(hlb hlb1, mue mue1, mua mua1)
    {
        mua1.a("RemoveFromCollectionTask");
        if (mue1 == null || mue1.c())
        {
            if (mue1 != null)
            {
                mua1 = mue1.c;
            }
            if (!nuo.a(hlb1.a, mue1, nup.m))
            {
                mue1 = hlb1.f.a();
                mue1.d = hlb1.a.getString(b.ww);
                mue1.a().c();
            }
            return;
        }
        if (hlb1.d)
        {
            hlb1.f.a().a(b.wx, new Object[0]).a().c();
        }
        hlb1.e.b();
    }

    static boolean a(ekq ekq1)
    {
        ekq1 = (ila)ekq1.b(ila);
        return ekq1 != null && ((ila) (ekq1)).a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = noz.a(context, "RemoveFromCollection", new String[] {
            "sync"
        });
        e = (ekb)olm1.a(ekb);
        c = (mmr)olm1.a(mmr);
        f = (dgk)olm1.a(dgk);
        b = ((mtj)olm1.a(mtj)).a("RemoveFromCollectionTask", new hlc(this));
    }
}
