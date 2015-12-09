// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//            StandardExceptionParser, ac, GoogleAnalytics, ExceptionParser, 
//            Tracker

public final class ExceptionReporter
    implements Thread.UncaughtExceptionHandler
{

    private final Context mContext;
    private final Thread.UncaughtExceptionHandler yM;
    private final Tracker yN;
    private ExceptionParser yO;
    private GoogleAnalytics yP;

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
        yM = uncaughtexceptionhandler;
        yN = tracker;
        yO = new StandardExceptionParser(context, new ArrayList());
        mContext = context.getApplicationContext();
        context = new StringBuilder("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            tracker = "null";
        } else
        {
            tracker = uncaughtexceptionhandler.getClass().getName();
        }
        ac.v(context.append(tracker).toString());
    }

    private GoogleAnalytics eo()
    {
        if (yP == null)
        {
            yP = GoogleAnalytics.getInstance(mContext);
        }
        return yP;
    }

    final Thread.UncaughtExceptionHandler ep()
    {
        return yM;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (yO != null)
        {
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = yO.getDescription(((String) (obj)), throwable);
        }
        ac.v((new StringBuilder("Tracking Exception: ")).append(((String) (obj))).toString());
        yN.send((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true).build());
        obj = eo();
        ((GoogleAnalytics) (obj)).dispatchLocalHits();
        ((GoogleAnalytics) (obj)).forceDispatch();
        if (yM != null)
        {
            ac.v("Passing exception to original handler.");
            yM.uncaughtException(thread, throwable);
        }
    }
}
