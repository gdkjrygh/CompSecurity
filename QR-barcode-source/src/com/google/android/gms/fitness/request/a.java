// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            BleScanCallback

public class com.google.android.gms.fitness.request.a extends l.a
{
    public static class a
    {

        private static final a Ug = new a();
        private final Map Uh = new HashMap();

        public static a je()
        {
            return Ug;
        }

        public com.google.android.gms.fitness.request.a a(BleScanCallback blescancallback)
        {
            Map map = Uh;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.a a2 = (com.google.android.gms.fitness.request.a)Uh.get(blescancallback);
            com.google.android.gms.fitness.request.a a1;
            a1 = a2;
            if (a2 != null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            a1 = new com.google.android.gms.fitness.request.a(blescancallback);
            Uh.put(blescancallback, a1);
            map;
            JVM INSTR monitorexit ;
            return a1;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }

        public com.google.android.gms.fitness.request.a b(BleScanCallback blescancallback)
        {
            Map map = Uh;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.a a1 = (com.google.android.gms.fitness.request.a)Uh.get(blescancallback);
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            map;
            JVM INSTR monitorexit ;
            return a1;
            blescancallback = new com.google.android.gms.fitness.request.a(blescancallback);
            map;
            JVM INSTR monitorexit ;
            return blescancallback;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }


        private a()
        {
        }
    }


    private final BleScanCallback Uf;

    private com.google.android.gms.fitness.request.a(BleScanCallback blescancallback)
    {
        Uf = (BleScanCallback)o.i(blescancallback);
    }


    public void onDeviceFound(BleDevice bledevice)
        throws RemoteException
    {
        Uf.onDeviceFound(bledevice);
    }

    public void onScanStopped()
        throws RemoteException
    {
        Uf.onScanStopped();
    }
}
