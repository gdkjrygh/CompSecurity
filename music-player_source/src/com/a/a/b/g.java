// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import com.a.a.a.a.a.b;
import com.a.a.b.b.d;
import com.a.a.b.d.c;
import com.a.a.b.d.e;
import com.a.a.b.g.a;
import com.a.a.c.h;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package com.a.a.b:
//            h, d

public final class g
{

    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final android.graphics.Bitmap.CompressFormat f;
    final int g;
    final a h;
    final Executor i;
    final Executor j;
    final boolean k;
    final boolean l;
    final int m;
    final int n;
    final com.a.a.b.a.h o;
    final com.a.a.a.b.a p;
    final com.a.a.a.a.b q;
    final c r;
    final d s;
    final com.a.a.b.d t;
    final boolean u;
    final com.a.a.a.a.b v;
    final c w;
    final c x;

    private g(com.a.a.b.h h1)
    {
        a = com.a.a.b.h.a(h1).getResources();
        b = com.a.a.b.h.b(h1);
        c = com.a.a.b.h.c(h1);
        d = com.a.a.b.h.d(h1);
        e = com.a.a.b.h.e(h1);
        f = com.a.a.b.h.f(h1);
        g = com.a.a.b.h.g(h1);
        h = com.a.a.b.h.h(h1);
        i = com.a.a.b.h.i(h1);
        j = com.a.a.b.h.j(h1);
        m = com.a.a.b.h.k(h1);
        n = com.a.a.b.h.l(h1);
        o = com.a.a.b.h.m(h1);
        q = com.a.a.b.h.n(h1);
        p = com.a.a.b.h.o(h1);
        t = com.a.a.b.h.p(h1);
        u = com.a.a.b.h.q(h1);
        r = com.a.a.b.h.r(h1);
        s = com.a.a.b.h.s(h1);
        k = com.a.a.b.h.t(h1);
        l = com.a.a.b.h.u(h1);
        w = new e(r);
        x = new com.a.a.b.d.g(r);
        h1 = com.a.a.c.h.a(com.a.a.b.h.a(h1), false);
        File file = new File(h1, "uil-images");
        if (file.exists() || file.mkdir())
        {
            h1 = file;
        }
        v = new b(h1);
    }

    g(com.a.a.b.h h1, byte byte0)
    {
        this(h1);
    }
}
