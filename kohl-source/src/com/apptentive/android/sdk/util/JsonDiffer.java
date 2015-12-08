// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import com.apptentive.android.sdk.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDiffer
{

    private JsonDiffer()
    {
    }

    public static boolean areObjectsEqual(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj1 instanceof JSONObject))
        {
            obj = (JSONObject)obj;
            obj1 = (JSONObject)obj1;
            if (((JSONObject) (obj)).length() != ((JSONObject) (obj1)).length())
            {
                return false;
            }
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
            {
                boolean flag;
                try
                {
                    String s = (String)iterator.next();
                    flag = areObjectsEqual(((JSONObject) (obj)).get(s), ((JSONObject) (obj1)).get(s));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("Error comparing JSONObjects", ((Throwable) (obj)), new Object[0]);
                    return false;
                }
                if (!flag)
                {
                    return false;
                }
            }

            return true;
        } else
        {
            if ((obj instanceof JSONArray) && (obj1 instanceof JSONArray))
            {
                obj = (JSONArray)obj;
                obj1 = (JSONArray)obj1;
                if (((JSONArray) (obj)).length() != ((JSONArray) (obj1)).length())
                {
                    return false;
                }
                int i = 0;
                do
                {
                    boolean flag1;
                    try
                    {
                        if (i >= ((JSONArray) (obj)).length())
                        {
                            break;
                        }
                        flag1 = areObjectsEqual(((JSONArray) (obj)).get(i), ((JSONArray) (obj1)).get(i));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.e("", ((Throwable) (obj)), new Object[0]);
                        return false;
                    }
                    if (!flag1)
                    {
                        return false;
                    }
                    i++;
                } while (true);
                return true;
            }
            if ((obj instanceof Number) && (obj1 instanceof Number))
            {
                double d = ((Number)obj).doubleValue();
                double d1 = ((Number)obj1).doubleValue();
                double d2 = Math.abs(9.9999999999999995E-07D * d1);
                return Math.abs(d - d1) <= d2;
            } else
            {
                return obj.equals(obj1);
            }
        }
    }

    public static JSONObject getDiff(JSONObject jsonobject, JSONObject jsonobject1)
    {
        JSONObject jsonobject2;
        Set set;
        Object obj;
        jsonobject2 = new JSONObject();
        obj = getKeys(jsonobject);
        set = getKeys(jsonobject1);
        obj = ((Set) (obj)).iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = (String)((Iterator) (obj)).next();
        set.remove(s1);
        Object obj1;
        Object obj2;
        obj1 = jsonobject.opt(s1);
        obj2 = jsonobject1.opt(s1);
        if (!isEmpty(obj1)) goto _L4; else goto _L3
_L3:
        if (!isEmpty(obj2))
        {
            jsonobject2.put(s1, obj2);
        }
_L7:
        ((Iterator) (obj)).remove();
        continue; /* Loop/switch isn't completed */
_L6:
        Log.w("Error diffing object with key %s", ((Throwable) (obj1)), new Object[] {
            s1
        });
        ((Iterator) (obj)).remove();
        continue; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (isEmpty(obj2))
            {
                jsonobject2.put(s1, JSONObject.NULL);
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                if ((obj1 instanceof JSONObject) && (obj2 instanceof JSONObject))
                {
                    if (!areObjectsEqual(obj1, obj2))
                    {
                        jsonobject2.put(s1, obj2);
                    }
                    continue; /* Loop/switch isn't completed */
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            finally
            {
                ((Iterator) (obj)).remove();
                throw jsonobject;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if ((obj1 instanceof JSONArray) && (obj2 instanceof JSONArray))
        {
            jsonobject2.put(s1, obj2);
            continue; /* Loop/switch isn't completed */
        }
        if (!obj1.equals(obj2))
        {
            jsonobject2.put(s1, obj2);
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = obj1.equals(obj2);
        if (!flag);
        if (true) goto _L7; else goto _L2
_L2:
        for (jsonobject = set.iterator(); jsonobject.hasNext();)
        {
            String s = (String)jsonobject.next();
            try
            {
                jsonobject2.put(s, jsonobject1.get(s));
            }
            catch (JSONException jsonexception) { }
        }

        jsonobject = jsonobject2;
        if (jsonobject2.length() == 0)
        {
            jsonobject = null;
        }
        Log.v("Generated diff: %s", new Object[] {
            jsonobject
        });
        return jsonobject;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static Set getKeys(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        if (jsonobject != null)
        {
            for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); hashset.add(jsonobject.next())) { }
        }
        return hashset;
    }

    private static boolean isEmpty(Object obj)
    {
        return obj == null || obj.equals("");
    }
}
