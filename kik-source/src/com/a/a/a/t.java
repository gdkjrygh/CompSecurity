// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.d.f;
import b.a.a.a.a.d.n;
import b.a.a.a.a.g.b;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.a.a.a:
//            e, u, m

final class t extends f
{

    t(Context context, n n, m m, ScheduledExecutorService scheduledexecutorservice)
    {
        super(context, n, m, scheduledexecutorservice);
    }

    static n a(t t1)
    {
        return t1.c;
    }

    protected final n a()
    {
        return new e();
    }

    protected final void a(b b, String s)
    {
        super.a(new u(this, b, s));
    }
}
