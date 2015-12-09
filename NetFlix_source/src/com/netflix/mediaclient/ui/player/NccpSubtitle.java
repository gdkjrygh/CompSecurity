// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class NccpSubtitle extends Subtitle
{

    public static final int IMPL_VALUE = 1;
    private static final String TRACK_TYPE_ASSISTIVE = "ASSISTIVE";
    private static final String TRACK_TYPE_PRIMARY = "PRIMARY";

    protected NccpSubtitle(JSONObject jsonobject, int i)
        throws JSONException
    {
        canDeviceRender = JsonUtils.getBoolean(jsonobject, "canDeviceRender", false);
        id = JsonUtils.getString(jsonobject, "id", null);
        languageCodeIso639_1 = JsonUtils.getString(jsonobject, "language", "en");
        languageDescription = JsonUtils.getString(jsonobject, "languageDescription", "English");
        nccpOrderNumber = i;
        jsonobject = JsonUtils.getString(jsonobject, "trackType", null);
        if (jsonobject == null)
        {
            trackType = -1;
        } else
        {
            if ("ASSISTIVE".equalsIgnoreCase(jsonobject))
            {
                trackType = 1;
                return;
            }
            if ("PRIMARY".equalsIgnoreCase(jsonobject))
            {
                trackType = 0;
                return;
            }
        }
    }

    public static final Subtitle newInstance(JSONObject jsonobject, int i)
        throws JSONException
    {
        return new NccpSubtitle(jsonobject, i);
    }

    public JSONObject toJson()
        throws JSONException
    {
        String s;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("impl", 1);
        jsonobject.put("id", id);
        jsonobject.put("order", nccpOrderNumber);
        jsonobject.put("canDeviceRender", canDeviceRender);
        jsonobject.put("language", languageCodeIso639_1);
        jsonobject.put("languageDescription", languageDescription);
        s = null;
        if (trackType != 1) goto _L2; else goto _L1
_L1:
        s = "ASSISTIVE";
_L4:
        jsonobject.put("trackType", s);
        return jsonobject;
_L2:
        if (trackType == 0)
        {
            s = "PRIMARY";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
