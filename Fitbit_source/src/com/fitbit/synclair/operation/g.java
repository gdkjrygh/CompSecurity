// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.galileo.protocol.commands.PairCommandWithCodeClassic;

// Referenced classes of package com.fitbit.synclair.operation:
//            r

public class g extends r
{

    private static final String e = "PairClasicTrackerWithCodeOperation";
    private final BluetoothWorker f;
    private final GalileoTracker g;
    private final String h;
    private final TrackerType i;

    public g(BluetoothWorker bluetoothworker, GalileoTracker galileotracker, String s, TrackerType trackertype)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.i);
        f = bluetoothworker;
        g = galileotracker;
        h = s;
        i = trackertype;
    }

    protected String p()
    {
        return "PairClasicTrackerWithCodeOperation";
    }

    protected AirlinkCommand q()
    {
        return new PairCommandWithCodeClassic(FitBitApplication.a(), f, g, h, i);
    }
}
