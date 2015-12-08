// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            is, kj, kl, kv, 
//            id, kp, ii, hz, 
//            kh, kb, io

public final class ir
{

    public final Resources a;
    public final int b;
    public final int c;
    final int d;
    final int e;
    final android.graphics.Bitmap.CompressFormat f;
    final int g;
    final kp h;
    final Executor i;
    final Executor j;
    final boolean k;
    final boolean l;
    final int m;
    final int n;
    final int o;
    public final ii p;
    final hz q;
    final kh r;
    final kb s;
    public final io t;
    public final boolean u;
    final hz v;
    final kh w;
    final kh x;

    private ir(is is1)
    {
        a = is.a(is1).getResources();
        b = is.b(is1);
        c = is.c(is1);
        d = is.d(is1);
        e = is.e(is1);
        f = is.f(is1);
        g = is.g(is1);
        h = is.h(is1);
        i = is.i(is1);
        j = is.j(is1);
        m = is.k(is1);
        n = is.l(is1);
        o = is.m(is1);
        q = is.n(is1);
        p = is.o(is1);
        t = is.p(is1);
        u = is.q(is1);
        r = is.r(is1);
        s = is.s(is1);
        k = is.t(is1);
        l = is.u(is1);
        w = new kj(r);
        x = new kl(r);
        is1 = kv.a(is.a(is1), false);
        File file = new File(is1, "uil-images");
        if (file.exists() || file.mkdir())
        {
            is1 = file;
        }
        v = new id(is1);
    }

    public ir(is is1, byte byte0)
    {
        this(is1);
    }
}
