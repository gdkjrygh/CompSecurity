// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.Intent;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.a.f;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoServicesStateListener

class a extends c
{

    final GalileoServicesStateListener a;

    public void a(Intent intent)
    {
        Object obj = intent.getAction();
        if (!"com.fitbit.galileo.GALILEO_TRACKER_SEARCH_IS_TOO_LONG".equals(obj)) goto _L2; else goto _L1
_L1:
        if (GalileoServicesStateListener.a(a) == lileoState.b)
        {
            a.a(com.fitbit.galileo.service.lileoState.c);
        }
_L4:
        return;
_L2:
        if (!"com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(obj)) goto _L4; else goto _L3
_L3:
        intent = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS");
        if (!e.a(intent)) goto _L4; else goto _L5
_L5:
        intent = p.c(f.a(e.c(intent)));
        if (intent == null) goto _L4; else goto _L6
_L6:
        intent = intent.c();
        this;
        JVM INSTR monitorenter ;
        obj = a.a(intent);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (com.fitbit.galileo.protocol.commands..c(((com.fitbit.galileo.protocol.commands..c) (obj))))
        {
            a.b(intent);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    eType(GalileoServicesStateListener galileoservicesstatelistener)
    {
        a = galileoservicesstatelistener;
        super();
    }
}
