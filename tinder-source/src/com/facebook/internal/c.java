// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
    public static interface a
    {

        public abstract void a(Bundle bundle, String s, Object obj)
            throws JSONException;
    }


    private static final Map a;

    public static Bundle a(JSONObject jsonobject)
        throws JSONException
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
                    a a1 = (a)a.get(obj.getClass());
                    if (a1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    a1.a(bundle, s, obj);
                }
            }
        } while (true);
        return bundle;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(java/lang/Boolean, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putBoolean(s, ((Boolean)obj).booleanValue());
            }

        });
        a.put(java/lang/Integer, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putInt(s, ((Integer)obj).intValue());
            }

        });
        a.put(java/lang/Long, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putLong(s, ((Long)obj).longValue());
            }

        });
        a.put(java/lang/Double, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putDouble(s, ((Double)obj).doubleValue());
            }

        });
        a.put(java/lang/String, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                bundle.putString(s, (String)obj);
            }

        });
        a.put([Ljava/lang/String;, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
            {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

        });
        a.put(org/json/JSONArray, new a() {

            public final void a(Bundle bundle, String s, Object obj)
                throws JSONException
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

        });
    }
}
