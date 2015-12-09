// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Intent;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth:
//            BluetoothErrorsHandler

class a extends c
{

    final BluetoothErrorsHandler a;

    protected void a(Intent intent)
    {
        if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED".equals(intent.getAction()) && !e.b())
        {
            BluetoothErrorsHandler.d(a);
        }
    }

    (BluetoothErrorsHandler bluetootherrorshandler)
    {
        a = bluetootherrorshandler;
        super();
    }
}
