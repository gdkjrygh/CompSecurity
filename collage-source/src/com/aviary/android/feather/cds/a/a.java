// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            b

public class com.aviary.android.feather.cds.a.a extends b
{
    public static class a
    {

        final String a;
        final String b;
        final byte c[];

        public static a a(JSONObject jsonobject)
            throws JSONException
        {
            return new a(jsonobject.getString("identifier"), jsonobject.getString("displayName"), jsonobject.optJSONObject("options"));
        }

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public byte[] c()
        {
            return c;
        }

        public String toString()
        {
            if (c != null)
            {
                return (new StringBuilder()).append("{").append(a).append(", ").append(b).append(", ").append(c).append("}").toString();
            } else
            {
                return (new StringBuilder()).append("{").append(a).append(", ").append(b).append("}").toString();
            }
        }

        a(String s, String s1, JSONObject jsonobject)
        {
            a = s;
            b = s1;
            if (jsonobject != null)
            {
                c = jsonobject.toString().getBytes();
                return;
            } else
            {
                c = null;
                return;
            }
        }
    }


    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    boolean l;
    List m;

    public com.aviary.android.feather.cds.a.a()
    {
    }

    public List a()
    {
        return m;
    }

    protected void a(JSONObject jsonobject)
        throws JSONException
    {
        m = new ArrayList();
        a = jsonobject.getString("identifier");
        b = jsonobject.getString("versionKey");
        c = jsonobject.getString("packType");
        d = jsonobject.getString("displayName");
        e = jsonobject.getString("displayDescription");
        f = jsonobject.getString("icon");
        g = jsonobject.getString("iconVersion");
        h = jsonobject.getString("previewURL");
        i = jsonobject.getString("previewVersion");
        j = jsonobject.getString("contentURL");
        k = jsonobject.getString("contentVersion");
        l = jsonobject.getBoolean("isFree");
        jsonobject = jsonobject.getJSONArray("items");
        for (int i1 = 0; i1 < jsonobject.length(); i1++)
        {
            a a1 = a.a(jsonobject.getJSONObject(i1));
            m.add(a1);
        }

    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        return e;
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        return g;
    }

    public String i()
    {
        return h;
    }

    public String j()
    {
        return i;
    }

    public String k()
    {
        return j;
    }

    public String l()
    {
        return k;
    }

    public boolean m()
    {
        return l;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("ContentParser:\n");
        stringbuffer.append((new StringBuilder()).append("\tidentifier: ").append(a).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tversionKey: ").append(b).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tpackType: ").append(c).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tdisplayName: ").append(d).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tdisplayDescription: ").append(e).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\ticonURL: ").append(f).append(", iconVersion: ").append(g).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tpreviewURL: ").append(h).append(", previewVersion: ").append(i).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tcontentURL: ").append(j).append(", contentVersion: ").append(k).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\tisFree: ").append(l).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("\titems: ").append(m).append("\n").toString());
        return stringbuffer.toString();
    }
}
