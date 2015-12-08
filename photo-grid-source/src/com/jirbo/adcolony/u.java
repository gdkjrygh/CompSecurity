// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyAd, AdColony, l, ag, 
//            d, b, a, v, 
//            ab, f, k, q, 
//            ADCDownload, ADCVideo

class u
    implements ADCDownload.Listener
{

    d a;
    ArrayList b;
    ArrayList c;
    int d;
    boolean e;

    u(d d1)
    {
        b = new ArrayList();
        c = new ArrayList();
        d = 0;
        e = false;
        a = d1;
    }

    void a()
    {
        b();
        d = 0;
    }

    void a(double d1, AdColonyAd adcolonyad)
    {
        double d2 = adcolonyad.n;
        if (d1 < d2)
        {
            return;
        }
        if (d2 < 0.25D && d1 >= 0.25D)
        {
            if (!AdColony.isZoneV4VC(adcolonyad.g) && adcolonyad.k.equals("native"))
            {
                b("native_first_quartile", adcolonyad);
            } else
            {
                b("first_quartile", adcolonyad);
            }
        }
        if (d2 < 0.5D && d1 >= 0.5D)
        {
            if (!AdColony.isZoneV4VC(adcolonyad.g) && adcolonyad.k.equals("native"))
            {
                b("native_midpoint", adcolonyad);
            } else
            {
                b("midpoint", adcolonyad);
            }
        }
        if (d2 < 0.75D && d1 >= 0.75D)
        {
            if (!AdColony.isZoneV4VC(adcolonyad.g) && adcolonyad.k.equals("native"))
            {
                b("native_third_quartile", adcolonyad);
            } else
            {
                b("third_quartile", adcolonyad);
            }
        }
        if (d2 < 1.0D && d1 >= 1.0D && !adcolonyad.k.equals("native"))
        {
            l.a.a("Tracking ad event - complete");
            ADCData.g g = new ADCData.g();
            g.b("ad_slot", adcolonyad.h.k.d);
            g.b("replay", adcolonyad.s);
            a("complete", g, adcolonyad);
        }
        adcolonyad.n = d1;
    }

    void a(String s, ADCData.g g)
    {
        n.f f1 = a.b.j.k;
        if (f1 != null)
        {
            a(s, f1.h.e(s), g);
        }
        g = a.b.j.l;
        if (g != null)
        {
            a(s, (ArrayList)((n.w) (g)).d.get(s));
        }
    }

    void a(String s, ADCData.g g, AdColonyAd adcolonyad)
    {
        if (s == null)
        {
            l.d.b("No such event type:").b(s);
            return;
        }
        if (s.equals("start") || s.equals("native_start"))
        {
            v v1 = a.l.e;
            v1.i = v1.i + 1;
        }
        ADCData.g g1 = g;
        if (g == null)
        {
            g1 = new ADCData.g();
            g1.b("replay", adcolonyad.s);
        }
        g1.b("s_imp_count", a.l.e.i);
        a(s, adcolonyad.i.t.D.e(s), g1, adcolonyad);
        a(s, (ArrayList)adcolonyad.i.q.C.get(s));
    }

    void a(String s, AdColonyAd adcolonyad)
    {
        if (a != null && a.b != null && a.b.j != null && a.b.j.n != null && a.b.j.n.a(s) != null)
        {
            l.a.a("Ad request for zone ").b(s);
            s = a.b.j.n.a(s);
            if (s != null && ((n.ab) (s)).h != null && ((n.ab) (s)).h.a != null)
            {
                ADCData.g g = new ADCData.g();
                if (a.ac == 0)
                {
                    g.b("request_denied", false);
                } else
                {
                    g.b("request_denied", true);
                }
                g.b("request_denied_reason", a.ac);
                a("request", ((n.ab) (s)).h.a, g, adcolonyad);
                l.a.a("Tracking ad request - URL : ").b(((n.ab) (s)).h.a);
                return;
            }
        }
    }

    void a(String s, String s1, ADCData.g g)
    {
        a(s, s1, g, null);
    }

    void a(String s, String s1, ADCData.g g, AdColonyAd adcolonyad)
    {
        if (s1 == null || s1.equals(""))
        {
            return;
        }
        ADCData.g g1 = g;
        if (g == null)
        {
            g1 = new ADCData.g();
        }
        g = ab.b();
        if (adcolonyad != null)
        {
            g1.b("asi", adcolonyad.l);
        }
        g1.b("sid", a.e.j);
        g1.b("guid", g);
        g1.b("guid_key", ab.b((new StringBuilder()).append(g).append("DUBu6wJ27y6xs7VWmNDw67DD").toString()));
        g = new a();
        g.a = s;
        g.b = s1;
        l.a.b("EVENT ---------------------------");
        l.a.a("EVENT - TYPE = ").b(s);
        l.a.a("EVENT - URL  = ").b(s1);
        g.c = g1.q();
        if (s.equals("reward_v4vc"))
        {
            g.d = g1.e("v4vc_name");
            g.h = g1.g("v4vc_amount");
        }
        b.add(g);
        e = true;
        com.jirbo.adcolony.a.r = true;
    }

    void a(String s, ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() == 0)
        {
            return;
        }
        for (int i = 0; i < arraylist.size(); i++)
        {
            String s1 = (String)arraylist.get(i);
            a a1 = new a();
            a1.a = s;
            a1.b = s1;
            a1.k = true;
            b.add(a1);
        }

        e = true;
        com.jirbo.adcolony.a.r = true;
    }

    void b()
    {
        com.jirbo.adcolony.a.r = true;
        ADCData.c c1 = k.c(new f("tracking_info.txt"));
        if (c1 != null)
        {
            b.clear();
            for (int i = 0; i < c1.i(); i++)
            {
                ADCData.g g = c1.b(i);
                a a1 = new a();
                a1.a = g.e("type");
                a1.b = g.e("url");
                a1.c = g.a("payload", null);
                a1.f = g.g("attempts");
                a1.k = g.h("third_party");
                if (a1.a.equals("v4vc_callback") || a1.a.equals("reward_v4vc"))
                {
                    a1.d = g.e("v4vc_name");
                    a1.h = g.g("v4vc_amount");
                }
                b.add(a1);
            }

        }
        l.a.a("Loaded ").a(b.size()).b(" events");
    }

    void b(String s, AdColonyAd adcolonyad)
    {
        a(s, ((ADCData.g) (null)), adcolonyad);
    }

    void c()
    {
        c.clear();
        c.addAll(b);
        b.clear();
        ADCData.c c1 = new ADCData.c();
        for (int i = 0; i < c.size(); i++)
        {
            a a1 = (a)c.get(i);
            if (a1.i)
            {
                continue;
            }
            b.add(a1);
            ADCData.g g = new ADCData.g();
            g.b("type", a1.a);
            g.b("url", a1.b);
            if (a1.c != null)
            {
                g.b("payload", a1.c);
            }
            g.b("attempts", a1.f);
            if (a1.d != null)
            {
                g.b("v4vc_name", a1.d);
                g.b("v4vc_amount", a1.h);
            }
            if (a1.k)
            {
                g.b("third_party", true);
            }
            c1.a(g);
        }

        c.clear();
        l.a.a("Saving tracking_info (").a(b.size()).b(" events)");
        k.a(new f("tracking_info.txt"), c1);
    }

    void d()
    {
        if (e)
        {
            e = false;
            c();
        }
        e();
    }

    void e()
    {
        if (b.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        for (; b.size() > 1000; b.remove(b.size() - 1)) { }
        if (!q.c()) goto _L1; else goto _L3
_L3:
        double d1;
        int i;
        d1 = ab.c();
        i = 0;
_L6:
        if (i >= b.size()) goto _L1; else goto _L4
_L4:
        a a1;
        a1 = (a)b.get(i);
        if (a1.e >= d1 || a1.j)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (d == 5) goto _L1; else goto _L5
_L5:
        d = d + 1;
        a1.j = true;
        if (a1.a.equals("v4vc_callback"))
        {
            com.jirbo.adcolony.a.Y.add(a1.b);
        }
        ADCDownload adcdownload = (new ADCDownload(a, a1.b, this)).a(a1);
        if (a1.k)
        {
            adcdownload.h = true;
        }
        if (a1.c != null)
        {
            adcdownload.a("application/json", a1.c);
        }
        l.b.a("Submitting '").a(a1.a).b("' event.");
        adcdownload.b();
        com.jirbo.adcolony.a.r = true;
        i++;
          goto _L6
    }

    public void on_download_finished(ADCDownload adcdownload)
    {
        a a1;
        char c1;
        c1 = '\u2710';
        com.jirbo.adcolony.a.r = true;
        e = true;
        d = d - 1;
        a1 = (a)adcdownload.e;
        l.a.a("on_download_finished - event.type = ").b(a1.a);
        a1.j = false;
        boolean flag1 = adcdownload.i;
        boolean flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (a1.c != null)
            {
                Object obj = k.b(adcdownload.n);
                if (obj != null)
                {
                    flag1 = ((ADCData.g) (obj)).e("status").equals("success");
                    flag = flag1;
                    if (flag1)
                    {
                        flag = flag1;
                        if (a1.a.equals("reward_v4vc"))
                        {
                            if (((ADCData.g) (obj)).h("v4vc_status"))
                            {
                                obj = ((ADCData.g) (obj)).e("v4vc_callback");
                                if (((String) (obj)).length() > 0)
                                {
                                    a a2 = new a();
                                    a2.a = "v4vc_callback";
                                    a2.b = ((String) (obj));
                                    a2.d = a1.d;
                                    a2.h = a1.h;
                                    b.add(a2);
                                    flag = flag1;
                                } else
                                {
                                    if (com.jirbo.adcolony.a.K != null)
                                    {
                                        com.jirbo.adcolony.a.K.o = true;
                                    }
                                    l.a.b("Client-side V4VC success");
                                    flag = flag1;
                                }
                            } else
                            {
                                l.a.b("Client-side V4VC failure");
                                flag = flag1;
                            }
                        }
                    }
                } else
                {
                    flag = false;
                }
            }
        }
        flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if (a1.a.equals("v4vc_callback"))
            {
                l.a.b("v4vc_callback response:").b(adcdownload.n);
                if (adcdownload.n.indexOf("vc_success") != -1)
                {
                    if (com.jirbo.adcolony.a.K != null)
                    {
                        com.jirbo.adcolony.a.K.o = true;
                    }
                    l.a.b("v4vc_callback success");
                    a.a(true, a1.d, a1.h);
                    flag1 = flag;
                } else
                if (adcdownload.n.indexOf("vc_decline") != -1 || adcdownload.n.indexOf("vc_noreward") != -1)
                {
                    l.c.a("Server-side V4VC failure: ").b(adcdownload.c);
                    l.a.b("v4vc_callback declined");
                    a.a(false, "", 0);
                    flag1 = flag;
                } else
                {
                    l.c.a("Server-side V4VC failure: ").b(adcdownload.c);
                    flag1 = false;
                }
            }
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        l.a.a("Event submission SUCCESS for type: ").b(a1.a);
        a1.i = true;
_L4:
        if (!a.e.b)
        {
            c();
        }
        return;
_L2:
        l.a.a("Event submission FAILED for type: ").a(a1.a).a(" on try ").b(a1.f + 1);
        a1.f = a1.f + 1;
        if (a1.f >= 24)
        {
            l.d.b("Discarding event after 24 attempts to report.");
            a1.i = true;
            if (a1.a.equals("v4vc_callback"))
            {
                a.a(false, "", 0);
            }
        } else
        {
            int i = 20;
            if (a1.g > 0)
            {
                i = a1.g * 3;
            }
            if (i > 10000)
            {
                i = c1;
            }
            l.a.a("Retrying in ").a(i).a(" seconds (attempt ").a(a1.f).b(")");
            a1.g = i;
            a1.e = ab.c() + (double)i;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class a
    {

        String a;
        String b;
        String c;
        String d;
        double e;
        int f;
        int g;
        int h;
        boolean i;
        boolean j;
        boolean k;

        a()
        {
        }
    }

}
