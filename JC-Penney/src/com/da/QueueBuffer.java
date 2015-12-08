// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import android.app.Application;
import android.content.Context;
import com.da.model.DAModel;
import com.da.util.SystemUtil;
import com.ibm.eo.EOCore;

// Referenced classes of package com.da:
//            DigitalAnalyticsModule, LoggingUtil, SessionManager

public final class QueueBuffer
{

    static final String ILLEGAL_STATE_MESSAGE = "An active QueueBuffer Not Found. Please use the TagAPI.startup call to activate the engine";
    private static boolean connected;
    private static volatile QueueBuffer singleton;
    private static boolean testMode;
    private Backlog activeBacklog;
    private Context appContext;
    private boolean captureAllOfflineTags;
    private boolean stateLoaded;

    private QueueBuffer(Application application)
    {
        activeBacklog = null;
        appContext = null;
        captureAllOfflineTags = true;
        stateLoaded = false;
        appContext = application.getApplicationContext();
    }

    private static void cleanup()
    {
        com/da/QueueBuffer;
        JVM INSTR monitorenter ;
        getInstance().activeBacklog.cleanup();
        getInstance().activeBacklog = null;
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void connect()
    {
        connected = true;
    }

    static void deactivateTestMode()
    {
        testMode = false;
    }

    static void disconnect()
    {
        connected = false;
    }

    static void flush()
    {
        if (EOCore.getConfigItemBoolean("ManualPostEnabled", EOCore.getInstance()).booleanValue())
        {
            EOCore.flushQueues();
        }
    }

    static QueueBuffer getInstance()
    {
        if (singleton == null)
        {
            throw new IllegalStateException("An active QueueBuffer Not Found. Please use the TagAPI.startup call to activate the engine");
        }
        if (!singleton.stateLoaded)
        {
            Boolean boolean1 = EOCore.getConfigItemBoolean("CaptureAllOfflineTags", DigitalAnalyticsModule.getInstance());
            if (boolean1 != null)
            {
                singleton.captureAllOfflineTags = boolean1.booleanValue();
            }
            singleton.stateLoaded = true;
        }
        return singleton;
    }

    static void indicateTestMode()
    {
        testMode = true;
    }

    private static boolean isConnected()
    {
        if (testMode)
        {
            return connected;
        } else
        {
            return SystemUtil.isConnected(getInstance().appContext);
        }
    }

    private void postToConnectedQueue(DAModel damodel)
    {
        LoggingUtil.log((new StringBuilder()).append("(QueueBuffer)Posting Directly to Queue: ").append(damodel).toString(), 3);
        postToQueueService(damodel);
    }

    private static void postToQueueService(DAModel damodel)
    {
        if (testMode)
        {
            return;
        }
        if (!Boolean.valueOf(EOCore.postMessage(DigitalAnalyticsModule.getInstance(), damodel, SessionManager.getInstance().getSessionId())).booleanValue())
        {
            throw new RuntimeException("Tag was not sent");
        } else
        {
            flush();
            return;
        }
    }

    static void shutdown()
    {
        singleton = null;
    }

    static QueueBuffer startup(Application application)
    {
        if (singleton != null) goto _L2; else goto _L1
_L1:
        com/da/QueueBuffer;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            singleton = new QueueBuffer(application);
        }
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
_L2:
        return singleton;
        application;
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
        throw application;
    }

    static void turnOffCaptureAll()
    {
        getInstance().captureAllOfflineTags = false;
    }

    void post(DAModel damodel)
    {
        if (captureAllOfflineTags)
        {
            postToConnectedQueue(damodel);
            return;
        }
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (activeBacklog == null) goto _L2; else goto _L1
_L1:
        com/da/QueueBuffer;
        JVM INSTR monitorenter ;
        if (activeBacklog == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        activeBacklog.post(damodel);
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
        return;
        damodel;
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
        throw damodel;
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
_L2:
        postToConnectedQueue(damodel);
        return;
        if (activeBacklog != null) goto _L4; else goto _L3
_L3:
        com/da/QueueBuffer;
        JVM INSTR monitorenter ;
        if (activeBacklog == null)
        {
            activeBacklog = new Backlog(null);
        }
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
_L4:
        activeBacklog.post(damodel);
        return;
        damodel;
        com/da/QueueBuffer;
        JVM INSTR monitorexit ;
        throw damodel;
    }




    private class Backlog
    {

        private static final String BUFFER_FILE = "QueueBuffer";
        private static final int DISCONNECTED_WINDOW_SIZE = 10;
        private int currentWindowSize;

        private void cleanup()
        {
            TagUtil.deleteFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer");
        }

        private void persistToLocalStorage(DAModel damodel)
        {
            TagUtil.writeToFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer", damodel.toString());
        }

        private void post(DAModel damodel)
        {
            this;
            JVM INSTR monitorenter ;
            if (!QueueBuffer.isConnected()) goto _L2; else goto _L1
_L1:
            postToConnectedQueue(damodel);
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (currentWindowSize <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            postToDisconnectedQueue(damodel);
_L5:
            currentWindowSize = currentWindowSize - 1;
            if (true) goto _L4; else goto _L3
            damodel;
            throw damodel;
_L3:
            persistToLocalStorage(damodel);
            LoggingUtil.log((new StringBuilder()).append("(BackLog)Saved: ").append(damodel).toString(), 3);
              goto _L5
        }

        private void postToConnectedQueue(DAModel damodel)
        {
            DAModel damodel1 = readFromLocalStorage();
            if (damodel1 != null)
            {
                LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting BackLog To a Connected Queue: ").append(damodel1).toString(), 3);
                QueueBuffer.postToQueueService(damodel1);
            }
            LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting To a Connected Queue: ").append(damodel).toString(), 3);
            QueueBuffer.postToQueueService(damodel);
            QueueBuffer.cleanup();
        }

        private void postToDisconnectedQueue(DAModel damodel)
        {
            LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting To a Disconnected Queue: ").append(damodel).toString(), 3);
            QueueBuffer.postToQueueService(damodel);
        }

        private DAModel readFromLocalStorage()
        {
            String s = TagUtil.readFromFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer");
            DAModel damodel = null;
            if (s != null)
            {
                damodel = new DAModel(s);
            }
            return damodel;
        }



        private Backlog()
        {
            currentWindowSize = 10;
        }

        Backlog(_cls1 _pcls1)
        {
            this();
        }
    }

}
