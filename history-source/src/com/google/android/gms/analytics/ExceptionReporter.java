// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            StandardExceptionParser, ae, GoogleAnalytics, ExceptionParser, 
//            Tracker

public class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private final Context mContext;
    private final Thread.UncaughtExceptionHandler yN;
    private final Tracker yO;
    private ExceptionParser yP;
    private GoogleAnalytics yQ;

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
        yN = uncaughtexceptionhandler;
        yO = tracker;
        yP = new StandardExceptionParser(context, new ArrayList());
        mContext = context.getApplicationContext();
        context = (new StringBuilder()).append("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        ae.V(context.append(tracker).toString());
    }

    GoogleAnalytics es()
    {
        if (yQ == null)
        {
            yQ = GoogleAnalytics.getInstance(mContext);
        }
        return yQ;
    }

    Thread.UncaughtExceptionHandler et()
    {
        return yN;
    }

    public ExceptionParser getExceptionParser()
    {
        return yP;
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        yP = exceptionparser;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (yP != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = yP.getDescription(((String) (obj)), throwable);
        }
        ae.V((new StringBuilder()).append("Tracking Exception: ").append(((String) (obj))).toString());
        yO.send((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true).build());
        obj = es();
        ((GoogleAnalytics) (obj)).dispatchLocalHits();
        ((GoogleAnalytics) (obj)).dY();
        if (yN != null)
        {
            ae.V("Passing exception to original handler.");
            yN.uncaughtException(thread, throwable);
        }
    }
}
