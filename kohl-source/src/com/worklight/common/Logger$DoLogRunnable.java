// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

private static class logger
    implements Runnable
{

    private JSONObject additionalMetadata;
    private t calledLevel;
    private Logger logger;
    private String message;
    private Throwable t;
    private long timestamp;

    public void run()
    {
        HashMap hashmap = Logger.access$1300();
        boolean flag;
        if (hashmap != null && hashmap.size() > 0)
        {
            if (hashmap.containsKey(Logger.access$1500(logger)))
            {
                if (calledLevel.Value() <= ((Value)hashmap.get(Logger.access$1500(logger))).Value())
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
        if (calledLevel != null && calledLevel.le())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && calledLevel != S) goto _L2; else goto _L1
_L1:
        Logger.access$1700(Logger.access$1600(calledLevel, Logger.access$1500(logger), message, timestamp, additionalMetadata, t), calledLevel);
        if (message == null)
        {
            obj = "(null)";
        } else
        {
            obj = message;
        }
        message = ((String) (obj));
        message = Logger.access$1800(message, additionalMetadata);
        com.worklight.common.Logger.LEVEL[calledLevel.calledLevel()];
        JVM INSTR tableswitch 1 7: default 192
    //                   1 254
    //                   2 254
    //                   3 301
    //                   4 348
    //                   5 395
    //                   6 442
    //                   7 442;
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
            Log.e(Logger.access$1500(logger), message);
        } else
        {
            Log.e(Logger.access$1500(logger), message, t);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (t == null)
        {
            Log.w(Logger.access$1500(logger), message);
        } else
        {
            Log.w(Logger.access$1500(logger), message, t);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (t == null)
        {
            Log.i(Logger.access$1500(logger), message);
        } else
        {
            Log.i(Logger.access$1500(logger), message, t);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (t == null)
        {
            Log.v(Logger.access$1500(logger), message);
        } else
        {
            Log.v(Logger.access$1500(logger), message, t);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (t == null)
        {
            Log.d(Logger.access$1500(logger), message);
        } else
        {
            Log.d(Logger.access$1500(logger), message, t);
        }
        if (true) goto _L2; else goto _L8
_L8:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ( , String s, long l, JSONObject jsonobject, Throwable throwable, Logger logger1)
    {
        calledLevel = ;
        message = s;
        timestamp = l;
        additionalMetadata = jsonobject;
        t = throwable;
        logger = logger1;
    }
}
