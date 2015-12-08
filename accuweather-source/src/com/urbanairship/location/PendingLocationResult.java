// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import com.urbanairship.PendingResult;

abstract class PendingLocationResult
    implements PendingResult
{

    private boolean isCanceled;
    private Location result;
    private com.urbanairship.PendingResult.ResultCallback resultCallback;

    PendingLocationResult()
    {
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isCanceled();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        onCancel();
        isCanceled = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isCanceled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isCanceled;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (isCanceled) goto _L2; else goto _L1
_L1:
        Location location = result;
        if (location == null) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void onCancel();

    public void onResult(com.urbanairship.PendingResult.ResultCallback resultcallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (isCanceled) goto _L2; else goto _L1
_L1:
        com.urbanairship.PendingResult.ResultCallback resultcallback1 = resultCallback;
        if (resultcallback1 == null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        resultCallback = resultcallback;
        if (result != null)
        {
            resultCallback.onResult(result);
        }
        if (true) goto _L2; else goto _L4
_L4:
        resultcallback;
        throw resultcallback;
    }

    void setResult(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isDone();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        result = location;
        if (resultCallback != null)
        {
            resultCallback.onResult(location);
        }
        if (true) goto _L1; else goto _L3
_L3:
        location;
        throw location;
    }
}
