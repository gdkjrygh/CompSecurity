// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ar, PurchaseExperience, ay, RequestId, 
//            x, PurchaseRequest, PurchaseResponse, ReceiptsResponse, 
//            ReceiptsRequest, SearchByIdResponse, SearchByIdRequest, SearchResponse, 
//            SearchRequest, FilterType, SortType, ServiceStatusResponse

final class ap
    implements ar
{

    private static final String a = com/amazon/device/associates/ap.getSimpleName();
    private ay b;
    private final Set c = new HashSet();
    private boolean d;
    private boolean e;

    ap()
    {
        d = false;
        e = false;
        c.add(PurchaseExperience.DIRECT_WITH_DETAIL);
        c.add(PurchaseExperience.DIRECT_WITH_PREVIEW);
    }

    private void a(RequestId requestid, String s, JSONObject jsonobject)
        throws JSONException
    {
        Intent intent = new Intent(s);
        Context context = b.b();
        Bundle bundle = new Bundle();
        jsonobject.put("sdkVersion", b.a());
        jsonobject.put("packageName", context.getPackageName());
        jsonobject.put("requestId", requestid.toString());
        bundle.putString("message", jsonobject.toString());
        x.b(a, (new StringBuilder()).append("action: ").append(s).append(", message: ").append(jsonobject.toString(4)).toString());
        intent.addFlags(0x10000000);
        intent.putExtras(bundle);
        context.startService(intent);
    }

    private boolean a()
    {
        for (Iterator iterator = b.b().getPackageManager().getInstalledPackages(0).iterator(); iterator.hasNext();)
        {
            if (((PackageInfo)iterator.next()).packageName.equals("com.amazon.sdktestclient"))
            {
                return true;
            }
        }

        return false;
    }

    public void a(RequestId requestid, PurchaseRequest purchaserequest, ay ay1)
    {
        x.b(a, "sendPurchaseRequest");
        b = ay1;
        if (!a() || purchaserequest.getPurchaseExperience() != null && purchaserequest.getPurchaseExperience() != PurchaseExperience.IN_APP)
        {
            requestid = new PurchaseResponse(requestid, PurchaseResponse.Status.NOT_SUPPORTED);
            ay1.a(ay.a.e, requestid);
            return;
        }
        try
        {
            ay1 = new JSONObject();
            ay1.put("productType", "PHYSICAL");
            ay1.put("productIds", new JSONArray((new StringBuilder()).append("[\"").append(purchaserequest.getProductId()).append("\"]").toString()));
            ay1.put("receiveReceipt", purchaserequest.getReceiveReceipt());
            a(requestid, "com.amazon.device.iap.physical.physical_purchase", ((JSONObject) (ay1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendPurchaseRequest.");
        }
    }

    public void a(RequestId requestid, ReceiptsRequest receiptsrequest, ay ay1)
    {
        x.b(a, "sendGetReceiptsRequest");
        b = ay1;
        if (!a())
        {
            requestid = new ReceiptsResponse(requestid, ReceiptsResponse.Status.NOT_SUPPORTED);
            ay1.a(ay.a.b, requestid);
            return;
        }
        try
        {
            ay1 = new JSONObject();
            ay1.put("offset", receiptsrequest.getOffset());
            a(requestid, "com.amazon.device.iap.physical.physical_get_receipts", ((JSONObject) (ay1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendGetReceiptsRequest.");
        }
    }

    public void a(RequestId requestid, SearchByIdRequest searchbyidrequest, ay ay1)
    {
        x.b(a, "sendSearchByIdRequest");
        b = ay1;
        if (!a())
        {
            requestid = new SearchByIdResponse(requestid, SearchByIdResponse.Status.NOT_SUPPORTED);
            ay1.a(ay.a.d, requestid);
            return;
        }
        try
        {
            ay1 = new JSONObject();
            ay1.put("productType", "PHYSICAL");
            ay1.put("productIds", new JSONArray(searchbyidrequest.getProductIds()));
            a(requestid, "com.amazon.device.iap.physical.physical_searchById", ((JSONObject) (ay1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendSearchByIdRequest.");
        }
    }

    public void a(RequestId requestid, SearchRequest searchrequest, ay ay1)
    {
        JSONObject jsonobject;
        x.b(a, "sendSearchRequest");
        b = ay1;
        if (!a())
        {
            requestid = new SearchResponse(requestid, SearchResponse.Status.NOT_SUPPORTED);
            ay1.a(ay.a.c, requestid);
            return;
        }
        try
        {
            ay1 = new JSONObject();
            ay1.put("category", searchrequest.getCategory().toString());
            ay1.put("searchTerm", searchrequest.getSearchTerm());
            Map map = searchrequest.getFilters();
            jsonobject = new JSONObject();
            FilterType filtertype;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.put(filtertype.toString(), map.get(filtertype)))
            {
                filtertype = (FilterType)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendSearchRequest.");
            return;
        }
        ay1.put("filters", jsonobject);
        ay1.put("sortType", searchrequest.getSortType().toString());
        ay1.put("page", searchrequest.getPage());
        a(requestid, "com.amazon.device.iap.physical.physical_search", ((JSONObject) (ay1)));
        return;
    }

    public void a(RequestId requestid, ay ay1)
    {
        x.b(a, "sendGetServiceStatusRequest");
        b = ay1;
        if (!a())
        {
            requestid = new ServiceStatusResponse(requestid, null, c, d, e);
            ay1.a(ay.a.a, requestid);
            return;
        }
        try
        {
            a(requestid, "com.amazon.device.iap.physical.get_userData", new JSONObject());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendGetServiceStatusRequest.");
        }
    }

    public void b(RequestId requestid, ay ay1)
    {
        x.b(a, "sendPurchaseResponseRequest");
        b = ay1;
        try
        {
            a(requestid, "com.amazon.device.iap.physical.physical_get_purchaseResult", new JSONObject());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendPurchaseResponseRequest.");
        }
    }

    public void c(RequestId requestid, ay ay1)
    {
        x.b(a, "sendReceiptReceivedRequest");
        b = ay1;
        try
        {
            a(requestid, "com.amazon.device.iap.physical.physical_notify_receiptReceived", new JSONObject());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            x.a(a, "Error in sendReceiptReceivedRequest.");
        }
    }

}
