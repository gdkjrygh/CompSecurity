// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            le, lf, kz

public abstract class lc
    implements le
{

    public lc()
    {
    }

    protected static void b(String s, JSONArray jsonarray, JSONArray jsonarray1, kz kz1)
    {
        jsonarray = lf.a(lf.b(jsonarray));
        jsonarray1 = lf.a(lf.b(jsonarray1));
        Iterator iterator = jsonarray.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = iterator.next();
            if (!jsonarray1.containsKey(obj1))
            {
                kz1.a((new StringBuilder()).append(s).append("[]").toString(), obj1);
            } else
            if (!((Integer)jsonarray1.get(obj1)).equals(jsonarray.get(obj1)))
            {
                kz1.a((new StringBuilder()).append(s).append("[]: Expected ").append(jsonarray.get(obj1)).append(" occurrence(s) of ").append(obj1).append(" but got ").append(jsonarray1.get(obj1)).append(" occurrence(s)").toString());
            }
        } while (true);
        jsonarray1 = jsonarray1.keySet().iterator();
        do
        {
            if (!jsonarray1.hasNext())
            {
                break;
            }
            Object obj = jsonarray1.next();
            if (!jsonarray.containsKey(obj))
            {
                kz1.b((new StringBuilder()).append(s).append("[]").toString(), obj);
            }
        } while (true);
    }

    public final kz a(JSONArray jsonarray, JSONArray jsonarray1)
    {
        kz kz1 = new kz();
        e("", jsonarray, jsonarray1, kz1);
        return kz1;
    }

    public final kz a(JSONObject jsonobject, JSONObject jsonobject1)
    {
        kz kz1 = new kz();
        a("", jsonobject, jsonobject1, kz1);
        return kz1;
    }

    protected final void a(String s, JSONArray jsonarray, JSONArray jsonarray1, kz kz1)
    {
        String s1 = lf.a(jsonarray);
        if (s1 == null || !lf.a(s1, jsonarray1))
        {
            d(s, jsonarray, jsonarray1, kz1);
        } else
        {
            jsonarray = lf.a(jsonarray, s1);
            jsonarray1 = lf.a(jsonarray1, s1);
            for (Iterator iterator = jsonarray.keySet().iterator(); iterator.hasNext();)
            {
                Object obj = iterator.next();
                if (!jsonarray1.containsKey(obj))
                {
                    kz1.a(lf.a(s, s1, obj), jsonarray.get(obj));
                } else
                {
                    JSONObject jsonobject = (JSONObject)jsonarray.get(obj);
                    JSONObject jsonobject1 = (JSONObject)jsonarray1.get(obj);
                    a(lf.a(s, s1, obj), jsonobject, jsonobject1, kz1);
                }
            }

            Iterator iterator1 = jsonarray1.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj1 = iterator1.next();
                if (!jsonarray.containsKey(obj1))
                {
                    kz1.b(lf.a(s, s1, obj1), jsonarray1.get(obj1));
                }
            }
        }
    }

    protected final void c(String s, JSONArray jsonarray, JSONArray jsonarray1, kz kz1)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            Object obj = jsonarray.get(i);
            Object obj1 = jsonarray1.get(i);
            a((new StringBuilder()).append(s).append("[").append(i).append("]").toString(), obj, obj1, kz1);
        }

    }

    protected final void d(String s, JSONArray jsonarray, JSONArray jsonarray1, kz kz1)
    {
        HashSet hashset;
        int j;
        hashset = new HashSet();
        j = 0;
_L16:
        if (j >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = jsonarray.get(j);
        i = 0;
_L15:
        Object obj1;
        if (i >= jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_263;
        }
        obj1 = jsonarray1.get(i);
        if (hashset.contains(Integer.valueOf(i)) || !obj1.getClass().equals(obj.getClass())) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof JSONObject)) goto _L6; else goto _L5
_L5:
        if (!a((JSONObject)obj, (JSONObject)obj1).a) goto _L4; else goto _L7
_L7:
        hashset.add(Integer.valueOf(i));
        i = 1;
_L13:
        if (i != 0) goto _L9; else goto _L8
_L8:
        kz1.a((new StringBuilder()).append(s).append("[").append(j).append("] Could not find match for element ").append(obj).toString());
_L2:
        return;
_L6:
        if (!(obj instanceof JSONArray)) goto _L11; else goto _L10
_L10:
        if (!a((JSONArray)obj, (JSONArray)obj1).a) goto _L4; else goto _L12
_L12:
        hashset.add(Integer.valueOf(i));
        i = 1;
          goto _L13
_L11:
        if (!obj.equals(obj1)) goto _L4; else goto _L14
_L14:
        hashset.add(Integer.valueOf(i));
        i = 1;
          goto _L13
_L4:
        i++;
          goto _L15
_L9:
        j++;
          goto _L16
        i = 0;
          goto _L13
    }
}
