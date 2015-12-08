// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.service:
//            SensorEventDispatcher

class b
    implements SensorEventDispatcher
{

    private final k UA;

    b(k k1)
    {
        UA = (k)o.i(k1);
    }

    public void publish(DataPoint datapoint)
        throws RemoteException
    {
        UA.c(datapoint);
    }

    public void publish(List list)
        throws RemoteException
    {
        for (list = list.iterator(); list.hasNext(); publish((DataPoint)list.next())) { }
    }
}
