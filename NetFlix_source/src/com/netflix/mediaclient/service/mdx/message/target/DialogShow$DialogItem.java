// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.mdx.message.target:
//            DialogShow

public static class data
{

    public String data;
    public String name;

    public static data fromJson(JSONObject jsonobject)
        throws JSONException
    {
        return new <init>(jsonobject.getString(DialogShow.access$000()), jsonobject.getString(DialogShow.access$100()));
    }

    public JSONObject toJSon()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put(DialogShow.access$000(), name);
        jsonobject.put(DialogShow.access$100(), data);
        return jsonobject;
    }

    public (String s, String s1)
    {
        name = s;
        data = s1;
    }
}
