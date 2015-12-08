// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aaK
    implements aaO
{
    static final class a
    {

        boolean a;
        int b;

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            a = false;
            b = 0;
            a = false;
            b = 0;
        }
    }

    public static final class b
        implements aaP
    {

        public final aaO a(ZL zl)
        {
            return new aaK();
        }

        public b()
        {
        }
    }


    private Map a;

    public aaK()
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
            obj = (a)((java.util.Map.Entry) (obj)).getValue();
            try
            {
                jsonarray.put((new JSONObject()).put("appLoads", jsonobject).put("count", ((a) (obj)).b).put("current", ((a) (obj)).a));
            }
            catch (JSONException jsonexception) { }
        }

        return jsonarray;
    }

    public final aaO a(aai aai1)
    {
        Iterator iterator = aai1.c().iterator();
        Object obj = null;
        while (iterator.hasNext()) 
        {
            aai1 = (aag)iterator.next();
            if (!(aai1 instanceof aaq))
            {
                aai1 = null;
            } else
            {
                JSONObject jsonobject = (JSONObject)aai1.a();
                if (jsonobject == null)
                {
                    aai1 = null;
                } else
                {
                    aai1 = new HashMap(jsonobject.length());
                    Iterator iterator1 = jsonobject.keys();
                    while (iterator1.hasNext()) 
                    {
                        String s = (String)iterator1.next();
                        aai1.put(s, jsonobject.opt(s));
                    }
                }
            }
            if (aai1 != null)
            {
                a a1 = (a)a.get(aai1);
                obj = a1;
                if (a1 == null)
                {
                    obj = new a();
                    a.put(aai1, obj);
                }
                obj.b = ((a) (obj)).b + 1;
            } else
            {
                aai1 = ((aai) (obj));
            }
            obj = aai1;
        }
        if (obj != null)
        {
            ((a)a.get(obj)).a = true;
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
            return null;
        }
        return s;
    }
}
