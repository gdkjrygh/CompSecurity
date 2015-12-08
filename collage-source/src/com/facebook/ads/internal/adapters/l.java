// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.internal.util.e;
import com.facebook.ads.internal.util.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            a

public class l
    implements a
{

    private final String a;
    private final String b;
    private final String c;
    private final e d;
    private final String e;
    private final Collection f;
    private final Map g;
    private final String h;
    private final int i;
    private final int j;

    private l(String s, String s1, String s2, e e1, String s3, Collection collection, Map map, 
            String s4, int i1, int j1)
    {
        a = s;
        b = s1;
        c = s2;
        d = e1;
        e = s3;
        f = collection;
        g = map;
        h = s4;
        i = i1;
        j = j1;
    }

    public static l a(Bundle bundle)
    {
        String s = bundle.getString("markup");
        String s1 = bundle.getString("native_impression_report_url");
        String s2 = bundle.getString("request_id");
        int i1 = bundle.getInt("viewability_check_initial_delay");
        int j1 = bundle.getInt("viewability_check_interval");
        return new l(s, null, s1, e.a, "", null, null, s2, i1, j1);
    }

    public static l a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        String s = jsonobject.optString("markup");
        String s1 = jsonobject.optString("activation_command");
        String s2 = jsonobject.optString("native_impression_report_url");
        String s3 = jsonobject.optString("request_id");
        e e1 = com.facebook.ads.internal.util.e.a(jsonobject.optString("invalidation_behavior"));
        String s4 = jsonobject.optString("invalidation_report_url");
        Object obj;
        HashMap hashmap;
        try
        {
            obj = new JSONArray(jsonobject.optString("detection_strings"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
            obj = null;
        }
        obj = com.facebook.ads.internal.util.f.a(((JSONArray) (obj)));
        jsonobject = jsonobject.optJSONObject("metadata");
        hashmap = new HashMap();
        if (jsonobject != null)
        {
            String s5;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s5, jsonobject.optString(s5)))
            {
                s5 = (String)iterator.next();
            }

        }
        int i1 = 0;
        int j1 = 1000;
        if (hashmap.containsKey("viewability_check_initial_delay"))
        {
            i1 = Integer.parseInt((String)hashmap.get("viewability_check_initial_delay"));
        }
        if (hashmap.containsKey("viewability_check_interval"))
        {
            j1 = Integer.parseInt((String)hashmap.get("viewability_check_interval"));
        }
        return new l(s, s1, s2, e1, s4, ((Collection) (obj)), hashmap, s3, i1, j1);
    }

    public static l b(Intent intent)
    {
        String s = intent.getStringExtra("markup");
        String s1 = intent.getStringExtra("activation_command");
        String s2 = intent.getStringExtra("native_impression_report_url");
        String s3 = intent.getStringExtra("request_id");
        int i1 = intent.getIntExtra("viewability_check_initial_delay", 0);
        int j1 = intent.getIntExtra("viewability_check_interval", 1000);
        return new l(s, s1, s2, e.a, "", null, null, s3, i1, j1);
    }

    public e a()
    {
        return d;
    }

    public void a(Intent intent)
    {
        intent.putExtra("markup", a);
        intent.putExtra("activation_command", b);
        intent.putExtra("native_impression_report_url", c);
        intent.putExtra("request_id", h);
        intent.putExtra("viewability_check_initial_delay", i);
        intent.putExtra("viewability_check_interval", j);
    }

    public String b()
    {
        return e;
    }

    public Collection c()
    {
        return f;
    }

    public String d()
    {
        return a;
    }

    public String e()
    {
        return b;
    }

    public String f()
    {
        return c;
    }

    public String g()
    {
        return "facebookAd.sendImpression();";
    }

    public Map h()
    {
        return g;
    }

    public String i()
    {
        return h;
    }

    public int j()
    {
        return i;
    }

    public int k()
    {
        return j;
    }

    public Bundle l()
    {
        Bundle bundle = new Bundle();
        bundle.putString("markup", a);
        bundle.putString("native_impression_report_url", c);
        bundle.putString("request_id", h);
        bundle.putInt("viewability_check_initial_delay", i);
        bundle.putInt("viewability_check_interval", j);
        return bundle;
    }
}
