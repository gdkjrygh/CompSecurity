// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.venezia.command.SuccessResult;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            ao, PurchaseExperience, ServiceStatusResponse, ay, 
//            x, UserData, RequestId

final class d extends ao
{

    private static final String b = com/amazon/device/associates/d.getSimpleName();
    private final Set c = new HashSet();
    private boolean d;
    private boolean e;

    d(RequestId requestid, ay ay1)
    {
        super("get_userData", "1.0", requestid, ay1);
        c.add(PurchaseExperience.DIRECT_WITH_DETAIL);
        c.add(PurchaseExperience.DIRECT_WITH_PREVIEW);
        d = false;
        e = false;
        a(false);
    }

    protected void a()
    {
        ServiceStatusResponse servicestatusresponse = new ServiceStatusResponse(b(), null, c, d, e);
        a.a(ay.a.a, servicestatusresponse);
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        x.b(b, "onSuccess");
        successresult = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        if (successresult.containsKey("errorMessage"))
        {
            Log.e(b, (String)successresult.get("errorMessage"));
        }
        if (!((String)successresult.get("requestStatus")).equals("SUCCESSFUL")) goto _L2; else goto _L1
_L1:
        String s = (String)successresult.get("userId");
        String s1 = (String)successresult.get("marketplace");
        if (((Set)successresult.get("availableProductTypes")).contains("PHYSICAL"))
        {
            c.add(PurchaseExperience.IN_APP);
            d = true;
            e = true;
        }
        successresult = new ServiceStatusResponse(b(), new UserData(s, s1), c, d, e);
_L4:
        a.a(ay.a.a, successresult);
        return;
_L2:
        try
        {
            successresult = new ServiceStatusResponse(b(), new UserData(null, null), c, d, e);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult).toString());
            successresult = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
