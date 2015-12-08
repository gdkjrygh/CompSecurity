// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.shared.io.h;
import com.google.android.apps.gsa.shared.util.b;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.g.a.a.t;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.gsa.a:
//            b, i, e, c, 
//            k, j

public final class a
{

    private final b a;
    private final c b;
    private final h c;
    private final t d;
    private final s e;
    private final k f;
    private final boolean g = true;
    private final j h = new com.google.android.apps.gsa.a.b(this);
    private boolean i;
    private i j;
    private e k;

    public a(b b1, c c1, h h1, t t, s s1, k k1)
    {
        a = b1;
        b = c1;
        c = h1;
        d = t;
        e = s1;
        f = k1;
    }

    public final void a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (i)
        {
            flag = false;
        }
        p.b(flag, "Duplicate call to start.");
        i = true;
        j = new i(b, f, h);
        k = new e(d, c, g);
        k.a(j, e);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        p.b(i, "Call to close without start.");
        i = false;
        j.a.set(true);
        j = null;
        k.a();
        k = null;
        e.get();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
