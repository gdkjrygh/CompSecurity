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
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.f;
import b.a.a.a.d;
import b.a.a.a.l;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.b:
//            l, f, g, i, 
//            e

abstract class a
    implements com.a.a.b.l
{

    final AtomicBoolean a;
    final AtomicBoolean b;
    private Context c;
    private e d;
    private t e;
    private f f;
    private com.a.a.b.f g;
    private c h;
    private m i;
    private g j;
    private long k;

    public a()
    {
        this(false);
    }

    public a(boolean flag)
    {
        a = new AtomicBoolean();
        k = 0L;
        b = new AtomicBoolean(flag);
    }

    protected final void a()
    {
        long l1;
        synchronized (h)
        {
            if (h.a().contains("last_update_check"))
            {
                h.a(h.b().remove("last_update_check"));
            }
        }
        l1 = i.a();
        long l2 = f.b;
        b.a.a.a.d.a();
        b.a.a.a.d.a();
        (new StringBuilder("Check for updates last check time: ")).append(k);
        l2 = l2 * 1000L + k;
        b.a.a.a.d.a();
        (new StringBuilder("Check for updates current time: ")).append(l1).append(", next check time: ").append(l2);
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        b.a.a.a.d.a();
        new h();
        obj = b.a.a.a.a.b.h.a(c);
        String s = e.a(((String) (obj)), g.d);
        (new com.a.a.b.g(d, b.a.a.a.a.b.j.b(((l) (d)).n, "com.crashlytics.ApiEndpoint"), f.a, j, new i())).a(((String) (obj)), s, g);
        k = l1;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        k = l1;
        throw exception;
        b.a.a.a.d.a();
        return;
    }

    public final void a(Context context, e e1, t t1, f f1, com.a.a.b.f f2, c c1, m m1, 
            g g1)
    {
        c = context;
        d = e1;
        e = t1;
        f = f1;
        g = f2;
        h = c1;
        i = m1;
        j = g1;
        a.set(true);
        if (b.get())
        {
            a();
        }
    }
}
