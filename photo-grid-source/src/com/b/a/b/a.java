// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import a.a.a.a.a.b.j;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.q;
import a.a.a.a.a.b.x;
import a.a.a.a.a.e.m;
import a.a.a.a.a.f.c;
import a.a.a.a.a.g.f;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.b.a.b:
//            l, f, g, e, 
//            i

abstract class a
    implements com.b.a.b.l
{

    private final AtomicBoolean a;
    private final AtomicBoolean b;
    private Context c;
    private e d;
    private x e;
    private f f;
    private com.b.a.b.f g;
    private c h;
    private q i;
    private m j;
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

    public final void a(Context context, e e1, x x1, f f1, com.b.a.b.f f2, c c1, q q1, 
            m m)
    {
        c = context;
        d = e1;
        e = x1;
        f = f1;
        g = f2;
        h = c1;
        i = q1;
        j = m;
        a.set(true);
        if (b.get())
        {
            b();
        }
    }

    protected final boolean a()
    {
        b.set(true);
        return a.get();
    }

    protected final void b()
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
        a.a.a.a.f.d();
        a.a.a.a.f.d();
        (new StringBuilder("Check for updates last check time: ")).append(k);
        l2 = l2 * 1000L + k;
        a.a.a.a.f.d();
        (new StringBuilder("Check for updates current time: ")).append(l1).append(", next check time: ").append(l2);
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        a.a.a.a.f.d();
        new j();
        obj = a.a.a.a.a.b.j.a(c);
        String s = e.a(((String) (obj)), g.d);
        (new g(d, l.c(d.v(), "com.crashlytics.ApiEndpoint"), f.a, j, new i())).a(((String) (obj)), s, g);
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
        a.a.a.a.f.d();
        return;
    }
}
