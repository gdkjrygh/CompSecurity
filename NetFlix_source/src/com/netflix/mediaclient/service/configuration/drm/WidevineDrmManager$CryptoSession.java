// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            WidevineDrmManager

private static class <init>
{

    public byte kceKeyId[];
    public byte kchKeyId[];
    public byte pendingSessionId[];
    public byte sessionId[];

    public byte[] activatePendingSessionId()
    {
        byte abyte0[] = null;
        this;
        JVM INSTR monitorenter ;
        if (pendingSessionId != null) goto _L2; else goto _L1
_L1:
        Log.e(WidevineDrmManager.TAG, "Pending session does NOT exist! Do nothing!");
_L4:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        Log.d(WidevineDrmManager.TAG, "Pending session does exist! Move pending to current session id and return old!");
        abyte0 = sessionId;
        sessionId = pendingSessionId;
        pendingSessionId = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        pendingSessionId = null;
        sessionId = null;
        kceKeyId = null;
        kchKeyId = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
