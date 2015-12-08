// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            bc

final class t
    implements Runnable
{

    private Date a;
    private Thread b;
    private Throwable c;
    private bc d;

    t(bc bc1, Date date, Thread thread, Throwable throwable)
    {
        d = bc1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }

    public final void run()
    {
        if (!bc.a(d).get())
        {
            bc.b(d, a, b, c);
        }
    }
}
