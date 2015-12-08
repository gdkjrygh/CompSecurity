// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONStoreAddOptions
{

    private static final String OPTION_ADDITIONAL_SEARCH_FIELDS = "additionalSearchFields";
    private static final String OPTION_IS_ADD = "isAdd";
    private JSONObject additionalSearchFields;
    private boolean markDirty;

    public JSONStoreAddOptions()
    {
        additionalSearchFields = new JSONObject();
        markDirty = false;
    }

    public JSONStoreAddOptions(JSONObject jsonobject)
    {
        this();
        if (jsonobject != null)
        {
            additionalSearchFields = jsonobject.optJSONObject("additionalSearchFields");
            markDirty = jsonobject.optBoolean("isAdd", false);
        }
    }

    private void putAdditionalSearchField(String s, Object obj)
        throws IllegalArgumentException
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("Key parameter cannot be null or empty.");
        }
        if (obj == null)
        {
            throw new IllegalArgumentException("Value parameter cannot be null.");
        }
        if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Number) && !(obj instanceof Boolean))
        {
            throw new IllegalArgumentException("Value parameter must be a String, Integer, Number, or Boolean type.");
        }
        if (additionalSearchFields.has(s))
        {
            additionalSearchFields.remove(s);
        }
        try
        {
            additionalSearchFields.put(s, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void addAdditionalSearchField(String s, Boolean boolean1)
    {
        putAdditionalSearchField(s, boolean1);
    }

    public void addAdditionalSearchField(String s, Integer integer)
        throws IllegalArgumentException
    {
        putAdditionalSearchField(s, integer);
    }

    public void addAdditionalSearchField(String s, Number number)
        throws IllegalArgumentException
    {
        putAdditionalSearchField(s, number);
    }

    public void addAdditionalSearchField(String s, String s1)
        throws IllegalArgumentException
    {
        putAdditionalSearchField(s, s1);
    }

    public void addAdditionalSearchFields(Map map)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            try
            {
                putAdditionalSearchField(s, map.get(s));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Error when adding additional search field '").append(s).append("'.").toString(), map);
            }
        }

    }

    public void addAdditionalSearchFields(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        Iterator iterator = jsonobject1.keys();
        while (iterator.hasNext()) 
        {
            jsonobject = (String)iterator.next();
            Object obj;
            try
            {
                obj = jsonobject1.get(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Error when adding additional search field. Could not get the value in JSONObject for search field '").append(jsonobject).append("'.").toString(), jsonexception);
            }
            putAdditionalSearchField(jsonobject, obj);
        }
    }

    public JSONObject getAdditionalSearchFieldsAsJSON()
    {
        return additionalSearchFields;
    }

    public boolean isMarkDirty()
    {
        return markDirty;
    }

    public void setMarkDirty(boolean flag)
    {
        markDirty = flag;
    }
}
