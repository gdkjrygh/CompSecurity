// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class gzu
    implements Executor
{

    private final Executor a;
    private final gzt b;

    public gzu(Executor executor, gzt gzt)
    {
        a = executor;
        b = gzt;
    }

    static gzt a(gzu gzu1)
    {
        return gzu1.b;
    }

    public final void execute(Runnable runnable)
    {
        a.execute(new gzw(runnable) {

            private gzu a;

            public final gzr b()
            {
                return gzu.a(a);
            }

            
            {
                a = gzu.this;
                super(runnable, null);
            }
        });
    }
}
