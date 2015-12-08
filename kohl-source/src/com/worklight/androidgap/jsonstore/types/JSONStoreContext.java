// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.types;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONStoreContext
{

    private HashMap parameters;

    public JSONStoreContext()
    {
        parameters = new HashMap();
    }

    protected JSONStoreContext(JSONStoreContext jsonstorecontext)
    {
        parameters = jsonstorecontext.parameters;
    }

    public void addParameter(String s, Object obj)
    {
        parameters.put(s, obj);
    }

    public JSONArray getArrayParameter(String s)
    {
        return (JSONArray)parameters.get(s);
    }

    public Boolean getBooleanParameter(String s)
    {
        return (Boolean)parameters.get(s);
    }

    public float getFloatParameter(String s)
    {
        return ((Float)parameters.get(s)).floatValue();
    }

    public int getIntParameter(String s)
    {
        return ((Integer)parameters.get(s)).intValue();
    }

    public JSONObject getObjectParameter(String s)
    {
        return (JSONObject)parameters.get(s);
    }

    public String getStringParameter(String s)
    {
        return (String)parameters.get(s);
    }

    public Object getUntypedParameter(String s)
    {
        return parameters.get(s);
    }
}
