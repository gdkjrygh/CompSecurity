// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            StandardExceptionParser, GoogleAnalytics, ExceptionParser, Tracker

public class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private final Thread.UncaughtExceptionHandler a;
    private final Tracker b;
    private final Context c;
    private ExceptionParser d;
    private GoogleAnalytics e;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
    {
        if (tracker == null)
        {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        a = uncaughtexceptionhandler;
        b = tracker;
        d = new StandardExceptionParser(context, new ArrayList());
        c = context.getApplicationContext();
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        zzae.b(context.append(tracker).toString());
    }

    GoogleAnalytics a()
    {
        if (e == null)
        {
            e = GoogleAnalytics.a(c);
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
        zzae.b((new StringBuilder()).append("Reporting uncaught exception: ").append(((String) (obj))).toString());
        b.a((new HitBuilders.ExceptionBuilder()).a(((String) (obj))).a(true).a());
        obj = a();
        ((GoogleAnalytics) (obj)).i();
        ((GoogleAnalytics) (obj)).j();
        if (a != null)
        {
            zzae.b("Passing exception to the original handler");
            a.uncaughtException(thread, throwable);
        }
    }
}
