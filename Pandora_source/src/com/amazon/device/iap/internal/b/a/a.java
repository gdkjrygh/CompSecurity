// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.b.a:
//            c

public final class a extends c
{

    private static final String a = com/amazon/device/iap/internal/b/a/a.getSimpleName();

    public a(com.amazon.device.iap.internal.b.e e1)
    {
        super(e1, "2.0");
    }

    protected boolean a(SuccessResult successresult)
        throws Exception
    {
        successresult = successresult.getData();
        e.a(a, (new StringBuilder()).append("data: ").append(successresult).toString());
        Object obj1 = (String)getCommandData().get("requestId");
        Object obj = (String)successresult.get("userId");
        String s = (String)successresult.get("marketplace");
        successresult = (String)successresult.get("receipt");
        if (d.a(successresult))
        {
            a(((String) (obj)), s, ((String) (obj1)), com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        successresult = new JSONObject(successresult);
        com.amazon.device.iap.model.PurchaseResponse.RequestStatus requeststatus = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.safeValueOf(successresult.getString("orderStatus"));
        if (requeststatus == com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL)
        {
            try
            {
                successresult = com.amazon.device.iap.internal.util.a.a(successresult, ((String) (obj)), ((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (SuccessResult successresult)
            {
                a(((String) (obj)), s, ((String) (obj1)), com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else
        {
            successresult = null;
        }
        obj1 = b();
        obj = (new UserDataBuilder()).setUserId(((String) (obj))).setMarketplace(s).build();
        successresult = (new PurchaseResponseBuilder()).setRequestId(((com.amazon.device.iap.internal.b.e) (obj1)).c()).setRequestStatus(requeststatus).setUserData(((com.amazon.device.iap.model.UserData) (obj))).setReceipt(successresult).build();
        ((com.amazon.device.iap.internal.b.e) (obj1)).d().a(successresult);
        return true;
    }

}
