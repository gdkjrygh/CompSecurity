// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.d;

import com.amazon.device.iap.internal.b.a;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.c.c;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.amazon.device.iap.internal.b.d:
//            b

public final class d extends b
{

    private static final String b = com/amazon/device/iap/internal/b/d/d.getSimpleName();
    private static final Date c = new Date(0L);

    public d(com.amazon.device.iap.internal.b.e e1)
    {
        super(e1, "1.0", true);
    }

    protected boolean a(SuccessResult successresult)
        throws Exception
    {
        boolean flag = false;
        Object obj1 = successresult.getData();
        e.a(b, (new StringBuilder()).append("data: ").append(obj1).toString());
        successresult = (String)((Map) (obj1)).get("userId");
        Object obj = (String)((Map) (obj1)).get("requestId");
        String s = (String)((Map) (obj1)).get("marketplace");
        obj = new ArrayList();
        Object obj2 = new JSONArray((String)((Map) (obj1)).get("receipts"));
        int i = 0;
        while (i < ((JSONArray) (obj2)).length()) 
        {
            try
            {
                Receipt receipt = com.amazon.device.iap.internal.util.a.a(((JSONArray) (obj2)).getJSONObject(i), successresult, null);
                ((List) (obj)).add(receipt);
                if (ProductType.ENTITLED == receipt.getProductType())
                {
                    com.amazon.device.iap.internal.c.c.a().a(successresult, receipt.getReceiptId(), receipt.getSku());
                }
            }
            catch (a a1)
            {
                e.b(b, (new StringBuilder()).append("fail to parse receipt, requestId:").append(a1.a()).toString());
            }
            catch (com.amazon.device.iap.internal.b.d d1)
            {
                e.b(b, (new StringBuilder()).append("fail to verify receipt, requestId:").append(d1.a()).toString());
            }
            catch (Throwable throwable)
            {
                e.b(b, (new StringBuilder()).append("fail to verify receipt, requestId:").append(throwable.getMessage()).toString());
            }
            i++;
        }
        obj2 = new JSONArray((String)((Map) (obj1)).get("revocations"));
        i = ((flag) ? 1 : 0);
        while (i < ((JSONArray) (obj2)).length()) 
        {
            try
            {
                String s1 = ((JSONArray) (obj2)).getString(i);
                String s2 = com.amazon.device.iap.internal.c.c.a().a(successresult, s1);
                ((List) (obj)).add((new ReceiptBuilder()).setSku(s1).setProductType(ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(c).setReceiptId(s2).build());
            }
            catch (JSONException jsonexception)
            {
                e.b(b, (new StringBuilder()).append("fail to parse JSON[").append(i).append("] in \"").append(obj2).append("\"").toString());
            }
            i++;
        }
        obj2 = (String)((Map) (obj1)).get("cursor");
        boolean flag1 = "true".equalsIgnoreCase((String)((Map) (obj1)).get("hasMore"));
        obj1 = b();
        successresult = (new UserDataBuilder()).setUserId(successresult).setMarketplace(s).build();
        successresult = (new PurchaseUpdatesResponseBuilder()).setRequestId(((com.amazon.device.iap.internal.b.e) (obj1)).c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(successresult).setReceipts(((List) (obj))).setHasMore(flag1).build();
        obj = com.amazon.device.iap.internal.c.a.a().b(successresult.getUserData().getUserId());
        successresult.getReceipts().addAll(((java.util.Collection) (obj)));
        ((com.amazon.device.iap.internal.b.e) (obj1)).d().a(successresult);
        ((com.amazon.device.iap.internal.b.e) (obj1)).d().a("newCursor", obj2);
        return true;
    }

}
