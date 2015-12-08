// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import com.worklight.common.Logger;
import com.worklight.location.api.WLEventTransmissionPolicy;
import com.worklight.location.internal.DeviceContextImpl;
import com.worklight.location.internal.PiggbackRegisterer;
import com.worklight.location.internal.events.server.EventServer;
import com.worklight.location.internal.events.storage.Chunk;
import com.worklight.location.internal.events.storage.IChunkStorage;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.json.JSONObject;

// Referenced classes of package com.worklight.location.internal.events:
//            PiggybackerFactory, EventFlusher, ChunkTransmissionRequestListener

public class EventTransmitter
{

    private static final long BYTES_IN_KILOBYTE = 1024L;
    private final DeviceContextImpl dc;
    private boolean eventsHaveBeenAdded;
    private boolean inTestingEnv;
    private boolean isClientConnected;
    private boolean isTransmitting;
    private long lastFlush;
    private Logger logger;
    private Chunk openChunk;
    private WLEventTransmissionPolicy policy;
    private int purgeCounter;
    private int retriesLeft;
    private EventServer server;
    private final IChunkStorage storage;
    private Timer timer;

    EventTransmitter(EventServer eventserver, DeviceContextImpl devicecontextimpl, Chunk chunk, IChunkStorage ichunkstorage, WLEventTransmissionPolicy wleventtransmissionpolicy, PiggbackRegisterer piggbackregisterer, PiggybackerFactory piggybackerfactory, 
            boolean flag)
    {
        logger = Logger.getInstance("EventTransmitter");
        isTransmitting = false;
        lastFlush = -1L;
        isClientConnected = false;
        purgeCounter = 0;
        inTestingEnv = false;
        eventsHaveBeenAdded = false;
        if (eventserver == null)
        {
            throw new IllegalArgumentException("server is null");
        }
        server = eventserver;
        if (devicecontextimpl == null)
        {
            throw new IllegalArgumentException("dc is null");
        }
        dc = devicecontextimpl;
        if (chunk == null)
        {
            throw new IllegalArgumentException("openChunk is null");
        }
        openChunk = chunk;
        if (ichunkstorage == null)
        {
            throw new IllegalArgumentException("storage is null");
        } else
        {
            storage = ichunkstorage;
            policy = wleventtransmissionpolicy;
            retriesLeft = wleventtransmissionpolicy.getNumRetries();
            inTestingEnv = flag;
            setEventTransmissionPolicy(wleventtransmissionpolicy);
            piggbackregisterer.register(piggybackerfactory.create(this, 2000L));
            return;
        }
    }

    public EventTransmitter(EventServer eventserver, DeviceContextImpl devicecontextimpl, IChunkStorage ichunkstorage)
    {
        this(eventserver, devicecontextimpl, new Chunk((long)WLEventTransmissionPolicy.getDefaultPolicy().getMaxChunkSize() * 1024L), ichunkstorage, WLEventTransmissionPolicy.getDefaultPolicy(), new PiggbackRegisterer(), new PiggybackerFactory(), false);
    }

