// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class BundleJSONConverter
{

    private static final Map SETTERS;

    public BundleJSONConverter()
    {
    }

    public static Bundle convertToBundle(JSONObject jsonobject)
    {
        Bundle bundle = new Bundle();
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj != null && obj != JSONObject.NULL)
            {
                if (obj instanceof JSONObject)
                {
                    bundle.putBundle(s, convertToBundle((JSONObject)obj));
                } else
                {
                    Setter setter = (Setter)SETTERS.get(obj.getClass());
                    if (setter == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    setter.setOnBundle(bundle, s, obj);
                }
            }
        } while (true);
        return bundle;
    }

    public static JSONObject convertToJSON(Bundle bundle)
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (obj != null)
            {
                if (obj instanceof List)
                {
                    JSONArray jsonarray = new JSONArray();
                    for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); jsonarray.put((String)((Iterator) (obj)).next())) { }
                    jsonobject.put(s, jsonarray);
                } else
                if (obj instanceof Bundle)
                {
                    jsonobject.put(s, convertToJSON((Bundle)obj));
                } else
                {
                    Setter setter = (Setter)SETTERS.get(obj.getClass());
                    if (setter == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    setter.setOnJSON(jsonobject, s, obj);
                }
            }
        } while (true);
        return jsonobject;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        SETTERS = hashmap;
        hashmap.put(java/lang/Boolean, new _cls1());
        SETTERS.put(java/lang/Integer, new _cls2());
        SETTERS.put(java/lang/Long, new _cls3());
        SETTERS.put(java/lang/Double, new _cls4());
        SETTERS.put(java/lang/String, new _cls5());
        SETTERS.put([Ljava/lang/String;, new _cls6());
        SETTERS.put(org/json/JSONArray, new _cls7());
    }

    private class Setter
    {

        public abstract void setOnBundle(Bundle bundle, String s, Object obj);

        public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj);
    }


    private class _cls1
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            bundle.putBoolean(s, ((Boolean)obj).booleanValue());
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            jsonobject.put(s, obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            bundle.putInt(s, ((Integer)obj).intValue());
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            jsonobject.put(s, obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            bundle.putLong(s, ((Long)obj).longValue());
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            jsonobject.put(s, obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            bundle.putDouble(s, ((Double)obj).doubleValue());
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            jsonobject.put(s, obj);
        }

        _cls4()
        {
        }
    }


    private class _cls5
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            bundle.putString(s, (String)obj);
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            jsonobject.put(s, obj);
        }

        _cls5()
        {
        }
    }


    private class _cls6
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            JSONArray jsonarray = new JSONArray();
            obj = (String[])obj;
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                jsonarray.put(obj[i]);
            }

            jsonobject.put(s, jsonarray);
        }

        _cls6()
        {
        }
    }


    private class _cls7
        implements Setter
    {

        public final void setOnBundle(Bundle bundle, String s, Object obj)
        {
            obj = (JSONArray)obj;
            ArrayList arraylist = new ArrayList();
            if (((JSONArray) (obj)).length() == 0)
            {
                bundle.putStringArrayList(s, arraylist);
                return;
            }
            for (int i = 0; i < ((JSONArray) (obj)).length();)
            {
                Object obj1 = ((JSONArray) (obj)).get(i);
                if (obj1 instanceof String)
                {
                    arraylist.add((String)obj1);
                    i++;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Unexpected type in an array: ")).append(obj1.getClass()).toString());
                }
            }

            bundle.putStringArrayList(s, arraylist);
        }

        public final void setOnJSON(JSONObject jsonobject, String s, Object obj)
        {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        _cls7()
        {
        }
    }

}
