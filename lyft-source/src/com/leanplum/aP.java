// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.Handler;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            ac, T, aJ, aK, 
//            Leanplum, aU, ActionContext, a, 
//            c, N, ad

class aP
{

    final ac a;

    aP(ac ac1)
    {
        a = ac1;
        super();
    }

    public void a()
    {
        if (!ac.a(a))
        {
            Log.i("Leanplum", "Connected to development server");
            Object obj = new HashMap();
            ((Map) (obj)).put("appId", T.b());
            ((Map) (obj)).put("deviceId", T.c());
            try
            {
                aJ aj = ac.b(a);
                obj = new JSONArray(Arrays.asList(new JSONObject[] {
                    new JSONObject(((Map) (obj)))
                }));
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("name", "auth");
                jsonobject.put("args", obj);
                aj.f.post(new aK(aj, jsonobject));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            ac.c(a, true);
            ac.a(a, true);
            ac.b(a, false);
        }
    }

    public void a(Exception exception)
    {
        Log.e("Leanplum", "Development socket error", exception);
    }

    public void a(String s, JSONArray jsonarray)
    {
        if (!s.equals("updateVars")) goto _L2; else goto _L1
_L1:
        Leanplum.forceContentUpdate();
_L4:
        return;
_L2:
        if (!s.equals("trigger"))
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject;
        String s1;
        boolean flag;
        try
        {
            s = jsonarray.getJSONObject(0);
            jsonobject = s.getJSONObject("action");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Leanplum", "Error getting action info", s);
            return;
        }
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        jsonarray = s.getString("messageId");
        flag = s.getBoolean("isRooted");
        s1 = jsonobject.getString("__name__");
        s = (Map)aU.k().get(s1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        s = (Map)s.get("values");
_L5:
        s = new ActionContext(s1, (Map)aU.a(s, com.leanplum.a.a(jsonobject)), jsonarray);
        s.a();
        s.a(flag);
        s.b(true);
        s.b();
        Leanplum.a(s);
        c.a().b(jsonarray);
        return;
        s = null;
          goto _L5
        if (!s.equals("registerDevice")) goto _L4; else goto _L6
_L6:
        Leanplum.d();
        try
        {
            s = jsonarray.getJSONObject(0).getString("email");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        jsonarray = s;
        if (s == null)
        {
            jsonarray = "a Leanplum account";
        }
        N.a().a(new ad(this, jsonarray));
        return;
    }

    public void b()
    {
        Log.i("Leanplum", "Disconnected from development server");
        ac.a(a, false);
        ac.b(a, false);
        ac.c(a, false);
    }
}
