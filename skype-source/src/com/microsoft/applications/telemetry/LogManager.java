// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.microsoft.applications.telemetry.hardware.DeviceInformation;
import com.microsoft.applications.telemetry.hardware.HardwareInformationReceiver;
import com.microsoft.applications.telemetry.hardware.NetworkInformation;
import com.microsoft.applications.telemetry.hardware.SystemInformation;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.microsoft.applications.telemetry:
//            AppLifecycleState, ILogger, SemanticContext, Logger, 
//            LogConfiguration, TransmitProfile, ISemanticContext

public final class LogManager extends Enum
{

    private static final LogManager $VALUES[];
    public static final LogManager INSTANCE;
    private static final String LOG_TAG = com/microsoft/applications/telemetry/LogManager.getSimpleName();
    private Context appContext;
    private HardwareInformationReceiver hardwareReceiver;
    private AtomicBoolean isInitialized;
    private LogConfiguration logConfig;
    private Map loggerCache;
    private ILogger primaryLogger;
    private String primaryTenantToken;

    private LogManager(String s, int i)
    {
        super(s, i);
        loggerCache = new HashMap();
        isInitialized = new AtomicBoolean(false);
        hardwareReceiver = null;
    }

    public static void appStart(Context context, String s, LogConfiguration logconfiguration)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("onAppStart|context: %s|tenantToken: %s|logConfig: %s", new Object[] {
            context, s, logconfiguration
        });
        if (INSTANCE.isInitialized.get()) goto _L2; else goto _L1
_L1:
        initialize(context, s, logconfiguration);
        getLogger().logAppLifecycle(AppLifecycleState.LAUNCH, null);
_L4:
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(LOG_TAG, "OnAppStart already called. Ignoring.");
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void appStop()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("onAppStop", new Object[0]);
        if (!INSTANCE.isInitialized.get()) goto _L2; else goto _L1
_L1:
        getLogger().logAppLifecycle(AppLifecycleState.EXIT, null);
        flushAndTeardown();
_L4:
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(LOG_TAG, "onAppStop called before initialization. Ignoring.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void autoPopulateCommonFields()
    {
        SemanticContext semanticcontext = (SemanticContext)getSemanticContext();
        semanticcontext.setOsBuild(android.os.Build.VERSION.INCREMENTAL);
        semanticcontext.setUserTimeZone(getCurrentTimezoneOffset());
    }

    private void cacheLogger(String s, String s1, ILogger ilogger)
    {
        if (s == null || s1 == null)
        {
            Log.e(LOG_TAG, String.format("Error caching logger. Invalid arguments|app: %s| source: %s", new Object[] {
                s, s1
            }));
        }
        if (INSTANCE.loggerCache.containsKey(s))
        {
            ((Map)INSTANCE.loggerCache.get(s)).put(s1, ilogger);
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put(s1, ilogger);
            INSTANCE.loggerCache.put(s, hashmap);
            return;
        }
    }

    private ILogger createLogger(long l)
    {
        if (l == 0L)
        {
            Log.wtf(LOG_TAG, "Error initializing logger. Null logger returned from native code.");
            return null;
        } else
        {
            return new Logger(l);
        }
    }

    public static void flush()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        INSTANCE.flushNative();
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void flushAndTeardown()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        if (!INSTANCE.isInitialized.get()) goto _L2; else goto _L1
_L1:
        INSTANCE.teardownReceiver();
        INSTANCE.flushAndTeardownNative();
        INSTANCE.isInitialized.set(false);
_L4:
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(LOG_TAG, "flushAndTeardown called before initialization. Ignoring.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private native void flushAndTeardownNative();

    private native void flushNative();

    private static String getCurrentTimezoneOffset()
    {
        Object obj = TimeZone.getDefault();
        int i = ((TimeZone) (obj)).getOffset(GregorianCalendar.getInstance(((TimeZone) (obj))).getTimeInMillis());
        String s = String.format("%02d:%02d", new Object[] {
            Integer.valueOf(Math.abs(i / 0x36ee80)), Integer.valueOf(Math.abs((i / 60000) % 60))
        });
        StringBuilder stringbuilder = new StringBuilder();
        if (i >= 0)
        {
            obj = "+";
        } else
        {
            obj = "-";
        }
        return stringbuilder.append(((String) (obj))).append(s).toString();
    }

    public static ILogger getLogger()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        ILogger ilogger;
        String.format("getLogger", new Object[0]);
        INSTANCE.verifyInitialized();
        ilogger = INSTANCE.primaryLogger;
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return ilogger;
        Exception exception;
        exception;
        throw exception;
    }

    public static ILogger getLogger(String s)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("getLogger|source: %s", new Object[] {
            s
        });
        INSTANCE.verifyInitialized();
        s = INSTANCE.getLoggerWithCache(INSTANCE.primaryTenantToken, s);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static ILogger getLogger(String s, String s1)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("getLogger|tenantToken: %s|source: %s", new Object[] {
            s, s1
        });
        INSTANCE.verifyInitialized();
        s = INSTANCE.getLoggerWithCache(s, s1);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private native long getLoggerForSourceAndAppNative(String s, String s1);

    private native long getLoggerForSourceNative(String s);

    private native long getLoggerNative();

    private ILogger getLoggerWithCache(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException(String.format("Invalid inputs for getLogger app:%s", new Object[] {
                s
            }));
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        if (loggerCache.containsKey(s))
        {
            s1 = (Map)loggerCache.get(s);
            if (s1.containsKey(s2))
            {
                return (ILogger)s1.get(s2);
            }
            if (s.equals(INSTANCE.primaryTenantToken))
            {
                s1 = createLogger(getLoggerForSourceNative(s2));
            } else
            {
                s1 = createLogger(getLoggerForSourceAndAppNative(s, s2));
            }
        } else
        {
            s1 = createLogger(getLoggerForSourceAndAppNative(s, s2));
        }
        INSTANCE.cacheLogger(s, s2, s1);
        return s1;
    }

    public static ISemanticContext getSemanticContext()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        SemanticContext semanticcontext;
        INSTANCE.verifyInitialized();
        semanticcontext = new SemanticContext(INSTANCE.getSemanticContextNative());
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return semanticcontext;
        Exception exception;
        exception;
        throw exception;
    }

