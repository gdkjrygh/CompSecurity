// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.os.SystemClock;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.utils.NetworkUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.base:
//            StopWatch

public class StopWatchV4 extends StopWatch
{

    private static final String EMPTY_STR = "";
    private static final int EVENTS_CHUNK_SIZE = 5;
    private static final String EVENT_CACHED = "cached";
    private static final String EVENT_CARRIER = "carrier";
    private static final String EVENT_NAME = "metric_name";
    private static final String EVENT_TIMING = "timing";
    private static final String KEY_BREAKDOWN = "breakdown";
    private static final String KEY_BREAKDOWN_ENDPOINT = "endpoint";
    private static final String KEY_BREAKDOWN_ID = "identifier";
    private static final String KEY_BREAKDOWN_NAME = "name";
    private static final String KEY_BREAKDOWN_STARTED = "started";
    private static final String KEY_BREAKDOWN_TIMING = "timing";
    private List _eventList;
    private StopWatch _stopWatchOld;
    private final HashMap _subStopWatches = new HashMap();

    public StopWatchV4()
    {
        _eventList = new LinkedList();
        _stopWatchOld = new StopWatch();
    }

    public volatile StopWatch complete(String s)
    {
        return complete(s);
    }

    public volatile StopWatch complete(String s, boolean flag, String s1)
    {
        return complete(s, flag, s1);
    }

    public StopWatchV4 complete(String s)
    {
        _stopWatchOld.complete(s, false, null);
        return complete(s, false, null);
    }

    public StopWatchV4 complete(String s, boolean flag, String s1)
    {
        _stopWatchOld.complete(s, flag, s1);
        Object obj = (JsonElement)_auxDatas.get(s);
        long l = stop(s);
        if (l != -1L)
        {
            if (s1 != null)
            {
                obj = (new Gson()).toJsonTree(s1);
            }
            if (obj != null)
            {
                s1 = ((JsonElement) (obj)).toString();
            } else
            {
                s1 = "";
            }
            log("StopWatchV4 %s - cached %s - auxData %s", new Object[] {
                s, String.valueOf(flag), s1
            });
            s1 = new JsonObject();
            s1.add("metric_name", new JsonPrimitive(s));
            s1.add("timing", new JsonPrimitive(new Long(l)));
            s1.add("cached", new JsonPrimitive(String.valueOf(flag)));
            s1.add("carrier", new JsonPrimitive(NetworkUtils.getInstance().getCarrierName()));
            obj = new JsonArray();
            if (_subStopWatches.containsKey(s))
            {
                for (s = ((Map)_subStopWatches.get(s)).values().iterator(); s.hasNext(); ((JsonArray) (obj)).add((JsonObject)s.next())) { }
            }
            s1.add("breakdown", ((JsonElement) (obj)));
            _eventList.add(s1);
            log((new StringBuilder("StopWatchV4: event in the list: ")).append(s1.toString()).toString(), new Object[0]);
            if (_eventList.size() == 5)
            {
                s = new JsonArray();
                for (s1 = _eventList.iterator(); s1.hasNext(); s.add((JsonObject)s1.next())) { }
                AnalyticsApi.a(s);
                _eventList.clear();
            }
        }
        return this;
    }

    public volatile StopWatch invalidate(String s)
    {
        return invalidate(s);
    }

    public StopWatchV4 invalidate(String s)
    {
        _stopWatchOld.invalidate(s);
        super.invalidate(s);
        return this;
    }

    public volatile StopWatch invalidateAll()
    {
        return invalidateAll();
    }

    public StopWatchV4 invalidateAll()
    {
        _stopWatchOld.invalidateAll();
        super.invalidateAll();
        return this;
    }

    public volatile StopWatch logTimeStamp(String s, String s1)
    {
        return logTimeStamp(s, s1);
    }

    public volatile StopWatch logTimeStamp(String s, String s1, boolean flag)
    {
        return logTimeStamp(s, s1, flag);
    }

