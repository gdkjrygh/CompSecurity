// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.h;
import com.fitbit.galileo.tasks.aa;
import com.fitbit.galileo.tasks.l;
import java.util.UUID;

// Referenced classes of package com.fitbit.livedata:
//            a

class ooth.h extends h
{

    final com.fitbit.livedata.a a;

    protected void a(UUID uuid)
    {
    }

    protected void b(UUID uuid)
    {
        com.fitbit.livedata.a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (com.fitbit.livedata.a.a(a) == null || !uuid.equals(com.fitbit.livedata.a.a(a).i())) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to find tracker.", new Object[0]);
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.b(a);
_L5:
        return;
_L2:
        if (com.fitbit.livedata.a.c(a) == null || !uuid.equals(com.fitbit.livedata.a.c(a).i())) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to enable LiveData.", new Object[0]);
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.b(a);
          goto _L5
        uuid;
        a1;
        JVM INSTR monitorexit ;
        throw uuid;
_L4:
        if (com.fitbit.livedata.a.d(a) == null || !uuid.equals(com.fitbit.livedata.a.d(a).i())) goto _L5; else goto _L6
_L6:
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.e(a);
          goto _L5
    }

    protected void c(UUID uuid)
    {
        com.fitbit.livedata.a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (com.fitbit.livedata.a.a(a) == null || !uuid.equals(com.fitbit.livedata.a.a(a).i())) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Tracker is found. Authenticating...", new Object[0]);
        uuid = com.fitbit.livedata.a.a(a).a();
        com.fitbit.livedata.a.a(a, null);
        if (uuid != null) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Tracker not found. Stop streaming.", new Object[0]);
        com.fitbit.livedata.a.b(a);
_L5:
        a1;
        JVM INSTR monitorexit ;
        return;
_L4:
        com.fitbit.livedata.a.a(a, uuid);
          goto _L5
        uuid;
        a1;
        JVM INSTR monitorexit ;
        throw uuid;
_L2:
        if (com.fitbit.livedata.a.c(a) == null || !uuid.equals(com.fitbit.livedata.a.c(a).i())) goto _L7; else goto _L6
_L6:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "LiveData enabled.", new Object[0]);
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.f(a);
          goto _L5
_L7:
        if (com.fitbit.livedata.a.d(a) == null || !uuid.equals(com.fitbit.livedata.a.d(a).i())) goto _L5; else goto _L8
_L8:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "LiveData disabled.", new Object[0]);
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.e(a);
          goto _L5
    }

    protected void d(UUID uuid)
    {
        com.fitbit.livedata.a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (com.fitbit.livedata.a.a(a) == null || !uuid.equals(com.fitbit.livedata.a.a(a).i())) goto _L2; else goto _L1
_L1:
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.e(a);
_L5:
        return;
_L2:
        if (com.fitbit.livedata.a.c(a) == null || !uuid.equals(com.fitbit.livedata.a.c(a).i())) goto _L4; else goto _L3
_L3:
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.e(a);
          goto _L5
        uuid;
        a1;
        JVM INSTR monitorexit ;
        throw uuid;
_L4:
        if (com.fitbit.livedata.a.d(a) == null || !uuid.equals(com.fitbit.livedata.a.d(a).i())) goto _L5; else goto _L6
_L6:
        com.fitbit.livedata.a.a(a, null);
        com.fitbit.livedata.a.e(a);
          goto _L5
    }

    .h(com.fitbit.livedata.a a1)
    {
        a = a1;
        super();
    }
}
