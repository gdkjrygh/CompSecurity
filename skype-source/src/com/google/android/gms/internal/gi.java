// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gl

public abstract class gi
{

    private final Runnable a = new Runnable() {

        final gi a;

        public final void run()
        {
            gi.a(a, Thread.currentThread());
            a.a();
        }

            
            {
                a = gi.this;
                super();
            }
    };
    private volatile Thread b;

    public gi()
    {
    }

    static Thread a(gi gi1, Thread thread)
    {
        gi1.b = thread;
        return thread;
    }

    public abstract void a();

    public abstract void b();

    public final Future e()
    {
        return gl.a(a);
    }

    public final void f()
    {
        gl.a(1, a);
    }

    public final void g()
    {
        b();
        if (b != null)
        {
            b.interrupt();
        }
    }
}
