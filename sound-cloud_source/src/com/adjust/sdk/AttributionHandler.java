// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            IAttributionHandler, AdjustFactory, TimerOnce, ILogger, 
//            AdjustAttribution, IActivityHandler, ActivityPackage, Util

public class AttributionHandler
    implements IAttributionHandler
{

    private IActivityHandler activityHandler;
    private ActivityPackage attributionPackage;
    private boolean hasListener;
    private ILogger logger;
    private boolean paused;
    private ScheduledExecutorService scheduler;
    private TimerOnce timer;

    public AttributionHandler(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
    {
        scheduler = Executors.newSingleThreadScheduledExecutor();
        logger = AdjustFactory.getLogger();
        if (scheduler != null)
        {
            timer = new TimerOnce(scheduler, new _cls1());
        } else
        {
            logger.error("Timer not initialized, attribution handler is disabled", new Object[0]);
        }
        init(iactivityhandler, activitypackage, flag, flag1);
    }

    private Uri buildUri(String s, Map map)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority("app.adjust.com");
        builder.appendPath(s);
        for (s = map.entrySet().iterator(); s.hasNext(); builder.appendQueryParameter((String)map.getKey(), (String)map.getValue()))
        {
            map = (java.util.Map.Entry)s.next();
        }

        return builder.build();
    }

    private void checkAttributionInternal(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        AdjustAttribution adjustattribution = AdjustAttribution.fromJson(jsonobject.optJSONObject("attribution"));
        long l = jsonobject.optLong("ask_in", -1L);
        if (l < 0L)
        {
            activityHandler.tryUpdateAttribution(adjustattribution);
            activityHandler.setAskingAttribution(false);
            return;
        } else
        {
            activityHandler.setAskingAttribution(true);
            getAttribution(l);
            return;
        }
    }

    private void getAttribution(long l)
    {
        if (timer.getFireIn() > l)
        {
            return;
        }
        if (l != 0L)
        {
            logger.debug("Waiting to query attribution in %d milliseconds", new Object[] {
                Long.valueOf(l)
            });
        }
        timer.startIn(l);
    }

    private void getAttributionInternal()
    {
        if (!hasListener)
        {
            return;
        }
        if (paused)
        {
            logger.debug("Attribution handler is paused", new Object[0]);
            return;
        }
        logger.verbose("%s", new Object[] {
            attributionPackage.getExtendedString()
        });
        JSONObject jsonobject;
        try
        {
            jsonobject = Util.readHttpResponse(Util.createGETHttpsURLConnection(buildUri(attributionPackage.getPath(), attributionPackage.getParameters()).toString(), attributionPackage.getClientSdk()));
        }
        catch (Exception exception)
        {
            logger.error("Failed to get attribution (%s)", new Object[] {
                exception.getMessage()
            });
            return;
        }
        checkAttributionInternal(jsonobject);
    }

    public void checkAttribution(final JSONObject jsonResponse)
    {
        scheduler.submit(new _cls2());
    }

    public void getAttribution()
    {
        getAttribution(0L);
    }

    public void init(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
    {
        activityHandler = iactivityhandler;
        attributionPackage = activitypackage;
        paused = flag;
        hasListener = flag1;
    }

    public void pauseSending()
    {
        paused = true;
    }

    public void resumeSending()
    {
        paused = false;
    }



    private class _cls1
        implements Runnable
    {

        final AttributionHandler this$0;

        public void run()
        {
            getAttributionInternal();
        }

        _cls1()
        {
            this$0 = AttributionHandler.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final AttributionHandler this$0;
        final JSONObject val$jsonResponse;

        public void run()
        {
            checkAttributionInternal(jsonResponse);
        }

        _cls2()
        {
            this$0 = AttributionHandler.this;
            jsonResponse = jsonobject;
            super();
        }
    }

}
