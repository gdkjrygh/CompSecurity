// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.dominos.beacon.scanner:
//            PreLollipopScanner

class this._cls0
    implements android.bluetooth.anCallback
{

    final PreLollipopScanner this$0;

    public void onLeScan(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        if (abyte0 != null && abyte0.length > 0)
        {
            onBeaconResult(bluetoothdevice, i, abyte0);
        }
    }

    k()
    {
        this$0 = PreLollipopScanner.this;
        super();
    }
}
