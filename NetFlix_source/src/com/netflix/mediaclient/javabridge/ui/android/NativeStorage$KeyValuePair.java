// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeStorage

private class value
{

    public String key;
    final NativeStorage this$0;
    public String value;

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", key);
        jsonobject.put("value", value);
        return jsonobject;
    }

    public (String s, String s1)
    {
        this$0 = NativeStorage.this;
        super();
        key = s;
        value = s1;
    }

    public value(JSONObject jsonobject)
        throws JSONException
    {
        this$0 = NativeStorage.this;
        super();
        key = JsonUtils.getString(jsonobject, "key", null);
        value = JsonUtils.getString(jsonobject, "value", null);
    }
}
