// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzad;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            StandardExceptionParser, ExceptionParser, Tracker, GoogleAnalytics

public class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private final Context mContext;
    private final Thread.UncaughtExceptionHandler zzEs;
    private final Tracker zzEt;
    private ExceptionParser zzEu;
    private GoogleAnalytics zzEv;

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
        zzEs = uncaughtexceptionhandler;
        zzEt = tracker;
        zzEu = new StandardExceptionParser(context, new ArrayList());
        mContext = context.getApplicationContext();
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        zzad.zzam(context.append(tracker).toString());
    }

    public ExceptionParser getExceptionParser()
    {
        return zzEu;
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        zzEu = exceptionparser;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (zzEu != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = zzEu.getDescription(((String) (obj)), throwable);
        }
        zzad.zzam((new StringBuilder()).append("Reporting uncaught exception: ").append(((String) (obj))).toString());
        zzEt.send((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true).build());
        obj = zzfT();
        ((GoogleAnalytics) (obj)).dispatchLocalHits();
        ((GoogleAnalytics) (obj)).zzfY();
        if (zzEs != null)
        {
            zzad.zzam("Passing exception to the original handler");
            zzEs.uncaughtException(thread, throwable);
        }
    }

    GoogleAnalytics zzfT()
    {
        if (zzEv == null)
        {
            zzEv = GoogleAnalytics.getInstance(mContext);
        }
        return zzEv;
    }

    Thread.UncaughtExceptionHandler zzfU()
    {
        return zzEs;
    }
}
