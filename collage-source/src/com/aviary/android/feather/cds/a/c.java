// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import com.aviary.android.feather.common.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            b

public class c extends b
{
    public static class a
    {

        final String a;
        final String b;

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ManifestPackItem{ identifier: ").append(a).append(", versionKey: ").append(b).append("}").toString();
        }

        public a(JSONObject jsonobject, boolean flag)
            throws JSONException
        {
            a = jsonobject.getString("identifier");
            if (flag)
            {
                b = jsonobject.getString("versionKey");
                return;
            } else
            {
                b = jsonobject.optString("versionKey");
                return;
            }
        }
    }


    HashMap a;
    HashMap b;
    HashMap c;
    HashMap d;
    HashMap e;
    List f;
    HashMap g;
    private String h;
    private String i;
    private String j;
    private boolean k;

    public c()
    {
        a = new HashMap();
        b = new HashMap();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = new ArrayList();
        g = new HashMap();
    }

    private void a(JSONArray jsonarray, List list, HashMap hashmap, boolean flag)
        throws JSONException
    {
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            a a1 = new a(jsonarray.getJSONObject(i1), flag);
            list.add(a1);
            if (hashmap != null)
            {
                hashmap.put(a1.a(), Boolean.valueOf(true));
            }
        }

    }

    private void a(JSONObject jsonobject, String s, List list, HashMap hashmap, boolean flag)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray(s);
        for (int i1 = 0; i1 < jsonobject.length(); i1++)
        {
            s = new a(jsonobject.getJSONObject(i1), flag);
            list.add(s);
            if (hashmap != null)
            {
                hashmap.put(s.a(), Boolean.valueOf(true));
            }
        }

    }

    public String a()
    {
        return h;
    }

    protected void a(JSONArray jsonarray)
    {
        int i1 = 0;
        while (i1 < jsonarray.length()) 
        {
            try
            {
                f.add(jsonarray.getString(i1));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            i1++;
        }
    }

    protected void a(JSONObject jsonobject)
        throws JSONException
    {
        h = jsonobject.getString("assetsBaseURL");
        i = jsonobject.getString("versionKey");
        j = jsonobject.getString("formatListId");
        Object obj = jsonobject.optJSONObject("packs");
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (obj != null)
        {
            b(((JSONObject) (obj)).getJSONObject("effects"), "effects");
            b(((JSONObject) (obj)).getJSONObject("frames"), "frames");
            b(((JSONObject) (obj)).getJSONObject("stickers"), "stickers");
        }
        obj = jsonobject.optJSONObject("messages");
        if (obj != null)
        {
            a(((JSONObject) (obj)).getJSONObject("launch"), "launch");
        }
        obj = jsonobject.optJSONArray("subscriptions");
        if (obj != null)
        {
            b(((JSONArray) (obj)));
        }
        jsonobject = jsonobject.optJSONArray("permissions");
        if (jsonobject != null)
        {
            a(((JSONArray) (jsonobject)));
        }
    }

    protected void a(JSONObject jsonobject, String s)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        a(jsonobject, "enabled", ((List) (arraylist)), e, true);
        if (arraylist.size() > 0)
        {
            d.put(s, arraylist);
        }
    }

    public String b()
    {
        return i;
    }

    protected void b(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        a(jsonarray, arraylist, c, true);
        if (arraylist.size() > 0)
        {
            g.put("enabled", arraylist);
        }
    }

    protected void b(JSONObject jsonobject, String s)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        a(jsonobject, "enabled", arraylist, c, true);
        if (arraylist.size() > 0)
        {
            a.put(s, arraylist);
        }
        arraylist = new ArrayList();
        a(jsonobject, "deleted", arraylist, null, false);
        if (arraylist.size() > 0)
        {
            b.put(s, arraylist);
        }
    }

    public boolean b(String s)
    {
        return c.containsKey(s);
    }

    public String c()
    {
        return j;
    }

    public boolean c(String s)
    {
        return e.containsKey(s);
    }

    public List d(String s)
    {
        return (List)b.get(s);
    }

    public boolean d()
    {
        return a.size() > 0;
    }

    public boolean e()
    {
        return b.size() > 0;
    }

    public boolean f()
    {
        return g.size() > 0;
    }

    public boolean g()
    {
        return d.size() > 0;
    }

    public boolean h()
    {
        return k;
    }

    public HashMap i()
    {
        return d;
    }

    public HashMap j()
    {
        return a;
    }

    public HashMap k()
    {
        return g;
    }

    public List l()
    {
        Collections.sort(f);
        return f;
    }

    public String m()
    {
        return com.aviary.android.feather.common.utils.k.a(f);
    }

    public List p()
    {
        ArrayList arraylist = new ArrayList();
        List list = d("effects");
        if (list != null)
        {
            arraylist.addAll(list);
        }
        list = d("frames");
        if (list != null)
        {
            arraylist.addAll(list);
        }
        list = d("stickers");
        if (list != null)
        {
            arraylist.addAll(list);
        }
        return arraylist;
    }
}
