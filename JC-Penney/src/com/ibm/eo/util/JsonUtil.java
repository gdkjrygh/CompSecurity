// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public final class JsonUtil
{

    private static volatile JsonUtil _myInstance;

    private JsonUtil()
    {
    }

    public static JSONObject getHashValues(HashMap hashmap)
    {
        java.util.Map.Entry entry = null;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        if (hashmap.isEmpty())
        {
            return null;
        }
        Object obj = new JSONObject();
        hashmap = hashmap.entrySet().iterator();
_L8:
        if (!hashmap.hasNext()) goto _L4; else goto _L3
_L3:
        entry = (java.util.Map.Entry)hashmap.next();
        if (entry.getValue() instanceof String)
        {
            ((JSONObject) (obj)).accumulate((String)entry.getKey(), entry.getValue());
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L6:
        LogInternal.logException(hashmap);
        return ((JSONObject) (obj));
_L5:
        if (entry.getValue() instanceof Boolean)
        {
            ((JSONObject) (obj)).accumulate((String)entry.getKey(), entry.getValue());
            continue; /* Loop/switch isn't completed */
        }
        if (entry.getValue() instanceof JSONObject)
        {
            ((JSONObject) (obj)).accumulate((String)entry.getKey(), entry.getValue());
            continue; /* Loop/switch isn't completed */
        }
        if (entry.getValue() instanceof JSONArray)
        {
            ((JSONObject) (obj)).accumulate((String)entry.getKey(), entry.getValue());
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (entry.getValue() instanceof byte[])
            {
                ((JSONObject) (obj)).accumulate((String)entry.getKey(), Base64.encodeToString((byte[])(byte[])entry.getValue(), 0));
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap) { }
        if (true) goto _L6; else goto _L4
_L4:
        return ((JSONObject) (obj));
        hashmap;
        obj = entry;
        if (true) goto _L6; else goto _L2
_L2:
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static JsonUtil getInstance()
    {
        com/ibm/eo/util/JsonUtil;
        JVM INSTR monitorenter ;
        JsonUtil jsonutil;
        if (_myInstance == null)
        {
            _myInstance = new JsonUtil();
        }
        jsonutil = _myInstance;
        com/ibm/eo/util/JsonUtil;
        JVM INSTR monitorexit ;
        return jsonutil;
        Exception exception;
        exception;
        throw exception;
    }

    public static JSONObject getStringHashValues(HashMap hashmap)
    {
        java.util.Map.Entry entry = null;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        if (hashmap.isEmpty())
        {
            return null;
        }
        Object obj = new JSONObject();
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); ((JSONObject) (obj)).accumulate((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

          goto _L3
        hashmap;
_L4:
        LogInternal.logException(hashmap);
        return ((JSONObject) (obj));
_L3:
        return ((JSONObject) (obj));
        hashmap;
        obj = entry;
        if (true) goto _L4; else goto _L2
_L2:
        return null;
    }
}
