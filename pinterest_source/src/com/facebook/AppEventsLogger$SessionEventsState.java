// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.facebook:
//            AppEventsLogger, Request

class hashedDeviceAndAppId
{

    public static final String ENCODED_EVENTS_KEY = "encoded_events";
    public static final String EVENT_COUNT_KEY = "event_count";
    public static final String NUM_SKIPPED_KEY = "num_skipped";
    private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
    private List accumulatedEvents;
    private AttributionIdentifiers attributionIdentifiers;
    private String hashedDeviceAndAppId;
    private List inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;
    private String packageName;

    private byte[] getStringAsByteArray(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Utility.logd("Encoding exception: ", s);
            return null;
        }
        return s;
    }

    private void populateRequest(Request request, int i, JSONArray jsonarray, boolean flag, boolean flag1)
    {
        Object obj = com.facebook.model.DeviceAndAppId();
        ((GraphObject) (obj)).setProperty("event", "CUSTOM_APP_EVENTS");
        if (numSkippedEventsDueToFullBuffer > 0)
        {
            ((GraphObject) (obj)).setProperty("num_skipped_events", Integer.valueOf(i));
        }
        if (flag)
        {
            Utility.setAppEventAttributionParameters(((GraphObject) (obj)), attributionIdentifiers, hashedDeviceAndAppId, flag1);
        }
        Bundle bundle;
        try
        {
            Utility.setAppEventExtendedDeviceInfoParameters(((GraphObject) (obj)), AppEventsLogger.access$1000());
        }
        catch (Exception exception) { }
        ((GraphObject) (obj)).setProperty("application_package_name", packageName);
        request.setGraphObject(((GraphObject) (obj)));
        bundle = request.getParameters();
        obj = bundle;
        if (bundle == null)
        {
            obj = new Bundle();
        }
        jsonarray = jsonarray.toString();
        if (jsonarray != null)
        {
            ((Bundle) (obj)).putByteArray("custom_events_file", getStringAsByteArray(jsonarray));
            request.setTag(jsonarray);
        }
        request.setParameters(((Bundle) (obj)));
    }

    public void accumulatePersistedEvents(List list)
    {
        this;
        JVM INSTR monitorenter ;
        accumulatedEvents.addAll(list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void addEvent(accumulatedEvents accumulatedevents)
    {
        this;
        JVM INSTR monitorenter ;
        if (accumulatedEvents.size() + inFlightEvents.size() < 1000) goto _L2; else goto _L1
_L1:
        numSkippedEventsDueToFullBuffer = numSkippedEventsDueToFullBuffer + 1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        accumulatedEvents.add(accumulatedevents);
        if (true) goto _L4; else goto _L3
_L3:
        accumulatedevents;
        throw accumulatedevents;
    }

    public void clearInFlightAndStats(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        accumulatedEvents.addAll(inFlightEvents);
        inFlightEvents.clear();
        numSkippedEventsDueToFullBuffer = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getAccumulatedEventCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = accumulatedEvents.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public List getEventsToPersist()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        list = accumulatedEvents;
        accumulatedEvents = new ArrayList();
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public int populateRequest(Request request, boolean flag, boolean flag1, boolean flag2)
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray;
        Iterator iterator;
        int i;
        i = numSkippedEventsDueToFullBuffer;
        inFlightEvents.addAll(accumulatedEvents);
        accumulatedEvents.clear();
        jsonarray = new JSONArray();
        iterator = inFlightEvents.iterator();
_L3:
        accumulatedEvents accumulatedevents;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        accumulatedevents = (inFlightEvents)iterator.next();
        if (flag) goto _L2; else goto _L1
_L1:
        if (accumulatedevents.cit()) goto _L3; else goto _L2
_L2:
        jsonarray.put(accumulatedevents.ect());
          goto _L3
        request;
        this;
        JVM INSTR monitorexit ;
        throw request;
        if (jsonarray.length() != 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        this;
        JVM INSTR monitorexit ;
        return 0;
        this;
        JVM INSTR monitorexit ;
        populateRequest(request, i, jsonarray, flag1, flag2);
        return jsonarray.length();
    }

    public (AttributionIdentifiers attributionidentifiers, String s, String s1)
    {
        accumulatedEvents = new ArrayList();
        inFlightEvents = new ArrayList();
        attributionIdentifiers = attributionidentifiers;
        packageName = s;
        hashedDeviceAndAppId = s1;
    }
}
