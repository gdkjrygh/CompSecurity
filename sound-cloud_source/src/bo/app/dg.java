// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            dn, dh, bx, h, 
//            j, az, ec, eg, 
//            dm

public final class dg
    implements dn
{

    public bx a;
    private final h b;
    private final j c;
    private final az d;
    private final az e;
    private final Executor f;
    private final ec g;
    private final eg h;

    public dg(h h1, j j, az az, az az1, Executor executor, ec ec, eg eg)
    {
        b = h1;
        c = j;
        d = az;
        e = az1;
        f = executor;
        g = ec;
        h = eg;
    }

    public final void a(dm dm)
    {
        f.execute(new dh(dm, b, c, d, e, g, a, h));
    }

    public final void b(dm dm)
    {
        (new dh(dm, b, c, d, e, g, a, h)).run();
    }
}
