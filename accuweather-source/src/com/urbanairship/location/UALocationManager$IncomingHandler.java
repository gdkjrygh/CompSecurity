// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager, LocationListener, PendingLocationResult

private static class A extends Handler
{

    public void handleMessage(Message message)
    {
        Object obj = UALocationManager.shared();
        message.what;
        JVM INSTR tableswitch 3 4: default 32
    //                   3 38
    //                   4 102;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
_L5:
        return;
_L2:
        Location location = (Location)message.obj;
        if (location == null) goto _L5; else goto _L4
_L4:
        message = UALocationManager.access$300(((UALocationManager) (obj)));
        message;
        JVM INSTR monitorenter ;
        for (obj = UALocationManager.access$300(((UALocationManager) (obj))).iterator(); ((Iterator) (obj)).hasNext(); ((LocationListener)((Iterator) (obj)).next()).onLocationChanged(location)) { }
          goto _L6
        obj;
        message;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
        message;
        JVM INSTR monitorexit ;
        return;
_L3:
        int i;
        location = (Location)message.obj;
        i = message.arg1;
        message = UALocationManager.access$400(((UALocationManager) (obj)));
        message;
        JVM INSTR monitorenter ;
        PendingLocationResult pendinglocationresult = (PendingLocationResult)UALocationManager.access$400(((UALocationManager) (obj))).get(i);
        if (pendinglocationresult == null) goto _L8; else goto _L7
_L7:
        pendinglocationresult.setResult(location);
        UALocationManager.access$400(((UALocationManager) (obj))).remove(i);
        UALocationManager.access$200(((UALocationManager) (obj)));
_L8:
        message;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    A(Looper looper)
    {
        super(looper);
    }
}
