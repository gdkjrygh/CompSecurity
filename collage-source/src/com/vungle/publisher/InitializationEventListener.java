// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.device.data.AppFingerprintManager;
import com.vungle.publisher.env.SdkConfig;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.exception.ExceptionManager;
import com.vungle.publisher.protocol.ProtocolHttpGateway;
import com.vungle.publisher.reporting.AdReportManager;
import java.util.List;

// Referenced classes of package com.vungle.publisher:
//            by, dg, bh, bw, 
//            ag, cq, cu

public class InitializationEventListener extends by
{
    static class GlobalEventListener extends by
    {

        AppFingerprintManager a;

        public void onEvent(ag ag)
        {
            a.a();
        }

        public void onEvent(cq cq)
        {
            a.a();
        }

        GlobalEventListener()
        {
        }
    }

    static class InitialConfigUpdatedEventListener extends by
    {

        ExceptionManager a;

        public void onEvent(cq cq)
        {
            Object obj;
            unregister();
            obj = a;
            int j;
            if (!((ExceptionManager) (obj)).b.b())
            {
                break MISSING_BLOCK_LABEL_98;
            }
            Logger.v("VungleData", "sdk configured to send logged exceptions");
            cq = ((ExceptionManager) (obj)).c.d(10);
            j = cq.size();
            if (j > 0)
            {
                try
                {
                    Logger.d("VungleData", (new StringBuilder("sending ")).append(j).append(" logged exceptions").toString());
                    obj = ((ExceptionManager) (obj)).a;
                    ((cu) (obj)).e.a(new cu._cls1(((cu) (obj)), cq), com.vungle.publisher.async.ScheduledPriorityExecutor.b.t);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (cq cq)
                {
                    Logger.e("VungleData", "error sending exceptions. irony?", cq);
                }
            }
            break MISSING_BLOCK_LABEL_115;
            Logger.v("VungleData", "sdk not configured to send logged exceptions");
            return;
        }

        InitialConfigUpdatedEventListener()
        {
        }
    }


    AdManager a;
    ScheduledPriorityExecutor b;
    ProtocolHttpGateway c;
    AdReportManager d;
    InitialConfigUpdatedEventListener e;
    GlobalEventListener f;
    SdkState g;
    private final dg i = new dg();

    public InitializationEventListener()
    {
    }

    private void a()
    {
        unregister();
        b.a(new _cls1(), 2000L);
    }

    public void onEvent(bh bh)
    {
        Logger.d("VungleDatabase", "on database ready");
        if (i.a(0) == 3)
        {
            a();
        }
    }

    public void onEvent(bw bw)
    {
        Logger.d("VungleDevice", "device ID available");
        if (i.a(1) == 3)
        {
            a();
        }
    }

    /* member class not found */
    class _cls1 {}

}