    private native long getSemanticContextNative();

    private native long getTelemetryManagerNative();

    public static ILogger initialize(Context context, String s)
        throws IllegalStateException
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("initializeLogger|context:%s|tenantToken:%s", new Object[] {
            context, s
        });
        context = initialize(context, s, null);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static ILogger initialize(Context context, String s, LogConfiguration logconfiguration)
        throws IllegalStateException
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("initializeLogger|context:%s|tenantToken:%s|configuration:%s", new Object[] {
            context, s, logconfiguration
        });
        if (context == null || s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (!s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new IllegalArgumentException(String.format("Invalid inputs in initializeLogger|context:%s|tenantToken:%s", new Object[] {
            context, s
        }));
        context;
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        throw context;
        LogManager logmanager;
        if (INSTANCE.isInitialized.get())
        {
            throw new IllegalStateException("Telemetry system has already been initialized!");
        }
        DeviceInformation.update(context);
        NetworkInformation.update(context);
        SystemInformation.initializeAppInfo(context);
        logmanager = INSTANCE;
        LogConfiguration logconfiguration1;
        logconfiguration1 = logconfiguration;
        if (logconfiguration != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        logconfiguration1 = LogConfiguration.getDefaultConfiguration(context);
        logmanager.logConfig = logconfiguration1;
        INSTANCE.appContext = context;
        INSTANCE.setupReceiver();
        long l = INSTANCE.initializeWithConfigNative(s, INSTANCE.logConfig.eventCollectorUri, INSTANCE.logConfig.blobCollectorUri, INSTANCE.logConfig.cacheFilePath, INSTANCE.logConfig.cacheFileSizeLimitInBytes, INSTANCE.logConfig.cacheMemorySizeLimitInBytes, INSTANCE.logConfig.httpStackInstance, INSTANCE.logConfig.palFactoryInstance, INSTANCE.logConfig.configurationProviderInstance);
        context = INSTANCE.initializeLogger(s, l);
        INSTANCE.autoPopulateCommonFields();
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return context;
    }

    private ILogger initializeLogger(String s, long l)
    {
        if (l == 0L)
        {
            Log.wtf(LOG_TAG, (new StringBuilder("Error initializing logger with token. Null logger returned from native code.")).append(s).toString());
            return null;
        } else
        {
            INSTANCE.primaryTenantToken = s;
            INSTANCE.primaryLogger = new Logger(l);
            INSTANCE.isInitialized.set(true);
            INSTANCE.cacheLogger(s, "", INSTANCE.primaryLogger);
            return primaryLogger;
        }
    }

    private native long initializeNative(String s);

    private native long initializeWithConfigNative(String s, String s1, String s2, String s3, int i, int j, long l, long l1, long l2);

    public static void pauseTransmission()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("pauseTransmission", new Object[0]);
        INSTANCE.verifyInitialized();
        INSTANCE.pauseTransmissionNative();
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private native void pauseTransmissionNative();

    public static void resumeTransmission()
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("resumeTransmission", new Object[0]);
        INSTANCE.verifyInitialized();
        INSTANCE.resumeTransmissionNative();
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private native void resumeTransmissionNative();

    public static void setContext(String s, double d)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("setContext|name: %s|value: %s", new Object[] {
            s, Double.valueOf(d)
        });
        INSTANCE.setContextDoubleNative(s, d);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void setContext(String s, long l)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("setContext|name: %s|value: %d", new Object[] {
            s, Long.valueOf(l)
        });
        INSTANCE.setContextLongNative(s, l);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void setContext(String s, String s1)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("setContext|name: %s|value: %s", new Object[] {
            s, s1
        });
        INSTANCE.setContextStringNative(s, s1);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void setContext(String s, Date date)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("setContext|name: %s|value: %s", new Object[] {
            s, date
        });
        long l = date.getTime();
        INSTANCE.setContextLongNative(s, l);
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private native void setContextDoubleNative(String s, double d);

    private native void setContextLongNative(String s, long l);

    private native void setContextStringNative(String s, String s1);

    public static void setTransmitProfile(TransmitProfile transmitprofile)
    {
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorenter ;
        String.format("setTransmitProfile|profile: %d", new Object[] {
            Integer.valueOf(transmitprofile.getValue())
        });
        INSTANCE.verifyInitialized();
        INSTANCE.setTransmitProfileNative(transmitprofile.getValue());
        com/microsoft/applications/telemetry/LogManager;
        JVM INSTR monitorexit ;
        return;
        transmitprofile;
        throw transmitprofile;
    }

    private native void setTransmitProfileNative(int i);

    private void setupReceiver()
    {
        INSTANCE.hardwareReceiver = new HardwareInformationReceiver();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentfilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentfilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        INSTANCE.appContext.registerReceiver(hardwareReceiver, intentfilter);
    }

    private void teardownReceiver()
    {
        if (appContext == null || hardwareReceiver == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        INSTANCE.appContext.unregisterReceiver(hardwareReceiver);
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        Log.w(LOG_TAG, "Unable to unregister hardware receiver");
        return;
    }

    public static LogManager valueOf(String s)
    {
        return (LogManager)Enum.valueOf(com/microsoft/applications/telemetry/LogManager, s);
    }

    public static LogManager[] values()
    {
        return (LogManager[])$VALUES.clone();
    }

    private void verifyInitialized()
    {
        if (!isInitialized.get())
        {
            Log.w(LOG_TAG, "The telemetry system has not yet been initialized!");
        }
    }

    static 
    {
        INSTANCE = new LogManager("INSTANCE", 0);
        $VALUES = (new LogManager[] {
            INSTANCE
        });
    }
}
