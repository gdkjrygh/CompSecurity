// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.d;

import com.amazon.device.iap.internal.b.a;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.amazon.device.iap.internal.b.d:
//            b

public final class c extends b
{

    private static final String b = com/amazon/device/iap/internal/b/d/c.getSimpleName();

    public c(com.amazon.device.iap.internal.b.e e1, boolean flag)
    {
        super(e1, "2.0", flag);
    }

    private List a(String s, String s1, String s2)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        s1 = new JSONArray(s1);
        int i = 0;
        while (i < s1.length()) 
        {
            try
            {
                arraylist.add(com.amazon.device.iap.internal.util.a.a(s1.getJSONObject(i), s, s2));
            }
            catch (a a1)
            {
                e.b(b, (new StringBuilder()).append("fail to parse receipt, requestId:").append(a1.a()).toString());
            }
            catch (d d1)
            {
                e.b(b, (new StringBuilder()).append("fail to verify receipt, requestId:").append(d1.a()).toString());
            }
            catch (Throwable throwable)
            {
                e.b(b, (new StringBuilder()).append("fail to verify receipt, requestId:").append(throwable.getMessage()).toString());
            }
            i++;
        }
        return arraylist;
    }

    protected boolean a(SuccessResult successresult)
        throws Exception
    {
        Object obj1 = successresult.getData();
        e.a(b, (new StringBuilder()).append("data: ").append(obj1).toString());
        Object obj = (String)((Map) (obj1)).get("userId");
        String s = (String)((Map) (obj1)).get("marketplace");
        successresult = (String)((Map) (obj1)).get("requestId");
        List list = a(((String) (obj)), (String)((Map) (obj1)).get("receipts"), ((String) (successresult)));
        successresult = (String)((Map) (obj1)).get("cursor");
        boolean flag = Boolean.valueOf((String)((Map) (obj1)).get("hasMore")).booleanValue();
        obj1 = b();
        obj = (new UserDataBuilder()).setUserId(((String) (obj))).setMarketplace(s).build();
        obj = (new PurchaseUpdatesResponseBuilder()).setRequestId(((com.amazon.device.iap.internal.b.e) (obj1)).c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(((com.amazon.device.iap.model.UserData) (obj))).setReceipts(list).setHasMore(flag).build();
        ((com.amazon.device.iap.internal.b.e) (obj1)).d().a("newCursor", successresult);
        ((com.amazon.device.iap.internal.b.e) (obj1)).d().a(obj);
        return true;
    }

}
