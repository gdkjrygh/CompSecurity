// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.FitBitApplication;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.galileo.protocol.commands.a;

// Referenced classes of package com.fitbit.synclair.operation:
//            r

public class c extends r
{

    private static final String e = "DisplayCodeOnProtonOperation";
    private final BluetoothWorker f;
    private final GalileoTracker g;

    public c(BluetoothWorker bluetoothworker, GalileoTracker galileotracker)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.g);
        f = bluetoothworker;
        g = galileotracker;
    }

    protected String p()
    {
        return "DisplayCodeOnProtonOperation";
    }

    protected AirlinkCommand q()
    {
        return new a(FitBitApplication.a(), f, g);
    }
}
