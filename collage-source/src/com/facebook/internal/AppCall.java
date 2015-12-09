// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

public class AppCall
{

    private static AppCall currentPendingCall;
    private UUID callId;
    private int requestCode;
    private Intent requestIntent;

    public AppCall(int i)
    {
        this(i, UUID.randomUUID());
    }

    public AppCall(int i, UUID uuid)
    {
        callId = uuid;
        requestCode = i;
    }

    public static AppCall finishPendingCall(UUID uuid, int i)
    {
        com/facebook/internal/AppCall;
        JVM INSTR monitorenter ;
        AppCall appcall = getCurrentPendingCall();
        if (appcall == null) goto _L2; else goto _L1
_L1:
        if (!appcall.getCallId().equals(uuid)) goto _L2; else goto _L3
_L3:
        int j = appcall.getRequestCode();
        if (j == i) goto _L4; else goto _L2
_L2:
        uuid = null;
_L6:
        com/facebook/internal/AppCall;
        JVM INSTR monitorexit ;
        return uuid;
_L4:
        setCurrentPendingCall(null);
        uuid = appcall;
        if (true) goto _L6; else goto _L5
_L5:
        uuid;
        throw uuid;
    }

    public static AppCall getCurrentPendingCall()
    {
        return currentPendingCall;
    }

    private static boolean setCurrentPendingCall(AppCall appcall)
    {
        com/facebook/internal/AppCall;
        JVM INSTR monitorenter ;
        AppCall appcall1;
        appcall1 = getCurrentPendingCall();
        currentPendingCall = appcall;
        boolean flag;
        if (appcall1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/facebook/internal/AppCall;
        JVM INSTR monitorexit ;
        return flag;
        appcall;
        throw appcall;
    }

    public UUID getCallId()
    {
        return callId;
    }

    public int getRequestCode()
    {
        return requestCode;
    }

    public Intent getRequestIntent()
    {
        return requestIntent;
    }

    public boolean setPending()
    {
        return setCurrentPendingCall(this);
    }

    public void setRequestCode(int i)
    {
        requestCode = i;
    }

    public void setRequestIntent(Intent intent)
    {
        requestIntent = intent;
    }
}
