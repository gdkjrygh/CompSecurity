// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import org.json.JSONException;
import org.json.JSONObject;

public final class LogArguments
{

    public String logLevel;
    public String msg;
    public String tags[];
    public String traceArea;
    public String type;

    public LogArguments(String s, String s1, String s2, String as[])
    {
        logLevel = s;
        msg = s1;
        type = s2;
        tags = as;
    }

    public JSONObject toJon()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("logLevel", logLevel);
        jsonobject.put("msg", msg);
        jsonobject.put("traceArea", traceArea);
        jsonobject.put("type", type);
        jsonobject.put("tags", tags);
        return jsonobject;
    }
}
