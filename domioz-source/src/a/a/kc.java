// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            kb, jy, kf, jx

public final class kc extends kb
{

    jx a;

    public kc(jx jx1)
    {
        a = jx1;
    }

    public final void a(String s, Object obj, Object obj1, jy jy1)
    {
        if ((obj instanceof Number) && (obj1 instanceof Number))
        {
            if (((Number)obj).doubleValue() != ((Number)obj1).doubleValue())
            {
                jy1.a(s, obj, obj1);
            }
        } else
        if (obj.getClass().isAssignableFrom(obj1.getClass()))
        {
            if (obj instanceof JSONArray)
            {
                e(s, (JSONArray)obj, (JSONArray)obj1, jy1);
                return;
            }
            if (obj instanceof JSONObject)
            {
                a(s, (JSONObject)obj, (JSONObject)obj1, jy1);
                return;
            }
            if (!obj.equals(obj1))
            {
                jy1.a(s, obj, obj1);
                return;
            }
        } else
        {
            jy1.a(s, obj, obj1);
            return;
        }
    }

    public final void a(String s, JSONObject jsonobject, JSONObject jsonobject1, jy jy1)
    {
        for (Iterator iterator = kf.a(jsonobject).iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            Object obj = jsonobject.get(s2);
            if (jsonobject1.has(s2))
            {
                Object obj1 = jsonobject1.get(s2);
                a(kf.a(s, s2), obj, obj1, jy1);
            } else
            {
                jy1.a(s, s2);
            }
        }

        if (!a.e)
        {
            jsonobject1 = kf.a(jsonobject1).iterator();
            do
            {
                if (!jsonobject1.hasNext())
                {
                    break;
                }
                String s1 = (String)jsonobject1.next();
                if (!jsonobject.has(s1))
                {
                    jy1.b(s, s1);
                }
            } while (true);
        }
    }

    public final void e(String s, JSONArray jsonarray, JSONArray jsonarray1, jy jy1)
    {
        if (jsonarray.length() != jsonarray1.length())
        {
            jy1.a((new StringBuilder()).append(s).append("[]: Expected ").append(jsonarray.length()).append(" values but got ").append(jsonarray1.length()).toString());
        } else
        if (jsonarray.length() != 0)
        {
            if (a.f)
            {
                c(s, jsonarray, jsonarray1, jy1);
                return;
            }
            if (kf.c(jsonarray))
            {
                b(s, jsonarray, jsonarray1, jy1);
                return;
            }
            if (kf.d(jsonarray))
            {
                a(s, jsonarray, jsonarray1, jy1);
                return;
            } else
            {
                d(s, jsonarray, jsonarray1, jy1);
                return;
            }
        }
    }
}
