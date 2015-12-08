// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class cur extends jig
{

    long a;
    final cun b;
    private final Runnable d = new cus(this);

    cur(cun cun)
    {
        b = cun;
        super();
    }

    private void q()
    {
        b.w().post(d);
    }

    protected final jjh a(int i)
    {
        return jjh.a(-1, "application/octet-stream", -1, -2L);
    }

    protected final void a(int i, long l, boolean flag)
    {
        a = l;
    }

    protected final void a(long l, long l1)
    {
        a = l;
        q();
    }

    protected final boolean a(long l)
    {
        return true;
    }

    protected final int aB_()
    {
        return 1;
    }

    protected final void b(long l)
    {
        a = l;
        q();
    }

    protected final boolean c()
    {
        return true;
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
    {
    }

    protected final long f()
    {
        return -2L;
    }

    protected final long g()
    {
        return -3L;
    }
}
