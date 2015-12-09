// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.bluetooth.BluetoothDevice;
import com.fitbit.FitBitApplication;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.galileo.protocol.commands.CheckForFirmwareCommand;

// Referenced classes of package com.fitbit.synclair.operation:
//            r

public class a extends r
{

    private static final String e = "CheckForFirmwareOperation";
    private final BluetoothWorker f;
    private final BluetoothDevice g;
    private final GalileoTrackerType h;

    public a(BluetoothWorker bluetoothworker, BluetoothDevice bluetoothdevice, GalileoTrackerType galileotrackertype)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.e);
        f = bluetoothworker;
        g = bluetoothdevice;
        h = galileotrackertype;
    }

    protected String p()
    {
        return "CheckForFirmwareOperation";
    }

    protected AirlinkCommand q()
    {
        return new CheckForFirmwareCommand(FitBitApplication.a(), f, g, h);
    }
}
