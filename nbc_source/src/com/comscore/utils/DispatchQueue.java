// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.task.TaskExecutor;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.comscore.utils:
//            TransmissionMode, CSLog

public class DispatchQueue extends ConcurrentLinkedQueue
{

    public static final int LIVE_TRANSMISSION_MODE = 0;
    public static final int MEASUREMENT_LABEL_ORDER = 3;
    public static final int OFFLINE_TRANSMISSION_MODE = 1;
    public static final int SECURE_MODE = 2;
    private static final long a = 1L;
    private Core b;

    public DispatchQueue(Core core)
    {
        b = core;
    }

    public void enqueue(Measurement measurement)
    {
        offer(measurement);
    }

    public void enqueueSettingChange(int i, Object obj)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            b.allowLiveTransmission((TransmissionMode)obj, true);
            return;

        case 1: // '\001'
            b.allowOfflineTransmission((TransmissionMode)obj, true);
            return;

        case 2: // '\002'
            b.setSecure(((Boolean)obj).booleanValue(), true);
            return;

        case 3: // '\003'
            b.setMeasurementLabelOrder((String[])(String[])obj, true);
            break;
        }
    }

    public boolean offer(Measurement measurement)
    {
        CSLog.d(this, (new StringBuilder()).append("offer(): ").append(measurement.retrieveLabelsAsString(b.getMeasurementLabelOrder())).toString());
        return b.getMeasurementDispatcher().sendMeasurmement(measurement, true);
    }

    public volatile boolean offer(Object obj)
    {
        return offer((Runnable)obj);
    }

    public boolean offer(Runnable runnable)
    {
        return b.getTaskExecutor().execute(runnable, true);
    }

    public void processAggregateData(Measurement measurement)
    {
        b.getMeasurementDispatcher().addAggregateData(measurement);
    }

    public void processEventCounter(Measurement measurement)
    {
        b.getMeasurementDispatcher().addEventCounter(measurement);
    }

    public void stop()
    {
        b.getTaskExecutor().clear();
    }
}
