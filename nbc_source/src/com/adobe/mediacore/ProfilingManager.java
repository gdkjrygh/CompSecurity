// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.adobe.mediacore:
//            Profiler

final class ProfilingManager
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[PROFILING]::").append(com/adobe/mediacore/ProfilingManager.getSimpleName()).toString();
    public static final boolean PROFILING_ENABLED = false;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private static Map _registeredProfilers = new ConcurrentHashMap();

    ProfilingManager()
    {
    }

    static long getElapsedTime(String s)
    {
        if (_registeredProfilers.containsKey(s))
        {
            return ((Profiler)_registeredProfilers.get(s)).getElapsedTime();
        } else
        {
            return 0L;
        }
    }

    static long getTotalElapsedTime(String s)
    {
        if (_registeredProfilers.containsKey(s))
        {
            return ((Profiler)_registeredProfilers.get(s)).getTotalElapsedTime();
        } else
        {
            return 0L;
        }
    }

    static void log(String s, String s1)
    {
        _logger.i(LOG_TAG, (new StringBuilder()).append("Elapsed/Total time for ").append(s1).append(" is ").append(getElapsedTime(s)).append(" ms ").append(getTotalElapsedTime(s)).toString());
    }

    static void recordElapsedTime(String s)
    {
        if (_registeredProfilers.containsKey(s))
        {
            ((Profiler)_registeredProfilers.get(s)).registerElapsedTime();
        }
    }

    static void recordStartElapsedTime(String s)
    {
        if (_registeredProfilers.containsKey(s))
        {
            ((Profiler)_registeredProfilers.get(s)).registerStartElapsedTime();
        }
    }

    static void registerProfiler(String s)
    {
        if (!_registeredProfilers.containsKey(s))
        {
            _registeredProfilers.put(s, new Profiler());
        }
    }

    static void unregisterProfiler(String s)
    {
        if (_registeredProfilers.containsKey(s))
        {
            _registeredProfilers.remove(s);
        }
    }

}
