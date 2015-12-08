// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class eu extends JSONObject
{

    private static final String a;

    public eu()
    {
    }

    public static Enum a(JSONObject jsonobject, String s, Class class1)
    {
        return Enum.valueOf(class1, jsonobject.getString(s).toUpperCase(Locale.US));
    }

    public static Enum a(JSONObject jsonobject, String s, Class class1, Enum enum)
    {
        try
        {
            jsonobject = a(jsonobject, s, class1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return enum;
        }
        return jsonobject;
    }

    public static String a(JSONObject jsonobject, String s)
    {
        Object obj = null;
        String s1 = obj;
        if (jsonobject.has(s))
        {
            s1 = obj;
            if (!jsonobject.isNull(s))
            {
                s1 = jsonobject.optString(s, null);
            }
        }
        return s1;
    }

    public static Map a(JSONObject jsonobject, Map map)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = a;
_L4:
        return map;
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = jsonobject.keys();
        do
        {
            map = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            map = (String)iterator.next();
            hashmap.put(map, jsonobject.getString(map));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static JSONArray a(Collection collection)
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); jsonarray.put(((IPutIntoJson)collection.next()).forJsonPut())) { }
        return jsonarray;
    }

    public static JSONObject a(JSONObject jsonobject, JSONObject jsonobject1)
    {
        JSONObject jsonobject2;
        try
        {
            jsonobject2 = new JSONObject();
            String s1;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject2.put(s1, jsonobject.get(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            AppboyLogger.e(a, "Caught exception merging Json objects.", jsonobject);
            return null;
        }
        String s;
        for (jsonobject = jsonobject1.keys(); jsonobject.hasNext(); jsonobject2.put(s, jsonobject1.get(s)))
        {
            s = (String)jsonobject.next();
        }

        return jsonobject2;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/eu.getName()
        });
    }
}
