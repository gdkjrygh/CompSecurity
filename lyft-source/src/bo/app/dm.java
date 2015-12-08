// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            dt, dn, cd, h, 
//            j, be, ei, em, 
//            ds

public final class dm
    implements dt
{

    public cd a;
    private final h b;
    private final j c;
    private final be d;
    private final be e;
    private final Executor f;
    private final ei g;
    private final em h;

    public dm(h h1, j j, be be, be be1, Executor executor, ei ei, em em)
    {
        b = h1;
        c = j;
        d = be;
        e = be1;
        f = executor;
        g = ei;
        h = em;
    }

    public final void a(ds ds)
    {
        f.execute(new dn(ds, b, c, d, e, g, a, h));
    }

    public final void b(ds ds)
    {
        (new dn(ds, b, c, d, e, g, a, h)).run();
    }
}
