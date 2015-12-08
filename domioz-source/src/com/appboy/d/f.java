// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import a.a.az;
import a.a.bu;
import a.a.dm;
import a.a.j;
import com.appboy.f.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            d, b, i

public abstract class f extends d
    implements b
{

    private String e;
    private int f;
    private int g;
    private boolean h;
    private List i;

    protected f()
    {
        f = 0;
        g = 0;
    }

    public f(JSONObject jsonobject, az az1)
    {
        this(jsonobject, az1, jsonobject.optString("header"), jsonobject.optInt("header_text_color"), jsonobject.optInt("close_btn_color"));
        if (jsonobject.optJSONArray("btns") != null)
        {
            az1 = new ArrayList();
            jsonobject = jsonobject.optJSONArray("btns");
            for (int k = 0; k < jsonobject.length(); k++)
            {
                az1.add(new i(jsonobject.optJSONObject(k)));
            }

            i = az1;
        }
    }

    private f(JSONObject jsonobject, az az1, String s, int k, int l)
    {
        super(jsonobject, az1);
        f = 0;
        g = 0;
        e = s;
        f = k;
        g = l;
    }

    public final boolean a(i k)
    {
        if (dm.b(b) && dm.b(c))
        {
            return false;
        }
        if (k == null)
        {
            com.appboy.f.a.c(a, "Message button was null. Ignoring button click.");
            return false;
        }
        if (h)
        {
            com.appboy.f.a.b(a, "Button click already logged for this message. Ignoring.");
            return false;
        }
        if (d == null)
        {
            com.appboy.f.a.d(a, "Cannot log a button click because the AppboyManager is null.");
            return false;
        }
        try
        {
            String s1 = b;
            String s = c;
            JSONObject jsonobject = new JSONObject();
            if (!dm.b(s1))
            {
                JSONArray jsonarray1 = new JSONArray();
                jsonarray1.put(s1);
                jsonobject.put("campaign_ids", jsonarray1);
            }
            if (!dm.b(s))
            {
                JSONArray jsonarray = new JSONArray();
                jsonarray.put(s);
                jsonobject.put("card_ids", jsonarray);
            }
            jsonobject.put("bid", k.b());
            k = new bu(j.q, jsonobject);
            d.a(k);
            h = true;
        }
        // Misplaced declaration of an exception variable
        catch (i k)
        {
            d.a(k);
            return false;
        }
        return true;
    }

    public final List e_()
    {
        return i;
    }

    public final String t()
    {
        return e;
    }

    public final int u()
    {
        return f;
    }

    public final int v()
    {
        return g;
    }
}
