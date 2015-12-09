// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.galileo.bluetooth.BluetoothWorker;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public class o extends BaseSynclairOperation
{

    private static final String a = "StartBluetoothWorkerOperation";
    private final BluetoothWorker e;

    public o(BluetoothWorker bluetoothworker)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.a);
        e = bluetoothworker;
    }

    static BluetoothWorker a(o o1)
    {
        return o1.e;
    }

    protected void o()
    {
        a(new _cls1());
    }

    protected String p()
    {
        return "StartBluetoothWorkerOperation";
    }

    /* member class not found */
    class _cls1 {}

}
