// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cw, br, bp, bz, 
//            cx, au

public final class cs
    implements cw
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
        implements cx
    {

        public final cw a(au au)
        {
            return new cs();
        }

        public b()
        {
        }
    }


    private Map a;

    public cs()
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

    public final cw a(br br1)
    {
        Iterator iterator = br1.c().iterator();
        Object obj = null;
        while (iterator.hasNext()) 
        {
            br1 = (bp)iterator.next();
            if (!(br1 instanceof bz))
            {
                br1 = null;
            } else
            {
                JSONObject jsonobject = (JSONObject)br1.a();
                if (jsonobject == null)
                {
                    br1 = null;
                } else
                {
                    br1 = new HashMap(jsonobject.length());
                    Iterator iterator1 = jsonobject.keys();
                    while (iterator1.hasNext()) 
                    {
                        String s = (String)iterator1.next();
                        br1.put(s, jsonobject.opt(s));
                    }
                }
            }
            if (br1 != null)
            {
                a a1 = (a)a.get(br1);
                obj = a1;
                if (a1 == null)
                {
                    obj = new a();
                    a.put(br1, obj);
                }
                obj.b = ((a) (obj)).b + 1;
            } else
            {
                br1 = ((br) (obj));
            }
            obj = br1;
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
}
