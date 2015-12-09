// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

public final class dyv
    implements dyw
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final String e;

    public dyv(JSONObject jsonobject)
    {
        ctz.a(jsonobject);
        a = jsonobject.optBoolean("pretick_eula");
        b = jsonobject.optBoolean("can_accept_licenses_in_one_step", true);
        c = jsonobject.optBoolean("requires_marketing_opt_in", false);
        d = jsonobject.optString("marketing_opt_in_contact_us_url");
        e = jsonobject.optString("country");
    }

    public final boolean a()
    {
        return b;
    }

    public final boolean b()
    {
        return a;
    }

    public final boolean c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }
}
