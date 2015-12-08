// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class app
{

    private static final Map a;

    public static Bundle a(JSONObject jsonobject)
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
                    bundle.putBundle(s, a((JSONObject)obj));
                } else
                {
                    apq apq1 = (apq)a.get(obj.getClass());
                    if (apq1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    apq1.a(bundle, s, obj);
                }
            }
        } while (true);
        return bundle;
    }

    public static JSONObject a(Bundle bundle)
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
                    jsonobject.put(s, a((Bundle)obj));
                } else
                {
                    apq apq1 = (apq)a.get(obj.getClass());
                    if (apq1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    apq1.a(jsonobject, s, obj);
                }
            }
        } while (true);
        return jsonobject;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(java/lang/Boolean, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                bundle.putBoolean(s, ((Boolean)obj).booleanValue());
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                jsonobject.put(s, obj);
            }

        });
        a.put(java/lang/Integer, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                bundle.putInt(s, ((Integer)obj).intValue());
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                jsonobject.put(s, obj);
            }

        });
        a.put(java/lang/Long, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                bundle.putLong(s, ((Long)obj).longValue());
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                jsonobject.put(s, obj);
            }

        });
        a.put(java/lang/Double, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                bundle.putDouble(s, ((Double)obj).doubleValue());
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                jsonobject.put(s, obj);
            }

        });
        a.put(java/lang/String, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                bundle.putString(s, (String)obj);
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                jsonobject.put(s, obj);
            }

        });
        a.put([Ljava/lang/String;, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
            {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            public final void a(JSONObject jsonobject, String s, Object obj)
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

        });
        a.put(org/json/JSONArray, new apq() {

            public final void a(Bundle bundle, String s, Object obj)
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

            public final void a(JSONObject jsonobject, String s, Object obj)
            {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }

        });
    }
}
