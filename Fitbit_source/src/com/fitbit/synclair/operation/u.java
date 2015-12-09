// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.FitBitApplication;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.galileo.protocol.commands.DisplayCodeClassicTrackers;

// Referenced classes of package com.fitbit.synclair.operation:
//            r

public class u extends r
{

    private static final String e = "TapTrackerOperation";
    private final BluetoothWorker f;
    private final GalileoTracker g;

    public u(BluetoothWorker bluetoothworker, GalileoTracker galileotracker)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.h);
        f = bluetoothworker;
        g = galileotracker;
    }

    protected String p()
    {
        return "TapTrackerOperation";
    }

    protected AirlinkCommand q()
    {
        return new DisplayCodeClassicTrackers(FitBitApplication.a(), f, g, com.fitbit.galileo.protocol.commands.DisplayCodeClassicTrackers.Interaction.b, new _cls1());
    }

    /* member class not found */
    class _cls1 {}

}
