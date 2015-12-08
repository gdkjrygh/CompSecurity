// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.WLAcquisitionPolicy;
import com.worklight.location.api.WLDevice;
import com.worklight.location.api.WLLocationServicesConfiguration;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.IRunnableExecutor;
import com.worklight.location.internal.geo.AcquireGeoPositionPseudoTimerTask;
import com.worklight.location.internal.geo.ChainGeoFailureCallback;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoDwellTrigger;
import com.worklight.location.internal.nativeImpl.TimerRunnableExecutor;
import com.worklight.wlclient.api.WLClient;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            GeoAreaTriggerEvaluator

abstract class GeoDwellTriggerEvaluator extends GeoAreaTriggerEvaluator
{

    private AcquireGeoPositionPseudoTimerTask acquirePosTT;
    private boolean alreadyEvaluatedAsDwelling;
    private WLGeoFailureCallback failureCallback;
    private WLGeoAcquisitionPolicy policy;
    private IRunnableExecutor runnableExec;
    private long startCurrentTime;
    private Long startDwellingTime;
    private WLDevice wlDevice;

    protected GeoDwellTriggerEvaluator(AbstractGeoDwellTrigger abstractgeodwelltrigger, boolean flag)
    {
        super(abstractgeodwelltrigger, flag);
        startDwellingTime = null;
        alreadyEvaluatedAsDwelling = false;
        wlDevice = null;
        policy = null;
        failureCallback = null;
        acquirePosTT = null;
        runnableExec = null;
        wlDevice = WLClient.getInstance().getWLDevice();
        runnableExec = new TimerRunnableExecutor();
    }

    protected GeoDwellTriggerEvaluator(AbstractGeoDwellTrigger abstractgeodwelltrigger, boolean flag, WLDevice wldevice, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, WLGeoFailureCallback wlgeofailurecallback)
    {
        super(abstractgeodwelltrigger, flag);
        startDwellingTime = null;
        alreadyEvaluatedAsDwelling = false;
        wlDevice = null;
        policy = null;
        failureCallback = null;
        acquirePosTT = null;
        runnableExec = null;
        wlDevice = wldevice;
        policy = wlgeoacquisitionpolicy;
        failureCallback = wlgeofailurecallback;
        runnableExec = new TimerRunnableExecutor();
    }

    private void cancelTask()
    {
        this;
        JVM INSTR monitorenter ;
        if (acquirePosTT != null)
        {
            acquirePosTT.cancel();
            acquirePosTT = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean isDwelling()
    {
        if (shouldBeInside)
        {
            return isInsideArea();
        } else
        {
            return isOutsideArea();
        }
    }

    private void resetTask()
    {
        this;
        JVM INSTR monitorenter ;
        cancelTask();
        if (startDwellingTime == null) goto _L2; else goto _L1
_L1:
        boolean flag = alreadyEvaluatedAsDwelling;
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        long l = (getTriggerDefinition().getDwellingTime() + 100L) - (System.currentTimeMillis() - startCurrentTime);
        acquirePosTT = new AcquireGeoPositionPseudoTimerTask(wlDevice, failureCallback, policy, l);
        runnableExec.execute(acquirePosTT, l);
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean evaluate(WLGeoPosition wlgeoposition)
    {
        Long long1;
        long1 = null;
        updatePosition(wlgeoposition);
        if (startDwellingTime != null) goto _L2; else goto _L1
_L1:
        if (isDwelling())
        {
            long1 = wlgeoposition.getTimestamp();
        }
        startDwellingTime = long1;
        startCurrentTime = System.currentTimeMillis();
        alreadyEvaluatedAsDwelling = false;
        resetTask();
_L4:
        return false;
_L2:
        if (isDwelling())
        {
            break; /* Loop/switch isn't completed */
        }
        startDwellingTime = null;
        cancelTask();
        if (true) goto _L4; else goto _L3
_L3:
        if (alreadyEvaluatedAsDwelling || !isDwelling() || wlgeoposition.getTimestamp().longValue() - startDwellingTime.longValue() < getTriggerDefinition().getDwellingTime()) goto _L4; else goto _L5
_L5:
        alreadyEvaluatedAsDwelling = true;
        cancelTask();
        return true;
    }

    public volatile WLGeoTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractGeoAreaTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public AbstractGeoDwellTrigger getTriggerDefinition()
    {
        return (AbstractGeoDwellTrigger)super.getTriggerDefinition();
    }

    public void notifyOfConfigurationUpdate(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        super.notifyOfConfigurationUpdate(wllocationservicesconfiguration);
        policy = wllocationservicesconfiguration.getPolicy().getGeoPolicy().clone();
        policy.setMaximumAge(100L);
        failureCallback = new ChainGeoFailureCallback(wllocationservicesconfiguration.getFailureCallbacks());
        resetTask();
    }

    public void preDestroy()
    {
        cancelTask();
        super.preDestroy();
    }
}
