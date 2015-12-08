// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class brv extends bmb
{

    public static final long a = (long)b.m(200);
    public static final long b = (long)b.m(8);
    private static long g = (long)b.m(50);
    public final Executor e;
    public final Runnable f = new brx(this);
    private final okq h;
    private final okq i;
    private final ddf j;
    private final Object k = new Object();
    private final Runnable l = new brw(this);

    public brv(bmb bmb1, Executor executor, okq okq1, okq okq2, ddf ddf1)
    {
        super(bmb1);
        e = (Executor)b.a(executor, "backgroundExecutor", null);
        h = (okq)b.a(okq1, "shortTermVideoChunkStore", null);
        i = (okq)b.a(okq2, "firstVideoChunkStore", null);
        j = (ddf)b.a(ddf1, "freeSpaceProvider", null);
    }

    static Object a(brv brv1)
    {
        return brv1.k;
    }

    static void b(brv brv1)
    {
        brv1.i.e();
        brv1.h.e();
        long l2 = Math.max(0L, (brv1.j.a() + (long)(brv1.h.g() * brv1.h.b + brv1.i.g() * brv1.i.b)) - g);
        long l1 = Math.min(l2, b);
        l2 = Math.min(l2 - l1, a);
        brv1.i.a(l1);
        brv1.h.a(l2);
    }

    static okq c(brv brv1)
    {
        return brv1.h;
    }

    public final brz b()
    {
        c.a(super.d, "controller must be initted before calling getVideoPredownloadStatusProvider()");
        return new bry(this);
    }

    public final void e()
    {
        super.e();
        e.execute(l);
    }

}
