// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.a.f;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.galileo.tasks:
//            SearchMultipleTrackersTask

public abstract class aa extends SearchMultipleTrackersTask
{

    protected final String a;
    private BluetoothDevice c;

    public aa(List list, String s, SearchMultipleTrackersTask.ScanDuration scanduration)
    {
        super(list, scanduration);
        a = s;
    }

    public final BluetoothDevice a()
    {
        return c;
    }

    protected boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (!TextUtils.isEmpty(a))
        {
            BluetoothDevice bluetoothdevice = bluetoothconnectionservicestatus.h();
            if (bluetoothdevice != null && com.fitbit.galileo.a.f.a(a, com.fitbit.galileo.a.f.a(bluetoothdevice)))
            {
                c = bluetoothdevice;
                return true;
            }
        }
        return super.a(bluetoothconnectionservicestatus);
    }

    protected final boolean a(Map map)
    {
        if (c != null)
        {
            com.fitbit.e.a.a(c(), "Preferred tracker found: %s", new Object[] {
                c
            });
        } else
        {
            c = b(map);
            com.fitbit.e.a.a(c(), "Best tracker: %s", new Object[] {
                c
            });
        }
        return c != null;
    }

    protected abstract BluetoothDevice b(Map map);

    protected boolean b(GalileoTracker galileotracker)
    {
        if (!TextUtils.isEmpty(a) && com.fitbit.galileo.a.f.a(a, galileotracker.e()))
        {
            c = galileotracker.a();
            return true;
        } else
        {
            return false;
        }
    }

    public Object f()
    {
        return a();
    }
}
