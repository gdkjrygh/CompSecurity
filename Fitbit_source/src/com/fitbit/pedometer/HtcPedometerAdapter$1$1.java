// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.e.a;
import com.htc.lib2.activeservice.TransportModeListener;
import com.htc.lib2.activeservice.TransportModeRecord;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            h, HtcPedometerAdapter, g, e

class a
    implements Runnable
{

    final TransportModeRecord a;
    final d b;

    public void run()
    {
        boolean flag1 = true;
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(a);
        com.fitbit.pedometer.h.a().b(((List) (obj)));
        obj = com.fitbit.pedometer.HtcPedometerAdapter.a(b.b, new TransportModeRecord[] {
            a
        });
        if (obj != null && !((List) (obj)).isEmpty() && com.fitbit.pedometer.HtcPedometerAdapter.a(b.b) != null && b.b.a != null)
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "Storing Pedometer units in LiveDataCollector...", new Object[0]);
            com.fitbit.pedometer.HtcPedometerAdapter.a(b.b).a(((List) (obj)));
            b.b.a.b(com.fitbit.pedometer.HtcPedometerAdapter.a(b.b).a(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.b).b(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.b).c());
            return;
        }
        obj = (new StringBuilder()).append("Unable to store Pedometer units in LiveDataCollector: collector is null = ");
        boolean flag;
        if (com.fitbit.pedometer.HtcPedometerAdapter.a(b.b) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((StringBuilder) (obj)).append(flag).append(", listener is null = ");
        if (b.b.a == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.fitbit.e.a.d("HtcPedometerAdapter", ((StringBuilder) (obj)).append(flag).toString(), new Object[0]);
    }

    d(d d, TransportModeRecord transportmoderecord)
    {
        b = d;
        a = transportmoderecord;
        super();
    }

    // Unreferenced inner class com/fitbit/pedometer/HtcPedometerAdapter$1

/* anonymous class */
    class HtcPedometerAdapter._cls1
        implements TransportModeListener
    {

        final HtcPedometerAdapter a;

        public void onTransportModeChanged(TransportModeRecord transportmoderecord)
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Received record from HtcActiveManager: ").append(transportmoderecord).toString(), new Object[0]);
            com.fitbit.pedometer.e.a(new HtcPedometerAdapter._cls1._cls1(this, transportmoderecord));
        }

            
            {
                a = htcpedometeradapter;
                super();
            }
    }

}
