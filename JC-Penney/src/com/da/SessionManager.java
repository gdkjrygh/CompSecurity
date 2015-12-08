// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import android.app.Application;

// Referenced classes of package com.da:
//            LoggingUtil, TagUtil

final class SessionManager
{

    static final String ILLEGAL_STATE_MESSAGE = "An active session Not Found. Please use the TagAPI.startNewSession call to activate a Session before firing Tags";
    private static volatile SessionManager singleton;
    private String activeSessionId;
    private boolean firstPageViewed;
    private boolean isSessionActive;
    private String visitorId;

    private SessionManager(Application application)
    {
        firstPageViewed = false;
        isSessionActive = false;
        loadVisitorId(application);
        startNewSession();
        LoggingUtil.log("SessionManager successfully started.....", 3);
    }

    static SessionManager getInstance()
    {
        if (singleton == null)
        {
            throw new IllegalStateException("Module is uninitialized. Please use startup(Application) to initialize the Module first");
        } else
        {
            return singleton;
        }
    }

    private void loadNewSessionId()
    {
        activeSessionId = TagUtil.generateSessionId();
    }

    private void loadVisitorId(Application application)
    {
        if (visitorId == null)
        {
            visitorId = TagUtil.readFromFile(application, "SessionManager");
            if (visitorId == null)
            {
                visitorId = TagUtil.generateVisitorId();
                TagUtil.writeToFile(application, "SessionManager", visitorId);
            }
        }
    }

    static void shutdown()
    {
        singleton = null;
    }

    static SessionManager startup(Application application)
    {
        if (singleton != null) goto _L2; else goto _L1
_L1:
        com/da/SessionManager;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            singleton = new SessionManager(application);
        }
        com/da/SessionManager;
        JVM INSTR monitorexit ;
_L2:
        return singleton;
        application;
        com/da/SessionManager;
        JVM INSTR monitorexit ;
        throw application;
    }

    String getSessionId()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isSessionActive)
        {
            throw new IllegalStateException("An active session Not Found. Please use the TagAPI.startNewSession call to activate a Session before firing Tags");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        String s = activeSessionId;
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    String getVisitorId()
    {
        return visitorId;
    }

    boolean isFirstPageView()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isSessionActive)
        {
            throw new IllegalStateException("An active session Not Found. Please use the TagAPI.startNewSession call to activate a Session before firing Tags");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag = firstPageViewed;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
    }

    boolean isSessionActive()
    {
        return isSessionActive;
    }

    void onPageView()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isSessionActive)
        {
            throw new IllegalStateException("An active session Not Found. Please use the TagAPI.startNewSession call to activate a Session before firing Tags");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        firstPageViewed = true;
        this;
        JVM INSTR monitorexit ;
    }

    String startNewSession()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        firstPageViewed = false;
        loadNewSessionId();
        isSessionActive = true;
        s = activeSessionId;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
