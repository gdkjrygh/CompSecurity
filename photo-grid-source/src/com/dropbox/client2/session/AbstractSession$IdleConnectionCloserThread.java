// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import java.util.concurrent.TimeUnit;

class checkIntervalMs extends Thread
{

    private static thread thread = null;
    private final int checkIntervalMs;
    private final int idleTimeoutSeconds;
    private final thread manager;

    public static void ensureRunning(checkIntervalMs checkintervalms, int i, int j)
    {
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorenter ;
        if (thread == null)
        {
            checkintervalms = new <init>(checkintervalms, i, j);
            thread = checkintervalms;
            checkintervalms.start();
        }
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorexit ;
        return;
        checkintervalms;
        throw checkintervalms;
    }

    public void run()
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        wait(checkIntervalMs);
        this;
        JVM INSTR monitorexit ;
        manager.piredConnections();
        manager.leConnections(idleTimeoutSeconds, TimeUnit.SECONDS);
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorenter ;
        if (manager.ectionsInPool() != 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        thread = null;
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            thread = null;
        }
        return;
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com/dropbox/client2/session/AbstractSession$IdleConnectionCloserThread;
        JVM INSTR monitorexit ;
        throw obj;
    }


    public ( , int i, int j)
    {
        manager = ;
        idleTimeoutSeconds = i;
        checkIntervalMs = j * 1000;
    }
}
