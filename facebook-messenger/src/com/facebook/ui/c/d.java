// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.c;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.common.f.f;
import com.facebook.common.f.g;
import com.google.common.base.Stopwatch;

// Referenced classes of package com.facebook.ui.c:
//            e

public class d
{

    private final Context a;
    private final a b;
    private final f c;
    private final Stopwatch d = new Stopwatch();

    public d(Context context, a a1, f f1)
    {
        c = f1;
        a = context;
        b = a1;
        d.reset();
    }

    static Context a(d d1)
    {
        return d1.a;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d.isRunning() || d.elapsedMillis() > 0x36ee80L)
        {
            b.b(new e(this));
            d.reset().start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(long l, boolean flag)
    {
        boolean flag1 = c.a(g.INTERNAL, l);
        if (flag1 && flag)
        {
            a();
        }
        return flag1;
    }
}
