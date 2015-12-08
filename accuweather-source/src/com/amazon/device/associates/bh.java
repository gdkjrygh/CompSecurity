// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            bg, PurchaseExperience, ServiceStatusResponse, ay, 
//            PurchaseResponse, p, RequestId

final class bh
    implements bg
{

    private static final String a = com/amazon/device/associates/bh.getSimpleName();

    bh()
    {
    }

    private void a(ay ay1, RequestId requestid)
    {
        HashSet hashset = new HashSet();
        hashset.add(PurchaseExperience.DIRECT_WITH_DETAIL);
        hashset.add(PurchaseExperience.DIRECT_WITH_PREVIEW);
        requestid = new ServiceStatusResponse(requestid, null, hashset, false, false);
        ay1.a(ay.a.a, requestid);
    }

    private void b(ay ay1, RequestId requestid)
    {
        requestid = new PurchaseResponse(requestid, PurchaseResponse.Status.SUCCESSFUL);
        ay1.a(ay.a.e, requestid);
    }

    public void a(Context context, Intent intent, ay ay1)
    {
        p.c(a, "handleResponse");
        try
        {
            p.c(a, (new StringBuilder()).append("Intent action received from Dummy Response Receiver:").append(intent.getAction()).toString());
            context = intent.getAction();
            intent = RequestId.a(intent.getStringExtra("requestId"));
            if (context.equalsIgnoreCase("com.amazon.device.iap.physical.get_serviceStatus"))
            {
                a(ay1, ((RequestId) (intent)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.c(a, (new StringBuilder()).append("error in handleResponse: ").append(context).toString());
            return;
        }
        if (context.equalsIgnoreCase("com.amazon.device.iap.physical.physical_purchase"))
        {
            b(ay1, intent);
            return;
        }
        p.c(a, (new StringBuilder()).append("response with unknown command: ").append(context).toString());
        return;
    }

}
