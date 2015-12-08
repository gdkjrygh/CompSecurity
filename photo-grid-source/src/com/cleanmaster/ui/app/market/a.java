// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            Ad

public class a extends Ad
{

    private String a;

    public a()
    {
    }

    public a a(JSONObject jsonobject)
    {
        super.fromJSONObject(jsonobject);
        a(jsonobject.optString("trigger_pkgs", ""));
        return this;
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        a = s;
    }

    public Ad fromJSONObject(JSONObject jsonobject)
    {
        return a(jsonobject);
    }

    public Object fromJSONObject(JSONObject jsonobject)
    {
        return a(jsonobject);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("  trigger_pkgs=").append(a()).toString();
    }
}
