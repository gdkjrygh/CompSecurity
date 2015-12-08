// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package com.google.analytics.tracking.android:
//            bg, aq, q, bh, 
//            bd

public final class r
    implements Thread.UncaughtExceptionHandler
{

    private final Thread.UncaughtExceptionHandler a;
    private final bh b;
    private final bd c;
    private q d;

    public r(bh bh1, bd bd1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
    {
        if (bh1 == null)
        {
            throw new NullPointerException("tracker cannot be null");
        }
        if (bd1 == null)
        {
            throw new NullPointerException("serviceManager cannot be null");
        }
        a = uncaughtexceptionhandler;
        b = bh1;
        c = bd1;
        d = new bg(context, new ArrayList());
        bd1 = new StringBuilder("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            bh1 = "null";
        } else
        {
            bh1 = uncaughtexceptionhandler.getClass().getName();
        }
        aq.d(bd1.append(bh1).toString());
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        String s = "UncaughtException";
        if (d != null)
        {
            if (thread != null)
            {
                s = thread.getName();
            } else
            {
                s = null;
            }
            s = d.a(s, throwable);
        }
        aq.d((new StringBuilder("Tracking Exception: ")).append(s).toString());
        b.d(s);
        c.c();
        if (a != null)
        {
            aq.d("Passing exception to original handler.");
            a.uncaughtException(thread, throwable);
        }
    }
}
