// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.UUID;

public final class eyn
{

    public final UUID a = UUID.fromString("cc2be520-4e4b-11e4-8081-0002a5d5c51b");
    public BluetoothAdapter b;
    public String c;

    public eyn(BluetoothAdapter bluetoothadapter)
    {
        b = bluetoothadapter;
    }

    public final boolean a(Context context)
    {
        while (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || b == null || !b.isMultipleAdvertisementSupported()) 
        {
            return false;
        }
        return true;
    }
}
