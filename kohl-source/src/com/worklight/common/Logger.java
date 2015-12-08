// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.worklight.common.internal.JULHandler;
import com.worklight.common.internal.LoggerServerConfigProcessor;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import javax.security.auth.x500.X500Principal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            WLAnalytics, WLConfig

public final class Logger
{
    private static class DoLogRunnable
        implements Runnable
    {

        private JSONObject additionalMetadata;
        private LEVEL calledLevel;
        private Logger logger;
        private String message;
        private Throwable t;
        private long timestamp;

        public void run()
        {
            HashMap hashmap = Logger.getFiltersSync();
            static class _cls13
            {

                static final int $SwitchMap$com$worklight$common$Logger$LEVEL[];

                static 
                {
                    $SwitchMap$com$worklight$common$Logger$LEVEL = new int[LEVEL.values().length];
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.FATAL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.ERROR.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.WARN.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.INFO.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.LOG.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.DEBUG.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$worklight$common$Logger$LEVEL[LEVEL.TRACE.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            boolean flag;
            if (hashmap != null && hashmap.size() > 0)
            {
                if (hashmap.containsKey(logger.tag))
                {
                    if (calledLevel.getLevelValue() <= ((LEVEL)hashmap.get(logger.tag)).getLevelValue())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = false;
                }
            } else
            if (calledLevel != null && calledLevel.isLoggable())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && calledLevel != LEVEL.ANALYTICS) goto _L2; else goto _L1
_L1:
            Logger.captureToFile(Logger.createJSONObject(calledLevel, logger.tag, message, timestamp, additionalMetadata, t), calledLevel);
            if (message == null)
            {
                obj = "(null)";
            } else
            {
                obj = message;
            }
            message = ((String) (obj));
            message = Logger.prependMetadata(message, additionalMetadata);
            _cls13..SwitchMap.com.worklight.common.Logger.LEVEL[calledLevel.ordinal()];
            JVM INSTR tableswitch 1 7: default 192
        //                       1 254
        //                       2 254
        //                       3 301
        //                       4 348
        //                       5 395
        //                       6 442
        //                       7 442;
               goto _L2 _L3 _L3 _L4 _L5 _L6 _L7 _L7
_L2:
            synchronized (logger)
            {
                logger.notifyAll();
            }
            return;
_L3:
            if (t == null)
            {
                Log.e(logger.tag, message);
            } else
            {
                Log.e(logger.tag, message, t);
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (t == null)
            {
                Log.w(logger.tag, message);
            } else
            {
                Log.w(logger.tag, message, t);
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (t == null)
            {
                Log.i(logger.tag, message);
            } else
            {
                Log.i(logger.tag, message, t);
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (t == null)
            {
                Log.v(logger.tag, message);
            } else
            {
                Log.v(logger.tag, message, t);
            }
            continue; /* Loop/switch isn't completed */
_L7:
            if (t == null)
            {
                Log.d(logger.tag, message);
            } else
            {
                Log.d(logger.tag, message, t);
            }
            if (true) goto _L2; else goto _L8
_L8:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public DoLogRunnable(LEVEL level1, String s, long l, JSONObject jsonobject, Throwable throwable, Logger logger1)
        {
            calledLevel = level1;
            message = s;
            timestamp = l;
            additionalMetadata = jsonobject;
            t = throwable;
            logger = logger1;
        }
    }

    private static class FileLogger extends FileLoggerInterface
    {

        private static String filePath;
        private static ClientLogFormatter formatter;
        private static FileLogger noopSingleton = new FileLogger(null, null);
        private static FileLogger singleton;

        private static void copyStream(InputStream inputstream, OutputStream outputstream)
            throws IOException
        {
            byte abyte0[] = new byte[1024];
            do
            {
                int i = inputstream.read(abyte0, 0, 1024);
                if (i == -1)
                {
                    inputstream.close();
                    return;
                }
                outputstream.write(abyte0, 0, i);
            } while (true);
        }

        private byte[] getByteArrayFromFile(String s)
            throws UnsupportedEncodingException
        {
            s = new File(Logger.context.getFilesDir(), s);
            if (!s.exists())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            byte abyte0[];
            FileInputStream fileinputstream = new FileInputStream(s);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((int)s.length());
            copyStream(fileinputstream, bytearrayoutputstream);
            abyte0 = bytearrayoutputstream.toByteArray();
            return abyte0;
            IOException ioexception;
            ioexception;
            Log.e(Logger.LOG_TAG, (new StringBuilder()).append("problem reading file ").append(s.toString()).toString(), ioexception);
            return "".getBytes("UTF-8");
        }

        public static FileLogger getInstance()
        {
            if (singleton == null && Logger.context != null)
            {
                singleton = new FileLogger(null, null);
                filePath = (new StringBuilder()).append(Logger.context.getFilesDir()).append(System.getProperty("file.separator")).append("wl.log").toString();
                formatter = new ClientLogFormatter();
                singleton.setLevel(Level.ALL);
                return singleton;
            } else
            {
                return noopSingleton;
            }
        }

        public byte[] getFileContentsAsByteArray(File file)
            throws UnsupportedEncodingException
        {
            return getByteArrayFromFile(file.getName());
        }

        public void log(JSONObject jsonobject, String s)
            throws SecurityException, IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (singleton != null)
            {
                filePath = (new StringBuilder()).append(Logger.context.getFilesDir()).append(System.getProperty("file.separator")).append(s).toString();
                s = new FileHandler(filePath, Logger.getMaxFileSize(), 2, true);
                s.setFormatter(formatter);
                singleton.addHandler(s);
                singleton.log(Level.FINEST, (new StringBuilder()).append(jsonobject.toString()).append(",").toString());
                singleton.getHandlers()[0].close();
                singleton.removeHandler(s);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            jsonobject;
            throw jsonobject;
        }


        private FileLogger(String s, String s1)
        {
            super(s, s1);
        }
    }

    private static class FileLogger.ClientLogFormatter extends Formatter
    {

        public String format(LogRecord logrecord)
        {
            return logrecord.getMessage();
        }

        private FileLogger.ClientLogFormatter()
        {
        }

    }

    protected static abstract class FileLoggerInterface extends java.util.logging.Logger
    {

        public abstract byte[] getFileContentsAsByteArray(File file)
            throws UnsupportedEncodingException;

        public abstract void log(JSONObject jsonobject, String s)
            throws SecurityException, IOException;

        protected FileLoggerInterface(String s, String s1)
        {
            super(s, s1);
        }
    }

    public static abstract class LEVEL extends Enum
    {

        private static final LEVEL $VALUES[];
        public static final LEVEL ANALYTICS;
        public static final LEVEL DEBUG;
        public static final LEVEL ERROR;
        public static final LEVEL FATAL;
        public static final LEVEL INFO;
        public static final LEVEL LOG;
        public static final LEVEL TRACE;
        public static final LEVEL WARN;

        public static LEVEL fromString(String s)
        {
            try
            {
                s = valueOf(s.toUpperCase());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static LEVEL valueOf(String s)
        {
            return (LEVEL)Enum.valueOf(com/worklight/common/Logger$LEVEL, s);
        }

        public static LEVEL[] values()
        {
            return (LEVEL[])$VALUES.clone();
        }

        protected abstract int getLevelValue();

        protected boolean isLoggable()
        {
            LEVEL level1 = Logger.getLevelSync();
            return level1 != null && level1.getLevelValue() >= getLevelValue();
        }

        static 
        {
            ANALYTICS = new LEVEL("ANALYTICS", 0) {

                protected int getLevelValue()
                {
                    return 25;
                }

            };
            FATAL = new LEVEL("FATAL", 1) {

                protected int getLevelValue()
                {
                    return 50;
                }

            };
            ERROR = new LEVEL("ERROR", 2) {

                protected int getLevelValue()
                {
                    return 100;
                }

            };
            WARN = new LEVEL("WARN", 3) {

                protected int getLevelValue()
                {
                    return 200;
                }

            };
            INFO = new LEVEL("INFO", 4) {

                protected int getLevelValue()
                {
                    return 300;
                }

            };
            LOG = new LEVEL("LOG", 5) {

                protected int getLevelValue()
                {
                    return 400;
                }

            };
            DEBUG = new LEVEL("DEBUG", 6) {

                protected int getLevelValue()
                {
                    return 500;
                }

            };
            TRACE = new LEVEL("TRACE", 7) {

                protected int getLevelValue()
                {
                    return 600;
                }

            };
            $VALUES = (new LEVEL[] {
                ANALYTICS, FATAL, ERROR, WARN, INFO, LOG, DEBUG, TRACE
            });
        }

        private LEVEL(String s, int i)
        {
            super(s, i);
        }

    }

    static class SendLogsRequestListener
        implements WLRequestListener
    {

        private static final Logger logger = Logger.getInstance(com/worklight/common/Logger$SendLogsRequestListener.getName());
        private final File file;
        private boolean isAnalyticsRequest;
        private WLRequestListener userDefinedListener;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            if (userDefinedListener != null)
            {
                userDefinedListener.onFailure(wlfailresponse);
            }
            if (isAnalyticsRequest)
            {
                Logger.sendingAnalyticsLogs = false;
            } else
            {
                Logger.sendingLogs = false;
            }
            synchronized (Logger.WAIT_LOCK)
            {
                Logger.WAIT_LOCK.notifyAll();
            }
            return;
            exception;
            wlfailresponse;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onSuccess(WLResponse wlresponse)
        {
            file.delete();
            if (wlresponse.getStatus() != 201)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            logger.trace((new StringBuilder()).append("Successfully POSTed log data from file ").append(file).append(" to URL ").append("apps/services/loguploader").append(".  HTTP response code: ").append(wlresponse.getStatus()).toString());
            if (userDefinedListener != null)
            {
                userDefinedListener.onSuccess(wlresponse);
            }
_L1:
            Logger.context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putBoolean("crashDetected", false).commit();
            Exception exception;
            if (isAnalyticsRequest)
            {
                Logger.sendingAnalyticsLogs = false;
            } else
            {
                Logger.sendingLogs = false;
            }
            synchronized (Logger.WAIT_LOCK)
            {
                Logger.WAIT_LOCK.notifyAll();
            }
            return;
            logger.error((new StringBuilder()).append("Failed to POST data from file ").append(file).append(" due to: HTTP response code: ").append(wlresponse.getStatus()).toString());
            if (userDefinedListener == null)
            {
                userDefinedListener.onFailure(new WLFailResponse(wlresponse));
            }
              goto _L1
            exception;
            if (isAnalyticsRequest)
            {
                Logger.sendingAnalyticsLogs = false;
            } else
            {
                Logger.sendingLogs = false;
            }
            synchronized (Logger.WAIT_LOCK)
            {
                Logger.WAIT_LOCK.notifyAll();
            }
            throw exception;
            exception1;
            wlresponse;
            JVM INSTR monitorexit ;
            throw exception1;
            exception2;
            wlresponse;
            JVM INSTR monitorexit ;
            throw exception2;
        }


        public SendLogsRequestListener(File file1, WLRequestListener wlrequestlistener, boolean flag)
        {
            isAnalyticsRequest = false;
            file = file1;
            userDefinedListener = wlrequestlistener;
            isAnalyticsRequest = flag;
        }
    }

    private static class UncaughtExceptionHandler
        implements Thread.UncaughtExceptionHandler
    {

        private final Thread.UncaughtExceptionHandler defaultUEH;

        public final void uncaughtException(Thread thread, Throwable throwable)
        {
            if (Logger.context != null)
            {
                Logger.context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putBoolean("crashDetected", true).commit();
            }
            Logger.getInstance(getClass().getName()).fatal("Uncaught Exception", new JSONObject(), throwable);
            defaultUEH.uncaughtException(thread, throwable);
        }

        private UncaughtExceptionHandler()
        {
            defaultUEH = Thread.getDefaultUncaughtExceptionHandler();
        }

    }


    public static final String ANALYTICS_FILENAME = "analytics.log";
    private static final String CONTEXT_NULL_MSG = (new StringBuilder()).append(com/worklight/common/Logger.getName()).append(".setContext(Context) must be called to fully enable debug log capture.  Currently, the 'capture' flag is set but the 'context' field is not.  This warning will only be printed once.").toString();
    public static final boolean DEFAULT_analyticsCapture = true;
    public static final boolean DEFAULT_capture = true;
    protected static final int DEFAULT_logFileMaxSize = 0x186a0;
    public static final String FILENAME = "wl.log";
    private static final String LOG_TAG = com/worklight/common/Logger.getName();
    public static final int MAX_NUM_LOG_FILES = 2;
    public static final String SHARED_PREF_KEY = com/worklight/common/Logger.getName();
    public static final String SHARED_PREF_KEY_CRASH_DETECTED = "crashDetected";
    protected static final String SHARED_PREF_KEY_autoSendLogs = "autoSendLogs";
    public static final String SHARED_PREF_KEY_filters = "filters";
    public static final String SHARED_PREF_KEY_filters_from_server = "filtersFromServer";
    public static final String SHARED_PREF_KEY_level = "level";
    public static final String SHARED_PREF_KEY_level_from_server = "levelFromServer";
    protected static final String SHARED_PREF_KEY_logFileMaxSize = "logFileMaxSize";
    public static final String SHARED_PREF_KEY_logPersistence = "logPersistence";
    public static final String SHARED_PREF_KEY_logPersistence_from_server = "logPersistenceFromServer";
    private static final ThreadPoolExecutor ThreadPoolWorkQueue;
    public static final Object WAIT_LOCK = new Object();
    private static Boolean analyticsCapture = null;
    private static Boolean autoSendLogs;
    private static Boolean capture = null;
    private static Context context;
    private static boolean context_null_msg_already_printed = false;
    private static FileLoggerInterface fileLoggerInstance;
    private static HashMap filters = new HashMap();
    private static WeakHashMap instances = new WeakHashMap();
    private static JULHandler julHandler = new JULHandler();
    private static LEVEL level = null;
    private static Integer logFileMaxSize = null;
    private static long priorAutoTriggerTime = 0L;
    private static boolean sendingAnalyticsLogs = false;
    private static boolean sendingLogs = false;
    private static Timer timer;
    private static UncaughtExceptionHandler uncaughtExceptionHandler = null;
    private final String tag;

    private Logger(String s)
    {
        if (fileLoggerInstance == null)
        {
            fileLoggerInstance = FileLogger.getInstance();
        }
        if (s == null || s.trim().equals(""))
        {
            s = "NONE";
        } else
        {
            s = s.trim();
        }
        tag = s;
    }

    public static JSONObject HashMapToJSONObject(HashMap hashmap)
    {
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        Object obj = new JSONObject();
_L4:
        return ((JSONObject) (obj));
_L2:
        obj = hashmap.keySet();
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = ((Set) (obj)).iterator();
        do
        {
            obj = jsonobject;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (String)iterator.next();
            try
            {
                jsonobject.put(((String) (obj)), ((LEVEL)hashmap.get(obj)).toString());
            }
            catch (JSONException jsonexception) { }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static HashMap JSONObjectToHashMap(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            try
            {
                hashmap.put(s, LEVEL.valueOf(jsonobject.getString(s).toUpperCase()));
            }
            catch (JSONException jsonexception) { }
        }

        return hashmap;
    }

    private static JSONObject appendFullStackTrace(JSONObject jsonobject, Throwable throwable)
    {
        JSONArray jsonarray = new JSONArray();
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        for (int i = 0; i < astacktraceelement.length; i++)
        {
            jsonarray.put(astacktraceelement[i].toString());
        }

        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            try
            {
                jsonobject1 = new JSONObject();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return jsonobject;
            }
        }
        jsonobject = jsonobject1;
        jsonobject1.put("$stacktrace", jsonarray);
        jsonobject = jsonobject1;
        jsonobject1.put("$exceptionMessage", throwable.getLocalizedMessage());
        jsonobject = jsonobject1;
        jsonobject1.put("$exceptionClass", throwable.getClass().getName());
        return jsonobject1;
    }

    private JSONObject appendStackMetadata(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        jsonobject1 = jsonobject;
        boolean flag = jsonobject.has("$src");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        jsonobject1 = jsonobject;
        Object obj = jsonobject.getString("$src");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        jsonobject1 = jsonobject;
        flag = ((String) (obj)).equals("js");
        if (flag)
        {
            return jsonobject;
        }
        break MISSING_BLOCK_LABEL_53;
        JSONException jsonexception;
        jsonexception;
        jsonobject1 = jsonobject;
        StackTraceElement astacktraceelement[] = (new Exception()).getStackTrace();
        int i = 0;
_L2:
        int j;
        j = i;
        jsonobject1 = jsonobject;
        if (astacktraceelement[i].getClassName().equals(com/worklight/common/Logger.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1 = jsonobject;
        if (astacktraceelement[j].getClassName().equals(com/worklight/common/Logger.getName())) goto _L4; else goto _L3
_L3:
        jsonobject1 = jsonobject;
        if (astacktraceelement[j].getClassName().startsWith(com/worklight/common/internal/JULHandler.getName())) goto _L4; else goto _L5
_L5:
        jsonobject1 = jsonobject;
        if (astacktraceelement[j].getClassName().startsWith(java/util/logging/Logger.getName())) goto _L4; else goto _L6
_L6:
        jsonobject1 = jsonobject;
        if (!astacktraceelement[j].getClassName().startsWith(com/worklight/common/WLAnalytics.getName())) goto _L7; else goto _L4
_L7:
        jsonexception = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        jsonobject1 = jsonobject;
        jsonexception = new JSONObject();
        jsonobject1 = jsonexception;
        if (jsonexception.has("$class"))
        {
            break MISSING_BLOCK_LABEL_239;
        }
        jsonobject1 = jsonexception;
        jsonexception.put("$class", astacktraceelement[j].getClassName());
        jsonobject1 = jsonexception;
        if (jsonexception.has("$file"))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        jsonobject1 = jsonexception;
        jsonexception.put("$file", astacktraceelement[j].getFileName());
        jsonobject1 = jsonexception;
        if (jsonexception.has("$method"))
        {
            break MISSING_BLOCK_LABEL_299;
        }
        jsonobject1 = jsonexception;
        jsonexception.put("$method", astacktraceelement[j].getMethodName());
        jsonobject1 = jsonexception;
        if (jsonexception.has("$line"))
        {
            break MISSING_BLOCK_LABEL_329;
        }
        jsonobject1 = jsonexception;
        jsonexception.put("$line", astacktraceelement[j].getLineNumber());
        jsonobject = jsonexception;
        jsonobject1 = jsonexception;
        if (jsonexception.has("$src"))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        jsonobject1 = jsonexception;
        jsonexception.put("$src", "java");
        jsonobject = jsonexception;
_L8:
        return jsonobject;
        jsonobject;
        Log.e(LOG_TAG, "Could not generate jsonMetadata object.", jsonobject);
        jsonobject = jsonobject1;
        if (true) goto _L8; else goto _L4
_L4:
        j++;
        if (true) goto _L1; else goto _L9
_L9:
    }

    private static void captureToFile(JSONObject jsonobject, LEVEL level1)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag = getCaptureSync();
        flag1 = getAnalyticsCaptureSync();
        if (context != null) goto _L2; else goto _L1
_L1:
        if (!context_null_msg_already_printed)
        {
            Log.w(LOG_TAG, CONTEXT_NULL_MSG);
            context_null_msg_already_printed = true;
        }
_L4:
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = jsonobject.length();
        if (i == 0) goto _L4; else goto _L3
_L3:
        if (!flag1) goto _L6; else goto _L5
_L5:
        if (!level1.equals(LEVEL.ANALYTICS)) goto _L6; else goto _L7
_L7:
        fileLoggerInstance.log(jsonobject, "analytics.log");
          goto _L4
        jsonobject;
        Log.e(LOG_TAG, "An error occurred capturing data to file.", jsonobject);
          goto _L4
        jsonobject;
        throw jsonobject;
_L6:
        if (!flag) goto _L4; else goto _L8
_L8:
        fileLoggerInstance.log(jsonobject, "wl.log");
          goto _L4
    }

    private static JSONObject createJSONObject(LEVEL level1, String s, String s1, long l, JSONObject jsonobject, Throwable throwable)
    {
        JSONObject jsonobject1 = new JSONObject();
        Object obj = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:S");
        ((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("GMT"));
        obj = ((SimpleDateFormat) (obj)).format(Long.valueOf(l));
        try
        {
            jsonobject1.put("timestamp", obj);
            jsonobject1.put("level", level1.toString());
            jsonobject1.put("pkg", s);
            jsonobject1.put("msg", s1);
            jsonobject1.put("threadid", Thread.currentThread().getId());
        }
        // Misplaced declaration of an exception variable
        catch (LEVEL level1)
        {
            Log.e(LOG_TAG, "Error adding JSONObject key/value pairs", level1);
            return jsonobject1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        jsonobject1.put("metadata", jsonobject);
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        jsonobject1.put("metadata", appendFullStackTrace(jsonobject, throwable));
        return jsonobject1;
    }

    public static boolean getAnalyticsCapture()
    {
        Future future = ThreadPoolWorkQueue.submit(new Callable() {

            public Boolean call()
            {
                return Boolean.valueOf(Logger.getAnalyticsCaptureSync());
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        boolean flag;
        try
        {
            flag = ((Boolean)future.get()).booleanValue();
        }
        catch (Exception exception)
        {
            return getAnalyticsCaptureSync();
        }
        return flag;
    }

    private static boolean getAnalyticsCaptureSync()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        Boolean boolean1 = analyticsCapture;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = analyticsCapture.booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static byte[] getByteArrayFromFile(File file)
        throws UnsupportedEncodingException
    {
        if (fileLoggerInstance == null)
        {
            return new byte[0];
        } else
        {
            return fileLoggerInstance.getFileContentsAsByteArray(file);
        }
    }

    public static boolean getCapture()
    {
        Future future = ThreadPoolWorkQueue.submit(new Callable() {

            public Boolean call()
            {
                return Boolean.valueOf(Logger.getCaptureSync());
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        boolean flag;
        try
        {
            flag = ((Boolean)future.get()).booleanValue();
        }
        catch (Exception exception)
        {
            return getCaptureSync();
        }
        return flag;
    }

    private static boolean getCaptureSync()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        if (capture != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        boolean flag1 = flag;
        if (context != null)
        {
            flag1 = context.getSharedPreferences(SHARED_PREF_KEY, 0).getBoolean("logPersistenceFromServer", flag);
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        flag = capture.booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static HashMap getFilters()
    {
        Object obj = ThreadPoolWorkQueue.submit(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public HashMap call()
            {
                return Logger.getFiltersSync();
            }

        });
        try
        {
            obj = (HashMap)((Future) (obj)).get();
        }
        catch (Exception exception)
        {
            return getFiltersSync();
        }
        return ((HashMap) (obj));
    }

    private static HashMap getFiltersSync()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        HashMap hashmap = filters;
        Object obj = hashmap;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = context.getSharedPreferences(SHARED_PREF_KEY, 0);
        Exception exception;
        try
        {
            obj = JSONObjectToHashMap(new JSONObject(((SharedPreferences) (obj)).getString("filtersFromServer", HashMapToJSONObject(hashmap).toString())));
        }
        catch (JSONException jsonexception)
        {
            jsonexception = hashmap;
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return ((HashMap) (obj));
        exception;
        throw exception;
    }

    public static Logger getInstance(String s)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        Logger logger1 = (Logger)instances.get(s);
        Logger logger;
        logger = logger1;
        if (logger1 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        logger = new Logger(s);
        instances.put(s, logger);
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return logger;
        s;
        throw s;
    }

    public static LEVEL getLevel()
    {
        Object obj = ThreadPoolWorkQueue.submit(new Callable() {

            public LEVEL call()
            {
                return Logger.getLevelSync();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        try
        {
            obj = (LEVEL)((Future) (obj)).get();
        }
        catch (Exception exception)
        {
            return getLevelSync();
        }
        return ((LEVEL) (obj));
    }

    public static LEVEL getLevelDefault()
    {
        if (context == null)
        {
            return LEVEL.DEBUG;
        }
        X500Principal x500principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        Object obj = context.getPackageManager();
        boolean flag;
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 64).signatures[0];
            flag = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(((Signature) (obj)).toByteArray()))).getSubjectX500Principal().equals(x500principal);
        }
        catch (Exception exception)
        {
            flag = false;
        }
        if (flag)
        {
            return LEVEL.DEBUG;
        } else
        {
            return LEVEL.FATAL;
        }
    }

    private static LEVEL getLevelSync()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        if (level != null) goto _L2; else goto _L1
_L1:
        LEVEL level1 = getLevelDefault();
_L4:
        LEVEL level2 = level1;
        if (context != null)
        {
            level2 = LEVEL.fromString(context.getSharedPreferences(SHARED_PREF_KEY, 0).getString("levelFromServer", level1.toString()));
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return level2;
_L2:
        level1 = level;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static int getMaxFileSize()
    {
        if (logFileMaxSize == null)
        {
            return 0x186a0;
        } else
        {
            return logFileMaxSize.intValue();
        }
    }

    public static boolean isUnCaughtExceptionDetected()
    {
        if (context == null)
        {
            if (!context_null_msg_already_printed)
            {
                Log.w(LOG_TAG, CONTEXT_NULL_MSG);
                context_null_msg_already_printed = true;
            }
            return false;
        } else
        {
            return context.getSharedPreferences(SHARED_PREF_KEY, 0).getBoolean("crashDetected", false);
        }
    }

    private static String prependMetadata(String s, JSONObject jsonobject)
    {
        String s5 = s;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        try
        {
            if (jsonobject.has("$class"))
            {
                s1 = jsonobject.getString("$class");
                s1 = s1.substring(s1.lastIndexOf('.') + 1, s1.length());
            }
            if (jsonobject.has("$method"))
            {
                s2 = jsonobject.getString("$method");
            }
            if (jsonobject.has("$file"))
            {
                s3 = jsonobject.getString("$file");
            }
            if (jsonobject.has("$line"))
            {
                s4 = jsonobject.getString("$line");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s;
        }
        s5 = s;
        if (!(new StringBuilder()).append(s1).append(s2).append(s3).append(s4).toString().equals(""))
        {
            s5 = (new StringBuilder()).append(s1).append(".").append(s2).append(" in ").append(s3).append(":").append(s4).append(" :: ").append(s).toString();
        }
        return s5;
    }

    public static void processAutomaticTrigger()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        if (Long.valueOf((new Date()).getTime()).longValue() - priorAutoTriggerTime >= 60000L)
        {
            if (timer != null)
            {
                timer.cancel();
            }
            timer = new Timer("trigger timer");
            timer.schedule(new TimerTask() {

                public void run()
                {
                    if (Logger.autoSendLogs == null || Logger.autoSendLogs.booleanValue())
                    {
                        Logger.send();
                        Logger.sendAnalytics(null);
                    }
                }

            }, 50L);
            priorAutoTriggerTime = (new Date()).getTime();
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void send()
    {
        send(null);
    }

    public static void send(WLRequestListener wlrequestlistener)
    {
        if (sendingLogs)
        {
            return;
        } else
        {
            sendingLogs = true;
            sendFiles("wl.log", wlrequestlistener);
            return;
        }
    }

    public static void sendAnalytics(WLRequestListener wlrequestlistener)
    {
        if (sendingAnalyticsLogs)
        {
            return;
        } else
        {
            sendingAnalyticsLogs = true;
            sendFiles("analytics.log", wlrequestlistener);
            return;
        }
    }

    private static void sendFiles(String s, WLRequestListener wlrequestlistener)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        Object obj = context;
        if (obj != null) goto _L2; else goto _L1
_L1:
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = 1;
_L5:
        if (i <= -1) goto _L1; else goto _L3
_L3:
        Object obj1;
        WLRequestOptions wlrequestoptions;
        obj1 = new File(context.getFilesDir(), (new StringBuilder()).append(s).append(".").append(i).toString());
        if (((File) (obj1)).length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj = new File((new StringBuilder()).append(obj1).append(".send").toString());
        if (!((File) (obj)).exists())
        {
            getInstance(LOG_TAG).trace((new StringBuilder()).append("Moving ").append(obj1).append(" to ").append(obj).toString());
            ((File) (obj1)).renameTo(((File) (obj)));
        }
        obj1 = new SendLogsRequestListener(((File) (obj)), wlrequestlistener, s.equalsIgnoreCase("analytics.log"));
        wlrequestoptions = new WLRequestOptions();
        byte abyte0[] = getByteArrayFromFile(((File) (obj)));
        if (abyte0.length == 0) goto _L1; else goto _L4
_L4:
        wlrequestoptions.addParameter("__logdata", new String(abyte0, "UTF-8"));
        (new WLRequest(((WLRequestListener) (obj1)), wlrequestoptions, WLConfig.getInstance(), context)).makeRequest("apps/services/loguploader", true);
_L6:
        i--;
          goto _L5
        IOException ioexception;
        ioexception;
        getInstance(LOG_TAG).error("Failed to send logs due to exception.", ioexception);
          goto _L6
        s;
        throw s;
    }

    public static void sendIfUnCaughtExceptionDetected(Context context1)
    {
        boolean flag = false;
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        setContext(context1);
        if (context1 != null) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        send();
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = context1.getSharedPreferences(SHARED_PREF_KEY, 0).getBoolean("crashDetected", false);
        if (true) goto _L1; else goto _L3
_L3:
        context1;
        throw context1;
    }

    public static void setAnalyticsCapture(boolean flag)
    {
        ThreadPoolWorkQueue.execute(new Runnable(flag) {

            final boolean val$_capture;

            public void run()
            {
                Logger.setAnalyticsCaptureSync(_capture);
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                _capture = flag;
                super();
            }
        });
    }

    private static void setAnalyticsCaptureSync(boolean flag)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        analyticsCapture = Boolean.valueOf(flag);
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setAutoSendLogs(boolean flag)
    {
        ThreadPoolWorkQueue.execute(new Runnable(flag) {

            final boolean val$_autoSendLogs;

            public void run()
            {
                Logger.setAutoSendLogsSync(_autoSendLogs);
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                _autoSendLogs = flag;
                super();
            }
        });
    }

    private static void setAutoSendLogsSync(boolean flag)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        autoSendLogs = Boolean.valueOf(flag);
        if (context != null)
        {
            context.getSharedPreferences(SHARED_PREF_KEY, 0).edit().putBoolean("autoSendLogs", autoSendLogs.booleanValue()).commit();
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setAutoUpdateConfig(boolean flag)
    {
    }

    public static void setCapture(boolean flag)
    {
        ThreadPoolWorkQueue.execute(new Runnable(flag) {

            final boolean val$_capture;

            public void run()
            {
                Logger.setCaptureSync(_capture);
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                _capture = flag;
                super();
            }
        });
    }

    private static void setCaptureSync(boolean flag)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        capture = Boolean.valueOf(flag);
        if (context != null)
        {
            SharedPreferences sharedpreferences = context.getSharedPreferences(SHARED_PREF_KEY, 0);
            sharedpreferences.edit().putBoolean("logPersistence", capture.booleanValue()).commit();
            capture = Boolean.valueOf(sharedpreferences.getBoolean("logPersistenceFromServer", capture.booleanValue()));
        }
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setContext(Context context1)
    {
        if (context == null)
        {
            LogManager.getLogManager().getLogger("").addHandler(julHandler);
            java.util.logging.Logger.getLogger("").setLevel(Level.ALL);
            context = context1;
            if (fileLoggerInstance == null || (fileLoggerInstance instanceof FileLogger))
            {
                fileLoggerInstance = FileLogger.getInstance();
            }
            try
            {
                WLClient.getInstance();
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                WLClient.createInstance(context);
            }
            context1 = context.getSharedPreferences(SHARED_PREF_KEY, 0);
            if (level != null)
            {
                setLevelSync(level);
            } else
            {
                setLevelSync(LEVEL.fromString(context1.getString("level", getLevelDefault().toString())));
            }
            if (logFileMaxSize != null)
            {
                setMaxFileSize(logFileMaxSize.intValue());
            } else
            {
                setMaxFileSize(context1.getInt("logFileMaxSize", 0x186a0));
            }
            if (capture != null)
            {
                setCaptureSync(capture.booleanValue());
            } else
            {
                setCaptureSync(context1.getBoolean("logPersistence", true));
            }
            if (autoSendLogs != null)
            {
                setAutoSendLogsSync(autoSendLogs.booleanValue());
            } else
            {
                setAutoSendLogsSync(context1.getBoolean("autoSendLogs", true));
            }
            if (filters != null)
            {
                setFiltersSync(filters);
            } else
            {
                try
                {
                    setFiltersSync(JSONObjectToHashMap(new JSONObject(context1.getString("filters", "{}"))));
                }
                // Misplaced declaration of an exception variable
                catch (Context context1) { }
            }
            uncaughtExceptionHandler = new UncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static void setFilters(HashMap hashmap)
    {
        ThreadPoolWorkQueue.execute(new Runnable(hashmap) {

            final HashMap val$_filters;

            public void run()
            {
                Logger.setFiltersSync(_filters);
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                _filters = hashmap;
                super();
            }
        });
    }

    private static void setFiltersSync(HashMap hashmap)
    {
        filters = hashmap;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hashmap = context.getSharedPreferences(SHARED_PREF_KEY, 0);
        hashmap.edit().putString("filters", HashMapToJSONObject(filters).toString()).commit();
        filters = JSONObjectToHashMap(new JSONObject(hashmap.getString("filtersFromServer", HashMapToJSONObject(filters).toString())));
        return;
        hashmap;
    }

    public static void setLevel(LEVEL level1)
    {
        ThreadPoolWorkQueue.execute(new Runnable(level1) {

            final LEVEL val$desiredLevel;

            public void run()
            {
                Logger.setLevelSync(desiredLevel);
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                desiredLevel = level1;
                super();
            }
        });
    }

    private static void setLevelSync(LEVEL level1)
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        if (level1 != null) goto _L2; else goto _L1
_L1:
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
_L2:
        level = level1;
        if (context != null)
        {
            level1 = context.getSharedPreferences(SHARED_PREF_KEY, 0);
            level1.edit().putString("level", level.toString()).commit();
            level = LEVEL.fromString(level1.getString("levelFromServer", level.toString()));
        }
        if (true) goto _L1; else goto _L3
_L3:
        level1;
        throw level1;
    }

    public static void setMaxFileSize(int i)
    {
        if (i >= 10000)
        {
            logFileMaxSize = Integer.valueOf(i);
        }
        if (context != null)
        {
            context.getSharedPreferences(SHARED_PREF_KEY, 0).edit().putInt("logFileMaxSize", logFileMaxSize.intValue()).commit();
        }
    }

    protected static void unsetContext()
    {
        instances.clear();
        context = null;
        capture = null;
        analyticsCapture = null;
        logFileMaxSize = null;
        level = null;
        filters = null;
        uncaughtExceptionHandler = null;
        fileLoggerInstance = null;
        autoSendLogs = null;
        LogManager.getLogManager().getLogger("").removeHandler(julHandler);
    }

    public static void updateConfigFromServer()
    {
        com/worklight/common/Logger;
        JVM INSTR monitorenter ;
        (new WLRequest(new WLRequestListener() {

            public void onFailure(WLFailResponse wlfailresponse)
            {
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception1;
                wlfailresponse;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            public void onSuccess(WLResponse wlresponse)
            {
                Context context1 = Logger.context;
                if (context1 == null)
                {
                    synchronized (Logger.WAIT_LOCK)
                    {
                        Logger.WAIT_LOCK.notifyAll();
                    }
                    return;
                }
                break MISSING_BLOCK_LABEL_28;
                exception1;
                wlresponse;
                JVM INSTR monitorexit ;
                throw exception1;
                if (wlresponse.getStatus() != 200) goto _L2; else goto _L1
_L1:
                wlresponse = wlresponse.getResponseJSON();
                if (wlresponse != null)
                {
                    break MISSING_BLOCK_LABEL_78;
                }
                Logger.getInstance(Logger.LOG_TAG).error("Server replied with 200 but had no JSON payload.  Ignoring this reply.");
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception2;
                wlresponse;
                JVM INSTR monitorexit ;
                throw exception2;
                boolean flag;
                Logger.getInstance(Logger.LOG_TAG).trace((new StringBuilder()).append("Processing server reply 200 OK.  Payload: ").append(wlresponse.toString()).toString());
                flag = wlresponse.has("wllogger");
                if (!flag) goto _L4; else goto _L3
_L3:
                LoggerServerConfigProcessor.processLoggerServerConfig(wlresponse.getJSONObject("wllogger"), Logger.context);
_L6:
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                return;
                exception3;
                wlresponse;
                JVM INSTR monitorexit ;
                throw exception3;
                Object obj;
                obj;
                Logger.getInstance(Logger.LOG_TAG).error((new StringBuilder()).append("Failed to parse response from server.  Payload: ").append(wlresponse.toString()).toString(), ((Throwable) (obj)));
                continue; /* Loop/switch isn't completed */
                obj;
                synchronized (Logger.WAIT_LOCK)
                {
                    Logger.WAIT_LOCK.notifyAll();
                }
                throw obj;
_L4:
                LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(Logger.context);
                continue; /* Loop/switch isn't completed */
_L2:
                if (wlresponse.getStatus() == 204)
                {
                    Logger.getInstance(Logger.LOG_TAG).trace("Processing server reply 204 NO_CONTENT.  No matching client configuration profiles were found at the MobileFirst Platform server, so removing any server-directed configuration overrides.");
                    LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(Logger.context);
                }
                if (true) goto _L6; else goto _L5
_L5:
                exception4;
                wlresponse;
                JVM INSTR monitorexit ;
                throw exception4;
            }

        }, new WLRequestOptions(), WLConfig.getInstance(), context)).makeRequest("apps/services/configprofile", true);
        com/worklight/common/Logger;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void analytics(String s, JSONObject jsonobject)
    {
        doLog(LEVEL.ANALYTICS, s, (new Date()).getTime(), jsonobject, null);
    }

    public void debug(String s)
    {
        debug(s, null, null);
    }

    public void debug(String s, Throwable throwable)
    {
        debug(s, null, throwable);
    }

    public void debug(String s, JSONObject jsonobject)
    {
        debug(s, jsonobject, null);
    }

    public void debug(String s, JSONObject jsonobject, Throwable throwable)
    {
        doLog(LEVEL.DEBUG, s, (new Date()).getTime(), jsonobject, throwable);
    }

    public void doLog(LEVEL level1, String s, long l, JSONObject jsonobject, Throwable throwable)
    {
        jsonobject = appendStackMetadata(jsonobject);
        ThreadPoolWorkQueue.execute(new DoLogRunnable(level1, s, l, jsonobject, throwable, this));
    }

    public void error(String s)
    {
        error(s, null, null);
    }

    public void error(String s, Throwable throwable)
    {
        error(s, null, throwable);
    }

    public void error(String s, JSONObject jsonobject)
    {
        error(s, jsonobject, null);
    }

    public void error(String s, JSONObject jsonobject, Throwable throwable)
    {
        doLog(LEVEL.ERROR, s, (new Date()).getTime(), jsonobject, throwable);
    }

    public void fatal(String s, JSONObject jsonobject, Throwable throwable)
    {
        doLog(LEVEL.FATAL, s, (new Date()).getTime(), jsonobject, throwable);
    }

    public void info(String s)
    {
        info(s, null);
    }

    public void info(String s, JSONObject jsonobject)
    {
        doLog(LEVEL.INFO, s, (new Date()).getTime(), jsonobject, null);
    }

    public void log(String s)
    {
        log(s, null);
    }

    public void log(String s, JSONObject jsonobject)
    {
        doLog(LEVEL.LOG, s, (new Date()).getTime(), jsonobject, null);
    }

    public void trace(String s)
    {
        trace(s, null);
    }

    public void trace(String s, JSONObject jsonobject)
    {
        doLog(LEVEL.TRACE, s, (new Date()).getTime(), jsonobject, null);
    }

    public void warn(String s)
    {
        warn(s, null, null);
    }

    public void warn(String s, Throwable throwable)
    {
        warn(s, null, throwable);
    }

    public void warn(String s, JSONObject jsonobject)
    {
        warn(s, jsonobject, null);
    }

    public void warn(String s, JSONObject jsonobject, Throwable throwable)
    {
        doLog(LEVEL.WARN, s, (new Date()).getTime(), jsonobject, throwable);
    }

    static 
    {
        ThreadPoolWorkQueue = new ThreadPoolExecutor(1, 1, 100L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1000));
        ThreadPoolWorkQueue.setRejectedExecutionHandler(new RejectedExecutionHandler() {

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
            {
                try
                {
                    threadpoolexecutor.getQueue().put(runnable);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Runnable runnable)
                {
                    return;
                }
            }

        });
    }












/*
    static boolean access$1902(boolean flag)
    {
        sendingAnalyticsLogs = flag;
        return flag;
    }

*/



/*
    static boolean access$2002(boolean flag)
    {
        sendingLogs = flag;
        return flag;
    }

*/





}
