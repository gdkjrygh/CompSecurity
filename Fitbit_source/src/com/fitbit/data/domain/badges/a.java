// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.badges;

import com.fitbit.d.b;
import com.fitbit.data.bl.ao;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class a
    implements b
{

    private static final String a = "badge";
    private String b;
    private String c;
    private long d;
    private String e;
    private Date f;
    private boolean g;

    public a()
    {
    }

    public String a()
    {
        return b;
    }

    public long b()
    {
        return d;
    }

    public String c()
    {
        return e;
    }

    public Date d()
    {
        return f;
    }

    public String e()
    {
        return c;
    }

    public boolean f()
    {
        return g;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        g = com.fitbit.d.a.a(jsonobject, "type").equalsIgnoreCase("badge");
        b = com.fitbit.d.a.a(jsonobject, "badgeType");
        f = new Date(com.fitbit.d.a.b(jsonobject, "timestamp", 0) * 1000L);
        c = ao.a(jsonobject.optJSONObject("badgeImageUrls"), 480);
        d = com.fitbit.d.a.a(jsonobject, "id", 0);
        e = com.fitbit.d.a.a(jsonobject, "badgeMessage");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    // Unreferenced inner class com/fitbit/data/domain/badges/a$a
    /* block-local class not found */
    class a {}

}
