// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.a;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.github.nkzawa.socketio.a:
//            b

public final class com.github.nkzawa.socketio.a.a
{
    public static final class a
    {

        public b a;
        public byte b[][];

        public a()
        {
        }
    }


    public static Object a(Object obj, List list)
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            if (obj instanceof byte[])
            {
                obj1 = new JSONObject();
                try
                {
                    ((JSONObject) (obj1)).put("_placeholder", true);
                    ((JSONObject) (obj1)).put("num", list.size());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return null;
                }
                list.add((byte[])(byte[])obj);
                return obj1;
            }
            if (obj instanceof JSONArray)
            {
                obj1 = new JSONArray();
                obj = (JSONArray)obj;
                int j = ((JSONArray) (obj)).length();
                int i = 0;
                while (i < j) 
                {
                    try
                    {
                        ((JSONArray) (obj1)).put(i, a(((JSONArray) (obj)).get(i), list));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return null;
                    }
                    i++;
                }
                return obj1;
            }
            obj1 = obj;
            if (obj instanceof JSONObject)
            {
                JSONObject jsonobject = new JSONObject();
                obj = (JSONObject)obj;
                for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
                {
                    String s = (String)iterator.next();
                    try
                    {
                        jsonobject.put(s, a(((JSONObject) (obj)).get(s), list));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return null;
                    }
                }

                return jsonobject;
            }
        }
        return obj1;
    }

    public static Object a(Object obj, byte abyte0[][])
    {
        if (!(obj instanceof JSONArray)) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        obj = (JSONArray)obj;
        k = ((JSONArray) (obj)).length();
        i = 0;
_L4:
        Object obj1;
        obj1 = obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(i, a(((JSONArray) (obj)).get(i), abyte0));
        i++;
        if (true) goto _L4; else goto _L3
        obj;
        obj1 = null;
_L3:
        return obj1;
_L2:
        obj1 = obj;
        if (!(obj instanceof JSONObject))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (JSONObject)obj;
        if (((JSONObject) (obj)).optBoolean("_placeholder"))
        {
            int j = ((JSONObject) (obj)).optInt("num", -1);
            if (j >= 0 && j < abyte0.length)
            {
                return abyte0[j];
            } else
            {
                return null;
            }
        }
        Iterator iterator = ((JSONObject) (obj)).keys();
        do
        {
            obj1 = obj;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (String)iterator.next();
            try
            {
                ((JSONObject) (obj)).put(((String) (obj1)), a(((JSONObject) (obj)).get(((String) (obj1))), abyte0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
    }
}
