// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.concurrent.Executor;

// Referenced classes of package a.a:
//            cl, cf, az, ga, 
//            ic, aa, db, df, 
//            ck

public final class ce
    implements cl
{

    public az a;
    private final ga b;
    private final ic c;
    private final aa d;
    private final aa e;
    private final Executor f;
    private final db g;
    private final df h;

    public ce(ga ga, ic ic, aa aa, aa aa1, Executor executor, db db, df df)
    {
        b = ga;
        c = ic;
        d = aa;
        e = aa1;
        f = executor;
        g = db;
        h = df;
    }

    public final void a(ck ck)
    {
        f.execute(new cf(ck, b, c, d, e, g, a, h));
    }

    public final void b(ck ck)
    {
        (new cf(ck, b, c, d, e, g, a, h)).run();
    }
}