    public StopWatchV4 logTimeStamp(String s, String s1)
    {
        _stopWatchOld.logTimeStamp(s, s1);
        super.logTimeStamp(s, s1);
        return this;
    }

    public StopWatchV4 logTimeStamp(String s, String s1, boolean flag)
    {
        _stopWatchOld.logTimeStamp(s, s1, flag);
        super.logTimeStamp(s, s1, flag);
        return this;
    }

    public volatile StopWatch pause(String s)
    {
        return pause(s);
    }

    public StopWatchV4 pause(String s)
    {
        _stopWatchOld.pause(s);
        super.pause(s);
        return this;
    }

    public volatile StopWatch putAuxData(String s, String s1, JsonElement jsonelement)
    {
        return putAuxData(s, s1, jsonelement);
    }

    public volatile StopWatch putAuxData(String s, String s1, JsonElement jsonelement, boolean flag)
    {
        return putAuxData(s, s1, jsonelement, flag);
    }

    public StopWatchV4 putAuxData(String s, String s1, JsonElement jsonelement)
    {
        _stopWatchOld.putAuxData(s, s1, jsonelement);
        super.putAuxData(s, s1, jsonelement);
        return this;
    }

    public StopWatchV4 putAuxData(String s, String s1, JsonElement jsonelement, boolean flag)
    {
        _stopWatchOld.putAuxData(s, s1, jsonelement, flag);
        super.putAuxData(s, s1, jsonelement, flag);
        return this;
    }

    public volatile StopWatch resume(String s)
    {
        return resume(s);
    }

    public StopWatchV4 resume(String s)
    {
        _stopWatchOld.resume(s);
        super.resume(s);
        return this;
    }

    public volatile StopWatch start(String s)
    {
        return start(s);
    }

    public StopWatchV4 start(String s)
    {
        _stopWatchOld.start(s);
        super.start(s);
        return this;
    }

    public volatile StopWatch startSubWatch(String s, String s1)
    {
        return startSubWatch(s, s1);
    }

    public StopWatchV4 startSubWatch(String s, String s1)
    {
        _stopWatchOld.startSubWatch(s, s1);
        return startSubWatch(s, s1, null, null);
    }

    public StopWatchV4 startSubWatch(String s, String s1, String s2, String s3)
    {
        if (isActive(s))
        {
            Object obj;
            if (_subStopWatches.containsKey(s))
            {
                obj = (Map)_subStopWatches.get(s);
            } else
            {
                obj = new HashMap();
                _subStopWatches.put(s, obj);
            }
            if (!((Map) (obj)).containsKey(s1))
            {
                long l = SystemClock.elapsedRealtime();
                long l1 = getStartTime(s);
                s = s2;
                if (s2 == null)
                {
                    s = "";
                }
                s2 = s3;
                if (s3 == null)
                {
                    s2 = "";
                }
                s3 = new JsonObject();
                s3.add("name", new JsonPrimitive(s1));
                s3.add("identifier", new JsonPrimitive(s));
                s3.add("endpoint", new JsonPrimitive(s2));
                s3.add("started", new JsonPrimitive(Long.valueOf(l - l1)));
                ((Map) (obj)).put(s1, s3);
            }
        }
        return this;
    }

    public long stop(String s)
    {
        _stopWatchOld.stop(s);
        return super.stop(s);
    }

    public volatile StopWatch stopSubWatch(String s, String s1)
    {
        return stopSubWatch(s, s1);
    }

    public StopWatchV4 stopSubWatch(String s, String s1)
    {
        _stopWatchOld.stopSubWatch(s, s1);
        if (isActive(s) && _subStopWatches.containsKey(s))
        {
            Map map = (Map)_subStopWatches.get(s);
            if (map.containsKey(s1))
            {
                s1 = (JsonObject)map.get(s1);
                if (s1.has("started"))
                {
                    long l = s1.get("started").getAsLong();
                    s1.add("timing", new JsonPrimitive(Long.valueOf(SystemClock.elapsedRealtime() - getStartTime(s) - l)));
                }
            }
        }
        return this;
    }
}
