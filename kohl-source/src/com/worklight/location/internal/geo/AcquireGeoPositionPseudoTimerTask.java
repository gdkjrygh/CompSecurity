// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.WLDevice;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoFailureCallback;

// Referenced classes of package com.worklight.location.internal.geo:
//            EmptyGeoCallback

public class AcquireGeoPositionPseudoTimerTask
    implements Runnable
{

    private static WLGeoCallback emptySuccess = new EmptyGeoCallback();
    private boolean cancelled;
    private WLGeoFailureCallback failureCallback;
    private WLGeoAcquisitionPolicy policy;
    private long targetTime;
    private WLDevice wlDevice;

    public AcquireGeoPositionPseudoTimerTask(WLDevice wldevice, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, long l)
    {
        cancelled = false;
        wlDevice = wldevice;
        failureCallback = wlgeofailurecallback;
        policy = wlgeoacquisitionpolicy;
        targetTime = System.currentTimeMillis() + l;
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        cancelled = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean cancelled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = cancelled;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        do
        {
            long l;
label0:
            {
                if (!cancelled())
                {
                    l = System.currentTimeMillis();
                    if (l < targetTime)
                    {
                        break label0;
                    }
                    wlDevice.acquireGeoPosition(emptySuccess, failureCallback, policy);
                }
                return;
            }
            try
            {
                Thread.sleep(targetTime - l);
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }

}
