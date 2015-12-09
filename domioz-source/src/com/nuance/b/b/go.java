// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class go
{

    static Double a(JSONObject jsonobject, String s, Double double1)
    {
        jsonobject = ((JSONObject) (d(jsonobject, s)));
        if (jsonobject == null)
        {
            return double1;
        }
        if (jsonobject instanceof Number)
        {
            return Double.valueOf(((Number)jsonobject).doubleValue());
        }
        if (!(jsonobject instanceof String))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        jsonobject = Double.valueOf((String)jsonobject);
        return jsonobject;
        jsonobject;
        return double1;
        jsonobject;
        return double1;
    }

    static String a(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = ((JSONObject) (d(jsonobject, s)));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s1;
        }
        if (jsonobject == null)
        {
            return s1;
        }
        if (jsonobject instanceof String)
        {
            return (String)jsonobject;
        }
        if (jsonobject == JSONObject.NULL)
        {
            return "null";
        }
        jsonobject = String.valueOf(jsonobject);
        return jsonobject;
    }

    static boolean a(JSONObject jsonobject, String s)
    {
        boolean flag;
        try
        {
            jsonobject = ((JSONObject) (d(jsonobject, s)));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return false;
        }
        if (jsonobject == null)
        {
            return false;
        }
        if (jsonobject instanceof Boolean)
        {
            return ((Boolean)jsonobject).booleanValue();
        }
        if (!(jsonobject instanceof String))
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if ("true".equalsIgnoreCase((String)jsonobject))
        {
            return true;
        }
        flag = "false".equalsIgnoreCase((String)jsonobject);
        if (flag)
        {
            return false;
        }
        return false;
    }

    static JSONObject b(JSONObject jsonobject, String s)
    {
        try
        {
            jsonobject = (JSONObject)d(jsonobject, s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    static JSONArray c(JSONObject jsonobject, String s)
    {
        try
        {
            jsonobject = (JSONArray)d(jsonobject, s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private static Object d(JSONObject jsonobject, String s)
    {
label0:
        {
            Object obj = null;
            String as[] = obj;
            if (s != null)
            {
                as = obj;
                if (jsonobject != null)
                {
                    as = s.split("\\.");
                    if (as.length <= 1)
                    {
                        break label0;
                    }
                    for (int i = 0; i < as.length - 1;)
                    {
                        if (jsonobject.has(as[i]))
                        {
                            jsonobject = jsonobject.getJSONObject(as[i]);
                            i++;
                        } else
                        {
                            throw new JSONException((new StringBuilder()).append(s).append(" key not found").toString());
                        }
                    }

                    as = ((String []) (jsonobject.get(as[as.length - 1])));
                }
            }
            return as;
        }
        return jsonobject.get(s);
    }
}
