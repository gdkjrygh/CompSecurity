// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds.a:
//            b

public class e extends b
{

    String a;
    String b;
    String c;
    String d;
    String e;
    int f;

    public e()
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
        b = jsonobject.getString("versionKey");
        c = jsonobject.getString("displayName");
        d = jsonobject.getString("displayDescription");
        f = jsonobject.getInt("durationTier");
        e = jsonobject.getString("unlockType");
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }
}
