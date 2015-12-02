// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class btx extends btu
{

    private static final String c = btx.getSimpleName();
    protected final buk a;
    protected final int b;
    private ThreadPoolExecutor d;

    public btx(int i, buk buk)
    {
        b = i;
        a = buk;
        d = (ThreadPoolExecutor)Executors.newCachedThreadPool();
    }

    static String c()
    {
        return c;
    }

    protected abstract String a();

    protected abstract int b();

    public final boolean b(buj buj)
    {
        d.submit(new bty(this, buj));
        return true;
    }

    protected abstract boolean c(buj buj);

}
