// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.a.a;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.d;
import com.facebook.ads.internal.util.e;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            i

public class s
    implements i
{
    private static class a
    {

        Map a;

        void a(String s1)
        {
            s1 = (List)a.get(s1);
            if (s1 != null && !s1.isEmpty())
            {
                s1 = s1.iterator();
                while (s1.hasNext()) 
                {
                    String s2 = (String)s1.next();
                    (new p()).execute(new String[] {
                        s2
                    });
                }
            }
        }

        a(JSONArray jsonarray)
        {
            a = new HashMap();
            if (jsonarray != null)
            {
                int i1 = 0;
                while (i1 < jsonarray.length()) 
                {
                    Object obj = jsonarray.optJSONObject(i1);
                    String s1 = ((JSONObject) (obj)).optString("type");
                    if (!com.facebook.ads.internal.util.t.a(s1))
                    {
                        obj = ((JSONObject) (obj)).optJSONArray("urls");
                        if (obj != null)
                        {
                            ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
                            for (int j1 = 0; j1 < ((JSONArray) (obj)).length(); j1++)
                            {
                                arraylist.add(((JSONArray) (obj)).optString(j1));
                            }

                            a.put(s1, arraylist);
                        }
                    }
                    i1++;
                }
            }
        }
    }


    private static final String a = com/facebook/ads/internal/adapters/s.getSimpleName();
    private com.facebook.ads.internal.util.b.a A;
    private final Uri b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final com.facebook.ads.NativeAd.a h;
    private final com.facebook.ads.NativeAd.a i;
    private final com.facebook.ads.NativeAd.b j;
    private final String k;
    private final String l;
    private final String m;
    private final e n;
    private final String o;
    private final Collection p;
    private final boolean q;
    private final com.facebook.ads.NativeAd.a r;
    private final String s;
    private final String t;
    private final a u;
    private final String v = UUID.randomUUID().toString();
    private boolean w;
    private boolean x;
    private boolean y;
    private long z;

    private s(Uri uri, String s1, String s2, String s3, String s4, String s5, com.facebook.ads.NativeAd.a a1, 
            com.facebook.ads.NativeAd.a a2, com.facebook.ads.NativeAd.b b1, String s6, String s7, String s8, e e1, String s9, 
            Collection collection, boolean flag, com.facebook.ads.NativeAd.a a3, String s10, String s11, a a4)
    {
        z = 0L;
        A = null;
        b = uri;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = a1;
        i = a2;
        j = b1;
        k = s6;
        l = s7;
        m = s8;
        n = e1;
        o = s9;
        p = collection;
        q = flag;
        r = a3;
        s = s10;
        t = s11;
        u = a4;
    }

    public static s a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            Uri uri = Uri.parse(jsonobject.optString("fbad_command"));
            String s1 = jsonobject.optString("title");
            String s2 = jsonobject.optString("subtitle");
            String s3 = jsonobject.optString("body");
            String s4 = jsonobject.optString("call_to_action");
            String s5 = jsonobject.optString("social_context");
            com.facebook.ads.NativeAd.a a1 = com.facebook.ads.NativeAd.a.a(jsonobject.optJSONObject("icon"));
            com.facebook.ads.NativeAd.a a2 = com.facebook.ads.NativeAd.a.a(jsonobject.optJSONObject("image"));
            com.facebook.ads.NativeAd.b b1 = com.facebook.ads.NativeAd.b.a(jsonobject.optJSONObject("star_rating"));
            String s6 = jsonobject.optString("impression_report_url");
            String s7 = jsonobject.optString("click_report_url");
            String s8 = jsonobject.optString("used_report_url");
            boolean flag = jsonobject.optBoolean("manual_imp");
            Object obj = null;
            Object obj1 = jsonobject.optJSONObject("ad_choices_icon");
            if (obj1 != null)
            {
                obj = com.facebook.ads.NativeAd.a.a(((JSONObject) (obj1)));
            }
            String s9 = jsonobject.optString("ad_choices_link_url");
            String s10 = jsonobject.optString("request_id");
            e e1 = com.facebook.ads.internal.util.e.a(jsonobject.optString("invalidation_behavior"));
            String s11 = jsonobject.optString("invalidation_report_url");
            try
            {
                obj1 = new JSONArray(jsonobject.optString("detection_strings"));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                jsonexception = null;
            }
            obj = new s(uri, s1, s2, s3, s4, s5, a1, a2, b1, s6, s7, s8, e1, s11, com.facebook.ads.internal.util.g.a(((JSONArray) (obj1))), flag, ((com.facebook.ads.NativeAd.a) (obj)), s9, s10, new a(jsonobject.optJSONArray("trackers")));
            jsonobject = ((JSONObject) (obj));
            if (!((s) (obj)).q())
            {
                return null;
            }
        }
        return jsonobject;
    }

    private void a(Map map, Map map1)
    {
        if (map1.containsKey("mil"))
        {
            boolean flag = ((Boolean)map1.get("mil")).booleanValue();
            map1.remove("mil");
            if (!flag)
            {
                return;
            }
        }
        map.put("mil", String.valueOf(true));
    }

    private void b(Map map, Map map1)
    {
        if (map1.containsKey("nti"))
        {
            map.put("nti", String.valueOf(map1.get("nti")));
        }
        if (map1.containsKey("nhs"))
        {
            map.put("nhs", String.valueOf(map1.get("nhs")));
        }
    }

    private void p()
    {
        if (!y)
        {
            (new p()).execute(new String[] {
                m
            });
            y = true;
        }
    }

    private boolean q()
    {
        return c != null && c.length() > 0 && f != null && f.length() > 0 && h != null && i != null;
    }

    public e a()
    {
        return n;
    }

    public void a(int i1)
    {
        if (i1 == 0 && z > 0L && A != null)
        {
            com.facebook.ads.internal.util.d.a(com.facebook.ads.internal.util.b.a(z, A, t));
            z = 0L;
            A = null;
        }
    }

    public void a(Context context, Map map)
    {
        if (!x)
        {
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                a(((Map) (hashmap)), map);
                b(hashmap, map);
                hashmap.put("touch", com.facebook.ads.internal.util.h.a(map));
            }
            (new p(hashmap)).execute(new String[] {
                l
            });
            u.a("click");
            x = true;
            com.facebook.ads.internal.util.h.a(context, "Click logged");
        }
        context = com.facebook.ads.internal.a.b.a(context, b);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        z = System.currentTimeMillis();
        A = context.a();
        context.b();
        return;
        context;
        Log.e(a, "Error executing action", context);
        return;
    }

    public void a(Map map)
    {
        if (!w)
        {
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                a(((Map) (hashmap)), map);
                b(hashmap, map);
            }
            (new p(hashmap)).execute(new String[] {
                k
            });
            u.a("impression");
            w = true;
        }
    }

    public String b()
    {
        return o;
    }

    public Collection c()
    {
        return p;
    }

    public com.facebook.ads.NativeAd.a d()
    {
        return h;
    }

    public com.facebook.ads.NativeAd.a e()
    {
        return i;
    }

    public String f()
    {
        p();
        return c;
    }

    public String g()
    {
        p();
        return e;
    }

    public String h()
    {
        p();
        return f;
    }

    public String i()
    {
        p();
        return g;
    }

    public com.facebook.ads.NativeAd.b j()
    {
        p();
        return j;
    }

    public boolean k()
    {
        return q;
    }

    public String l()
    {
        return v;
    }

    public com.facebook.ads.NativeAd.a m()
    {
        return r;
    }

    public String n()
    {
        return s;
    }

    public String o()
    {
        return t;
    }

}
