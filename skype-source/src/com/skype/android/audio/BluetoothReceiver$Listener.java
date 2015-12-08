// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.skype.android.audio:
//            BluetoothReceiver

public static interface 
{

    public abstract void deviceConnected(BluetoothDevice bluetoothdevice);

    public abstract void deviceDisconnected(BluetoothDevice bluetoothdevice);

    public abstract void scoConnected();

    public abstract void scoDisconnected();
}
