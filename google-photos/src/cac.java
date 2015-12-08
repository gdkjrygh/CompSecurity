// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;

final class cac
    implements bus
{

    private bzv a;

    cac(bzv bzv1)
    {
        a = bzv1;
        super();
    }

    private void c()
    {
        bzv.g(a).d(bzv.h());
    }

    public final void a()
    {
        File file = new File((String)c.a(bzv.k(a).s(), "state.getVideoOutputFileName()", null));
        File file1 = new File((String)c.a(bzv.l(a).t(), "state.getSavingTemporaryFileName()", null));
        if (!file1.renameTo(file))
        {
            file.delete();
            file1.delete();
            Log.e(bzv.h(), "failed to rename output file");
            bzv.g(a).d(bzv.h());
            bzv.m(a).j(true);
            bzv.n(a).i(false);
            if (!bzv.o(a).q())
            {
                bzv.p(a).h(true);
                bzv.g(a).c(bzv.h());
            }
            bzv.i(a).a(bzv.i());
            bzv.q(a).a(caf.a);
            a.d();
            return;
        } else
        {
            bzo bzo = bzv.w(a);
            android.content.Context context = bzv.r(a);
            bzv.s(a).a(new bzs(context, bzo, bzv.t(a).b.X, bzv.u(a).b.p, file.getAbsolutePath(), bzv.v(a).b.ae));
            bzv.a(a, file.getAbsolutePath());
            return;
        }
    }

    public final void a(int i)
    {
        bra bra1 = bzv.g(a);
        boolean flag;
        if (!bra1.c.b.af && !bra1.c.b.ae)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bra1.e.a("saving", flag);
        if (flag)
        {
            ((brg)bra1.b.b).a(c.bh, i);
        }
    }

    public final void a(boolean flag)
    {
        c();
        bzv.z(a);
        if (bzv.A(a).p())
        {
            if (!bzv.B(a).q())
            {
                bzv.C(a).h(true);
                bzv.g(a).c(bzv.h());
            }
            if (flag && bzv.D(a) != null)
            {
                bzv.D(a).a();
            }
            bzv.i(a).a(bzv.i());
            bzv.E(a).a(caf.a);
        }
    }

    public final void b()
    {
        if (bzv.x(a).p())
        {
            if (!bzv.y(a).b.I)
            {
                throw c.a("unexpected incomplete save");
            } else
            {
                bzv.i(a).a(bzv.i());
                return;
            }
        } else
        {
            Log.w(bzv.h(), "saving interrupted while not saving");
            c();
            return;
        }
    }
}
