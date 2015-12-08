// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            AdColony, d, ah, g, 
//            ab, a, l, z, 
//            q, ADCStorage, o, u, 
//            b, v, t, AdColonyException

class c
{

    static String c = "https://androidads21.adcolony.com/configure";
    String A;
    String B;
    String C;
    String D;
    String E;
    String F;
    String G;
    String H;
    String I;
    String J;
    String K;
    String L;
    String M;
    boolean N;
    boolean O;
    d a;
    String b;
    int d;
    int e;
    boolean f;
    boolean g;
    String h;
    ADCData.g i;
    String j;
    String k[];
    n.ab l;
    n.a m;
    double n;
    String o;
    String p;
    String q;
    String r;
    boolean s;
    String t;
    String u;
    String v;
    String w;
    String x;
    String y;
    String z;

    c(d d1)
    {
        b = "2.2.1";
        d = 300;
        e = 0;
        f = false;
        g = false;
        i = new ADCData.g();
        n = 0.0D;
        o = "android";
        p = "android_native";
        q = "1.0";
        r = "google";
        s = false;
        x = "";
        a = d1;
    }

    String a(String s1, String s2)
    {
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s2;
        }
    }

    void a()
    {
        while (!AdColony.b && e < 60) 
        {
            try
            {
                e = e + 1;
                Thread.sleep(50L);
            }
            catch (Exception exception) { }
        }
        e = 0;
        a.g.a();
        K = a(g.a, "");
        N = g.b;
        t = a(com.jirbo.adcolony.g.a(), "");
        Object obj;
        boolean flag;
        if (!K.equals(""))
        {
            obj = "";
        } else
        {
            obj = a(ab.b(t), "");
        }
        u = ((String) (obj));
        w = a(com.jirbo.adcolony.g.b(), "");
        if (y == null)
        {
            y = a(com.jirbo.adcolony.g.e(), "");
        }
        z = a(com.jirbo.adcolony.g.l(), "");
        A = a(com.jirbo.adcolony.g.m(), "");
        E = a(com.jirbo.adcolony.g.j(), "en");
        F = a(com.jirbo.adcolony.g.n(), "");
        G = a(com.jirbo.adcolony.g.o(), "");
        J = a((new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).toString(), "");
        C = a(com.jirbo.adcolony.g.h(), "");
        D = "";
        H = a((new StringBuilder()).append(com.jirbo.adcolony.g.c()).toString(), "");
        I = a((new StringBuilder()).append(com.jirbo.adcolony.g.d()).toString(), "");
        if (ab.d() && ab.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        O = flag;
        a.V = G;
        a.W = b;
        if (a.m)
        {
            B = "tablet";
        } else
        {
            B = "phone";
        }
        v = "";
        if (ab.a("com.android.vending") || ab.a("com.android.market"))
        {
            v = "google";
        }
        if (ab.a("com.amazon.venezia"))
        {
            if (v.length() > 0)
            {
                v = (new StringBuilder()).append(v).append(",").toString();
            }
            v = (new StringBuilder()).append(v).append("amazon").toString();
        }
        if (l.b.f)
        {
            l.b.a("sdk_version:").b(b);
            l.b.a("ad_manifest_url:").b(c);
            l.b.a("app_id:").b(j);
            l.b.a("zone_ids:").b(k);
            l.b.a("os_name:").b(o);
            l.b.a("sdk_type:").b(p);
            l.b.a("app_version:").b(q);
            l.b.a("origin_store:").b(r);
            l.b.a("skippable:").b(s);
            l.b.a("android_id:").b(t);
            l.b.a("android_id_sha1:").b(u);
            l.b.a("available_stores:").b(v);
            l.b.a("carrier_name:").b(w);
            l.b.a("custom_id:").b(x);
            l.b.a("device_id:").b(y);
            l.b.a("device_manufacturer:").b(z);
            l.b.a("device_model:").b(A);
            l.b.a("device_type:").b(B);
            l.b.a("imei:").b(C);
            l.b.a("imei_sha1:").b(D);
            l.b.a("language:").b(E);
            l.b.a("open_udid:").b(F);
            l.b.a("os_version:").b(G);
        }
        obj = new z();
        ((z) (obj)).a("&os_name=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(o));
        ((z) (obj)).a("&os_version=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(G));
        ((z) (obj)).a("&device_api=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(J));
        ((z) (obj)).a("&app_version=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(q));
        ((z) (obj)).a("&android_id_sha1=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(u));
        ((z) (obj)).a("&device_id=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(y));
        ((z) (obj)).a("&open_udid=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(F));
        ((z) (obj)).a("&device_type=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(B));
        ((z) (obj)).a("&ln=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(E));
        ((z) (obj)).a("&device_brand=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(z));
        ((z) (obj)).a("&device_model=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(A));
        ((z) (obj)).a("&screen_width=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a((new StringBuilder()).append(com.jirbo.adcolony.g.f()).toString()));
        ((z) (obj)).a("&screen_height=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a((new StringBuilder()).append(com.jirbo.adcolony.g.g()).toString()));
        ((z) (obj)).a("&sdk_type=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(p));
        ((z) (obj)).a("&sdk_version=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(b));
        ((z) (obj)).a("&origin_store=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(r));
        ((z) (obj)).a("&available_stores=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(v));
        ((z) (obj)).a("&imei_sha1=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(D));
        ((z) (obj)).a("&memory_class=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(H));
        ((z) (obj)).a("&memory_used_mb=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(I));
        ((z) (obj)).a("&advertiser_id=");
        ((z) (obj)).a(com.jirbo.adcolony.q.a(K));
        ((z) (obj)).a("&limit_tracking=");
        ((z) (obj)).a(N);
        ((z) (obj)).a("&immersion=");
        ((z) (obj)).a(O);
        h = ((z) (obj)).toString();
        a.f.a();
        a.c.a();
        a.d.a();
        a.b.a();
        a.e.a();
        a.h.a();
        g = true;
        a.b.e();
        if (a.b.j.i == null || a.b.j.i.equals(""))
        {
            a.b.j.i = "all";
        }
        if (a.b.j.j == null || a.b.j.j.equals(""))
        {
            a.b.j.j = "all";
        }
    }

    void a(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        s1 = s2.split(",");
        int j1 = s1.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = s1[i1].split(":");
            if (obj.length == 2)
            {
                String s3 = obj[0];
                obj = obj[1];
                if (s3.equals("version"))
                {
                    q = ((String) (obj));
                } else
                if (s3.equals("store"))
                {
                    if (((String) (obj)).toLowerCase().equals("google") || ((String) (obj)).toLowerCase().equals("amazon"))
                    {
                        r = ((String) (obj));
                    } else
                    {
                        throw new AdColonyException("Origin store in client options must be set to either 'google' or 'amazon'");
                    }
                } else
                if (s3.equals("skippable"))
                {
                    s = false;
                }
            } else
            if (obj[0].equals("skippable"))
            {
                s = false;
            }
            i1++;
        }
    }

    void a(String s1, n.a a1)
    {
        l = a.b.j.n.a(s1);
        if (l != null)
        {
            if (a1 == null)
            {
                m = l.i();
            } else
            {
                m = a1;
            }
            if (m != null)
            {
                s1 = a.c;
                a1 = m.v;
                i.b("video_enabled", ((n.aa) (a1)).a);
                i.b("video_filepath", a1.b());
                i.b("video_width", ((n.aa) (a1)).b);
                i.b("video_height", ((n.aa) (a1)).c);
                i.b("video_duration", ((n.aa) (a1)).k);
                i.b("engagement_delay", ((n.aa) (a1)).m.e);
                i.b("skip_delay", ((n.aa) (a1)).l.e);
                i.b("browser_close_image_normal", s1.b(m.r.k.f));
                i.b("browser_close_image_down", s1.b(m.r.k.h));
                i.b("browser_reload_image_normal", s1.b(m.r.m.f));
                i.b("browser_reload_image_down", s1.b(m.r.m.h));
                i.b("browser_back_image_normal", s1.b(m.r.j.f));
                i.b("browser_back_image_down", s1.b(m.r.j.h));
                i.b("browser_forward_image_normal", s1.b(m.r.l.f));
                i.b("browser_forward_image_down", s1.b(m.r.l.h));
                i.b("browser_stop_image_normal", s1.b(m.r.i.f));
                i.b("browser_stop_image_down", s1.b(m.r.i.h));
                i.b("browser_glow_button", s1.b(m.r.a));
                i.b("browser_icon", s1.b(m.r.h.d));
                i.b("mute", s1.b(m.w.k.d));
                i.b("unmute", s1.b(m.w.l.d));
                i.b("poster_image", s1.b(m.w.c));
                i.b("thumb_image", s1.b(m.w.g));
                i.b("advertiser_name", m.w.d);
                i.b("description", m.w.e);
                i.b("title", m.w.f);
                i.b("native_engagement_enabled", m.w.j.a);
                i.b("native_engagement_type", m.w.j.c);
                i.b("native_engagement_command", m.w.j.e);
                i.b("native_engagement_label", m.w.j.d);
                i.b("skip_video_image_normal", s1.b(((n.aa) (a1)).l.f));
                i.b("skip_video_image_down", s1.b(((n.aa) (a1)).l.h));
                i.b("engagement_image_normal", s1.b(((n.aa) (a1)).m.f));
                i.b("engagement_image_down", s1.b(((n.aa) (a1)).m.h));
                i.b("engagement_height", ((n.aa) (a1)).m.c);
                i.b("image_overlay_enabled", ((n.aa) (a1)).n.a);
                i.b("image_overlay_filepath", s1.b(((n.aa) (a1)).n.f));
                i.b("haptics_enabled", ((n.aa) (a1)).o.a);
                i.b("haptics_filepath", s1.b(((n.aa) (a1)).o.c));
                i.b("v4iap_enabled", m.x.c);
                i.b("product_id", m.x.a);
                i.b("in_progress", m.x.b);
                b();
                return;
            }
        }
    }

    void b()
    {
        n.v v1 = m.u.h;
        n.j j1 = m.u.i;
        o o1 = a.c;
        if (!m.u.d)
        {
            i.b("end_card_enabled", m.u.d);
            return;
        }
        if (j1.a())
        {
            a.O = true;
            a.T = j1.g;
            a.U = o1.b(j1.f.b);
            i.b("close_image_normal", o1.b(j1.j.f));
            i.b("close_image_down", o1.b(j1.j.h));
            i.b("reload_image_normal", o1.b(j1.i.f));
            i.b("reload_image_down", o1.b(j1.i.h));
        } else
        {
            a.O = false;
            i.b("end_card_filepath", o1.b(v1.d));
            i.b("info_image_normal", o1.b(v1.f.f));
            i.b("info_image_down", o1.b(v1.f.h));
            i.b("info_url", v1.f.j);
            i.b("replay_image_normal", o1.b(v1.h.f));
            i.b("replay_image_down", o1.b(v1.h.h));
            i.b("continue_image_normal", o1.b(v1.i.f));
            i.b("continue_image_down", o1.b(v1.i.h));
            i.b("download_image_normal", o1.b(v1.g.f));
            i.b("download_image_down", o1.b(v1.g.h));
            i.b("download_url", v1.g.j);
        }
        i.b("end_card_enabled", m.u.d);
        i.b("load_timeout_enabled", m.u.i.c);
        i.b("load_timeout", m.u.i.b);
        i.b("hardware_acceleration_disabled", a.b.j.e);
    }

    void b(String s1)
    {
        a(s1, ((n.a) (null)));
    }

    void c(String s1)
    {
        l = a.b.j.n.a(s1);
        m = l.i();
        s1 = a.c;
        n.aa aa = m.v;
        i.b("video_enabled", aa.a);
        i.b("video_filepath", aa.b());
        i.b("video_width", aa.b);
        i.b("video_height", aa.c);
        i.b("video_duration", aa.k);
        i.b("engagement_delay", aa.m.e);
        i.b("skip_delay", aa.l.e);
        b();
        n.c c1 = m.s;
        i.b("pre_popup_bg", s1.b(c1.b.d.e));
        i.b("v4vc_logo", s1.b(c1.b.d.l.d));
        i.b("no_button_normal", s1.b(c1.b.d.n.f));
        i.b("no_button_down", s1.b(c1.b.d.n.h));
        i.b("yes_button_normal", s1.b(c1.b.d.m.f));
        i.b("yes_button_down", s1.b(c1.b.d.m.h));
        i.b("done_button_normal", s1.b(c1.c.d.m.f));
        i.b("done_button_down", s1.b(c1.c.d.m.h));
        i.b("browser_close_image_normal", s1.b(m.r.k.f));
        i.b("browser_close_image_down", s1.b(m.r.k.h));
        i.b("browser_reload_image_normal", s1.b(m.r.m.f));
        i.b("browser_reload_image_down", s1.b(m.r.m.h));
        i.b("browser_back_image_normal", s1.b(m.r.j.f));
        i.b("browser_back_image_down", s1.b(m.r.j.h));
        i.b("browser_forward_image_normal", s1.b(m.r.l.f));
        i.b("browser_forward_image_down", s1.b(m.r.l.h));
        i.b("browser_stop_image_normal", s1.b(m.r.i.f));
        i.b("browser_stop_image_down", s1.b(m.r.i.h));
        i.b("browser_glow_button", s1.b(m.r.a));
        i.b("browser_icon", s1.b(m.r.h.d));
        i.b("skip_video_image_normal", s1.b(aa.l.f));
        i.b("skip_video_image_down", s1.b(aa.l.h));
        i.b("engagement_image_normal", s1.b(aa.m.f));
        i.b("engagement_image_down", s1.b(aa.m.h));
        i.b("engagement_height", aa.m.c);
        i.b("image_overlay_enabled", aa.n.a);
        i.b("image_overlay_filepath", s1.b(aa.n.f));
        i.b("haptics_enabled", aa.o.a);
        i.b("haptics_filepath", s1.b(aa.o.c));
        i.b("v4iap_enabled", m.x.c);
        i.b("product_id", m.x.a);
        i.b("in_progress", m.x.b);
    }

}
