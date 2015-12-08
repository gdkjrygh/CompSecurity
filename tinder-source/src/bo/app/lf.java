// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class lf
{

    private static Integer a = new Integer(1);

    public static String a(String s, String s1)
    {
        if ("".equals(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(".").append(s1).toString();
        }
    }

    public static String a(String s, String s1, Object obj)
    {
        return (new StringBuilder()).append(s).append("[").append(s1).append("=").append(obj).append("]").toString();
    }

    public static String a(JSONArray jsonarray)
    {
        for (Iterator iterator = a((JSONObject)jsonarray.get(0)).iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (a(s, jsonarray))
            {
                return s;
            }
        }

        return null;
    }

    public static Map a(Collection collection)
    {
        HashMap hashmap = new HashMap();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            Object obj = collection.next();
            Integer integer = (Integer)hashmap.get(obj);
            if (integer == null)
            {
                hashmap.put(obj, a);
            } else
            {
                hashmap.put(obj, new Integer(integer.intValue() + 1));
            }
        }

        return hashmap;
    }

    public static Map a(JSONArray jsonarray, String s)
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            JSONObject jsonobject = (JSONObject)jsonarray.get(i);
            hashmap.put(jsonobject.get(s), jsonobject);
        }

        return hashmap;
    }

    public static Set a(JSONObject jsonobject)
    {
        TreeSet treeset = new TreeSet();
        for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); treeset.add((String)jsonobject.next())) { }
        return treeset;
    }

    private static boolean a(Object obj)
    {
        return !(obj instanceof JSONObject) && !(obj instanceof JSONArray);
    }

    public static boolean a(String s, JSONArray jsonarray)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            HashSet hashset = new HashSet();
            for (int i = 0; i < jsonarray.length(); i++)
            {
                Object obj = jsonarray.get(i);
                flag = flag1;
                if (!(obj instanceof JSONObject))
                {
                    break label0;
                }
                obj = (JSONObject)obj;
                flag = flag1;
                if (!((JSONObject) (obj)).has(s))
                {
                    break label0;
                }
                obj = ((JSONObject) (obj)).get(s);
                flag = flag1;
                if (!a(obj))
                {
                    break label0;
                }
                flag = flag1;
                if (hashset.contains(obj))
                {
                    break label0;
                }
                hashset.add(obj);
            }

            flag = true;
        }
        return flag;
    }

    public static List b(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(jsonarray.get(i));
        }

        return arraylist;
    }

    public static boolean c(JSONArray jsonarray)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            if (!a(jsonarray.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean d(JSONArray jsonarray)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            if (!(jsonarray.get(i) instanceof JSONObject))
            {
                return false;
            }
        }

        return true;
    }

}
