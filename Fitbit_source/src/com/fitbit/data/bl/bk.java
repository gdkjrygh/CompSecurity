// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.os.Build;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.bluetooth.support.a;
import com.fitbit.bluetooth.support.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao

public class bk extends e
{

    public static final String a = "SyncBluetoothSupportStatusOperation";

    public bk(bs bs1, boolean flag)
    {
        super(bs1, flag, false);
    }

    private static boolean a(BluetoothSupportStatus bluetoothsupportstatus)
    {
        if (bluetoothsupportstatus != null && bluetoothsupportstatus.a() == com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.d)
        {
            if ((bluetoothsupportstatus = com.fitbit.bluetooth.support.a.a().b()) == null || bluetoothsupportstatus != null && bluetoothsupportstatus.a() != com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.d)
            {
                return true;
            }
        }
        return false;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        a1 = e().a().a("android", android.os.Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL, Build.DISPLAY, b.a());
        a1 = e().b().T(a1);
        boolean flag = a(((BluetoothSupportStatus) (a1)));
        com.fitbit.bluetooth.support.a.a().a(a1);
        com.fitbit.galileo.a.a.a(flag);
    }

    public String c()
    {
        return "SyncBluetoothSupportStatusOperation";
    }
}
