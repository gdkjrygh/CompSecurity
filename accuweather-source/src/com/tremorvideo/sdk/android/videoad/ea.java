// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

public class ea
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        private String e;

        public static a a(String s)
        {
            a aa[] = values();
            int j1 = aa.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                a a1 = aa[i1];
                if (a1.toString().equalsIgnoreCase(s))
                {
                    return a1;
                }
            }

            return d;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ea$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        public String toString()
        {
            return e;
        }

        static 
        {
            a = new a("ClickToAppStore", 0, "click-to-appstore");
            b = new a("ClickToBlackberryMarket", 1, "click-to-blackberrymarket");
            c = new a("ClickToITunes", 2, "click-to-itunes");
            d = new a("None", 3, "none");
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1, String s1)
        {
            super(s, i1);
            e = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final b H;
        public static final b I;
        public static final b J;
        public static final b K;
        public static final b L;
        public static final b M;
        public static final b N;
        public static final b O;
        public static final b P;
        public static final b Q;
        public static final b R;
        public static final b S;
        public static final b T;
        public static final b U;
        public static final b V;
        public static final b a;
        private static final b aa[];
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;
        public static final b r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final b y;
        public static final b z;
        private String W;
        private boolean X;
        private String Y;
        private gd.b Z;

        public static b a(String s1)
        {
            b ab[] = values();
            int j1 = ab.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                b b1 = ab[i1];
                if (b1.toString().equalsIgnoreCase(s1))
                {
                    return b1;
                }
            }

            return V;
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ea$b, s1);
        }

        public static b[] values()
        {
            return (b[])aa.clone();
        }

        public boolean a()
        {
            return X;
        }

        public gd.b b()
        {
            return Z;
        }

        public String c()
        {
            return Y;
        }

        public String toString()
        {
            return W;
        }

        static 
        {
            a = new b("Invalid", 0, "", false, "", null);
            b = new b("Web", 1, "click-to-web", true, "Web", gd.b.a);
            c = new b("Call", 2, "click-to-call", true, "Call", gd.b.b);
            d = new b("MP3Store", 3, "click-to-mp3store", true, "MP3", gd.b.c);
            e = new b("Twitter", 4, "click-to-twitter", true, "Twitter", gd.b.e);
            f = new b("Market", 5, "click-to-market", true, "Market", gd.b.d);
            g = new b("Facebook", 6, "click-to-facebook", true, "Facebook", gd.b.f);
            h = new b("Ticket", 7, "click-to-tickets", true, "Tickets", gd.b.g);
            i = new b("Youtube", 8, "click-to-youtube", true, "Youtube", gd.b.h);
            j = new b("Timer", 9, "timer", false, "", null);
            k = new b("ExternalSurveyIntiated", 10, "external-survey-init", false, "", null);
            l = new b("ExternalSurveyStart", 11, "external-survey-start", false, "", gd.b.j);
            m = new b("ExternalSurveyEnd", 12, "external-survey-end", false, "", null);
            n = new b("ExternalSurveySkip", 13, "external-survey-skip", false, "", null);
            o = new b("ExternalSurveyButton", 14, "survey", false, "Survey", gd.b.d);
            p = new b("TwitterTweet", 15, "twitter-tweet", true, "Tweet", gd.b.e);
            q = new b("Map", 16, "click-to-map", true, "Map", gd.b.m);
            r = new b("Share", 17, "click-to-share", true, "Share", gd.b.k);
            s = new b("ShareEmail", 18, "share-email", true, "Share", gd.b.k);
            t = new b("ShareSMS", 19, "share-sms", true, "Share", gd.b.k);
            u = new b("PostToFacebook", 20, "post-to-facebook", true, "Post", gd.b.f);
            v = new b("Skip", 21, "skip", false, "Skip", gd.b.i);
            w = new b("Replay", 22, "replay", false, "Replay", gd.b.v);
            x = new b("Vibrate", 23, "timer-vibration", false, "Vibrate", null);
            y = new b("AdStart", 24, "ad-start", false, "Ad Start", null);
            z = new b("AdComplete", 25, "ad-complete", false, "Ad Complete", null);
            A = new b("CouponSave", 26, "save-coupon", true, "Save", gd.b.d);
            B = new b("CouponShow", 27, "show-coupon", true, "Coupon", gd.b.n);
            C = new b("CouponAutoDisplay", 28, "coupon-auto-display", false, "", null);
            D = new b("CouponSkip", 29, "coupon-skip", true, "Done", gd.b.i);
            E = new b("CouponBack", 30, "coupon-back", true, "Done", gd.b.i);
            F = new b("Date", 31, "show-date", true, "Date", gd.b.l);
            G = new b("Zip", 32, "show-zip", false, "Date", null);
            H = new b("AdChoices", 33, "ad-choices", false, "", null);
            I = new b("TMS", 34, "click-to-tms", false, "", null);
            J = new b("AgeGate", 35, "age-gate", false, "", null);
            K = new b("CouponShare", 36, "coupon-share", true, "Share", gd.b.k);
            L = new b("CouponShareSMS", 37, "coupon-share-sms", true, "Share SMS", gd.b.k);
            M = new b("CouponShareEmail", 38, "coupon-share-email", true, "Share Email", gd.b.k);
            N = new b("InternalSurveyStart", 39, "internal-survey-start", false, "", null);
            O = new b("InternalSurveySkip", 40, "internal-survey-skip", false, "", null);
            P = new b("InternalSurveySubmit", 41, "internal-survey-submit", false, "", null);
            Q = new b("BuyItNow", 42, "buy-now", true, "", gd.b.n);
            R = new b("BuyItNowStart", 43, "buy-now-start", false, "", null);
            S = new b("BuyItNowClick", 44, "buy-now-click", false, "", null);
            T = new b("BuyItNowSkip", 45, "buy-now-skip", false, "", null);
            U = new b("BuyItNowEnd", 46, "buy-now-end", false, "", null);
            V = new b("Custom", 47, "custom", false, "", null);
            aa = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V
            });
        }

        private b(String s1, int i1, String s2, boolean flag, String s3, gd.b b1)
        {
            super(s1, i1);
            W = s2;
            X = flag;
            Y = s3;
            Z = b1;
        }
    }


    private b a;
    private String b;
    private String c;
    private String d[];
    private String e;
    private String f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private Dictionary k;
    private int l;
    private String m;
    private a n;
    private Map o;

    public ea(b b1, int i1, String as[])
    {
        a = b1;
        b = b1.c();
        c = "";
        d = as;
        e = "";
        f = "0";
        g = true;
        h = 0;
        i = i1;
        j = true;
        l = -1;
        m = "";
        n = a.d;
    }

    public ea(b b1, String s, String as[])
    {
        a = b1;
        b = b1.c();
        c = "";
        d = as;
        e = s;
        f = "0";
        g = true;
        h = 0;
        i = 0;
        j = true;
        l = -1;
        m = "";
        n = a.d;
    }

    public ea(JSONObject jsonobject)
        throws Exception
    {
        l = -1;
        f = jsonobject.getString("id");
        g = jsonobject.getBoolean("billable");
        String s = jsonobject.getString("type");
        a = b.a(s);
        if (jsonobject.has("order"))
        {
            h = jsonobject.getInt("order");
        } else
        {
            h = 0;
        }
        n = a.a(s);
        if (jsonobject.has("text"))
        {
            b = jsonobject.getString("text");
        } else
        {
            b = "";
        }
        if (jsonobject.has("tracking-url"))
        {
            d = (new String[] {
                a(jsonobject, "tracking-url")
            });
        }
        e = a(jsonobject, "click-url");
        if (jsonobject.has("tag"))
        {
            m = jsonobject.getString("tag");
        } else
        {
            m = null;
        }
        if (jsonobject.has("icon"))
        {
            c = jsonobject.getString("icon");
        } else
        {
            c = null;
        }
        if (jsonobject.has("event-trigger-secs"))
        {
            i = (int)Math.round(jsonobject.getDouble("event-trigger-secs") * 1000D);
        } else
        {
            i = 0;
        }
        if (jsonobject.has("pre-event-trigger"))
        {
            j = jsonobject.getBoolean("pre-event-trigger");
        } else
        {
            j = false;
        }
        if (jsonobject.has("activity-trigger-secs"))
        {
            l = (int)Math.round(jsonobject.getDouble("activity-trigger-secs") * 1000D);
        }
        if (a == b.q)
        {
            f(jsonobject);
        } else
        {
            if (a == b.u)
            {
                e(jsonobject);
                return;
            }
            if (a == b.x)
            {
                g(jsonobject);
                return;
            }
            if (a == b.w)
            {
                h(jsonobject);
                return;
            }
            if (a == b.r)
            {
                i(jsonobject);
                return;
            }
            if (a == b.s)
            {
                i(jsonobject);
                return;
            }
            if (a == b.t)
            {
                i(jsonobject);
                return;
            }
            if (a == b.M)
            {
                i(jsonobject);
                return;
            }
            if (a == b.L)
            {
                i(jsonobject);
                return;
            }
            if (a == b.K)
            {
                i(jsonobject);
                return;
            }
            if (a == b.p)
            {
                d(jsonobject);
                return;
            }
            if (a == b.H)
            {
                a(jsonobject);
                return;
            }
            if (a == b.I)
            {
                b(jsonobject);
                return;
            }
            if (a == b.J)
            {
                c(jsonobject);
                return;
            }
            if (a == b.V)
            {
                b = s;
                return;
            }
        }
    }

    private static String a(JSONObject jsonobject, String s)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private static void a(Dictionary dictionary, JSONObject jsonobject, String s)
    {
        jsonobject = a(jsonobject, s);
        if (jsonobject != null)
        {
            dictionary.put(s, jsonobject);
        }
    }

    private void a(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "location");
    }

    public static String b(b b1)
    {
        return b1.c();
    }

    private void b(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "zip");
        a(k, jsonobject, "movie");
    }

    private void c(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "age");
    }

    private void d(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "message");
    }

    private void e(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "description");
        a(k, jsonobject, "image");
        a(k, jsonobject, "message");
        a(k, jsonobject, "link");
        a(k, jsonobject, "name");
        a(k, jsonobject, "video");
    }

    private void f(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "map-type");
        a(k, jsonobject, "latitude");
        a(k, jsonobject, "longitude");
        a(k, jsonobject, "pinpoint-name");
        a(k, jsonobject, "query");
        a(k, jsonobject, "zoom");
    }

    private void g(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "duration");
    }

    private void h(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "auto-skip");
    }

    private void i(JSONObject jsonobject)
    {
        k = new Hashtable();
        a(k, jsonobject, "message");
        a(k, jsonobject, "subject");
    }

    public int a(String s, int i1)
    {
        String s1;
        int j1;
        try
        {
            s1 = (String)k.get(s);
        }
        catch (Exception exception)
        {
            ct.a((new StringBuilder()).append("Could not get integer parameter: ").append(s).toString(), exception);
            return i1;
        }
        j1 = i1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        j1 = Integer.parseInt(s1);
        return j1;
    }

    public b a()
    {
        return a;
    }

    public String a(String s, String s1)
    {
        String s2 = (String)k.get(s);
        if (s2 != null)
        {
            return s2;
        }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        ct.a((new StringBuilder()).append("Could not get string parameter: ").append(s).toString(), exception);
        return s1;
    }

    public void a(b b1)
    {
        a = b1;
    }

    public int b()
    {
        return l;
    }

    public void b(String s, String s1)
    {
        if (o == null)
        {
            o = new HashMap();
        }
        o.put(s, s1);
    }

    public String c()
    {
        return f;
    }

    public String d()
    {
        return m;
    }

    public boolean e()
    {
        return g;
    }

    public int f()
    {
        return i;
    }

    public Dictionary g()
    {
        return k;
    }

    public boolean h()
    {
        return j;
    }

    public String i()
    {
        return b;
    }

    public int j()
    {
        return h;
    }

    public String[] k()
    {
        return d;
    }

    public String l()
    {
        return e;
    }

    public boolean m()
    {
        if (!a.a())
        {
            return false;
        } else
        {
            return n();
        }
    }

    public boolean n()
    {
        boolean flag1 = false;
        boolean flag;
        if (a == b.c)
        {
            flag = ct.q();
        } else
        {
            flag = flag1;
            if (!o())
            {
                flag = flag1;
                if (ct.a(a))
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public boolean o()
    {
        return n != a.d;
    }

    public String p()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return a.b().X;
        }
    }

    public Map q()
    {
        return o;
    }
}
