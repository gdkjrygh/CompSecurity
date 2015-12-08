// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import com.microsoft.advertising.android.a.d;

// Referenced classes of package com.microsoft.advertising.android:
//            af, f

final class bo
    implements d
{

    private volatile boolean a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile boolean d;
    private final f e;
    private final Runnable f;
    private final Handler g;

    public bo(f f1, Handler handler, Runnable runnable)
    {
        a = false;
        b = false;
        c = false;
        d = false;
        af.a(new Object[] {
            f1, runnable, handler
        });
        e = f1;
        f = runnable;
        g = handler;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            c = true;
            g.post(f);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        if (!d)
        {
            if (!a)
            {
                c();
                return;
            }
            if (b)
            {
                c();
                return;
            }
        }
    }

    public final void b()
    {
        d = true;
    }
}
