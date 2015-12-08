// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.helpers.CyclicBuffer;
import fs.ch.qos.logback.core.spi.LogbackLock;
import fs.ch.qos.logback.core.status.Status;
import fs.ch.qos.logback.core.status.StatusListener;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.status.WarnStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicStatusManager
    implements StatusManager
{

    int count;
    int level;
    protected final List statusList = new ArrayList();
    protected final LogbackLock statusListLock = new LogbackLock();
    protected final List statusListenerList = new ArrayList();
    protected final LogbackLock statusListenerListLock = new LogbackLock();
    protected final CyclicBuffer tailBuffer = new CyclicBuffer(150);

    public BasicStatusManager()
    {
        count = 0;
        level = 0;
    }

    private void fireStatusAddEvent(Status status)
    {
        LogbackLock logbacklock = statusListenerListLock;
        logbacklock;
        JVM INSTR monitorenter ;
        for (Iterator iterator = statusListenerList.iterator(); iterator.hasNext(); ((StatusListener)iterator.next()).addStatusEvent(status)) { }
        break MISSING_BLOCK_LABEL_49;
        status;
        logbacklock;
        JVM INSTR monitorexit ;
        throw status;
        logbacklock;
        JVM INSTR monitorexit ;
    }

    public void add(Status status)
    {
        fireStatusAddEvent(status);
        count = count + 1;
        if (status.getLevel() > level)
        {
            level = status.getLevel();
        }
        LogbackLock logbacklock = statusListLock;
        logbacklock;
        JVM INSTR monitorenter ;
        if (statusList.size() >= 150)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        statusList.add(status);
_L2:
        return;
        tailBuffer.add(status);
        if (true) goto _L2; else goto _L1
_L1:
        status;
        logbacklock;
        JVM INSTR monitorexit ;
        throw status;
    }

    public void add(StatusListener statuslistener)
    {
        synchronized (statusListenerListLock)
        {
            statusListenerList.add(statuslistener);
        }
        return;
        statuslistener;
        logbacklock;
        JVM INSTR monitorexit ;
        throw statuslistener;
    }

    public boolean addUniquely(StatusListener statuslistener, Object obj)
    {
        for (Iterator iterator = getCopyOfStatusListenerList().iterator(); iterator.hasNext();)
        {
            StatusListener statuslistener1 = (StatusListener)iterator.next();
            if (statuslistener1.getClass().isInstance(statuslistener))
            {
                add(new WarnStatus((new StringBuilder()).append("A previous listener of type [").append(statuslistener1.getClass()).append("] has been already registered. Skipping double registration.").toString(), obj));
                return false;
            }
        }

        add(statuslistener);
        return true;
    }

    public List getCopyOfStatusList()
    {
        ArrayList arraylist;
        synchronized (statusListLock)
        {
            arraylist = new ArrayList(statusList);
            arraylist.addAll(tailBuffer.asList());
        }
        return arraylist;
        exception;
        logbacklock;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getCopyOfStatusListenerList()
    {
        ArrayList arraylist;
        synchronized (statusListenerListLock)
        {
            arraylist = new ArrayList(statusListenerList);
        }
        return arraylist;
        exception;
        logbacklock;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void remove(StatusListener statuslistener)
    {
        synchronized (statusListenerListLock)
        {
            statusListenerList.remove(statuslistener);
        }
        return;
        statuslistener;
        logbacklock;
        JVM INSTR monitorexit ;
        throw statuslistener;
    }
}
