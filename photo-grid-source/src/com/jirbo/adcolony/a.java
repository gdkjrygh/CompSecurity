// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.jirbo.adcolony:
//            d, l, AdColonyException, g, 
//            AdColony, AdColonyNativeAdView, AdColonyAdAvailabilityListener, h, 
//            AdColonyAd, ADCVideo, j

class a
{

    static boolean A = false;
    static boolean B = false;
    static boolean C = false;
    static boolean D = false;
    static boolean E = false;
    static boolean F = false;
    static boolean G = false;
    static boolean H = false;
    static h I;
    static AdColonyAd J;
    static ADCVideo K;
    static ADCVideo L;
    static a M;
    static b N;
    static boolean O = false;
    static boolean P = false;
    static boolean Q = false;
    static boolean R = false;
    static int S = 0;
    static String T;
    static String U;
    static String V;
    static String W;
    static String X;
    static ArrayList Y = new ArrayList();
    static ADCData.c Z = new ADCData.c();
    public static final boolean a = false;
    static boolean aa = false;
    static long ab = 0L;
    static int ac = 0;
    static ArrayList ad = new ArrayList();
    static ArrayList ae = new ArrayList();
    static ArrayList af = new ArrayList();
    static ArrayList ag = new ArrayList();
    static HashMap ah;
    private static Activity ai;
    public static final boolean b = false;
    public static final boolean c = false;
    public static final boolean d = false;
    public static String e = null;
    public static final String f = null;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    static final String k = "AdColony";
    static d l = new d();
    static boolean m;
    static int n = 2;
    static boolean o;
    static boolean p;
    static boolean q;
    static boolean r;
    static boolean s;
    static boolean t;
    static boolean u = false;
    static boolean v = true;
    static int w = 0;
    static double x = 1.0D;
    static boolean y = false;
    static boolean z = false;

    a()
    {
    }

