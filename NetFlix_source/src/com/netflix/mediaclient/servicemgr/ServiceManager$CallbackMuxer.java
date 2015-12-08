// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ServiceManager, ManagerCallback

private static class <init>
{
    private static class MuxedCallback
    {

        private static int sRequestIdCounter = 0;
        private final ManagerCallback callback;
        private final int requestId;

        public ManagerCallback getDemuxedCallback()
        {
            return callback;
        }

        public int getRequestId()
        {
            return requestId;
        }


        public MuxedCallback(ManagerCallback managercallback)
        {
            sRequestIdCounter++;
            requestId = sRequestIdCounter;
            callback = managercallback;
        }
    }


    private final ArrayList muxedCallbacks;

    public ManagerCallback demuxCallback(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = muxedCallbacks.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        MuxedCallback muxedcallback = (MuxedCallback)((Iterator) (obj)).next();
        if (muxedcallback.getRequestId() != i) goto _L4; else goto _L3
_L3:
        muxedCallbacks.remove(muxedcallback);
        obj = muxedcallback.getDemuxedCallback();
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((ManagerCallback) (obj));
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public int muxCallback(ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        managercallback = new MuxedCallback(managercallback);
        muxedCallbacks.add(managercallback);
        i = managercallback.getRequestId();
        this;
        JVM INSTR monitorexit ;
        return i;
        managercallback;
        throw managercallback;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        muxedCallbacks.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private MuxedCallback.callback()
    {
        muxedCallbacks = new ArrayList();
    }

    muxedCallbacks(muxedCallbacks muxedcallbacks)
    {
        this();
    }
}
