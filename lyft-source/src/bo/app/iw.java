// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            ix, ko, kq, la, 
//            ii, ku, in, ie, 
//            km, kg, it

public final class iw
{

    public final Resources a;
    public final int b;
    public final int c;
    final int d;
    final int e;
    final android.graphics.Bitmap.CompressFormat f;
    final int g;
    final ku h;
    final Executor i;
    final Executor j;
    final boolean k;
    final boolean l;
    final int m;
    final int n;
    final int o;
    public final in p;
    final ie q;
    final km r;
    final kg s;
    public final it t;
    public final boolean u;
    final ie v;
    final km w;
    final km x;

    private iw(ix ix1)
    {
        a = ix.a(ix1).getResources();
        b = ix.b(ix1);
        c = ix.c(ix1);
        d = ix.d(ix1);
        e = ix.e(ix1);
        f = ix.f(ix1);
        g = ix.g(ix1);
        h = ix.h(ix1);
        i = ix.i(ix1);
        j = ix.j(ix1);
        m = ix.k(ix1);
        n = ix.l(ix1);
        o = ix.m(ix1);
        q = ix.n(ix1);
        p = ix.o(ix1);
        t = ix.p(ix1);
        u = ix.q(ix1);
        r = ix.r(ix1);
        s = ix.s(ix1);
        k = ix.t(ix1);
        l = ix.u(ix1);
        w = new ko(r);
        x = new kq(r);
        ix1 = la.a(ix.a(ix1), false);
        File file = new File(ix1, "uil-images");
        if (file.exists() || file.mkdir())
        {
            ix1 = file;
        }
        v = new ii(ix1);
    }

    public iw(ix ix1, byte byte0)
    {
        this(ix1);
    }
}
