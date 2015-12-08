// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingServiceResponse, UserData, PurchaseExperience, RequestId

public class ServiceStatusResponse extends ShoppingServiceResponse
{

    private final UserData a;
    private final boolean b;
    private final boolean c;
    private Set d;

    ServiceStatusResponse(RequestId requestid, UserData userdata, Set set, boolean flag, boolean flag1)
    {
        super(requestid);
        a = userdata;
        b = flag;
        c = flag1;
        d = set;
    }

    protected boolean a()
    {
        return false;
    }

    JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("requestId", getRequestId());
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = a.a();
_L4:
        jsonobject.put("userData", obj);
        jsonobject.put("canSearch", b);
        jsonobject.put("canGetReceipts", c);
        obj = new JSONArray();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((PurchaseExperience)iterator.next()).toString())) { }
        break MISSING_BLOCK_LABEL_119;
_L2:
        try
        {
            obj = (JSONObject)null;
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        if (true) goto _L4; else goto _L3
_L3:
        jsonobject.put("supportedPurchaseExperiences", obj);
        return jsonobject;
    }

    public boolean canGetReceipts()
    {
        return c;
    }

    public boolean canSearch()
    {
        return b;
    }

    public Set getSupportedPurchaseExperiences()
    {
        return d;
    }

    public UserData getUserData()
    {
        return a;
    }

    public String toString()
    {
        String s;
        try
        {
            s = b().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }
}
