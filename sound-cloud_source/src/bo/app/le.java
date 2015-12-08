// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ld, la, lg, kz

public final class le extends ld
{

    kz a;

    public le(kz kz1)
    {
        a = kz1;
    }

    public final void a(String s, Object obj, Object obj1, la la1)
    {
        if ((obj instanceof Number) && (obj1 instanceof Number))
        {
            if (((Number)obj).doubleValue() != ((Number)obj1).doubleValue())
            {
                la1.a(s, obj, obj1);
            }
        } else
        if (obj.getClass().isAssignableFrom(obj1.getClass()))
        {
            if (obj instanceof JSONArray)
            {
                e(s, (JSONArray)obj, (JSONArray)obj1, la1);
                return;
            }
            if (obj instanceof JSONObject)
            {
                a(s, (JSONObject)obj, (JSONObject)obj1, la1);
                return;
            }
            if (!obj.equals(obj1))
            {
                la1.a(s, obj, obj1);
                return;
            }
        } else
        {
            la1.a(s, obj, obj1);
            return;
        }
    }

    public final void a(String s, JSONObject jsonobject, JSONObject jsonobject1, la la1)
    {
        for (Iterator iterator = lg.a(jsonobject).iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            Object obj = jsonobject.get(s2);
            if (jsonobject1.has(s2))
            {
                Object obj1 = jsonobject1.get(s2);
                a(lg.a(s, s2), obj, obj1, la1);
            } else
            {
                la1.a(s, s2);
            }
        }

        if (!a.e)
        {
            jsonobject1 = lg.a(jsonobject1).iterator();
            do
            {
                if (!jsonobject1.hasNext())
                {
                    break;
                }
                String s1 = (String)jsonobject1.next();
                if (!jsonobject.has(s1))
                {
                    la1.b(s, s1);
                }
            } while (true);
        }
    }

    public final void e(String s, JSONArray jsonarray, JSONArray jsonarray1, la la1)
    {
        if (jsonarray.length() != jsonarray1.length())
        {
            la1.a((new StringBuilder()).append(s).append("[]: Expected ").append(jsonarray.length()).append(" values but got ").append(jsonarray1.length()).toString());
        } else
        if (jsonarray.length() != 0)
        {
            if (a.f)
            {
                c(s, jsonarray, jsonarray1, la1);
                return;
            }
            if (lg.c(jsonarray))
            {
                b(s, jsonarray, jsonarray1, la1);
                return;
            }
            if (lg.d(jsonarray))
            {
                a(s, jsonarray, jsonarray1, la1);
                return;
            } else
            {
                d(s, jsonarray, jsonarray1, la1);
                return;
            }
        }
    }
}
