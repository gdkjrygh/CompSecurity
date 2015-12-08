// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.paypal.android.sdk:
//            dl, bg, dx, dw

public abstract class do extends dl
{

    private static final String c = com/paypal/android/sdk/do.getSimpleName();
    protected final dx a;
    protected final int b;
    private ThreadPoolExecutor d;

    public do(int i, dx dx)
    {
        b = i;
        a = dx;
        d = (ThreadPoolExecutor)Executors.newCachedThreadPool();
    }

    static String c()
    {
        return c;
    }

    protected abstract String a();

    protected abstract int b();

    public final boolean b(dw dw)
    {
        d.submit(new bg(this, dw));
        return true;
    }

    protected abstract boolean c(dw dw);

}
