// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.d;
import com.google.android.apps.gsa.shared.util.debug.b.a;
import com.google.common.util.concurrent.t;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            f, d

final class e
    implements d
{

    final c a;
    private final com.google.android.apps.gsa.b.a.a.d b;
    private final d c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    e(com.google.android.apps.gsa.b.a.a.d d1, d d2, c c1)
    {
        b = d1;
        c = d2;
        a = c1;
    }

    public final t a()
    {
        return com.google.android.apps.gsa.shared.util.debug.b.a.a(com.google.common.util.concurrent.e.a(c.a(), new f(this)));
    }

    public final int b()
    {
        return c.b();
    }

    public final void c()
    {
        if (!d.getAndSet(true))
        {
            b.a();
            c.c();
        }
    }
}
