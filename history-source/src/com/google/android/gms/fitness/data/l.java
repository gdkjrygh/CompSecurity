// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.RemoteException;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint

public class l extends k.a
{
    public static class a
    {

        private static final a UG = new a();
        private final Map UH = new HashMap();

        public static a jG()
        {
            return UG;
        }

        public l a(OnDataPointListener ondatapointlistener)
        {
            Map map = UH;
            map;
            JVM INSTR monitorenter ;
            l l2 = (l)UH.get(ondatapointlistener);
            l l1;
            l1 = l2;
            if (l2 != null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            l1 = new l(ondatapointlistener);
            UH.put(ondatapointlistener, l1);
            map;
            JVM INSTR monitorexit ;
            return l1;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        public l b(OnDataPointListener ondatapointlistener)
        {
            synchronized (UH)
            {
                ondatapointlistener = (l)UH.get(ondatapointlistener);
            }
            return ondatapointlistener;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        public l c(OnDataPointListener ondatapointlistener)
        {
            Map map = UH;
            map;
            JVM INSTR monitorenter ;
            l l1 = (l)UH.remove(ondatapointlistener);
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            map;
            JVM INSTR monitorexit ;
            return l1;
            ondatapointlistener = new l(ondatapointlistener);
            map;
            JVM INSTR monitorexit ;
            return ondatapointlistener;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }


        private a()
        {
        }
    }


    private final OnDataPointListener UF;

    private l(OnDataPointListener ondatapointlistener)
    {
        UF = (OnDataPointListener)jx.i(ondatapointlistener);
    }


    public void c(DataPoint datapoint)
        throws RemoteException
    {
        UF.onDataPoint(datapoint);
    }
}
