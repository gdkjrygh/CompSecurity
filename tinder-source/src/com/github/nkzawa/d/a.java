// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.d;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{

    public static boolean a(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof byte[])
        {
            return true;
        }
        if (!(obj instanceof JSONArray)) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        int j;
        obj1 = (JSONArray)obj;
        j = ((JSONArray) (obj1)).length();
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = ((JSONArray) (obj1)).isNull(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = null;
_L6:
        if (a(obj))
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        obj = ((JSONArray) (obj1)).get(i);
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L2:
        if (!(obj instanceof JSONObject)) goto _L7; else goto _L9
_L9:
        obj = (JSONObject)obj;
        obj1 = ((JSONObject) (obj)).keys();
_L12:
        if (!((Iterator) (obj1)).hasNext()) goto _L7; else goto _L10
_L10:
        Object obj2 = (String)((Iterator) (obj1)).next();
        try
        {
            obj2 = ((JSONObject) (obj)).get(((String) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!a(obj2)) goto _L12; else goto _L11
_L11:
        return true;
_L7:
        return false;
    }
}
