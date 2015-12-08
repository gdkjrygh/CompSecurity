// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.util;

import com.worklight.common.Logger;
import com.worklight.jsonstore.api.JSONStoreFileInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONStoreLogger
{
    public static class JSONStoreAnalyticsLogInstance
    {

        private String collection;
        private String operation;
        private long startTime;
        private String username;

        public void end()
        {
            long l = System.currentTimeMillis();
            JSONStoreLogger.logAnalytics(Long.valueOf(startTime), Long.valueOf(l), username, collection, operation);
        }

        public JSONStoreAnalyticsLogInstance(String s, String s1, String s2)
        {
            startTime = System.currentTimeMillis();
            username = s;
            collection = s1;
            operation = s2;
        }
    }

    public static class LogDetails
    {

        Throwable cause;
        String message;
        StackTraceElement stackTrace[];
        String tag;
        long timeLogged;
        String type;

        public JSONArray convertStackTraceElementToJSONArray(StackTraceElement astacktraceelement[])
        {
            JSONArray jsonarray = new JSONArray();
            StackTraceElement stacktraceelement;
            JSONObject jsonobject;
            int i;
            int j;
            try
            {
                j = astacktraceelement.length;
            }
            // Misplaced declaration of an exception variable
            catch (StackTraceElement astacktraceelement[])
            {
                break; /* Loop/switch isn't completed */
            }
            i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            stacktraceelement = astacktraceelement[i];
            jsonobject = new JSONObject();
            jsonobject.put("line", stacktraceelement.getLineNumber());
            jsonobject.put("class", stacktraceelement.getClassName());
            jsonobject.put("method", stacktraceelement.getMethodName());
            jsonobject.put("file", stacktraceelement.getFileName());
            jsonarray.put(jsonobject);
            i++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L2; else goto _L1
_L1:
            return jsonarray;
        }

        public JSONObject convertThrowableToJSONObject(Throwable throwable)
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("throwableStackTrace", convertStackTraceElementToJSONArray(throwable.getStackTrace()));
                jsonobject.put("message", throwable.getMessage());
                jsonobject.put("tag", tag);
                jsonobject.put("type", type);
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return jsonobject;
            }
            return jsonobject;
        }

        public JSONObject convertToMetadata()
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("message", message);
                jsonobject.put("time", timeLogged);
                if (cause != null)
                {
                    jsonobject.put("causedBy", convertThrowableToJSONObject(cause));
                }
                jsonobject.put("stackTrace", convertStackTraceElementToJSONArray(stackTrace));
            }
            catch (JSONException jsonexception)
            {
                return jsonobject;
            }
            return jsonobject;
        }

        public LogDetails(String s, String s1, String s2, Throwable throwable)
        {
            tag = s;
            type = s1;
            message = s2;
            cause = throwable;
            timeLogged = System.currentTimeMillis() / 1000L;
            stackTrace = Thread.currentThread().getStackTrace();
        }
    }


    private static final String ANALYTICS_COLLECTION = "$js.collection";
    private static final String ANALYTICS_END_TIME = "$js.endTime";
    private static final String ANALYTICS_IS_ENCRYPTED = "$js.encryption";
    private static final String ANALYTICS_OPERATION = "$js.operation";
    private static final String ANALYTICS_RETURN_CODE = "$js.rc";
    private static final String ANALYTICS_SIZE = "$js.size";
    private static final String ANALYTICS_SOURCE = "java";
    private static final String ANALYTICS_SOURCE_KEY = "$src";
    private static final String ANALYTICS_START_TIME = "$js.startTime";
    private static final String ANALYTICS_USERNAME = "$js.user";
    public static String OPERATION_ADD = "add";
    public static String OPERATION_CHANGE = "change";
    public static String OPERATION_CHANGE_PASSWORD = "changePassword";
    public static String OPERATION_CLEAR = "clear";
    public static String OPERATION_CLOSE_ALL = "closeAll";
    public static String OPERATION_COMMIT_TRANSACTION = "commitTransaction";
    public static String OPERATION_COUNT = "count";
    public static String OPERATION_COUNT_ALL_DIRTY = "countAllDirty";
    public static String OPERATION_DESTROY = "destroy";
    public static String OPERATION_FIND = "find";
    public static String OPERATION_FIND_ALL_DIRTY = "allDirty";
    public static String OPERATION_IS_DOCUMENT_DIRTY = "isDirty";
    public static String OPERATION_MARK_CLEAN = "markClean";
    public static String OPERATION_OPEN = "open";
    public static String OPERATION_REMOVE = "remove";
    public static String OPERATION_REMOVE_COLLECTION = "removeCollection";
    public static String OPERATION_REPLACE = "replace";
    public static String OPERATION_ROLLBACK_TRANSACTION = "rollbackTransaction";
    public static String OPERATION_START_TRANSACTION = "startTransaction";
    private static boolean analyticsEnabled = false;
    private static Logger analyticsLogger = Logger.getInstance("JSONSTORE_ANALYTICS");
    private static final HashMap instances = new HashMap();
    private static Logger logger = Logger.getInstance("JSONSTORE");
    private String tag;

    private JSONStoreLogger(String s)
    {
        tag = s;
    }

    public static JSONStoreLogger getLogger(String s)
    {
        com/worklight/jsonstore/util/JSONStoreLogger;
        JVM INSTR monitorenter ;
        JSONStoreLogger jsonstorelogger1 = (JSONStoreLogger)instances.get(s);
        JSONStoreLogger jsonstorelogger;
        jsonstorelogger = jsonstorelogger1;
        if (jsonstorelogger1 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        jsonstorelogger = new JSONStoreLogger(s);
        instances.put(s, jsonstorelogger);
        com/worklight/jsonstore/util/JSONStoreLogger;
        JVM INSTR monitorexit ;
        return jsonstorelogger;
        s;
        throw s;
    }

    public static void logAnalytics(Long long1, Long long2, String s, String s1, String s2)
    {
        if (!analyticsEnabled)
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("$src", "java");
            jsonobject.put("$js.startTime", long1);
            jsonobject.put("$js.endTime", long2);
            jsonobject.put("$js.user", s);
            jsonobject.put("$js.collection", s1);
            jsonobject.put("$js.operation", s2);
            jsonobject.put("$js.rc", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            analyticsLogger.error("Error logging JSONStore analytics.", long1);
        }
        analyticsLogger.analytics("", jsonobject);
    }

    public static void logFileInfo(List list)
    {
        if (analyticsEnabled)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                JSONStoreFileInfo jsonstorefileinfo = (JSONStoreFileInfo)list.next();
                JSONObject jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("$src", "java");
                    jsonobject.put("$js.user", jsonstorefileinfo.getUsername());
                    jsonobject.put("$js.size", jsonstorefileinfo.getFileSizeBytes());
                    jsonobject.put("$js.encryption", jsonstorefileinfo.isEncrypted());
                    jsonobject.put("$js.rc", 0);
                }
                catch (JSONException jsonexception)
                {
                    analyticsLogger.error("Error logging JSONStore analytics.", jsonexception);
                }
                analyticsLogger.analytics("", jsonobject);
            }
        }
    }

    public static void setAnalyticsEnabled(boolean flag)
    {
        analyticsEnabled = flag;
    }

    public static JSONStoreAnalyticsLogInstance startAnalyticsInstance(String s, String s1, String s2)
    {
        return new JSONStoreAnalyticsLogInstance(s, s1, s2);
    }

    public void logDebug(String s)
    {
        LogDetails logdetails = new LogDetails(tag, "debug", s, null);
        logger.debug(s, logdetails.convertToMetadata());
    }

    public void logDebug(String s, Throwable throwable)
    {
        throwable = new LogDetails(tag, "debug", s, throwable);
        logger.debug(s, throwable.convertToMetadata());
    }

    public void logError(String s)
    {
        LogDetails logdetails = new LogDetails(tag, "error", s, null);
        logger.error(s, logdetails.convertToMetadata());
    }

    public void logError(String s, Throwable throwable)
    {
        LogDetails logdetails = new LogDetails(tag, "error", s, throwable);
        logger.error(s, logdetails.convertToMetadata(), throwable);
    }

    public void logTrace(String s)
    {
        LogDetails logdetails = new LogDetails(tag, "info", s, null);
        logger.trace(s, logdetails.convertToMetadata());
    }

}
