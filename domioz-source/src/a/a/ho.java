// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package a.a:
//            hp, jh, jj, jt, 
//            gz, jn, hf, gv, 
//            jf, iy, hl

public final class ho
{

    public final Resources a;
    public final int b;
    public final int c;
    final int d;
    final int e;
    final android.graphics.Bitmap.CompressFormat f;
    final int g;
    final jn h;
    final Executor i;
    final Executor j;
    final boolean k;
    final boolean l;
    final int m;
    final int n;
    final int o;
    public final hf p;
    final gv q;
    final jf r;
    final iy s;
    public final hl t;
    public final boolean u;
    final gv v;
    final jf w;
    final jf x;

    private ho(hp hp1)
    {
        a = hp.a(hp1).getResources();
        b = hp.b(hp1);
        c = hp.c(hp1);
        d = hp.d(hp1);
        e = hp.e(hp1);
        f = hp.f(hp1);
        g = hp.g(hp1);
        h = hp.h(hp1);
        i = hp.i(hp1);
        j = hp.j(hp1);
        m = hp.k(hp1);
        n = hp.l(hp1);
        o = hp.m(hp1);
        q = hp.n(hp1);
        p = hp.o(hp1);
        t = hp.p(hp1);
        u = hp.q(hp1);
        r = hp.r(hp1);
        s = hp.s(hp1);
        k = hp.t(hp1);
        l = hp.u(hp1);
        w = new jh(r);
        x = new jj(r);
        hp1 = jt.a(hp.a(hp1), false);
        File file = new File(hp1, "uil-images");
        if (file.exists() || file.mkdir())
        {
            hp1 = file;
        }
        v = new gz(hp1);
    }

    public ho(hp hp1, byte byte0)
    {
        this(hp1);
    }
}
