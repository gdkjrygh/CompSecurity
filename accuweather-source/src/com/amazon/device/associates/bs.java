// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

// Referenced classes of package com.amazon.device.associates:
//            ao, PurchaseResponse, ay, x, 
//            aw, RequestId

final class bs extends ao
{

    private static final String b = com/amazon/device/associates/bs.getSimpleName();

    bs(RequestId requestid, ay ay1)
    {
        super("physical_get_purchaseResult", "1.0", requestid, ay1);
        a(false);
    }

    protected void a()
    {
        PurchaseResponse purchaseresponse = new PurchaseResponse(b(), PurchaseResponse.Status.NOT_SUPPORTED);
        a.a(ay.a.e, purchaseresponse);
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        PurchaseResponse purchaseresponse;
        x.b(b, "onSuccess");
        purchaseresponse = new PurchaseResponse(b(), PurchaseResponse.Status.FAILED);
        Object obj;
        obj = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(obj).toString());
        if (((Map) (obj)).containsKey("errorMessage"))
        {
            Log.e(b, (String)((Map) (obj)).get("errorMessage"));
        }
        successresult = PurchaseResponse.Status.valueOf((String)((Map) (obj)).get("requestStatus"));
        if (successresult != PurchaseResponse.Status.SUCCESSFUL) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        ArrayList arraylist;
        s = (String)((Map) (obj)).get("userId");
        s1 = (String)((Map) (obj)).get("deviceId");
        arraylist = new ArrayList();
        if (!((Map) (obj)).containsKey("receipts") || ((Map) (obj)).get("receipts") == null) goto _L4; else goto _L3
_L3:
        obj = new JSONArray((String)((Map) (obj)).get("receipts"));
        int i = 0;
_L11:
        if (i >= ((JSONArray) (obj)).length()) goto _L4; else goto _L5
_L5:
        org.json.JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        if (!a(s, s1, jsonobject)) goto _L7; else goto _L6
_L6:
        arraylist.add(aw.b(jsonobject));
          goto _L8
_L7:
        x.a(b, (new StringBuilder()).append("receipt verification failed: ").append(jsonobject).toString());
          goto _L8
        Exception exception;
        exception;
        x.a(b, (new StringBuilder()).append("error in parsing a receipt: ").append(jsonobject).toString());
          goto _L8
_L9:
        a.a(ay.a.e, successresult);
        return;
_L4:
        try
        {
            successresult = new PurchaseResponse(b(), successresult, arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult.getMessage()).toString());
            successresult = purchaseresponse;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        successresult = new PurchaseResponse(b(), successresult);
        if (true) goto _L9; else goto _L8
_L8:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
    }

}
