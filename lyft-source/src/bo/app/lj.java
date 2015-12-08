// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            li, lf, ll, le

public final class lj extends li
{

    le a;

    public lj(le le1)
    {
        a = le1;
    }

    public final void a(String s, Object obj, Object obj1, lf lf1)
    {
        if ((obj instanceof Number) && (obj1 instanceof Number))
        {
            if (((Number)obj).doubleValue() != ((Number)obj1).doubleValue())
            {
                lf1.a(s, obj, obj1);
            }
        } else
        if (obj.getClass().isAssignableFrom(obj1.getClass()))
        {
            if (obj instanceof JSONArray)
            {
                e(s, (JSONArray)obj, (JSONArray)obj1, lf1);
                return;
            }
            if (obj instanceof JSONObject)
            {
                a(s, (JSONObject)obj, (JSONObject)obj1, lf1);
                return;
            }
            if (!obj.equals(obj1))
            {
                lf1.a(s, obj, obj1);
                return;
            }
        } else
        {
            lf1.a(s, obj, obj1);
            return;
        }
    }

    public final void a(String s, JSONObject jsonobject, JSONObject jsonobject1, lf lf1)
    {
        for (Iterator iterator = ll.a(jsonobject).iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            Object obj = jsonobject.get(s2);
            if (jsonobject1.has(s2))
            {
                Object obj1 = jsonobject1.get(s2);
                a(ll.a(s, s2), obj, obj1, lf1);
            } else
            {
                lf1.a(s, s2);
            }
        }

        if (!a.e)
        {
            jsonobject1 = ll.a(jsonobject1).iterator();
            do
            {
                if (!jsonobject1.hasNext())
                {
                    break;
                }
                String s1 = (String)jsonobject1.next();
                if (!jsonobject.has(s1))
                {
                    lf1.b(s, s1);
                }
            } while (true);
        }
    }

    public final void e(String s, JSONArray jsonarray, JSONArray jsonarray1, lf lf1)
    {
        if (jsonarray.length() != jsonarray1.length())
        {
            lf1.a((new StringBuilder()).append(s).append("[]: Expected ").append(jsonarray.length()).append(" values but got ").append(jsonarray1.length()).toString());
        } else
        if (jsonarray.length() != 0)
        {
            if (a.f)
            {
                c(s, jsonarray, jsonarray1, lf1);
                return;
            }
            if (ll.c(jsonarray))
            {
                b(s, jsonarray, jsonarray1, lf1);
                return;
            }
            if (ll.d(jsonarray))
            {
                a(s, jsonarray, jsonarray1, lf1);
                return;
            } else
            {
                d(s, jsonarray, jsonarray1, lf1);
                return;
            }
        }
    }
}
