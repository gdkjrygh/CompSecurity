// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingServiceRequest, an

public class SearchByIdRequest extends ShoppingServiceRequest
{

    private final Set a;

    public SearchByIdRequest()
    {
        a = new HashSet();
    }

    public SearchByIdRequest(Set set)
    {
        an.a(set, "productIds");
        a = new HashSet(set);
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonobject.put("productIds", jsonarray);
        return jsonobject;
    }

    public void addProductId(String s)
    {
        an.a(s, "productId");
        a.add(s);
    }

    public Set getProductIds()
    {
        return Collections.unmodifiableSet(a);
    }

    public void removeProductId(String s)
    {
        an.a(s, "productId");
        a.remove(s);
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
