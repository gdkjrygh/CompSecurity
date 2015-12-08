// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JsonOrgModule

public class JacksonSerializedJSONArray extends JSONArray
{

    private JSONArray wrappedArray;

    public JacksonSerializedJSONArray()
    {
    }

    public JacksonSerializedJSONArray(JSONArray jsonarray)
    {
        wrappedArray = jsonarray;
    }

    public String toString()
    {
        Object obj;
        if (wrappedArray == null)
        {
            obj = this;
        } else
        {
            obj = wrappedArray;
        }
        return JsonOrgModule.serialize(((JSONArray) (obj)));
    }

    public String toString(int i)
        throws JSONException
    {
        return toString();
    }
}
