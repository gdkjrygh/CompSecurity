// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;

final class arx
    implements ThreadFactory
{

    private final String a;
    private final arz b;
    private int c;

    arx()
    {
        this("fifo-pool");
    }

    arx(String s)
    {
        this(s, arz.a);
    }

    private arx(String s, arz arz1)
    {
        c = 0;
        a = s;
        b = arz1;
    }

    static arz a(arx arx1)
    {
        return arx1.b;
    }

    public final Thread newThread(Runnable runnable)
    {
        String s = a;
        int i = c;
        runnable = new ary(this, runnable, (new StringBuilder(String.valueOf(s).length() + 19)).append(s).append("-thread-").append(i).toString());
        c = c + 1;
        return runnable;
    }
}
