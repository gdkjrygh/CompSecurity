// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.a:
//            b

public final class c
    implements com.amazon.device.iap.internal.c
{

    private static final String a = com/amazon/device/iap/internal/a/c.getSimpleName();

    public c()
    {
    }

    private Intent a(String s)
    {
        s = new Intent(s);
        s.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return s;
    }

    private Product a(String s, JSONObject jsonobject)
        throws JSONException
    {
        ProductType producttype = ProductType.valueOf(jsonobject.optString("itemType"));
        Object obj1 = jsonobject.getJSONObject("priceJson");
        Object obj = Currency.getInstance(((JSONObject) (obj1)).optString("currency"));
        obj1 = new BigDecimal(((JSONObject) (obj1)).optString("value"));
        obj = (new StringBuilder()).append(((Currency) (obj)).getSymbol()).append(obj1).toString();
        obj1 = jsonobject.optString("title");
        String s1 = jsonobject.optString("description");
        jsonobject = jsonobject.optString("smallIconUrl");
        return (new ProductBuilder()).setSku(s).setProductType(producttype).setDescription(s1).setPrice(((String) (obj))).setSmallIconUrl(jsonobject).setTitle(((String) (obj1))).build();
    }

    private Receipt a(JSONObject jsonobject)
        throws ParseException
    {
        String s = jsonobject.optString("receiptId");
        String s1 = jsonobject.optString("sku");
        ProductType producttype = ProductType.valueOf(jsonobject.optString("itemType"));
        Object obj = jsonobject.optString("purchaseDate");
        obj = b.a.parse(((String) (obj)));
        jsonobject = jsonobject.optString("cancelDate");
        if (jsonobject == null || jsonobject.length() == 0)
        {
            jsonobject = null;
        } else
        {
            jsonobject = b.a.parse(jsonobject);
        }
        return (new ReceiptBuilder()).setReceiptId(s).setSku(s1).setProductType(producttype).setPurchaseDate(((java.util.Date) (obj))).setCancelDate(jsonobject).build();
    }

    static String a()
    {
        return a;
    }

    private void a(Intent intent)
        throws JSONException
    {
        PurchaseUpdatesResponse purchaseupdatesresponse = b(intent);
        if (purchaseupdatesresponse.getRequestStatus() == com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL)
        {
            intent = (new JSONObject(intent.getStringExtra("purchaseUpdatesOutput"))).optString("offset");
            Log.i(a, (new StringBuilder()).append("Offset for PurchaseUpdatesResponse:").append(intent).toString());
            com.amazon.device.iap.internal.util.b.a(purchaseupdatesresponse.getUserData().getUserId(), intent);
        }
        a(purchaseupdatesresponse);
    }

    private void a(String s, String s1, boolean flag)
    {
        String s2;
        Context context;
        JSONObject jsonobject;
        context = com.amazon.device.iap.internal.d.d().b();
        s2 = com.amazon.device.iap.internal.util.b.a(s1);
        Log.i(a, (new StringBuilder()).append("send PurchaseUpdates with user id:").append(s1).append(";reset flag:").append(flag).append(", local cursor:").append(s2).append(", parsed from old requestId:").append(s).toString());
        s1 = new Bundle();
        jsonobject = new JSONObject();
        jsonobject.put("requestId", s.toString());
        s = s2;
        if (flag)
        {
            s = null;
        }
        try
        {
            jsonobject.put("offset", s);
            jsonobject.put("sdkVersion", "2.0.61.0");
            jsonobject.put("packageName", context.getPackageName());
            s1.putString("purchaseUpdatesInput", jsonobject.toString());
            s = a("com.amazon.testclient.iap.purchaseUpdates");
            s.addFlags(0x10000000);
            s.putExtras(s1);
            context.startService(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.amazon.device.iap.internal.util.e.b(a, "Error in sendPurchaseUpdatesRequest.");
        }
        return;
    }

    private void a(String s, boolean flag, boolean flag1)
    {
        try
        {
            Context context = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("requestId", s);
            jsonobject.put("packageName", context.getPackageName());
            jsonobject.put("sdkVersion", "2.0.61.0");
            jsonobject.put("isPurchaseUpdates", flag);
            jsonobject.put("reset", flag1);
            bundle.putString("userInput", jsonobject.toString());
            s = a("com.amazon.testclient.iap.appUserId");
            s.addFlags(0x10000000);
            s.putExtras(bundle);
            context.startService(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.amazon.device.iap.internal.util.e.b(a, "Error in sendGetUserDataRequest.");
        }
    }

    private PurchaseUpdatesResponse b(Intent intent)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        int i = 0;
        obj1 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED;
        Object obj;
        ArrayList arraylist;
        Exception exception;
        boolean flag;
        try
        {
            obj2 = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput"));
            intent = RequestId.fromString(((JSONObject) (obj2)).optString("requestId"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            Object obj4 = null;
            obj2 = null;
            intent = null;
            obj = obj1;
            flag = false;
            obj1 = obj4;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
_L6:
            obj = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.valueOf(((JSONObject) (obj2)).optString("status"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            Object obj5 = null;
            obj2 = intent;
            intent = null;
            obj = obj1;
            flag = false;
            obj1 = obj5;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        flag = ((JSONObject) (obj2)).optBoolean("isMore");
        try
        {
            obj1 = ((JSONObject) (obj2)).optString("userId");
            obj3 = ((JSONObject) (obj2)).optString("marketplace");
            obj1 = (new UserDataBuilder()).setUserId(((String) (obj1))).setMarketplace(((String) (obj3))).build();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj2 = intent;
            intent = null;
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
        if (obj != com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) goto _L2; else goto _L1
_L1:
        arraylist = new ArrayList();
        obj3 = ((JSONObject) (obj2)).optJSONArray("receipts");
        obj2 = arraylist;
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        obj2 = arraylist;
        if (i >= ((JSONArray) (obj3)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((JSONArray) (obj3)).optJSONObject(i);
        arraylist.add(a(((JSONObject) (obj2))));
_L5:
        i++;
        if (true) goto _L3; else goto _L4
        exception;
        Log.e(a, (new StringBuilder()).append("Failed to parse receipt from json:").append(obj2).toString());
          goto _L5
        obj3;
        obj2 = intent;
        intent = arraylist;
_L9:
        Log.e(a, "Error parsing purchase updates output", ((Throwable) (obj3)));
_L7:
        return (new PurchaseUpdatesResponseBuilder()).setRequestId(((RequestId) (obj2))).setRequestStatus(((com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus) (obj))).setUserData(((UserData) (obj1))).setReceipts(intent).setHasMore(flag).build();
_L2:
        obj2 = null;
_L4:
        obj3 = intent;
        intent = ((Intent) (obj2));
        obj2 = obj3;
        if (true) goto _L7; else goto _L6
        obj3;
        Object obj6 = null;
        obj2 = intent;
        intent = obj6;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void c(Intent intent)
    {
        a(d(intent));
    }

    private ProductDataResponse d(Intent intent)
    {
        Object obj1;
        Object obj2;
        Object obj5;
        obj2 = null;
        obj5 = null;
        obj1 = com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED;
        JSONObject jsonobject;
        jsonobject = new JSONObject(intent.getStringExtra("itemDataOutput"));
        intent = RequestId.fromString(jsonobject.optString("requestId"));
        Object obj = com.amazon.device.iap.model.ProductDataResponse.RequestStatus.valueOf(jsonobject.optString("status"));
        obj1 = obj;
        if (obj == com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj1 = obj;
        LinkedHashSet linkedhashset = new LinkedHashSet();
        Object obj3 = new HashMap();
        obj1 = jsonobject.optJSONArray("unavailableSkus");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        if (i >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        linkedhashset.add(((JSONArray) (obj1)).getString(i));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        obj1 = jsonobject.optJSONObject("items");
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        for (obj2 = ((JSONObject) (obj1)).keys(); ((Iterator) (obj2)).hasNext(); ((Map) (obj3)).put(obj5, a(((String) (obj5)), ((JSONObject) (obj1)).optJSONObject(((String) (obj5))))))
        {
            obj5 = (String)((Iterator) (obj2)).next();
        }

          goto _L5
        obj2;
        obj5 = obj;
        obj = intent;
        obj1 = linkedhashset;
        intent = ((Intent) (obj5));
_L8:
        Log.e(a, "Error parsing item data output", ((Throwable) (obj2)));
        obj2 = obj1;
        obj1 = obj3;
_L7:
        return (new ProductDataResponseBuilder()).setRequestId(((RequestId) (obj))).setRequestStatus(intent).setProductData(((Map) (obj1))).setUnavailableSkus(((Set) (obj2))).build();
_L5:
        obj1 = obj3;
        obj2 = linkedhashset;
_L9:
        obj3 = obj;
        obj = intent;
        intent = ((Intent) (obj3));
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        obj = null;
        intent = ((Intent) (obj1));
        linkedhashset = null;
        obj3 = obj5;
        obj1 = obj;
        obj = linkedhashset;
          goto _L8
        obj2;
        linkedhashset = null;
        obj = intent;
        intent = ((Intent) (obj1));
        obj3 = obj5;
        obj1 = linkedhashset;
          goto _L8
        obj2;
        obj1 = obj;
        obj = intent;
        obj3 = obj5;
        intent = ((Intent) (obj1));
        obj1 = linkedhashset;
          goto _L8
        Object obj4 = null;
        obj1 = obj2;
        obj2 = obj4;
          goto _L9
    }

    private void e(Intent intent)
    {
        UserDataResponse userdataresponse = f(intent);
        RequestId requestid = userdataresponse.getRequestId();
        String s = intent.getStringExtra("userInput");
        try
        {
            intent = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e(a, (new StringBuilder()).append("Unable to parse request data: ").append(s).toString(), intent);
            intent = null;
        }
        if (requestid == null || intent == null)
        {
            a(userdataresponse);
            return;
        }
        if (!intent.optBoolean("isPurchaseUpdates", false))
        {
            a(userdataresponse);
            return;
        }
        if (userdataresponse.getUserData() == null || com.amazon.device.iap.internal.util.d.a(userdataresponse.getUserData().getUserId()))
        {
            Log.e(a, (new StringBuilder()).append("No Userid found in userDataResponse").append(userdataresponse).toString());
            a((new PurchaseUpdatesResponseBuilder()).setRequestId(requestid).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(userdataresponse.getUserData()).setReceipts(new ArrayList()).setHasMore(false).build());
            return;
        } else
        {
            Log.i(a, (new StringBuilder()).append("sendGetPurchaseUpdates with user id").append(userdataresponse.getUserData().getUserId()).toString());
            boolean flag = intent.optBoolean("reset", true);
            a(requestid.toString(), userdataresponse.getUserData().getUserId(), flag);
            return;
        }
    }

    private UserDataResponse f(Intent intent)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED;
        RequestId requestid;
        JSONObject jsonobject;
        jsonobject = new JSONObject(intent.getStringExtra("userOutput"));
        requestid = RequestId.fromString(jsonobject.optString("requestId"));
        intent = com.amazon.device.iap.model.UserDataResponse.RequestStatus.valueOf(jsonobject.optString("status"));
        obj = obj1;
        if (intent == com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL)
        {
            obj = jsonobject.optString("userId");
            String s = jsonobject.optString("marketplace");
            obj = (new UserDataBuilder()).setUserId(((String) (obj))).setMarketplace(s).build();
        }
_L2:
        return (new UserDataResponseBuilder()).setRequestId(requestid).setRequestStatus(intent).setUserData(((UserData) (obj))).build();
        Exception exception;
        exception;
        Object obj2 = null;
        intent = ((Intent) (obj));
        obj = exception;
        exception = obj2;
_L3:
        Log.e(a, "Error parsing userid output", ((Throwable) (obj)));
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception1;
        exception1;
        intent = ((Intent) (obj));
        obj = exception1;
          goto _L3
        obj;
          goto _L3
    }

    private void g(Intent intent)
    {
        a(h(intent));
    }

    private PurchaseResponse h(Intent intent)
    {
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED;
        Object obj1;
        Object obj3;
        obj3 = new JSONObject(intent.getStringExtra("purchaseOutput"));
        obj1 = RequestId.fromString(((JSONObject) (obj3)).optString("requestId"));
        Object obj;
        intent = ((JSONObject) (obj3)).optString("userId");
        obj = ((JSONObject) (obj3)).optString("marketplace");
        obj = (new UserDataBuilder()).setUserId(intent).setMarketplace(((String) (obj))).build();
        intent = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.safeValueOf(((JSONObject) (obj3)).optString("purchaseStatus"));
        JSONObject jsonobject = ((JSONObject) (obj3)).optJSONObject("receipt");
        Intent intent1;
        UserData userdata;
        obj3 = obj4;
        intent1 = intent;
        userdata = ((UserData) (obj));
        obj2 = obj1;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj3 = a(jsonobject);
        obj2 = obj1;
        userdata = ((UserData) (obj));
        intent1 = intent;
_L2:
        return (new PurchaseResponseBuilder()).setRequestId(((RequestId) (obj2))).setRequestStatus(intent1).setUserData(userdata).setReceipt(((Receipt) (obj3))).build();
        obj1;
        obj = null;
        obj3 = null;
        intent = ((Intent) (obj2));
        obj2 = obj3;
_L3:
        Log.e(a, "Error parsing purchase output", ((Throwable) (obj1)));
        obj3 = obj4;
        intent1 = intent;
        userdata = ((UserData) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj = null;
        intent = ((Intent) (obj2));
        obj2 = obj1;
        obj1 = exception;
          goto _L3
        exception;
        intent = ((Intent) (obj2));
        obj2 = obj1;
        obj1 = exception;
          goto _L3
        exception;
        obj2 = obj1;
        obj1 = exception;
          goto _L3
    }

    public void a(Context context, Intent intent)
    {
        com.amazon.device.iap.internal.util.e.a(a, "handleResponse");
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try
        {
            context = intent.getExtras().getString("responseType");
            if (context.equalsIgnoreCase("com.amazon.testclient.iap.purchase"))
            {
                g(intent);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(a, "Error handling response.", context);
            return;
        }
        if (context.equalsIgnoreCase("com.amazon.testclient.iap.appUserId"))
        {
            e(intent);
            return;
        }
        if (context.equalsIgnoreCase("com.amazon.testclient.iap.itemData"))
        {
            c(intent);
            return;
        }
        if (context.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates"))
        {
            a(intent);
        }
        return;
    }

    public void a(RequestId requestid)
    {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetUserDataRequest");
        a(requestid.toString(), false, false);
    }

    public void a(RequestId requestid, String s)
    {
        com.amazon.device.iap.internal.util.e.a(a, "sendPurchaseRequest");
        try
        {
            Context context = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("sku", s);
            jsonobject.put("requestId", requestid.toString());
            jsonobject.put("packageName", context.getPackageName());
            jsonobject.put("sdkVersion", "2.0.61.0");
            bundle.putString("purchaseInput", jsonobject.toString());
            requestid = a("com.amazon.testclient.iap.purchase");
            requestid.addFlags(0x10000000);
            requestid.putExtras(bundle);
            context.startService(requestid);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            com.amazon.device.iap.internal.util.e.b(a, "Error in sendPurchaseRequest.");
        }
    }

    public void a(RequestId requestid, String s, FulfillmentResult fulfillmentresult)
    {
        com.amazon.device.iap.internal.util.e.a(a, "sendNotifyPurchaseFulfilled");
        try
        {
            Context context = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("requestId", requestid.toString());
            jsonobject.put("packageName", context.getPackageName());
            jsonobject.put("receiptId", s);
            jsonobject.put("fulfillmentResult", fulfillmentresult);
            jsonobject.put("sdkVersion", "2.0.61.0");
            bundle.putString("purchaseFulfilledInput", jsonobject.toString());
            requestid = a("com.amazon.testclient.iap.purchaseFulfilled");
            requestid.addFlags(0x10000000);
            requestid.putExtras(bundle);
            context.startService(requestid);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            com.amazon.device.iap.internal.util.e.b(a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    public void a(RequestId requestid, Set set)
    {
        com.amazon.device.iap.internal.util.e.a(a, "sendItemDataRequest");
        try
        {
            Context context = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jsonobject = new JSONObject();
            set = new JSONArray(set);
            jsonobject.put("requestId", requestid.toString());
            jsonobject.put("packageName", context.getPackageName());
            jsonobject.put("skus", set);
            jsonobject.put("sdkVersion", "2.0.61.0");
            bundle.putString("itemDataInput", jsonobject.toString());
            requestid = a("com.amazon.testclient.iap.itemData");
            requestid.addFlags(0x10000000);
            requestid.putExtras(bundle);
            context.startService(requestid);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RequestId requestid)
        {
            com.amazon.device.iap.internal.util.e.b(a, "Error in sendItemDataRequest.");
        }
    }

    public void a(RequestId requestid, boolean flag)
    {
        RequestId requestid1 = requestid;
        if (requestid == null)
        {
            requestid1 = new RequestId();
        }
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("sendPurchaseUpdatesRequest/sendGetUserData first:").append(requestid1).toString());
        a(requestid1.toString(), true, flag);
    }

    protected void a(Object obj)
    {
        com.amazon.device.iap.internal.util.d.a(obj, "response");
        Context context = com.amazon.device.iap.internal.d.d().b();
        PurchasingListener purchasinglistener = com.amazon.device.iap.internal.d.d().a();
        if (context == null || purchasinglistener == null)
        {
            com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("PurchasingListener is not set. Dropping response: ").append(obj).toString());
            return;
        } else
        {
            obj = new Runnable(obj, purchasinglistener) {

                final Object a;
                final PurchasingListener b;
                final c c;

                public void run()
                {
                    try
                    {
                        if (a instanceof ProductDataResponse)
                        {
                            b.onProductDataResponse((ProductDataResponse)a);
                            return;
                        }
                    }
                    catch (Exception exception)
                    {
                        com.amazon.device.iap.internal.util.e.b(c.a(), (new StringBuilder()).append("Error in sendResponse: ").append(exception).toString());
                        return;
                    }
                    if (a instanceof UserDataResponse)
                    {
                        b.onUserDataResponse((UserDataResponse)a);
                        return;
                    }
                    if (a instanceof PurchaseUpdatesResponse)
                    {
                        b.onPurchaseUpdatesResponse((PurchaseUpdatesResponse)a);
                        return;
                    }
                    if (a instanceof PurchaseResponse)
                    {
                        b.onPurchaseResponse((PurchaseResponse)a);
                        return;
                    }
                    com.amazon.device.iap.internal.util.e.b(c.a(), (new StringBuilder()).append("Unknown response type:").append(a.getClass().getName()).toString());
                    return;
                }

            
            {
                c = c.this;
                a = obj;
                b = purchasinglistener;
                super();
            }
            };
            (new Handler(context.getMainLooper())).post(((Runnable) (obj)));
            return;
        }
    }

}
