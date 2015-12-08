// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CordovaArgs
{

    private JSONArray baseArgs;

    public CordovaArgs(JSONArray jsonarray)
    {
        baseArgs = jsonarray;
    }

    public Object get(int i)
        throws JSONException
    {
        return baseArgs.get(i);
    }

    public byte[] getArrayBuffer(int i)
        throws JSONException
    {
        return Base64.decode(baseArgs.getString(i), 0);
    }

    public boolean getBoolean(int i)
        throws JSONException
    {
        return baseArgs.getBoolean(i);
    }

    public double getDouble(int i)
        throws JSONException
    {
        return baseArgs.getDouble(i);
    }

    public int getInt(int i)
        throws JSONException
    {
        return baseArgs.getInt(i);
    }

    public JSONArray getJSONArray(int i)
        throws JSONException
    {
        return baseArgs.getJSONArray(i);
    }

    public JSONObject getJSONObject(int i)
        throws JSONException
    {
        return baseArgs.getJSONObject(i);
    }

    public long getLong(int i)
        throws JSONException
    {
        return baseArgs.getLong(i);
    }

    public String getString(int i)
        throws JSONException
    {
        return baseArgs.getString(i);
    }

    public boolean isNull(int i)
    {
        return baseArgs.isNull(i);
    }

    public Object opt(int i)
    {
        return baseArgs.opt(i);
    }

    public boolean optBoolean(int i)
    {
        return baseArgs.optBoolean(i);
    }

    public double optDouble(int i)
    {
        return baseArgs.optDouble(i);
    }

    public int optInt(int i)
    {
        return baseArgs.optInt(i);
    }

    public JSONArray optJSONArray(int i)
    {
        return baseArgs.optJSONArray(i);
    }

    public JSONObject optJSONObject(int i)
    {
        return baseArgs.optJSONObject(i);
    }

    public long optLong(int i)
    {
        return baseArgs.optLong(i);
    }

    public String optString(int i)
    {
        return baseArgs.optString(i);
    }
}
