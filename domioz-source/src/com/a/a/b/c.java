// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.q;
import b.a.a.a.a.b.x;
import b.a.a.a.a.e.m;
import b.a.a.a.a.f.b;
import b.a.a.a.a.g.f;

// Referenced classes of package com.a.a.b:
//            b, d, a, f

final class c
{

    private final Context a;
    private final a b;
    private final x c;
    private final f d;
    private final com.a.a.b.b e;
    private final b f;
    private final q g;
    private final m h;

    public c(Context context, a a1, x x1, f f1, com.a.a.b.b b1, b b2, q q1, 
            m m)
    {
        a = context;
        b = a1;
        c = x1;
        d = f1;
        e = b1;
        f = b2;
        g = q1;
        h = m;
    }

    public final void a()
    {
        long l1;
        l1 = g.a();
        long l2 = d.b * 1000;
        b.a.a.a.f.c().a("Beta", (new StringBuilder("Check for updates delay: ")).append(l2).toString());
        long l3 = f.a().getLong("last_update_check", 0L);
        b.a.a.a.f.c().a("Beta", (new StringBuilder("Check for updates last check time: ")).append(l3).toString());
        l2 += l3;
        b.a.a.a.f.c().a("Beta", (new StringBuilder("Check for updates current time: ")).append(l1).append(", next check time: ").append(l2).toString());
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        b.a.a.a.f.c().a("Beta", "Performing update check");
        new j();
        String s = j.a(a);
        String s1 = c.a(s, e.d);
        (new d(b, l.d(b.w(), "com.crashlytics.ApiEndpoint"), d.a, h, new com.a.a.b.f())).a(s, s1, e);
        f.b().putLong("last_update_check", l1).commit();
        return;
        Exception exception;
        exception;
        f.b().putLong("last_update_check", l1).commit();
        throw exception;
        b.a.a.a.f.c().a("Beta", "Check for updates next check time was not passed");
        return;
    }
}
