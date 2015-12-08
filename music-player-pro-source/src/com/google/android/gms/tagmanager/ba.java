// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.tagmanager:
//            m, di

class ba
{

    public static cr.c cI(String s)
        throws JSONException
    {
        s = n(new JSONObject(s));
        cr.d d = cr.c.qo();
        for (int i = 0; i < ((com.google.android.gms.internal.d.a) (s)).gx.length; i++)
        {
            d.a(cr.a.qk().b(b.df.toString(), ((com.google.android.gms.internal.d.a) (s)).gx[i]).b(b.cU.toString(), di.cZ(m.ph())).b(m.pi(), ((com.google.android.gms.internal.d.a) (s)).gy[i]).qn());
        }

        return d.qr();
    }

    private static com.google.android.gms.internal.d.a n(Object obj)
        throws JSONException
    {
        return di.u(o(obj));
    }

    static Object o(Object obj)
        throws JSONException
    {
        if (obj instanceof JSONArray)
        {
            throw new RuntimeException("JSONArrays are not supported");
        }
        if (JSONObject.NULL.equals(obj))
        {
            throw new RuntimeException("JSON nulls are not supported");
        }
        Object obj1 = obj;
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            obj1 = new HashMap();
            String s;
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); ((Map) (obj1)).put(s, o(((JSONObject) (obj)).get(s))))
            {
                s = (String)iterator.next();
            }

        }
        return obj1;
    }
}
