// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.RemoteException;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint

public class l extends k.a
{
    public static class a
    {

        private static final a Tj = new a();
        private final Map Tk = new HashMap();

        public static a iV()
        {
            return Tj;
        }

        public l a(OnDataPointListener ondatapointlistener)
        {
            Map map = Tk;
            map;
            JVM INSTR monitorenter ;
            l l2 = (l)Tk.get(ondatapointlistener);
            l l1;
            l1 = l2;
            if (l2 != null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            l1 = new l(ondatapointlistener);
            Tk.put(ondatapointlistener, l1);
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
            synchronized (Tk)
            {
                ondatapointlistener = (l)Tk.get(ondatapointlistener);
            }
            return ondatapointlistener;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        public l c(OnDataPointListener ondatapointlistener)
        {
            Map map = Tk;
            map;
            JVM INSTR monitorenter ;
            l l1 = (l)Tk.remove(ondatapointlistener);
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


    private final OnDataPointListener Ti;

    private l(OnDataPointListener ondatapointlistener)
    {
        Ti = (OnDataPointListener)o.i(ondatapointlistener);
    }


    public void c(DataPoint datapoint)
        throws RemoteException
    {
        Ti.onDataPoint(datapoint);
    }
}
