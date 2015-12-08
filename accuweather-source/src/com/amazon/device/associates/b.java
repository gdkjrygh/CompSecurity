// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            bg, PurchaseExperience, RequestId, aw, 
//            ServiceStatusResponse, ay, ReceiptsResponse, Offset, 
//            SearchResponse, SearchByIdResponse, bc, PurchaseResponse, 
//            x

final class b
    implements bg
{

    private static final String a = com/amazon/device/associates/b.getSimpleName();
    private ay b;

    b()
    {
    }

    static ay a(b b1)
    {
        return b1.b;
    }

    private void a(Intent intent, JSONObject jsonobject)
        throws JSONException
    {
        boolean flag1 = true;
        boolean flag = false;
        intent = new HashSet();
        intent.add(PurchaseExperience.DIRECT_WITH_DETAIL);
        intent.add(PurchaseExperience.DIRECT_WITH_PREVIEW);
        RequestId requestid = RequestId.a(jsonobject.getString("requestId"));
        if (jsonobject.getString("requestStatus").equals("SUCCESSFUL"))
        {
            UserData userdata = aw.a(jsonobject);
            if (((Set)aw.a(jsonobject.getJSONArray("availableProductTypes"), new HashSet())).contains("PHYSICAL"))
            {
                intent.add(PurchaseExperience.IN_APP);
                flag = true;
            } else
            {
                flag1 = false;
            }
            intent = new ServiceStatusResponse(requestid, userdata, intent, flag, flag1);
        } else
        {
            intent = new ServiceStatusResponse(requestid, null, intent, false, false);
        }
        b.a(ay.a.a, intent);
    }

    private void b(Intent intent, JSONObject jsonobject)
        throws JSONException
    {
        intent = RequestId.a(jsonobject.getString("requestId"));
        ReceiptsResponse.Status status = ReceiptsResponse.Status.valueOf(jsonobject.getString("requestStatus"));
        if (status == ReceiptsResponse.Status.SUCCESSFUL)
        {
            intent = new ReceiptsResponse(intent, status, (List)aw.b(jsonobject.getJSONArray("receipts"), new ArrayList()), Offset.fromString(jsonobject.getString("offset")), jsonobject.optBoolean("hasMore"));
        } else
        {
            intent = new ReceiptsResponse(intent, status);
        }
        b.a(ay.a.b, intent);
    }

    private void c(Intent intent, JSONObject jsonobject)
        throws JSONException
    {
        intent = RequestId.a(jsonobject.getString("requestId"));
        SearchResponse.Status status = SearchResponse.Status.valueOf(jsonobject.getString("requestStatus"));
        if (status == SearchResponse.Status.SUCCESSFUL)
        {
            intent = new SearchResponse(intent, status, (List)aw.c(jsonobject.getJSONArray("products"), new ArrayList()), jsonobject.getInt("page"), jsonobject.getInt("totalPages"));
        } else
        {
            intent = new SearchResponse(intent, status);
        }
        b.a(ay.a.c, intent);
    }

    private void d(Intent intent, JSONObject jsonobject)
        throws JSONException
    {
        intent = RequestId.a(jsonobject.getString("requestId"));
        SearchByIdResponse.Status status = SearchByIdResponse.Status.valueOf(jsonobject.getString("requestStatus"));
        if (status == SearchByIdResponse.Status.SUCCESSFUL)
        {
            intent = new SearchByIdResponse(intent, status, (List)aw.c(jsonobject.getJSONArray("products"), new ArrayList()), (Set)aw.a(jsonobject.getJSONArray("unavailableProductIds"), new HashSet()));
        } else
        {
            intent = new SearchByIdResponse(intent, status);
        }
        b.a(ay.a.d, intent);
    }

    private void e(Intent intent, JSONObject jsonobject)
        throws JSONException
    {
        RequestId requestid = RequestId.a(jsonobject.getString("requestId"));
        jsonobject = PurchaseResponse.Status.valueOf(jsonobject.getString("requestStatus"));
        if (jsonobject == PurchaseResponse.Status.SUCCESSFUL)
        {
            intent = (Intent)intent.getExtras().get("intent");
            bc.a().post(new Runnable(intent) {

                final Intent a;
                final b b;

                public void run()
                {
                    b.a(b).b().startActivity(a);
                }

            
            {
                b = b.this;
                a = intent;
                super();
            }
            });
            return;
        } else
        {
            intent = new PurchaseResponse(requestid, jsonobject);
            b.a(ay.a.e, intent);
            return;
        }
    }

    private void f(Intent intent, JSONObject jsonobject)
        throws JSONException, ParseException
    {
        intent = RequestId.a(jsonobject.getString("requestId"));
        PurchaseResponse.Status status = PurchaseResponse.Status.valueOf(jsonobject.getString("requestStatus"));
        if (status == PurchaseResponse.Status.SUCCESSFUL)
        {
            ArrayList arraylist = new ArrayList();
            if (jsonobject.has("receipts") && !jsonobject.isNull("receipts"))
            {
                aw.b(jsonobject.getJSONArray("receipts"), arraylist);
            }
            intent = new PurchaseResponse(intent, status, arraylist);
        } else
        {
            intent = new PurchaseResponse(intent, status);
        }
        b.a(ay.a.e, intent);
    }

    public void a(Context context, Intent intent, ay ay1)
    {
        String s;
        x.b(a, "handleResponse");
        b = ay1;
        try
        {
            context = new JSONObject(intent.getExtras().getString("message"));
            x.b(a, (new StringBuilder()).append("message: ").append(context.toString(4)).toString());
            if (context.has("errorMessage"))
            {
                Log.e(a, context.optString("errorMessage"));
            }
            s = context.getString("command");
            if (s.equalsIgnoreCase("com.amazon.device.iap.physical.get_userData"))
            {
                a(intent, ((JSONObject) (context)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            x.a(a, (new StringBuilder()).append("error in handleResponse: ").append(context).toString());
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_get_receipts"))
        {
            b(intent, context);
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_search"))
        {
            c(intent, context);
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_searchById"))
        {
            d(intent, context);
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_purchase"))
        {
            e(intent, context);
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_get_purchaseResult"))
        {
            f(intent, context);
            return;
        }
        if (s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_purchase_done"))
        {
            context = RequestId.a(context.getString("requestId"));
            ay1.a(ay.a.f, context, null);
            return;
        }
        if (!s.equalsIgnoreCase("com.amazon.device.iap.physical.physical_notify_receiptReceived"))
        {
            x.a(a, (new StringBuilder()).append("response with unknown command: ").append(s).toString());
        }
        return;
    }

}