    static void a(int i1)
    {
        boolean flag1 = false;
        n = i1;
        l l1 = l.a;
        boolean flag;
        if (i1 <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1.f = flag;
        l1 = l.b;
        if (i1 <= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1.f = flag;
        l1 = l.c;
        if (i1 <= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1.f = flag;
        l1 = l.d;
        flag = flag1;
        if (i1 <= 3)
        {
            flag = true;
        }
        l1.f = flag;
        if (i1 <= 0)
        {
            b("DEVELOPER LOGGING ENABLED");
        }
        if (i1 <= 1)
        {
            c("DEBUG LOGGING ENABLED");
        }
    }

    static void a(int i1, String s1)
    {
        if (n > i1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 40
    //                   1 40
    //                   2 41
    //                   3 49;
           goto _L2 _L2 _L2 _L3 _L4
_L2:
        return;
_L3:
        Log.i("AdColony", s1);
        return;
_L4:
        Log.e("AdColony", s1);
        return;
    }

    static void a(Activity activity)
    {
        if (activity == ai || activity == null)
        {
            return;
        } else
        {
            ai = activity;
            M = new a();
            N = new b();
            new p.a();
            return;
        }
    }

    static void a(AdColonyNativeAdView adcolonynativeadview)
    {
        ag.add(adcolonynativeadview);
    }

    static void a(j j1)
    {
        l.a(j1);
    }

    static void a(RuntimeException runtimeexception)
    {
        G = true;
        e(runtimeexception.toString());
        runtimeexception.printStackTrace();
    }

    static void a(String s1)
    {
        G = true;
        e(s1);
    }

    static void a(String s1, AdColonyAd adcolonyad)
    {
        l.a(s1, null, adcolonyad);
    }

    static void a(String s1, String s2)
    {
        l.a(s1, s2);
    }

    static void a(String s1, String s2, AdColonyAd adcolonyad)
    {
        l.a(s1, s2, adcolonyad);
    }

    static boolean a()
    {
        return ai == null;
    }

    static Activity b()
    {
        if (ai == null)
        {
            throw new AdColonyException("AdColony.configure() must be called before any other AdColony methods. If you have called AdColony.configure(), the Activity reference you passed in via AdColony.configure() OR AdColony.resume() is null.");
        } else
        {
            return ai;
        }
    }

    static void b(Activity activity)
    {
        p = false;
        a(activity);
        I = null;
        m = com.jirbo.adcolony.g.i();
        if (G)
        {
            G = false;
            o = false;
            l = new d();
        }
    }

    static void b(String s1)
    {
        a(0, s1);
    }

    static boolean b(int i1)
    {
        return n <= i1;
    }

    static void c(String s1)
    {
        a(1, s1);
    }

    static boolean c()
    {
        return G || q || !o;
    }

    static void d(String s1)
    {
        a(2, s1);
    }

    static boolean d()
    {
        return o && !G && !q;
    }

    static void e()
    {
        b();
    }

    static void e(String s1)
    {
        a(3, s1);
    }

    static void f(String s1)
    {
        Toast.makeText(b(), s1, 0).show();
    }

    static boolean f()
    {
        return n <= 0;
    }

    static double g(String s1)
    {
        return l.a(s1);
    }

    static boolean g()
    {
        return n <= 1;
    }

    static int h(String s1)
    {
        return l.b(s1);
    }

    static void h()
    {
        if (l != null && af.size() != 0 && ah != null)
        {
            Iterator iterator = ah.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                boolean flag1 = ((Boolean)entry.getValue()).booleanValue();
                boolean flag;
                if (AdColony.isZoneV4VC((String)entry.getKey()))
                {
                    flag = l.b((String)entry.getKey(), true, false);
                } else
                {
                    flag = l.a((String)entry.getKey(), true, false);
                }
                if (AdColony.isZoneNative((String)entry.getKey()))
                {
                    flag = (new AdColonyNativeAdView(b(), (String)entry.getKey(), 300, true)).b(true);
                }
                if (flag1 != flag)
                {
                    ah.put(entry.getKey(), Boolean.valueOf(flag));
                    int i1 = 0;
                    while (i1 < af.size()) 
                    {
                        ((AdColonyAdAvailabilityListener)af.get(i1)).onAdColonyAdAvailabilityChange(flag, (String)entry.getKey());
                        i1++;
                    }
                }
            }
        }
    }

    static boolean i(String s1)
    {
        return l.c(s1);
    }

    static String j(String s1)
    {
        return l.d(s1);
    }

    static void k(String s1)
    {
        l.a(s1, null);
    }

    static 
    {
        A = false;
        B = false;
        C = true;
        F = false;
        ac = 0;
    }

    private class a extends Handler
    {

        AdColonyAd a;

        public void a(AdColonyAd adcolonyad)
        {
            if (adcolonyad == null)
            {
                a = com.jirbo.adcolony.a.J;
            } else
            {
                a = adcolonyad;
            }
            sendMessage(obtainMessage(1));
        }

        public void b(AdColonyAd adcolonyad)
        {
            if (adcolonyad == null)
            {
                a = com.jirbo.adcolony.a.J;
            } else
            {
                a = adcolonyad;
            }
            sendMessage(obtainMessage(0));
        }

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 1: default 28
        //                       0 29
        //                       1 58;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            com.jirbo.adcolony.a.a("skip", a);
            if (com.jirbo.adcolony.a.J != null)
            {
                com.jirbo.adcolony.a.J.f = 1;
                com.jirbo.adcolony.a.J.a();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            message = new ADCData.g();
            if (com.jirbo.adcolony.a.L.F.Q)
            {
                message.b("html5_endcard_loading_started", com.jirbo.adcolony.a.L.k);
            }
            if (com.jirbo.adcolony.a.L.F.Q)
            {
                message.b("html5_endcard_loading_finished", com.jirbo.adcolony.a.L.l);
            }
            if (com.jirbo.adcolony.a.L.F.Q)
            {
                message.b("html5_endcard_loading_time", com.jirbo.adcolony.a.L.p);
            }
            if (com.jirbo.adcolony.a.L.F.Q)
            {
                message.b("html5_endcard_loading_timeout", com.jirbo.adcolony.a.L.m);
            }
            if (com.jirbo.adcolony.a.L.q < 60000D)
            {
                message.b("endcard_time_spent", com.jirbo.adcolony.a.L.q);
            }
            message.b("endcard_dissolved", com.jirbo.adcolony.a.L.n);
            ADCVideo adcvideo = com.jirbo.adcolony.a.L;
            message.b("replay", ADCVideo.e);
            message.b("reward", com.jirbo.adcolony.a.L.o);
            com.jirbo.adcolony.a.l.d.a("continue", message, a);
            com.jirbo.adcolony.a.l.b.e();
            if (com.jirbo.adcolony.a.J != null)
            {
                com.jirbo.adcolony.a.J.f = 4;
                com.jirbo.adcolony.a.J.a();
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        a()
        {
        }
    }


    private class b extends Handler
    {

        public void a(boolean flag, String s1, int i1)
        {
            if (!flag)
            {
                s1 = null;
            }
            sendMessage(obtainMessage(i1, s1));
        }

        public void handleMessage(Message message)
        {
            int i1 = 0;
            String s1 = (String)message.obj;
            int j1 = message.what;
            boolean flag;
            if (s1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            message = s1;
            if (!flag)
            {
                message = "";
            }
            message = new AdColonyV4VCReward(flag, message, j1);
            for (; i1 < com.jirbo.adcolony.a.ae.size(); i1++)
            {
                ((AdColonyV4VCListener)com.jirbo.adcolony.a.ae.get(i1)).onAdColonyV4VCReward(message);
            }

        }

        b()
        {
        }
    }

}
