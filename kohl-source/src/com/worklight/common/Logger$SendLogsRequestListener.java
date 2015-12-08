// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import java.io.File;

// Referenced classes of package com.worklight.common:
//            Logger

static class isAnalyticsRequest
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
            Logger.access$1902(false);
        } else
        {
            Logger.access$2002(false);
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
        Logger.access$200().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().lean("crashDetected", false).();
        Exception exception;
        if (isAnalyticsRequest)
        {
            Logger.access$1902(false);
        } else
        {
            Logger.access$2002(false);
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
            Logger.access$1902(false);
        } else
        {
            Logger.access$2002(false);
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


    public _cls9(File file1, WLRequestListener wlrequestlistener, boolean flag)
    {
        isAnalyticsRequest = false;
        file = file1;
        userDefinedListener = wlrequestlistener;
        isAnalyticsRequest = flag;
    }
}
