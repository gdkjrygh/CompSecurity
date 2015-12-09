// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.action.a;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.e;
import com.facebook.ads.internal.util.f;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.o;
import com.facebook.ads.internal.util.s;
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
//            a

public class n
    implements com.facebook.ads.internal.adapters.a
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
                    (new o()).execute(new String[] {
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
                    if (!com.facebook.ads.internal.util.s.a(s1))
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


    private static final String a = com/facebook/ads/internal/adapters/n.getSimpleName();
    private final String A;
    private final com.facebook.ads.NativeAd.Image B;
    private final String C;
    private final String D;
    private final a E;
    private final NativeAdViewAttributes F;
    private final String G = UUID.randomUUID().toString();
    private boolean H;
    private boolean I;
    private boolean J;
    private long K;
    private com.facebook.ads.internal.util.b.a L;
    private final Uri b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final com.facebook.ads.NativeAd.Image h;
    private final com.facebook.ads.NativeAd.Image i;
    private final com.facebook.ads.NativeAd.Rating j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final e o;
    private final String p;
    private final Collection q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final String y;
    private final String z;

    private n(Uri uri, String s1, String s2, String s3, String s4, String s5, com.facebook.ads.NativeAd.Image image, 
            com.facebook.ads.NativeAd.Image image1, com.facebook.ads.NativeAd.Rating rating, String s6, String s7, String s8, e e1, String s9, 
            Collection collection, boolean flag, com.facebook.ads.NativeAd.Image image2, String s10, String s11, a a1, String s12, 
            boolean flag1, boolean flag2, int i1, int j1, String s13, String s14, String s15, 
            int k1, int l1, NativeAdViewAttributes nativeadviewattributes)
    {
        K = 0L;
        L = null;
        b = uri;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = image;
        i = image1;
        j = rating;
        k = s6;
        m = s7;
        n = s8;
        o = e1;
        p = s9;
        q = collection;
        r = flag;
        s = flag1;
        t = flag2;
        B = image2;
        C = s10;
        D = s11;
        E = a1;
        l = s12;
        u = i1;
        v = j1;
        w = k1;
        x = l1;
        y = s13;
        z = s14;
        A = s15;
        F = nativeadviewattributes;
    }

    private void A()
    {
        if (!J)
        {
            (new o()).execute(new String[] {
                n
            });
            J = true;
        }
    }

    private boolean B()
    {
        return c != null && c.length() > 0 && f != null && f.length() > 0 && h != null && i != null;
    }

    public static n a(JSONObject jsonobject)
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
            com.facebook.ads.NativeAd.Image image1 = com.facebook.ads.NativeAd.Image.fromJSONObject(jsonobject.optJSONObject("icon"));
            com.facebook.ads.NativeAd.Image image2 = com.facebook.ads.NativeAd.Image.fromJSONObject(jsonobject.optJSONObject("image"));
            com.facebook.ads.NativeAd.Rating rating = com.facebook.ads.NativeAd.Rating.fromJSONObject(jsonobject.optJSONObject("star_rating"));
            String s6 = jsonobject.optString("impression_report_url");
            String s7 = jsonobject.optString("native_view_report_url");
            String s8 = jsonobject.optString("click_report_url");
            String s9 = jsonobject.optString("used_report_url");
            boolean flag = jsonobject.optBoolean("manual_imp");
            boolean flag1 = jsonobject.optBoolean("enable_view_log");
            boolean flag2 = jsonobject.optBoolean("enable_snapshot_log");
            int i1 = jsonobject.optInt("snapshot_log_delay_second", 4);
            int j1 = jsonobject.optInt("snapshot_compress_quality", 0);
            int k1 = jsonobject.optInt("viewability_check_initial_delay", 0);
            int l1 = jsonobject.optInt("viewability_check_interval", 1000);
            com.facebook.ads.NativeAd.Image image = null;
            Object obj1 = jsonobject.optJSONObject("ad_choices_icon");
            Object obj = jsonobject.optJSONObject("native_ui_config");
            String s10;
            String s11;
            e e1;
            String s12;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new NativeAdViewAttributes(((JSONObject) (obj)));
            }
            if (obj1 != null)
            {
                image = com.facebook.ads.NativeAd.Image.fromJSONObject(((JSONObject) (obj1)));
            }
            s10 = jsonobject.optString("ad_choices_link_url");
            s11 = jsonobject.optString("request_id");
            e1 = com.facebook.ads.internal.util.e.a(jsonobject.optString("invalidation_behavior"));
            s12 = jsonobject.optString("invalidation_report_url");
            try
            {
                obj1 = new JSONArray(jsonobject.optString("detection_strings"));
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                jsonexception = null;
            }
            obj = new n(uri, s1, s2, s3, s4, s5, image1, image2, rating, s6, s8, s9, e1, s12, com.facebook.ads.internal.util.f.a(((JSONArray) (obj1))), flag, image, s10, s11, new a(jsonobject.optJSONArray("trackers")), s7, flag1, flag2, i1, j1, jsonobject.optString("video_url"), jsonobject.optString("video_play_report_url"), jsonobject.optString("video_time_report_url"), k1, l1, ((NativeAdViewAttributes) (obj)));
            jsonobject = ((JSONObject) (obj));
            if (!((n) (obj)).B())
            {
                return null;
            }
        }
        return jsonobject;
    }

    static String a(n n1)
    {
        return n1.l;
    }

    private void a(String s1, Map map, Map map1)
    {
        if (map1.containsKey(s1))
        {
            map.put(s1, String.valueOf(map1.get(s1)));
        }
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

    private Map b(Map map)
    {
        HashMap hashmap = new HashMap();
        if (map.containsKey("view"))
        {
            hashmap.put("view", String.valueOf(map.get("view")));
        }
        if (map.containsKey("snapshot"))
        {
            hashmap.put("snapshot", String.valueOf(map.get("snapshot")));
        }
        return hashmap;
    }

    private void b(Map map, Map map1)
    {
        a("nti", map, map1);
        a("nhs", map, map1);
        a("nmv", map, map1);
    }

    public e a()
    {
        return o;
    }

    public void a(int i1)
    {
        if (i1 == 0 && K > 0L && L != null)
        {
            com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(K, L, D));
            K = 0L;
            L = null;
        }
    }

    public void a(Context context, Map map)
    {
        if (!I)
        {
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                a(((Map) (hashmap)), map);
                b(hashmap, map);
                hashmap.put("touch", com.facebook.ads.internal.util.g.a(map));
            }
            (new o(hashmap)).execute(new String[] {
                m
            });
            E.a("click");
            I = true;
            com.facebook.ads.internal.util.g.a(context, "Click logged");
        }
        context = com.facebook.ads.internal.action.b.a(context, b);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        K = System.currentTimeMillis();
        L = context.a();
        context.b();
        return;
        context;
        Log.e(a, "Error executing action", context);
        return;
    }

    public void a(Map map)
    {
        if (!H)
        {
            HashMap hashmap = new HashMap();
            if (map != null)
            {
                a(((Map) (hashmap)), map);
                b(hashmap, map);
            }
            (new o(hashmap)).execute(new String[] {
                k
            });
            if (p() || q())
            {
                try
                {
                    map = b(map);
                    (new Handler()).postDelayed(new Runnable(hashmap, map) {

                        final Map a;
                        final Map b;
                        final n c;

                        public void run()
                        {
                            (new o(a, b)).execute(new String[] {
                                com.facebook.ads.internal.adapters.n.a(c)
                            });
                        }

            
            {
                c = n.this;
                a = map;
                b = map1;
                super();
            }
                    }, u * 1000);
                }
                // Misplaced declaration of an exception variable
                catch (Map map) { }
            }
            E.a("impression");
            H = true;
        }
    }

    public String b()
    {
        return p;
    }

    public Collection c()
    {
        return q;
    }

    public com.facebook.ads.NativeAd.Image d()
    {
        return h;
    }

    public com.facebook.ads.NativeAd.Image e()
    {
        return i;
    }

    public String f()
    {
        A();
        return c;
    }

    public String g()
    {
        A();
        return d;
    }

    public String h()
    {
        A();
        return e;
    }

    public String i()
    {
        A();
        return f;
    }

    public String j()
    {
        A();
        return g;
    }

    public com.facebook.ads.NativeAd.Rating k()
    {
        A();
        return j;
    }

    public String l()
    {
        return y;
    }

    public String m()
    {
        return z;
    }

    public String n()
    {
        return A;
    }

    public boolean o()
    {
        return r;
    }

    public boolean p()
    {
        return s;
    }

    public boolean q()
    {
        return t;
    }

    public int r()
    {
        if (v < 0 || v > 100)
        {
            return 0;
        } else
        {
            return v;
        }
    }

    public String s()
    {
        return G;
    }

    public com.facebook.ads.NativeAd.Image t()
    {
        return B;
    }

    public String u()
    {
        return C;
    }

    public String v()
    {
        return D;
    }

    public NativeAdViewAttributes w()
    {
        return F;
    }

    public boolean x()
    {
        return F != null;
    }

    public int y()
    {
        return w;
    }

    public int z()
    {
        return x;
    }

}
