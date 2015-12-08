// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.security;

import com.worklight.jsonstore.jackson.JacksonSerializedJSONObject;
import com.worklight.jsonstore.jackson.JsonOrgModule;
import org.json.JSONException;
import org.json.JSONObject;

public class DPKBean
{

    private static final String KEY_DPK = "dpk";
    private static final String KEY_ITERATIONS = "iterations";
    private static final String KEY_IV = "iv";
    private static final String KEY_SALT = "jsonSalt";
    private static final String KEY_VERSION = "version";
    private static final String VERSION_NUM = "1.0";
    private JSONObject obj;

    protected DPKBean(String s)
        throws JSONException
    {
        try
        {
            obj = JsonOrgModule.deserializeJSONObject(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException(s);
        }
    }

    protected DPKBean(String s, String s1, String s2, int i)
        throws JSONException
    {
        obj = new JacksonSerializedJSONObject();
        obj.put("dpk", s);
        obj.put("iterations", i);
        obj.put("iv", s1);
        obj.put("jsonSalt", s2);
        obj.put("version", "1.0");
    }

    public String getEncryptedDPK()
        throws JSONException
    {
        return obj.getString("dpk");
    }

    public String getIV()
        throws JSONException
    {
        return obj.getString("iv");
    }

    public int getIterations()
        throws JSONException
    {
        return obj.getInt("iterations");
    }

    public String getSalt()
        throws JSONException
    {
        return obj.getString("jsonSalt");
    }

    public String getVersion()
        throws JSONException
    {
        return obj.getString("version");
    }

    public String toString()
    {
        return obj.toString();
    }
}
