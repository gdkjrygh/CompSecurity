// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.userdata;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.s;
import java.util.ArrayList;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.userdata:
//            a, e, b, d, 
//            c

public class UserDataPlugin extends d
{

    private static final b a = org.c.c.a("CardsWebUserData");
    private static boolean b;
    private e d;
    private com.kik.cards.web.browser.BrowserPlugin.a e;
    private ArrayList f;

    public UserDataPlugin(com.kik.cards.web.userdata.a a1, com.kik.cards.web.browser.BrowserPlugin.a a2)
    {
        super("UserData");
        d = null;
        f = new ArrayList();
        d = a1.a();
        e = a2;
        b = false;
    }

    static ArrayList a(UserDataPlugin userdataplugin)
    {
        return userdataplugin.f;
    }

    static void a(a a1, JSONObject jsonobject)
    {
        a(a1, 200, jsonobject);
    }

    static void b(a a1, JSONObject jsonobject)
    {
        a(a1, 500, jsonobject);
    }

    static b c()
    {
        return a;
    }

    static boolean d()
    {
        b = false;
        return false;
    }

    public j checkPermissions(JSONObject jsonobject)
    {
        jsonobject = new JSONObject();
        boolean flag;
        try
        {
            flag = ((Boolean)s.b(d.a(), 100L)).booleanValue();
        }
        catch (InterruptedException interruptedexception)
        {
            flag = false;
        }
        jsonobject.put("permitted", flag);
_L2:
        return new j(jsonobject);
        JSONException jsonexception;
        jsonexception;
        jsonobject = null;
_L3:
        a.b((new StringBuilder("Error firing back event: ")).append(jsonexception).toString());
        if (true) goto _L2; else goto _L1
_L1:
        jsonexception;
          goto _L3
    }

    public j getUserData(a a1, JSONObject jsonobject, String s1)
    {
        boolean flag = false;
        int i = 0;
        if (e.e())
        {
            return new j(405);
        }
        JSONArray jsonarray = jsonobject.optJSONArray("fields");
        boolean flag1 = jsonobject.optBoolean("skipPrompt", false);
        if (jsonarray != null)
        {
            jsonobject = new ArrayList();
            for (; i < jsonarray.length(); i++)
            {
                jsonobject.add(jsonarray.optString(i, ""));
            }

            flag = jsonobject.contains("profile");
        }
        if (d.a(flag1, s1))
        {
            return new j(420);
        }
        f.add(a1);
        if (!b)
        {
            b = true;
            d.a(flag, flag1, s1).a(new com.kik.cards.web.userdata.b(this));
        }
        return new j(202);
    }

    public j pickFilteredUsers(a a1, JSONObject jsonobject)
    {
        boolean flag = false;
        if (e.e())
        {
            return new j(405);
        }
        int l = jsonobject.optInt("minResults", 1);
        int i1 = jsonobject.optInt("maxResults", -1);
        boolean flag1 = jsonobject.optBoolean("filterSelf", true);
        ArrayList arraylist = new ArrayList();
        Object obj = jsonobject.optJSONArray("filtered");
        if (obj != null)
        {
            for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
            {
                arraylist.add(((JSONArray) (obj)).getString(i));
            }

        }
        if (i1 != -1 && l > i1 || l < 0)
        {
            throw new JSONException("minResults must be nonnegative and cannot be greater than maxResults");
        }
        jsonobject = jsonobject.optJSONArray("preselected");
        obj = new ArrayList();
        if (jsonobject != null)
        {
            for (int k = ((flag) ? 1 : 0); k < jsonobject.length(); k++)
            {
                ((ArrayList) (obj)).add(jsonobject.getString(k));
            }

        }
        d.a(l, i1, ((java.util.List) (obj)), flag1, arraylist).a(new com.kik.cards.web.userdata.d(this, a1));
        return new j(202);
    }

    public j pickUsers(a a1, JSONObject jsonobject)
    {
        if (e.e())
        {
            return new j(405);
        }
        int k = jsonobject.optInt("minResults", 1);
        int l = jsonobject.optInt("maxResults", -1);
        if (l != -1 && k > l || k < 0)
        {
            throw new JSONException("minResults must be nonnegative and cannot be greater than maxResults");
        }
        jsonobject = jsonobject.optJSONArray("preselected");
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                arraylist.add(jsonobject.getString(i));
            }

        }
        d.a(k, l, arraylist).a(new com.kik.cards.web.userdata.c(this, a1));
        return new j(202);
    }

}
