// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class dyq
    implements dmh
{

    private final dyp a;

    public dyq(dyp dyp1)
    {
        a = (dyp)ctz.a(dyp1);
    }

    private static Map a(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        jsonobject = jsonobject.optJSONObject("errors");
        if (jsonobject == null)
        {
            return hashmap;
        }
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = jsonobject.optString(s);
            if (s1 != null)
            {
                hashmap.put(s, s1);
            }
        } while (true);
        return hashmap;
    }

    public final void a(int i, Object obj)
    {
        Object obj1 = (JSONObject)obj;
        obj = new ArrayList();
        JSONArray jsonarray = ((JSONObject) (obj1)).optJSONArray("suggestions");
        if (jsonarray != null)
        {
            for (i = 0; i < jsonarray.length(); i++)
            {
                String s = jsonarray.optString(i, "");
                if (!TextUtils.isEmpty(s))
                {
                    ((ArrayList) (obj)).add(s);
                }
            }

        }
        i = ((JSONObject) (obj1)).optInt("status", 0x80000000);
        if (i > 0x80000000 && i == 1)
        {
            new dyu();
            obj1 = new dyv(((JSONObject) (obj1)));
            a.a(((ArrayList) (obj)), ((dyw) (obj1)));
            return;
        } else
        {
            obj1 = a(((JSONObject) (obj1)));
            a.a(((ArrayList) (obj)), ((Map) (obj1)));
            return;
        }
    }

    public final void a(Throwable throwable, String s)
    {
        a.a();
    }
}
