// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

final class ng.Object
    implements Runnable
{

    private Date a;
    private Thread b;
    private Throwable c;
    private aly d;

    public final void run()
    {
        if (!aly.a(d).get())
        {
            aly.b(d, a, b, c);
        }
    }

    ng.Throwable(aly aly1, Date date, Thread thread, Throwable throwable)
    {
        d = aly1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }
}
