// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.jsonstore.api:
//            JSONStoreQueryPart

public class JSONStoreQueryParts
{

    private List parts;

    public JSONStoreQueryParts()
    {
        parts = new ArrayList();
    }

    public JSONStoreQueryParts(JSONArray jsonarray)
        throws JSONStoreFindException
    {
        if (jsonarray == null)
        {
            parts = new ArrayList();
        } else
        {
            parts = new ArrayList(jsonarray.length());
            int i = 0;
            while (i < jsonarray.length()) 
            {
                org.json.JSONObject jsonobject;
                try
                {
                    jsonobject = jsonarray.getJSONObject(i);
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    throw new JSONStoreFindException((new StringBuilder()).append("Value in query at index ").append(i).append(" is not a JSON Object").toString(), jsonarray);
                }
                parts.add(new JSONStoreQueryPart(jsonobject));
                i++;
            }
        }
    }

    public void addQueryPart(JSONStoreQueryPart jsonstorequerypart)
    {
        if (jsonstorequerypart != null)
        {
            parts.add(jsonstorequerypart);
        }
    }

    public List getAllQueryParts()
    {
        return parts;
    }
}
