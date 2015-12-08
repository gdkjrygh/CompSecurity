// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.chromium.base:
//            TraceEvent

public class PerfTraceEvent
{
    private static final class EventType extends Enum
    {

        private static final EventType $VALUES[];
        public static final EventType FINISH;
        public static final EventType INSTANT;
        public static final EventType START;
        private final String mTypeStr;

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(org/chromium/base/PerfTraceEvent$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])$VALUES.clone();
        }

        public String toString()
        {
            return mTypeStr;
        }

        static 
        {
            START = new EventType("START", 0, "S");
            FINISH = new EventType("FINISH", 1, "F");
            INSTANT = new EventType("INSTANT", 2, "I");
            $VALUES = (new EventType[] {
                START, FINISH, INSTANT
            });
        }

        private EventType(String s, int i, String s1)
        {
            super(s, i);
            mTypeStr = s1;
        }
    }


    private static final int MAX_NAME_LENGTH = 40;
    private static final String MEMORY_TRACE_NAME_SUFFIX = "_BZR_PSS";
    private static long sBeginNanoTime;
    private static boolean sEnabled = false;
    private static List sFilter;
    private static File sOutputFile = null;
    private static JSONArray sPerfTraceStrings;
    private static boolean sTrackMemory = false;
    private static boolean sTrackTiming = true;

    public PerfTraceEvent()
    {
    }

    public static void begin(String s)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        long l = s.hashCode();
        TraceEvent.startAsync(s, l);
        if (sEnabled && matchesFilter(s))
        {
            if (sTrackMemory)
            {
                savePerfString(makeMemoryTraceNameFromTimingName(s), l, EventType.START, true);
            }
            if (sTrackTiming)
            {
                savePerfString(s, l, EventType.START, false);
            }
        }
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void begin(String s, android.os.Debug.MemoryInfo memoryinfo)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        long l = s.hashCode();
        TraceEvent.startAsync(s, l);
        if (sEnabled && matchesFilter(s))
        {
            long l1 = (System.nanoTime() - sBeginNanoTime) / 1000L;
            savePerfString(makeMemoryTraceNameFromTimingName(s), l, EventType.START, l1, memoryinfo);
            if (sTrackTiming)
            {
                savePerfString(s, l, EventType.START, false);
            }
        }
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static void dumpPerf()
    {
        String s;
        s = sPerfTraceStrings.toString();
        if (sOutputFile == null)
        {
            System.out.println(s);
            return;
        }
        Object obj = new PrintStream(new FileOutputStream(sOutputFile, true));
        ((PrintStream) (obj)).print(s);
        ((PrintStream) (obj)).close();
        return;
        obj;
        try
        {
            Log.e("PerfTraceEvent", "Unable to close perf trace output file.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PerfTraceEvent", "Unable to dump perf trace data to output file.");
        }
        return;
        Exception exception1;
        exception1;
        ((PrintStream) (obj)).close();
_L1:
        throw exception1;
        Exception exception;
        exception;
        Log.e("PerfTraceEvent", "Unable to close perf trace output file.");
          goto _L1
    }

    public static boolean enabled()
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        boolean flag = sEnabled;
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void end(String s)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        long l = s.hashCode();
        TraceEvent.finishAsync(s, l);
        if (sEnabled && matchesFilter(s))
        {
            if (sTrackTiming)
            {
                savePerfString(s, l, EventType.FINISH, false);
            }
            if (sTrackMemory)
            {
                savePerfString(makeMemoryTraceNameFromTimingName(s), l, EventType.FINISH, true);
            }
        }
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void end(String s, android.os.Debug.MemoryInfo memoryinfo)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        long l = s.hashCode();
        TraceEvent.finishAsync(s, l);
        if (sEnabled && matchesFilter(s))
        {
            if (sTrackTiming)
            {
                savePerfString(s, l, EventType.FINISH, false);
            }
            long l1 = (System.nanoTime() - sBeginNanoTime) / 1000L;
            savePerfString(makeMemoryTraceNameFromTimingName(s), l, EventType.FINISH, l1, memoryinfo);
        }
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void instant(String s)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        long l = s.hashCode();
        TraceEvent.instant(s);
        if (sEnabled && matchesFilter(s))
        {
            savePerfString(s, l, EventType.INSTANT, false);
        }
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static String makeMemoryTraceNameFromTimingName(String s)
    {
        return makeSafeTraceName(s, "_BZR_PSS");
    }

    public static String makeSafeTraceName(String s, String s1)
    {
        int i = s1.length();
        String s2 = s;
        if (s.length() + i > 40)
        {
            s2 = s.substring(0, 40 - i);
        }
        return (new StringBuilder()).append(s2).append(s1).toString();
    }

    private static boolean matchesFilter(String s)
    {
        if (sFilter != null)
        {
            return sFilter.contains(s);
        } else
        {
            return false;
        }
    }

    private static void savePerfString(String s, long l, EventType eventtype, long l1, android.os.Debug.MemoryInfo memoryinfo)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("cat", "Java");
            jsonobject.put("ts", l1);
            jsonobject.put("ph", eventtype);
            jsonobject.put("name", s);
            jsonobject.put("id", l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        if (memoryinfo == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        jsonobject.put("mem", memoryinfo.nativePss + memoryinfo.dalvikPss + memoryinfo.otherPss);
        sPerfTraceStrings.put(jsonobject);
        return;
    }

    private static void savePerfString(String s, long l, EventType eventtype, boolean flag)
    {
        long l1 = (System.nanoTime() - sBeginNanoTime) / 1000L;
        android.os.Debug.MemoryInfo memoryinfo = null;
        if (flag)
        {
            memoryinfo = new android.os.Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryinfo);
        }
        savePerfString(s, l, eventtype, l1, memoryinfo);
    }

    public static void setEnabled(boolean flag)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        boolean flag1 = sEnabled;
        if (flag1 != flag) goto _L2; else goto _L1
_L1:
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        sBeginNanoTime = System.nanoTime();
        sPerfTraceStrings = new JSONArray();
_L4:
        sEnabled = flag;
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        dumpPerf();
        sPerfTraceStrings = null;
        sFilter = null;
          goto _L4
    }

    public static void setFilter(List list)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        sFilter = new LinkedList(list);
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public static void setMemoryTrackingEnabled(boolean flag)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        sTrackMemory = flag;
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setOutputFile(File file)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        sOutputFile = file;
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        file;
        throw file;
    }

    public static void setTimingTrackingEnabled(boolean flag)
    {
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorenter ;
        sTrackTiming = flag;
        org/chromium/base/PerfTraceEvent;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
