// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            ir, ki, kk, ku, 
//            ic, ko, ih, hy, 
//            kg, ka, in

public final class iq
{

    public final Resources a;
    public final int b;
    public final int c;
    final int d;
    final int e;
    final android.graphics.Bitmap.CompressFormat f;
    final int g;
    final ko h;
    final Executor i;
    final Executor j;
    final boolean k;
    final boolean l;
    final int m;
    final int n;
    final int o;
    public final ih p;
    final hy q;
    final kg r;
    final ka s;
    public final in t;
    public final boolean u;
    final hy v;
    final kg w;
    final kg x;

    private iq(ir ir1)
    {
        a = ir.a(ir1).getResources();
        b = ir.b(ir1);
        c = ir.c(ir1);
        d = ir.d(ir1);
        e = ir.e(ir1);
        f = ir.f(ir1);
        g = ir.g(ir1);
        h = ir.h(ir1);
        i = ir.i(ir1);
        j = ir.j(ir1);
        m = ir.k(ir1);
        n = ir.l(ir1);
        o = ir.m(ir1);
        q = ir.n(ir1);
        p = ir.o(ir1);
        t = ir.p(ir1);
        u = ir.q(ir1);
        r = ir.r(ir1);
        s = ir.s(ir1);
        k = ir.t(ir1);
        l = ir.u(ir1);
        w = new ki(r);
        x = new kk(r);
        ir1 = ku.a(ir.a(ir1), false);
        File file = new File(ir1, "uil-images");
        if (file.exists() || file.mkdir())
        {
            ir1 = file;
        }
        v = new ic(ir1);
    }

    public iq(ir ir1, byte byte0)
    {
        this(ir1);
    }
}
