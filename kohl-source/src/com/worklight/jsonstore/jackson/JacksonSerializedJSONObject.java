// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JsonOrgModule

public class JacksonSerializedJSONObject extends JSONObject
{

    private JSONObject wrappedObject;

    public JacksonSerializedJSONObject()
    {
    }

    public JacksonSerializedJSONObject(JSONObject jsonobject)
    {
        wrappedObject = jsonobject;
    }

    public String toString()
    {
        Object obj;
        if (wrappedObject == null)
        {
            obj = this;
        } else
        {
            obj = wrappedObject;
        }
        return JsonOrgModule.serialize(((JSONObject) (obj)));
    }

    public String toString(int i)
        throws JSONException
    {
        return toString();
    }
}
