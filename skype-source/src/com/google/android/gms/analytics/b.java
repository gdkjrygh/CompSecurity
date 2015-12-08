// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.s;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            f, a, g, c

public final class b
    implements Thread.UncaughtExceptionHandler
{

    private final Thread.UncaughtExceptionHandler a;
    private final g b;
    private final Context c;
    private a d;
    private c e;

    public b(g g1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
    {
        if (g1 == null)
        {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        a = uncaughtexceptionhandler;
        b = g1;
        d = new com.google.android.gms.analytics.f(context, new ArrayList());
        c = context.getApplicationContext();
        context = new StringBuilder("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            g1 = "null";
        } else
        {
            g1 = uncaughtexceptionhandler.getClass().getName();
        }
        f.b(context.append(g1).toString());
    }

    public final void a(a a1)
    {
        d = a1;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (d != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = d.a(((String) (obj)), throwable);
        }
        f.b((new StringBuilder("Reporting uncaught exception: ")).append(((String) (obj))).toString());
        b.a((new d.c()).a(((String) (obj))).a(true).a());
        if (e == null)
        {
            e = com.google.android.gms.analytics.c.a(c);
        }
        obj = e;
        ((c) (obj)).i().h().d();
        ((c) (obj)).i().h().e();
        if (a != null)
        {
            f.b("Passing exception to the original handler");
            a.uncaughtException(thread, throwable);
        }
    }
}
