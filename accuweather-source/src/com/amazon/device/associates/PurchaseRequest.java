// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingServiceRequest, an, PurchaseExperience

public class PurchaseRequest extends ShoppingServiceRequest
{

    private final String a;
    private boolean b;
    private View c;
    private PurchaseExperience d;

    public PurchaseRequest(String s, View view)
    {
        an.a(s, "productId");
        an.a(view, "originView");
        a = s;
        c = view;
        b = false;
    }

    public PurchaseRequest(String s, View view, boolean flag)
    {
        an.a(s, "productId");
        an.a(view, "originView");
        a = s;
        c = view;
        b = flag;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("productId", a);
            jsonobject.put("receiveReceipt", b);
            jsonobject.put("purchaseExperience", d);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public View getOriginView()
    {
        return c;
    }

    public String getProductId()
    {
        return a;
    }

    public PurchaseExperience getPurchaseExperience()
    {
        return d;
    }

    public boolean getReceiveReceipt()
    {
        return b;
    }

    public void setPurchaseExperience(PurchaseExperience purchaseexperience)
    {
        d = purchaseexperience;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }
}
