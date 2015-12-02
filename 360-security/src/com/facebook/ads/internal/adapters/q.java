// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.internal.util.e;
import com.facebook.ads.internal.util.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            i

public class q
    implements i
{

    private final String a;
    private final String b;
    private final String c;
    private final e d;
    private final String e;
    private final Collection f;
    private final Map g;
    private final String h;

    private q(String s, String s1, String s2, e e1, String s3, Collection collection, Map map, 
            String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = e1;
        e = s3;
        f = collection;
        g = map;
        h = s4;
    }

    public static q a(Bundle bundle)
    {
        String s = bundle.getString("markup");
        String s1 = bundle.getString("native_impression_report_url");
        bundle = bundle.getString("request_id");
        return new q(s, null, s1, e.a, "", null, null, bundle);
    }

    public static q a(JSONObject jsonobject)
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
        obj = com.facebook.ads.internal.util.g.a(((JSONArray) (obj)));
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
        return new q(s, s1, s2, e1, s4, ((Collection) (obj)), hashmap, s3);
    }

    public static q b(Intent intent)
    {
        String s = intent.getStringExtra("markup");
        String s1 = intent.getStringExtra("activation_command");
        String s2 = intent.getStringExtra("native_impression_report_url");
        intent = intent.getStringExtra("request_id");
        return new q(s, s1, s2, e.a, "", null, null, intent);
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
        return c;
    }

    public String f()
    {
        return "facebookAd.sendImpression();";
    }

    public Map g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public Bundle i()
    {
        Bundle bundle = new Bundle();
        bundle.putString("markup", a);
        bundle.putString("native_impression_report_url", c);
        bundle.putString("request_id", h);
        return bundle;
    }
}
