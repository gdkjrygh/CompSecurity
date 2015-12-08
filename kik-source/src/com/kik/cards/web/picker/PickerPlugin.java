// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.picker;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import org.c.b;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.picker:
//            PickerRequest, a

public class PickerPlugin extends d
{

    private static final b a = org.c.c.a("CardsWebPicker");
    private com.kik.cards.web.browser.BrowserPlugin.a b;
    private PickerRequest d;
    private String e;
    private JSONObject f;

    public PickerPlugin(String s, com.kik.cards.web.browser.BrowserPlugin.a a1)
    {
        super("Picker");
        e = s;
        b = a1;
    }

    public PickerPlugin(String s, com.kik.cards.web.browser.BrowserPlugin.a a1, PickerRequest pickerrequest)
    {
        super("Picker");
        e = s;
        b = a1;
        d = pickerrequest;
    }

    public final String c()
    {
        return e;
    }

    public j cancelRequest(JSONObject jsonobject)
    {
        if (!b.e() && d != null)
        {
            e = null;
            d = null;
            b.a(null);
            return new j();
        } else
        {
            return new j(405);
        }
    }

    public j completeRequest(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("responseData");
        if (!b.e() && d != null)
        {
            jsonobject = jsonobject1;
            if (jsonobject1 != null)
            {
                jsonobject = jsonobject1;
                if (jsonobject1.length() == 0)
                {
                    jsonobject = null;
                }
            }
            d = null;
            b.a(jsonobject);
            return new j();
        } else
        {
            return new j(405);
        }
    }

    public j forwardRequest(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("target");
        if (d == null || !b.b(jsonobject) || e.equals(jsonobject) || b.e())
        {
            return new j(405);
        } else
        {
            b.a(jsonobject, d);
            return new j(202);
        }
    }

    public j getRequest(JSONObject jsonobject)
    {
        if (d != null)
        {
            jsonobject = new JSONObject();
            try
            {
                jsonobject.put("requestData", d.b);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                a.b((new StringBuilder("Error generating getRequest result: ")).append(jsonobject.getMessage()).toString());
                return new j(500);
            }
            return new j(jsonobject);
        } else
        {
            return new j(405);
        }
    }

    public j startRequest(a a1, JSONObject jsonobject)
    {
        String s = jsonobject.optString("requestUrl");
        f = jsonobject.optJSONObject("requestData");
        if (e.equals(s) || b.e())
        {
            return new j(405);
        }
        jsonobject = new PickerRequest(e, f);
        if (f == null || a1 == null)
        {
            return new j(400);
        } else
        {
            b.b(s, jsonobject).a(new com.kik.cards.web.picker.a(this, a1));
            return new j(202);
        }
    }

}
