// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.t;
import b.a.a.a.a.e.g;
import b.a.a.a.a.f.b;
import b.a.a.a.a.g.f;
import b.a.a.a.d;

// Referenced classes of package com.a.a.b:
//            b, d, a, f

final class c
{

    private final Context a;
    private final a b;
    private final t c;
    private final f d;
    private final com.a.a.b.b e;
    private final b f;
    private final m g;
    private final g h;

    public c(Context context, a a1, t t1, f f1, com.a.a.b.b b1, b b2, m m1, 
            g g1)
    {
        a = context;
        b = a1;
        c = t1;
        d = f1;
        e = b1;
        f = b2;
        g = m1;
        h = g1;
    }

    public final void a()
    {
        long l;
        l = g.a();
        long l1 = d.b * 1000;
        b.a.a.a.d.c();
        long l2 = f.a().getLong("last_update_check", 0L);
        b.a.a.a.d.c();
        l1 += l2;
        b.a.a.a.d.c();
        (new StringBuilder("Check for updates current time: ")).append(l).append(", next check time: ").append(l1);
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        b.a.a.a.d.c();
        new h();
        String s = b.a.a.a.a.b.h.a(a);
        String s1 = c.a(s, e.d);
        (new com.a.a.b.d(b, j.c(b.v(), "com.crashlytics.ApiEndpoint"), d.a, h, new com.a.a.b.f())).a(s, s1, e);
        f.b().putLong("last_update_check", l).commit();
        return;
        Exception exception;
        exception;
        f.b().putLong("last_update_check", l).commit();
        throw exception;
        b.a.a.a.d.c();
        return;
    }
}
