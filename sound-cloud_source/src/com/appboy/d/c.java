// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import bo.app.bx;
import bo.app.ct;
import bo.app.eq;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            f, b

public abstract class c extends f
    implements b
{

    public String a;
    public String b;
    private boolean o;

    protected c()
    {
        o = false;
    }

    public c(JSONObject jsonobject, bx bx1)
    {
        super(jsonobject, bx1);
        o = false;
        if (!eq.c(jsonobject.optString("zipped_assets_url")))
        {
            a = jsonobject.optString("zipped_assets_url");
        }
    }

    public final boolean a(String s)
    {
        while (eq.b(f) && eq.b(g) || o || h == null) 
        {
            return false;
        }
        try
        {
            s = ct.a(f, g, s);
            h.a(s);
            o = true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.a(s);
            return false;
        }
        return true;
    }

    public final String u()
    {
        return b;
    }
}
