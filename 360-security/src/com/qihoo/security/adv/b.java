// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.adv:
//            a, d, c, e, 
//            AdvDataManager

public class b
{

    public static a a(JSONObject jsonobject)
    {
        a a1 = null;
        if (jsonobject != null)
        {
            a1 = new a();
            a1.a(jsonobject.optLong("responseTime"));
            a1.a(jsonobject.optInt("result"));
            a1.b(jsonobject.optLong("expired"));
            a1.a(a(jsonobject.optJSONArray("data")));
            a1.b(c(jsonobject.optJSONArray("standby")));
        }
        return a1;
    }

    public static ArrayList a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            for (int i = 0; i < j; i++)
            {
                d d1 = b(jsonarray.optJSONObject(i));
                if (d1 != null)
                {
                    arraylist.add(d1);
                }
            }

        }
        return arraylist;
    }

    public static d b(JSONObject jsonobject)
    {
        d d1 = null;
        if (jsonobject != null)
        {
            d d2 = new d();
            d2.b(jsonobject.optInt("pid"));
            d2.c(jsonobject.optInt("tp"));
            d2.d(jsonobject.optInt("state"));
            d2.a(jsonobject.optString("p1"));
            d2.b(jsonobject.optString("p2"));
            if (jsonobject.has("source"))
            {
                d2.a(b(jsonobject.optJSONArray("source")));
            }
            d1 = d2;
            if (jsonobject.has("ad"))
            {
                d2.a(d(jsonobject.optJSONObject("ad")));
                d1 = d2;
            }
        }
        return d1;
    }

    public static ArrayList b(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            for (int i = 0; i < j; i++)
            {
                c c1 = c(jsonarray.optJSONObject(i));
                if (c1 != null)
                {
                    arraylist.add(c1);
                }
            }

        }
        Collections.sort(arraylist);
        return arraylist;
    }

    public static c c(JSONObject jsonobject)
    {
        c c1 = null;
        if (jsonobject != null)
        {
            c1 = new c();
            c1.a(jsonobject.optString("key"));
            c1.a(jsonobject.optInt("level"));
            c1.b(jsonobject.optInt("sid"));
        }
        return c1;
    }

    public static ArrayList c(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            for (int i = 0; i < j; i++)
            {
                e e1 = d(jsonarray.optJSONObject(i));
                if (e1 != null)
                {
                    arraylist.add(e1);
                }
            }

        }
        return arraylist;
    }

    public static e d(JSONObject jsonobject)
    {
        e e1 = null;
        if (jsonobject != null)
        {
            e1 = new e();
            e1.c(jsonobject.optString("adid"));
            e1.d(jsonobject.optString("title"));
            e1.e(jsonobject.optString("des"));
            e1.f(jsonobject.optString("pkg"));
            e1.g(jsonobject.optString("size"));
            e1.h(jsonobject.optString("sc"));
            String s = jsonobject.optString("icon");
            e1.i(AdvDataManager.a().a(0, s));
            s = jsonobject.optString("creatives");
            e1.j(AdvDataManager.a().a(1, s));
            e1.k(jsonobject.optString("dev"));
            e1.a(jsonobject.optInt("openType"));
            e1.l(jsonobject.optString("openUrl"));
            e1.m(jsonobject.optString("installs"));
            e1.n(jsonobject.optString("impr"));
            e1.o(jsonobject.optString("c1"));
            e1.p(jsonobject.optString("c2"));
            e1.q(jsonobject.optString("c3"));
            e1.b(jsonobject.optString("btndesc"));
            e1.a(jsonobject.optString("btnname"));
        }
        return e1;
    }
}
