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

// Referenced classes of package com.facebook.internal:
//            c, d, e, f, 
//            g, h, i, j

public final class b
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
                    j j1 = (j)a.get(obj.getClass());
                    if (j1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    j1.a(bundle, s, obj);
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
                    j j1 = (j)a.get(obj.getClass());
                    if (j1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(obj.getClass()).toString());
                    }
                    j1.a(jsonobject, s, obj);
                }
            }
        } while (true);
        return jsonobject;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(java/lang/Boolean, new c());
        a.put(java/lang/Integer, new d());
        a.put(java/lang/Long, new e());
        a.put(java/lang/Double, new f());
        a.put(java/lang/String, new g());
        a.put([Ljava/lang/String;, new h());
        a.put(org/json/JSONArray, new i());
    }
}