    private void addEventToChunk(JSONObject jsonobject, DeviceContextImpl devicecontextimpl)
    {
        this;
        JVM INSTR monitorenter ;
        if (!jsonobject.has("deviceContext"))
        {
            devicecontextimpl.addToEvent(jsonobject);
        }
        if (!openChunk.add(jsonobject))
        {
            storage.store(openChunk);
            openChunk = openChunk.createNewChunk();
            openChunk.add(jsonobject);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        jsonobject.printStackTrace();
        throw new AssertionError(jsonobject.getMessage());
        jsonobject;
        this;
        JVM INSTR monitorexit ;
        throw jsonobject;
    }

    private void clearTimer()
    {
        if (timer != null)
        {
            timer.cancel();
            timer = null;
        }
    }

    private void debugLog(String s)
    {
        if (!inTestingEnv)
        {
            logger.debug((new StringBuilder()).append(Thread.currentThread().getName()).append(" - ").append(s).toString());
        }
    }

    private boolean hasEvents()
    {
        return eventsHaveBeenAdded && (openChunk.numberOfEvents() > 0 || !storage.isEmpty());
    }

    private void resetTimer()
    {
        clearTimer();
        if (hasEvents() && !isTransmitting)
        {
            long l1 = policy.getInterval();
            long l = l1;
            if (lastFlush > 0L)
            {
                l = l1 - (System.currentTimeMillis() - lastFlush) % policy.getInterval();
            }
            scheduleTimer(l);
        }
    }

    private void scheduleTimer(long l)
    {
        timer = new Timer("Event Transmitter Timer");
        timer.schedule(new EventFlusher(this), l);
    }

    public void flushEvents()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        debugLog("Flush called");
        flag = isTransmitting;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!isClientConnected) goto _L1; else goto _L3
_L3:
        isTransmitting = true;
        clearTimer();
        lastFlush = System.currentTimeMillis();
        if (storage.isEmpty())
        {
            if (openChunk.numberOfEvents() <= 0)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            storage.store(openChunk);
            openChunk = openChunk.createNewChunk();
        }
        int i = purgeCounter;
        debugLog("Transmitting...:");
        server.send(storage.getFirst(), new ChunkTransmissionRequestListener(this, i));
          goto _L1
        Exception exception;
        exception;
        throw exception;
        isTransmitting = false;
          goto _L1
    }

    public void flushEventsFromAsync()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isTransmitting && eventsHaveBeenAdded)
        {
            flushEvents();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public IChunkStorage forTestOnly_getChunkStorage()
    {
        this;
        JVM INSTR monitorenter ;
        IChunkStorage ichunkstorage = storage;
        this;
        JVM INSTR monitorexit ;
        return ichunkstorage;
        Exception exception;
        exception;
        throw exception;
    }

    public void forTestOnly_setEventServer(EventServer eventserver)
    {
        this;
        JVM INSTR monitorenter ;
        server = eventserver;
        this;
        JVM INSTR monitorexit ;
        return;
        eventserver;
        throw eventserver;
    }

    boolean isTransmitting()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isTransmitting;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void purgeEvents()
    {
        this;
        JVM INSTR monitorenter ;
        storage.purgeAll();
        openChunk = openChunk.createNewChunk();
        purgeCounter = purgeCounter + 1;
        clearTimer();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setClientConnected(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        isClientConnected = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setEventTransmissionPolicy(WLEventTransmissionPolicy wleventtransmissionpolicy)
    {
        this;
        JVM INSTR monitorenter ;
        if (wleventtransmissionpolicy != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new IllegalArgumentException("p is null");
        wleventtransmissionpolicy;
        this;
        JVM INSTR monitorexit ;
        throw wleventtransmissionpolicy;
        long l;
        policy = wleventtransmissionpolicy.clone();
        l = (long)wleventtransmissionpolicy.getMaxChunkSize() * 1024L;
        if (!wleventtransmissionpolicy.isEventStorageEnabled())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        storage.setMaxmiumMemorySize(Math.max(l, (long)wleventtransmissionpolicy.getMaxMemSize() * 1024L - l));
_L1:
        if (openChunk.currentChunkSize() != 0L)
        {
            storage.store(openChunk);
        }
        openChunk = openChunk.createNewChunk(l);
        resetTimer();
        this;
        JVM INSTR monitorexit ;
        return;
        storage.setMaxmiumMemorySize(0x7fffffffffffffffL);
          goto _L1
    }

    public void transmitEvent(JSONObject jsonobject, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        transmitEvents(Collections.singletonList(jsonobject), flag);
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public void transmitEvents(List list, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        DeviceContextImpl devicecontextimpl = dc.clone();
        if (!list.isEmpty())
        {
            eventsHaveBeenAdded = true;
        }
        for (list = list.iterator(); list.hasNext(); addEventToChunk((JSONObject)list.next(), devicecontextimpl)) { }
        break MISSING_BLOCK_LABEL_62;
        list;
        throw list;
        if (isTransmitting) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        flushEvents();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (timer != null) goto _L2; else goto _L5
_L5:
        resetTimer();
          goto _L2
    }

    void txFailure()
    {
        this;
        JVM INSTR monitorenter ;
        isTransmitting = false;
        if (retriesLeft != 0) goto _L2; else goto _L1
_L1:
        debugLog((new StringBuilder()).append("Failed to transmit ").append(policy.getNumRetries()).append(" times, giving up this transmission, will try again according to the given interval").toString());
        retriesLeft = policy.getNumRetries();
        resetTimer();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        debugLog("Failed to transmit chunk, retrying");
        retriesLeft = retriesLeft - 1;
        scheduleTimer(policy.getRetryInterval());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void txSuccess(int i)
    {
        this;
        JVM INSTR monitorenter ;
        debugLog("Succesfully transmitted a chunk");
        if (i == purgeCounter)
        {
            storage.removeFirst();
        }
        retriesLeft = policy.getNumRetries();
        isTransmitting = false;
        if (hasEvents())
        {
            flushEvents();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
