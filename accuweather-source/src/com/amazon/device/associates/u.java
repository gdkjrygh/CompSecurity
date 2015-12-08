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
//            ao, ReceiptsRequest, Offset, ReceiptsResponse, 
//            ay, x, aw, RequestId

final class u extends ao
{

    private static final String b = com/amazon/device/associates/u.getSimpleName();

    u(RequestId requestid, ReceiptsRequest receiptsrequest, ay ay1)
    {
        super("physical_get_receipts", "1.0", requestid, ay1);
        a("offset", receiptsrequest.getOffset().toString());
        a(false);
    }

    protected void a()
    {
        ReceiptsResponse receiptsresponse = new ReceiptsResponse(b(), ReceiptsResponse.Status.NOT_SUPPORTED);
        a.a(ay.a.b, receiptsresponse);
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        ReceiptsResponse receiptsresponse;
        x.b(b, "onSuccess");
        receiptsresponse = new ReceiptsResponse(b(), ReceiptsResponse.Status.FAILED);
        ReceiptsResponse.Status status;
        successresult = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        if (successresult.containsKey("errorMessage"))
        {
            Log.e(b, (String)successresult.get("errorMessage"));
        }
        status = ReceiptsResponse.Status.valueOf((String)successresult.get("requestStatus"));
        if (status != ReceiptsResponse.Status.SUCCESSFUL) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        String s;
        String s2;
        JSONArray jsonarray;
        s = (String)successresult.get("userId");
        s2 = (String)successresult.get("deviceId");
        arraylist = new ArrayList();
        jsonarray = new JSONArray((String)successresult.get("receipts"));
        int i = 0;
_L10:
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        org.json.JSONObject jsonobject = jsonarray.getJSONObject(i);
        if (!a(s, s2, jsonobject)) goto _L6; else goto _L5
_L5:
        arraylist.add(aw.b(jsonobject));
          goto _L7
_L6:
        x.a(b, (new StringBuilder()).append("receipt verification failed: ").append(jsonobject).toString());
          goto _L7
        Exception exception;
        exception;
        x.a(b, (new StringBuilder()).append("error in parsing a receipt: ").append(jsonobject).toString());
          goto _L7
_L8:
        a.a(ay.a.b, successresult);
        return;
_L4:
        try
        {
            String s1 = (String)successresult.get("offset");
            boolean flag = Boolean.parseBoolean((String)successresult.get("hasMore"));
            successresult = new ReceiptsResponse(b(), status, arraylist, Offset.fromString(s1), flag);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult).toString());
            successresult = receiptsresponse;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        successresult = new ReceiptsResponse(b(), status);
        if (true) goto _L8; else goto _L7
_L7:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

}
