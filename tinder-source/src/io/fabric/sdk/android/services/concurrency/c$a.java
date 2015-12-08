// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            c, e, a

private static final class b
    implements Executor
{

    private final Executor a;
    private final c b;

    static c a(b b1)
    {
        return b1.b;
    }

    public final void execute(Runnable runnable)
    {
        a.execute(new e(runnable) {

            final c.a a;

            public final a b()
            {
                return c.a.a(a);
            }

            
            {
                a = c.a.this;
                super(runnable, null);
            }
        });
    }

    public nit>(Executor executor, c c1)
    {
        a = executor;
        b = c1;
    }
}
