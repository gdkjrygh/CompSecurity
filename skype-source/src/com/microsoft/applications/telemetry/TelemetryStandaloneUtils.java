// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.applications.telemetry:
//            DataRVErrorCode

public class TelemetryStandaloneUtils
{
    class LogInfo
    {

        public long logInstance;
        public int logUp;
        final TelemetryStandaloneUtils this$0;

        LogInfo()
        {
            this$0 = TelemetryStandaloneUtils.this;
            super();
        }
    }


    private static TelemetryStandaloneUtils utilsInstance = null;
    private long httpstackInstance;
    private Map logInfos;
    private int roottoolsUp;
    private Map stackInfo;

    private TelemetryStandaloneUtils()
    {
        roottoolsUp = 0;
        stackInfo = new HashMap();
        logInfos = new HashMap();
        httpstackInstance = 0L;
    }

    public static TelemetryStandaloneUtils getTelemetryClientUtils()
    {
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (utilsInstance == null)
        {
            utilsInstance = new TelemetryStandaloneUtils();
        }
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return utilsInstance;
        Exception exception;
        exception;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native void initRoottoolsNative();

    private DataRVErrorCode removeStackInfo(String s)
    {
        s = Thread.currentThread().getStackTrace()[3].getClassName();
        stackInfo.remove(s);
        return DataRVErrorCode.DATARV_ERROR_OK;
    }

    private void setStackInfo(String s)
    {
        String s1 = Thread.currentThread().getStackTrace()[4].getMethodName();
        String s2 = Thread.currentThread().getStackTrace()[3].getClassName();
        String s3 = Thread.currentThread().getStackTrace()[3].getFileName();
        int i = Thread.currentThread().getStackTrace()[4].getLineNumber();
        HashMap hashmap = new HashMap();
        hashmap.put((new StringBuilder()).append(s).append("-lineNum").toString(), Integer.toString(i));
        hashmap.put((new StringBuilder()).append(s).append("-methodName").toString(), s1);
        hashmap.put((new StringBuilder()).append(s).append("-fileName").toString(), s3);
        hashmap.put((new StringBuilder()).append(s).append("-className").toString(), s2);
        stackInfo.put((new StringBuilder()).append(s2).append("-httpstack").toString(), hashmap);
    }

    private native long setupLogNative(String s);

    private native void shutdownLogNative(long l);

    private native void stopRoottoolsNative();

    public void initRoottools()
    {
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        int i;
        setStackInfo("roottools");
        i = roottoolsUp + 1;
        roottoolsUp = i;
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        initRoottoolsNative();
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void printStackInfo()
    {
        for (Iterator iterator = stackInfo.entrySet().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)((java.util.Map.Entry)iterator.next()).getValue()).entrySet().iterator();
            while (iterator1.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                System.out.println((new StringBuilder()).append((String)entry.getKey()).append(" : ").append((String)entry.getValue()).toString());
            }
        }

    }

    public int setupLog(boolean flag, String s)
    {
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (s.isEmpty()) goto _L2; else goto _L3
_L3:
        if (!logInfos.containsKey(s)) goto _L5; else goto _L4
_L4:
        LogInfo loginfo;
        loginfo = (LogInfo)logInfos.get(s);
        loginfo.logUp = loginfo.logUp + 1;
_L6:
        logInfos.put(s, loginfo);
_L2:
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return 0;
_L5:
        long l;
        loginfo = new LogInfo();
        l = setupLogNative(s);
        loginfo.logInstance = l;
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return -1;
        s;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw s;
        loginfo.logUp = 1;
          goto _L6
    }

    public void shutdownLog(String s)
    {
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        LogInfo loginfo;
        if (logInfos.containsKey(s))
        {
            loginfo = (LogInfo)logInfos.get(s);
            if (loginfo.logUp != 1)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            shutdownLogNative(loginfo.logInstance);
            logInfos.remove(s);
        }
_L2:
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        loginfo.logUp = loginfo.logUp - 1;
        logInfos.put(s, loginfo);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void uninitRoottools()
    {
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorenter ;
        if (roottoolsUp != 0)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        removeStackInfo("roottools");
        if (roottoolsUp == 1)
        {
            stopRoottoolsNative();
        }
        roottoolsUp = roottoolsUp - 1;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/microsoft/applications/telemetry/TelemetryStandaloneUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
