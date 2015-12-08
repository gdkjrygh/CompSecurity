// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            BleScanCallback

public class com.google.android.gms.fitness.request.a extends l.a
{
    public static class a
    {

        private static final a VD = new a();
        private final Map VE = new HashMap();

        public static a jP()
        {
            return VD;
        }

        public com.google.android.gms.fitness.request.a a(BleScanCallback blescancallback)
        {
            Map map = VE;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.a a2 = (com.google.android.gms.fitness.request.a)VE.get(blescancallback);
            com.google.android.gms.fitness.request.a a1;
            a1 = a2;
            if (a2 != null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            a1 = new com.google.android.gms.fitness.request.a(blescancallback);
            VE.put(blescancallback, a1);
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
            Map map = VE;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.a a1 = (com.google.android.gms.fitness.request.a)VE.get(blescancallback);
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


    private final BleScanCallback VC;

    private com.google.android.gms.fitness.request.a(BleScanCallback blescancallback)
    {
        VC = (BleScanCallback)jx.i(blescancallback);
    }


    public void onDeviceFound(BleDevice bledevice)
        throws RemoteException
    {
        VC.onDeviceFound(bledevice);
    }

    public void onScanStopped()
        throws RemoteException
    {
        VC.onScanStopped();
    }
}
