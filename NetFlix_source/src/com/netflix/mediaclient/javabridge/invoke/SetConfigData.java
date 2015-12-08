// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke;

import com.netflix.mediaclient.Log;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.invoke:
//            BaseInvoke

public class SetConfigData extends BaseInvoke
{

    private static final String DATA = "data";
    private static final String METHOD = "setConfigData";
    private static final String NAME = "name";
    private static final String TAG = "SetConfigData";
    private static final String TARGET = "nrdp";

    public SetConfigData(JSONObject jsonobject, String s)
    {
        super("nrdp", "setConfigData");
        if (jsonobject == null || s == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        StringBuilder stringbuilder;
        Iterator iterator;
        stringbuilder = new StringBuilder();
        iterator = jsonobject.keys();
        boolean flag = true;
_L1:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        stringbuilder.append("&");
        flag = false;
        String s1 = (String)iterator.next();
        stringbuilder.append(String.format("%s=%s", new Object[] {
            URLEncoder.encode(s1, "UTF-8"), URLEncoder.encode(jsonobject.getString(s1), "UTF-8")
        }));
          goto _L1
        jsonobject;
        Log.e("SetConfigData", "Unable to setConfigData", jsonobject);
        return;
        jsonobject = new JSONObject();
        jsonobject.put("name", s);
        jsonobject.put("data", stringbuilder.toString());
        arguments = jsonobject.toString();
        return;
    }
}
