// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.service.Callback;
import com.fsr.tracker.service.ITrackerServiceClient;
import com.fsr.tracker.tasks.BatchHttpGetAsyncTask;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TrackerServiceClient
    implements ITrackerServiceClient
{

    private String apiKey;
    private String baseUrl;
    private ConnectivityManager connectivityManager;
    private Logger logger;

    public TrackerServiceClient(String s, String s1, ConnectivityManager connectivitymanager)
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        connectivityManager = connectivitymanager;
        apiKey = s;
        baseUrl = s1;
    }

    public Void checkShouldInvite(final Callback callback, final List result)
    {
        String s = (new StringBuilder()).append(baseUrl).append("invite?cid=%s&sid=%s").toString();
        final HashMap urlMap = new HashMap();
        MeasureConfiguration measureconfiguration;
        for (result = result.iterator(); result.hasNext(); urlMap.put(String.format(s, new Object[] {
    apiKey, measureconfiguration.getSurveyId()
}), measureconfiguration))
        {
            measureconfiguration = (MeasureConfiguration)result.next();
        }

        result = new TreeMap();
        if (connectionAvailable())
        {
            BatchHttpGetAsyncTask batchhttpgetasynctask = new BatchHttpGetAsyncTask();
            batchhttpgetasynctask.setCallback(new com.fsr.tracker.tasks.BatchHttpGetAsyncTask.AsyncCallback() {

                final TrackerServiceClient this$0;
                final Callback val$callback;
                final SortedMap val$result;
                final Map val$urlMap;

                public volatile void onComplete(Object obj)
                {
                    onComplete((Map)obj);
                }

                public void onComplete(Map map)
                {
                    Iterator iterator = map.keySet().iterator();
_L2:
                    if (!iterator.hasNext())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    Object obj = (String)iterator.next();
                    boolean flag = false;
                    Object obj1 = (String)map.get(obj);
                    obj = (MeasureConfiguration)urlMap.get(obj);
                    if (obj1 == null)
                    {
                        break MISSING_BLOCK_LABEL_119;
                    }
                    String s1;
                    int i;
                    try
                    {
                        i = Integer.parseInt(((String) (obj1)));
                        obj1 = logger;
                        s1 = ((MeasureConfiguration) (obj)).getSurveyId();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        logger.error("ForeSee Trigger Code", "Sampling check failed: response is invalid.");
                        callback.onFailure(map);
                        return;
                    }
                    if (i != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((Logger) (obj1)).debug("Sampling check for {} returned. In pool? {}", s1, Boolean.valueOf(flag));
                    if (i != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    result.put(obj, Boolean.valueOf(flag));
                    if (true) goto _L2; else goto _L1
_L1:
                    callback.onComplete(result);
                    return;
                }

            
            {
                this$0 = TrackerServiceClient.this;
                urlMap = map;
                callback = callback1;
                result = sortedmap;
                super();
            }
            });
            batchhttpgetasynctask.execute(urlMap.keySet().toArray(new String[urlMap.size()]));
        } else
        {
            logger.debug("Network connection not available");
        }
        return null;
    }

    public boolean connectionAvailable()
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

}
