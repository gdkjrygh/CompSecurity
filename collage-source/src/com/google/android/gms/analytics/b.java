// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.f;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            f, c, a, g

public class b
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
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            g1 = "null";
        } else
        {
            g1 = uncaughtexceptionhandler.getClass().getName();
        }
        f.b(context.append(g1).toString());
    }

    c a()
    {
        if (e == null)
        {
            e = com.google.android.gms.analytics.c.a(c);
        }
        return e;
    }

    Thread.UncaughtExceptionHandler b()
    {
        return a;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
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
        f.b((new StringBuilder()).append("Reporting uncaught exception: ").append(((String) (obj))).toString());
        b.a((new d.a()).a(((String) (obj))).a(true).a());
        obj = a();
        ((c) (obj)).i();
        ((c) (obj)).j();
        if (a != null)
        {
            f.b("Passing exception to the original handler");
            a.uncaughtException(thread, throwable);
        }
    }
}
