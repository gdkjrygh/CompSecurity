// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            b

public class d extends b
{

    String a;
    String b;
    String c;
    long d;
    long e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    boolean l;
    boolean m;

    public d()
    {
    }

    public String a()
    {
        return a;
    }

    protected void a(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.getString("identifier");
        c = jsonobject.getString("versionKey");
        b = jsonobject.getString("contentIdentifier");
        d = jsonobject.getLong("beginDate");
        e = jsonobject.getLong("endDate");
        j = jsonobject.getString("contentURL");
        f = jsonobject.getString("title");
        g = jsonobject.getString("paragraph");
        h = jsonobject.getString("dismissButtonText");
        i = jsonobject.optString("actionButtonText", "Yes");
        k = jsonobject.getString("layoutStyle");
        l = jsonobject.getBoolean("showsNewBanner");
        m = jsonobject.getBoolean("isSplitButton");
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return j;
    }

    public String d()
    {
        return b;
    }

    public long e()
    {
        return d;
    }

    public long f()
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
        return k;
    }

    public boolean l()
    {
        return l;
    }

    public boolean m()
    {
        return m;
    }
}
