// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            dv, do, be, bc, 
//            cp, eu

public final class dn
    implements dv
{

    private Map a;

    public dn()
    {
        a = new HashMap();
    }

    private JSONArray a()
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            JSONObject jsonobject = new JSONObject((Map)((java.util.Map.Entry) (obj)).getKey());
            obj = (do)((java.util.Map.Entry) (obj)).getValue();
            try
            {
                jsonarray.put((new JSONObject()).put("appLoads", jsonobject).put("count", ((do) (obj)).b).put("current", ((do) (obj)).a));
            }
            catch (JSONException jsonexception) { }
        }

        return jsonarray;
    }

    public final dv a(be be1)
    {
        Iterator iterator = be1.c().iterator();
        Object obj = null;
        while (iterator.hasNext()) 
        {
            be1 = (bc)iterator.next();
            if (!(be1 instanceof cp))
            {
                be1 = null;
            } else
            {
                JSONObject jsonobject = (JSONObject)be1.a();
                if (jsonobject == null)
                {
                    be1 = null;
                } else
                {
                    be1 = new HashMap(jsonobject.length());
                    Iterator iterator1 = jsonobject.keys();
                    while (iterator1.hasNext()) 
                    {
                        String s = (String)iterator1.next();
                        be1.put(s, jsonobject.opt(s));
                    }
                }
            }
            if (be1 != null)
            {
                do do1 = (do)a.get(be1);
                obj = do1;
                if (do1 == null)
                {
                    obj = new do();
                    a.put(be1, obj);
                }
                obj.b = ((do) (obj)).b + 1;
            } else
            {
                be1 = ((be) (obj));
            }
            obj = be1;
        }
        if (obj != null)
        {
            ((do)a.get(obj)).a = true;
        }
        return this;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a().toString().getBytes("UTF8"));
    }

    public final String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
        }
        catch (JSONException jsonexception)
        {
            eu.a();
            return null;
        }
        return s;
    }
}
