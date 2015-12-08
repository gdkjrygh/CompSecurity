// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.Executor;
import rx.R;
import rx.e.d;
import rx.e.f;
import rx.internal.c.a;

// Referenced classes of package rx.f:
//            a, h, g, c, 
//            m

public final class i
{

    private static final i d = new i();
    private final R a = new a();
    private final R b = new rx.f.a();
    private final R c = h.b();

    private i()
    {
        rx.e.d.a().d();
        f.a();
        rx.e.d.a().d();
        f.b();
        rx.e.d.a().d();
        f.c();
    }

    public static R a()
    {
        return g.b();
    }

    public static R a(Executor executor)
    {
        return new c(executor);
    }

    public static R b()
    {
        return m.b();
    }

    public static R c()
    {
        return d.a;
    }

}
