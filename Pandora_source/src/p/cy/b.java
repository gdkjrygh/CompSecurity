// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cy;

import android.bluetooth.BluetoothAdapter;

// Referenced classes of package p.cy:
//            c

public class b
{

    public static boolean a()
    {
        return BluetoothAdapter.getDefaultAdapter() != null;
    }

    public static boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
    }

    public static c c()
    {
        int i = android.os.Build.VERSION.SDK_INT;
        Object obj = "com.pandora.android.api.bluetooth.DeviceProfile11";
        if (i < 11)
        {
            obj = "com.pandora.android.api.bluetooth.DeviceProfile5";
        }
        try
        {
            obj = (c)Class.forName(((String) (obj))).newInstance();
        }
        catch (Exception exception)
        {
            return new c();
        }
        return ((c) (obj));
    }
}
