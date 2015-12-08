// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.a;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.b.a:
//            c

public final class b extends c
{

    private static final String a = com/amazon/device/iap/internal/b/a/b.getSimpleName();

    public b(com.amazon.device.iap.internal.b.e e1)
    {
        super(e1, "1.0");
    }

    private void a(String s, String s1, String s2)
    {
        if (s != null && s1 != null && s2 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (com.amazon.device.iap.model.PurchaseResponse.RequestStatus.safeValueOf(((JSONObject) (obj = new JSONObject(s2))).getString("orderStatus")) != com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL) goto _L1; else goto _L3
_L3:
        obj = com.amazon.device.iap.internal.util.a.a(((JSONObject) (obj)), s1, s);
        com.amazon.device.iap.internal.c.a.a().a(s, s1, ((Receipt) (obj)).getReceiptId(), s2);
        return;
        s;
        e.b(a, (new StringBuilder()).append("Error in savePendingReceipt: ").append(s).toString());
        return;
    }

    protected boolean a(SuccessResult successresult)
        throws Exception
    {
        successresult = successresult.getData();
        e.a(a, (new StringBuilder()).append("data: ").append(successresult).toString());
        Object obj1 = (String)getCommandData().get("requestId");
        Object obj = (String)successresult.get("userId");
        String s = (String)successresult.get("marketplace");
        String s1 = (String)successresult.get("receipt");
        if (obj1 == null || !com.amazon.device.iap.internal.c.b.a().a(((String) (obj1))))
        {
            b().d().b();
            return true;
        }
        if (d.a(s1))
        {
            a(((String) (obj)), s, ((String) (obj1)), com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        successresult = new JSONObject(s1);
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
            if (ProductType.CONSUMABLE == successresult.getProductType())
            {
                a(((String) (obj1)), ((String) (obj)), s1);
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
