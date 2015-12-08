// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleJSONConverter
{
    public static interface Setter
    {

        public abstract void setOnBundle(Bundle bundle, String s, Object obj)
            throws JSONException;

        public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj)
            throws JSONException;
    }


    private static final Map SETTERS;

    public BundleJSONConverter()
    {
    }

    public static Bundle convertToBundle(JSONObject jsonobject)
        throws JSONException
    {
        Bundle bundle = new Bundle();
        Iterator iterator = jsonobject.keys();
        do
        {
            String s;
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    return bundle;
                }
                s = (String)iterator.next();
                obj = jsonobject.get(s);
            } while (obj == null || obj == JSONObject.NULL);
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
        } while (true);
    }

    public static JSONObject convertToJSON(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = bundle.keySet().iterator();
label0:
        do
        {
            String s;
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    return jsonobject;
                }
                s = (String)iterator.next();
                obj = bundle.get(s);
            } while (obj == null);
            if (obj instanceof List)
            {
                JSONArray jsonarray = new JSONArray();
                obj = ((List)obj).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        jsonobject.put(s, jsonarray);
                        continue label0;
                    }
                    jsonarray.put((String)((Iterator) (obj)).next());
                } while (true);
            }
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
        } while (true);
    }

    static 
    {
        SETTERS = new HashMap();
        SETTERS.put(java/lang/Boolean, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putBoolean(s, ((Boolean)obj).booleanValue());
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                jsonobject.put(s, obj);
            }

        });
        SETTERS.put(java/lang/Integer, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putInt(s, ((Integer)obj).intValue());
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                jsonobject.put(s, obj);
            }

        });
        SETTERS.put(java/lang/Long, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putLong(s, ((Long)obj).longValue());
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                jsonobject.put(s, obj);
            }

        });
        SETTERS.put(java/lang/Double, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putDouble(s, ((Double)obj).doubleValue());
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                jsonobject.put(s, obj);
            }

        });
        SETTERS.put(java/lang/String, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putString(s, (String)obj);
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                jsonobject.put(s, obj);
            }

        });
        SETTERS.put([Ljava/lang/String;, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                JSONArray jsonarray = new JSONArray();
                obj = (String[])obj;
                int j = obj.length;
                int i = 0;
                do
                {
                    if (i >= j)
                    {
                        jsonobject.put(s, jsonarray);
                        return;
                    }
                    jsonarray.put(obj[i]);
                    i++;
                } while (true);
            }

        });
        SETTERS.put(org/json/JSONArray, new Setter() {

            public void setOnBundle(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                obj = (JSONArray)obj;
                ArrayList arraylist = new ArrayList();
                if (((JSONArray) (obj)).length() == 0)
                {
                    bundle.putStringArrayList(s, arraylist);
                    return;
                }
                int i = 0;
                do
                {
                    if (i >= ((JSONArray) (obj)).length())
                    {
                        bundle.putStringArrayList(s, arraylist);
                        return;
                    }
                    Object obj1 = ((JSONArray) (obj)).get(i);
                    if (obj1 instanceof String)
                    {
                        arraylist.add((String)obj1);
                        i++;
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unexpected type in an array: ")).append(obj1.getClass()).toString());
                    }
                } while (true);
            }

            public void setOnJSON(JSONObject jsonobject, String s, Object obj)
                throws JSONException
            {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }

        });
    }
}
