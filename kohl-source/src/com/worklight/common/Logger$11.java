// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import com.worklight.common.internal.LoggerServerConfigProcessor;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

static final class sponse
    implements WLRequestListener
{

    public void onFailure(WLFailResponse wlfailresponse)
    {
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
        android.content.Context context = Logger.access$200();
        if (context == null)
        {
            synchronized (Logger.WAIT_LOCK)
            {
                Logger.WAIT_LOCK.notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_28;
        exception;
        wlresponse;
        JVM INSTR monitorexit ;
        throw exception;
        if (wlresponse.getStatus() != 200) goto _L2; else goto _L1
_L1:
        wlresponse = wlresponse.getResponseJSON();
        if (wlresponse != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        Logger.getInstance(Logger.access$400()).error("Server replied with 200 but had no JSON payload.  Ignoring this reply.");
        synchronized (Logger.WAIT_LOCK)
        {
            Logger.WAIT_LOCK.notifyAll();
        }
        return;
        exception1;
        wlresponse;
        JVM INSTR monitorexit ;
        throw exception1;
        boolean flag;
        Logger.getInstance(Logger.access$400()).trace((new StringBuilder()).append("Processing server reply 200 OK.  Payload: ").append(wlresponse.toString()).toString());
        flag = wlresponse.has("wllogger");
        if (!flag) goto _L4; else goto _L3
_L3:
        LoggerServerConfigProcessor.processLoggerServerConfig(wlresponse.getJSONObject("wllogger"), Logger.access$200());
_L6:
        synchronized (Logger.WAIT_LOCK)
        {
            Logger.WAIT_LOCK.notifyAll();
        }
        return;
        exception2;
        wlresponse;
        JVM INSTR monitorexit ;
        throw exception2;
        Object obj;
        obj;
        Logger.getInstance(Logger.access$400()).error((new StringBuilder()).append("Failed to parse response from server.  Payload: ").append(wlresponse.toString()).toString(), ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        synchronized (Logger.WAIT_LOCK)
        {
            Logger.WAIT_LOCK.notifyAll();
        }
        throw obj;
_L4:
        LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(Logger.access$200());
        continue; /* Loop/switch isn't completed */
_L2:
        if (wlresponse.getStatus() == 204)
        {
            Logger.getInstance(Logger.access$400()).trace("Processing server reply 204 NO_CONTENT.  No matching client configuration profiles were found at the MobileFirst Platform server, so removing any server-directed configuration overrides.");
            LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(Logger.access$200());
        }
        if (true) goto _L6; else goto _L5
_L5:
        exception3;
        wlresponse;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    sponse()
    {
    }
}
