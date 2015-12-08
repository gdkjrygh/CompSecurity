// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.amazon.device.associates:
//            ao, SearchByIdRequest, SearchByIdResponse, ay, 
//            x, aw, RequestId

final class bf extends ao
{

    private static final String b = com/amazon/device/associates/bf.getSimpleName();

    bf(RequestId requestid, SearchByIdRequest searchbyidrequest, ay ay1)
    {
        super("physical_searchById", "1.0", requestid, ay1);
        a("productIds", searchbyidrequest.getProductIds());
        a(false);
    }

    protected void a()
    {
        SearchByIdResponse searchbyidresponse = new SearchByIdResponse(b(), SearchByIdResponse.Status.NOT_SUPPORTED);
        a.a(ay.a.d, searchbyidresponse);
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        SearchByIdResponse searchbyidresponse;
        x.b(b, "onSuccess");
        searchbyidresponse = new SearchByIdResponse(b(), SearchByIdResponse.Status.FAILED);
        Object obj;
        Object obj1;
        obj = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(obj).toString());
        if (((Map) (obj)).containsKey("errorMessage"))
        {
            Log.e(b, (String)((Map) (obj)).get("errorMessage"));
        }
        successresult = SearchByIdResponse.Status.valueOf((String)((Map) (obj)).get("requestStatus"));
        if (successresult != SearchByIdResponse.Status.SUCCESSFUL)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        obj1 = (String)((Map) (obj)).get("userId");
        obj1 = new ArrayList();
        aw.c(new JSONArray((String)((Map) (obj)).get("products")), ((java.util.Collection) (obj1)));
_L1:
        obj = (Set)((Map) (obj)).get("unavailableProductIds");
        successresult = new SearchByIdResponse(b(), successresult, ((java.util.List) (obj1)), ((Set) (obj)));
_L2:
        a.a(ay.a.d, successresult);
        return;
        JSONException jsonexception;
        jsonexception;
        x.a(b, (new StringBuilder()).append("Error parsing JSON for products: ").append(jsonexception.getMessage()).toString());
          goto _L1
        try
        {
            successresult = new SearchByIdResponse(b(), successresult);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult.getMessage()).toString());
            successresult = searchbyidresponse;
        }
          goto _L2
    }

}
