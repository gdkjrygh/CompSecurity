// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.d.g;
import b.a.a.a.a.d.o;
import b.a.a.a.a.g.b;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.a.a.a:
//            e, r, i

final class q extends g
{

    q(Context context, o o, i i, ScheduledExecutorService scheduledexecutorservice)
    {
        super(context, o, i, scheduledexecutorservice);
    }

    static o a(q q1)
    {
        return q1.c;
    }

    protected final o a()
    {
        return new e();
    }

    protected final void a(b b, String s)
    {
        super.a(new r(this, b, s));
    }
}
