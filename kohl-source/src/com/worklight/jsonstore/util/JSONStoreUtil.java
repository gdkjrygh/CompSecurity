// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.util;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.util:
//            JSONStoreLogger

public class JSONStoreUtil
{

    private static final String DATABASE_SPECIAL_CHARACTERS[] = {
        "@", "$", "^", "&", "|", ">", "<", "?", "-"
    };
    private static final JSONStoreLogger coreLogger = JSONStoreLogger.getLogger("jsonstore-core");
    private static final JSONStoreLogger dbLogger = JSONStoreLogger.getLogger("jsonstore-db");

    private JSONStoreUtil()
    {
    }

    public static List convertJSONArrayToJSONObjectList(JSONArray jsonarray)
    {
        LinkedList linkedlist = new LinkedList();
        if (jsonarray != null)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                try
                {
                    linkedlist.add(jsonarray.getJSONObject(i));
                }
                catch (JSONException jsonexception) { }
                i++;
            }
        }
        return linkedlist;
    }

    public static List convertJSONObjectArrayToJSONObjectList(JSONObject ajsonobject[])
    {
        LinkedList linkedlist = new LinkedList();
        if (ajsonobject != null)
        {
            for (int i = 0; i < ajsonobject.length; i++)
            {
                if (ajsonobject[i] != null)
                {
                    linkedlist.add(ajsonobject[i]);
                }
            }

        }
        return linkedlist;
    }

    public static JSONArray convertJSONObjectListToJSONArray(List list)
    {
        JSONArray jsonarray = new JSONArray();
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                JSONObject jsonobject = (JSONObject)list.next();
                if (jsonobject != null)
                {
                    jsonarray.put(jsonobject);
                }
            }
        }
        return jsonarray;
    }

    public static transient String formatString(String s, Object aobj[])
    {
        return MessageFormat.format(s, aobj);
    }

    public static JSONStoreLogger getCoreLogger()
    {
        return coreLogger;
    }

    public static JSONStoreLogger getDatabaseLogger()
    {
        return dbLogger;
    }

    public static String getDatabaseSafeSearchFieldName(String s)
    {
        if (s == null)
        {
            return null;
        }
        String as[] = DATABASE_SPECIAL_CHARACTERS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = s.replace(as[i], "");
        }

        return s.replace('.', '_');
    }

    public static List splitListIntoChunks(List list, int i)
    {
        LinkedList linkedlist = new LinkedList();
        int k = 0;
        int l = list.size();
        int j = l;
        if (l <= i)
        {
            linkedlist.add(list);
        } else
        {
            while (j > 0) 
            {
                linkedlist.add(list.subList(k, k + Math.min(i, list.size() - k)));
                k += i;
                j -= i;
            }
        }
        return linkedlist;
    }

}
