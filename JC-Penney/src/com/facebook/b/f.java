// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            g, h, i, j, 
//            k, l, m, n

public class f
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
                    n n1 = (n)a.get(obj.getClass());
                    if (n1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Unsupported type: ").append(obj.getClass()).toString());
                    }
                    n1.a(bundle, s, obj);
                }
            }
        } while (true);
        return bundle;
    }

    static 
    {
        a = new HashMap();
        a.put(java/lang/Boolean, new g());
        a.put(java/lang/Integer, new h());
        a.put(java/lang/Long, new i());
        a.put(java/lang/Double, new j());
        a.put(java/lang/String, new k());
        a.put([Ljava/lang/String;, new l());
        a.put(org/json/JSONArray, new m());
    }
}
