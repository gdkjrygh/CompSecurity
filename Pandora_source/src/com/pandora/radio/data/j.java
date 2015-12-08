// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j
    implements Comparable
{
    public static class a
        implements Serializable, Comparable
    {

        private String a;
        private String b;
        private String c;
        private String d;

        public int a(a a1)
        {
            if (this != a1)
            {
                int k = i.a(a, a1.a);
                if (k != 0)
                {
                    return k;
                }
                k = i.a(b, a1.b);
                if (k != 0)
                {
                    return k;
                }
                k = i.a(c, a1.c);
                if (k != 0)
                {
                    return k;
                }
                k = i.a(d, a1.d);
                if (k != 0)
                {
                    return k;
                }
            }
            return 0;
        }

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        public int compareTo(Object obj)
        {
            return a((a)obj);
        }

        public String d()
        {
            return d;
        }

        public String toString()
        {
            return b();
        }

        public a(String s, String s1, String s2, String s3)
        {
            a = s;
            b = s1;
            c = s2;
            d = s3;
        }

        public a(JSONObject jsonobject)
            throws JSONException
        {
            a = jsonobject.getString("stationId");
            b = jsonobject.getString("stationName");
            c = jsonobject.getString("stationToken");
            d = jsonobject.optString("artUrl");
        }
    }


    private String a;
    private String b;
    private String c;
    private ArrayList d;

    public j(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
        d = new ArrayList();
    }

    public j(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.getString("categoryName");
        c = jsonobject.optString("categoryAdUrl");
        b = a(c);
        jsonobject = jsonobject.getJSONArray("stations");
        if (jsonobject != null)
        {
            d = new ArrayList(jsonobject.length());
            for (int k = 0; k < jsonobject.length(); k++)
            {
                d.add(new a(jsonobject.getJSONObject(k)));
            }

        } else
        {
            d = new ArrayList();
        }
    }

    private String a(String s)
    {
        if (!i.a(s))
        {
            int k = s.indexOf("gcat");
            if (k != -1)
            {
                return s.substring(k).split(";")[0].split("=")[1];
            }
        }
        return null;
    }

    public int a(j j1)
    {
        if (this == j1)
        {
            return 0;
        } else
        {
            return i.a(a, j1.a);
        }
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int compareTo(Object obj)
    {
        return a((j)obj);
    }

    public ArrayList d()
    {
        return d;
    }

    public String toString()
    {
        return a();
    }
}
