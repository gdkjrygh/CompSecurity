// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.device;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.device:
//            BaseDeviceEvent

public class LanguageChange extends BaseDeviceEvent
{

    private static final String ATTR_OLD = "old";
    public static final String TYPE = "languagechange";
    private String old;

    public LanguageChange(String s)
    {
        super("languagechange");
        if (s == null)
        {
            throw new IllegalArgumentException("Old language is null!");
        } else
        {
            old = s;
            return;
        }
    }

    public JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("old", old);
        jsonobject.put("type", getType());
        return jsonobject;
    }
}
