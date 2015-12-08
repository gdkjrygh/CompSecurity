// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactJson
{

    private static final String TAG = "ContactJson";
    private JSONObject mObject;

    public ContactJson(String s)
    {
        if (s == null)
        {
            return;
        }
        try
        {
            mObject = new JSONObject(s);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("ContactJson", (new StringBuilder()).append("Init JSON by ").append(s).append(" failed: ").append(jsonexception.toString()).toString());
        }
    }

    public ContactJson(JSONObject jsonobject)
    {
        mObject = jsonobject;
    }

    public boolean getBoolean(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mObject != null)
        {
            flag = flag1;
            if (mObject.has(s))
            {
                try
                {
                    flag = mObject.getBoolean(s);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("ContactJson", (new StringBuilder()).append("getBoolean(").append(s).append("): Failed to parse json data: ").append(jsonexception.toString()).toString());
                    return false;
                }
            }
        }
        return flag;
    }

    public String getFirstValue(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (mObject != null)
        {
            s1 = obj;
            if (mObject.has(s))
            {
                try
                {
                    s1 = mObject.getJSONArray(s).getString(0);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("ContactJson", (new StringBuilder()).append("getArrayTop(").append(s).append("): Failed to parse json data: ").append(jsonexception.toString()).toString());
                    return null;
                }
            }
        }
        return s1;
    }

    public JSONObject getObject(String s)
    {
        Object obj = null;
        JSONObject jsonobject = obj;
        if (mObject != null)
        {
            jsonobject = obj;
            if (mObject.has(s))
            {
                try
                {
                    jsonobject = mObject.getJSONObject(s);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("ContactJson", (new StringBuilder()).append("getObject(").append(s).append("): Failed to parse json data: ").append(jsonexception.toString()).toString());
                    return null;
                }
            }
        }
        return jsonobject;
    }

    public String getString(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (mObject != null)
        {
            s1 = obj;
            if (mObject.has(s))
            {
                try
                {
                    s1 = mObject.getString(s);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("ContactJson", (new StringBuilder()).append("getString(").append(s).append("): Failed to parse json data: ").append(jsonexception.toString()).toString());
                    return null;
                }
            }
        }
        return s1;
    }

    public List getStringArray(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (mObject == null || !mObject.has(s)) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = mObject.getJSONArray(s);
        int i = 0;
_L3:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jsonarray.getString(i));
        i++;
        if (true) goto _L3; else goto _L2
        JSONException jsonexception;
        jsonexception;
        Log.e("ContactJson", (new StringBuilder()).append("getStringArray(").append(s).append("): Failed to parse json data: ").append(jsonexception.toString()).toString());
_L2:
        return arraylist;
    }
}
