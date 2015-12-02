// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mobvista.sdk.m.a.a.c.a;
import com.mobvista.sdk.m.core.entity.b;
import com.mobvista.sdk.m.core.entity.c;
import com.mobvista.sdk.m.core.p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            m

public final class l extends a
{

    private Context c;
    private String d;

    public l()
    {
    }

    private static m a(String s)
    {
        int i = 0;
        Object obj;
        ArrayList arraylist;
        s = new String(Base64.decode(URLDecoder.decode(s, "UTF-8"), 0));
        com.mobvista.sdk.m.a.b.a.a.a("ProfileLoader", s);
        obj = new JSONObject(s);
        s = new m();
        s.a(((JSONObject) (obj)).optInt("status"));
        s.a(((JSONObject) (obj)).optString("msg"));
        if (s.a() != com.mobvista.sdk.m.core.loader.m.a)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj = ((JSONObject) (obj)).optJSONArray("data");
        arraylist = new ArrayList();
_L1:
        if (i >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_335;
        }
        JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        b b1 = new b();
        if (jsonobject.has("name"))
        {
            b1.a(jsonobject.optString("name"));
        }
        if (jsonobject.has("ver"))
        {
            b1.a(jsonobject.optInt("ver"));
        }
        if (jsonobject.has("url"))
        {
            b1.b(jsonobject.optString("url"));
        }
        if (jsonobject.has("check"))
        {
            b1.c(jsonobject.optString("check"));
        }
        if (jsonobject.has("state"))
        {
            b1.b(jsonobject.optInt("state"));
        }
        if (jsonobject.has("entryClass"))
        {
            b1.e(jsonobject.optString("entryClass"));
        }
        if (jsonobject.has("appID"))
        {
            b1.d(jsonobject.optString("appID"));
        }
        if (jsonobject.has("pubID"))
        {
            b1.g(jsonobject.optString("pubID"));
        }
        if (jsonobject.has("modPn"))
        {
            b1.f(jsonobject.optString("modPn"));
        }
        if (jsonobject.has("weight"))
        {
            b1.a(a(jsonobject.optJSONObject("weight")));
        }
        arraylist.add(b1);
        i++;
          goto _L1
        s.a(arraylist);
        return s;
        s;
        s.printStackTrace();
_L3:
        return null;
        s;
        s.printStackTrace();
        if (true) goto _L3; else goto _L2
_L2:
    }

    private m a(byte abyte0[])
    {
label0:
        {
            if (abyte0 != null && abyte0.length > 0)
            {
                abyte0 = new String(abyte0);
                if (!TextUtils.isEmpty(abyte0))
                {
                    break label0;
                }
            }
            return null;
        }
        return a(((String) (abyte0)));
    }

    private static Map a(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        String s;
        c c1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s, c1))
        {
            s = (String)iterator.next();
            JSONObject jsonobject1 = jsonobject.optJSONObject(s);
            c1 = new c();
            c1.a(s);
            c1.b(jsonobject1.optString("unitID"));
            c1.a(jsonobject1.optInt("weight"));
        }

        return hashmap;
    }

    private String b()
    {
        String s = (new StringBuilder()).append(System.currentTimeMillis()).toString();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt("appID", p.a);
            jsonobject.putOpt("unit_id", d);
            jsonobject.putOpt("appVer", com.mobvista.sdk.m.a.f.b.j(c));
            jsonobject.putOpt("pID", "-");
            jsonobject.putOpt("sdkVer", "6.1.2 M");
            jsonobject.putOpt("pkName", com.mobvista.sdk.m.a.f.b.m(c));
            jsonobject.putOpt("appName", com.mobvista.sdk.m.a.f.b.n(c));
            jsonobject.putOpt("aID", com.mobvista.sdk.m.a.f.b.e(c));
            jsonobject.putOpt("pl", "android");
            jsonobject.putOpt("gmsVer", "0");
            jsonobject.putOpt("imei", com.mobvista.sdk.m.a.f.b.a(c));
            jsonobject.putOpt("imsi", com.mobvista.sdk.m.a.f.b.b(c));
            jsonobject.putOpt("mac", com.mobvista.sdk.m.a.f.b.h(c));
            jsonobject.putOpt("cl", com.mobvista.sdk.m.a.f.b.f(c));
            jsonobject.putOpt("osVer", android.os.Build.VERSION.RELEASE);
            jsonobject.putOpt("brand", com.mobvista.sdk.m.a.f.b.b());
            jsonobject.putOpt("model", com.mobvista.sdk.m.a.f.b.a());
            jsonobject.putOpt("res", (new StringBuilder()).append(com.mobvista.sdk.m.a.f.b.k(c)).append("x").append(com.mobvista.sdk.m.a.f.b.l(c)).toString());
            jsonobject.putOpt("net", Integer.valueOf(com.mobvista.sdk.m.a.f.b.q(c)));
            jsonobject.putOpt("ts", s);
            jsonobject.putOpt("s", com.mobvista.sdk.m.a.f.c.a((new StringBuilder()).append(p.a).append("6.1.2 M").append(com.mobvista.sdk.m.a.f.b.m(c)).append(com.mobvista.sdk.m.a.f.b.a(c)).append(com.mobvista.sdk.m.a.f.b.b(c)).append(s).toString()));
            s = new String(Base64.encode(jsonobject.toString().getBytes(), 0));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return "";
        }
        return s;
    }

    protected final volatile Object a(Map map, byte abyte0[])
    {
        return a(abyte0);
    }

    protected final String a()
    {
        String s = "";
        String s1 = (new StringBuilder("?d=")).append(URLEncoder.encode(b(), "UTF-8")).toString();
        s = s1;
_L2:
        return (new StringBuilder("http://net.rayjump.com/mdt/get_profile.php")).append(s).toString();
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        unsupportedencodingexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(Context context, String s)
    {
        c = context;
        d = s;
    }
}
