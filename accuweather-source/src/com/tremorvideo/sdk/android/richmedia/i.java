// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            e

public class i
{
    public class a
    {

        final i a;
        private c b;
        private b c;
        private Object d;
        private int e;
        private String f;

        public int a()
        {
            return e;
        }

        public c b()
        {
            return b;
        }

        public b c()
        {
            return c;
        }

        public String d()
        {
            return f;
        }

        public Object e()
        {
            return d;
        }

        public a(c c1, b b1, Object obj, int k, String s)
        {
            a = i.this;
            super();
            b = c1;
            c = b1;
            d = obj;
            e = k;
            f = null;
            if (s != null && s.length() > 0)
            {
                f = s;
            }
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
        private static final b S[];
        public static final b a;
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

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/i$b, s1);
        }

        public static b[] values()
        {
            return (b[])S.clone();
        }

        static 
        {
            a = new b("None", 0);
            b = new b("GotoScene", 1);
            c = new b("GotoKeyFrame", 2);
            d = new b("StartVideo", 3);
            e = new b("StartVideo1", 4);
            f = new b("StartVideo2", 5);
            g = new b("StartVideo3", 6);
            h = new b("PauseVideo", 7);
            i = new b("ResumeVideo", 8);
            j = new b("PauseHideVideo", 9);
            k = new b("StopVideo", 10);
            l = new b("Exit", 11);
            m = new b("Impression", 12);
            n = new b("Vibration", 13);
            o = new b("Replay", 14);
            p = new b("VideoStart", 15);
            q = new b("VideoMidpoint", 16);
            r = new b("VideoEnd", 17);
            s = new b("VideoFirstquartile", 18);
            t = new b("VideoThirdquartile", 19);
            u = new b("Skip", 20);
            v = new b("ClickToWeb", 21);
            w = new b("ClickToAppstore", 22);
            x = new b("ClickToCall", 23);
            y = new b("ClickToItunes", 24);
            z = new b("ClickToMarket", 25);
            A = new b("ClickToMp3store", 26);
            B = new b("ClickToFacebook", 27);
            C = new b("ClickToTwitter", 28);
            D = new b("ClickToTickets", 29);
            E = new b("ClickToBlackberrymarket", 30);
            F = new b("ClickToMap", 31);
            G = new b("PostToFacebook", 32);
            H = new b("AddToCalendar", 33);
            I = new b("AddToContacts", 34);
            J = new b("ShareEmail", 35);
            K = new b("ShareSms", 36);
            L = new b("ClickToCoupon", 37);
            M = new b("ClickToYoutube", 38);
            N = new b("TwitterTweet", 39);
            O = new b("ShowDate", 40);
            P = new b("AdChoices", 41);
            Q = new b("AgeGate", 42);
            R = new b("ShowBuyNow", 43);
            S = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final c k;
        public static final c l;
        public static final c m;
        public static final c n;
        public static final c o;
        private static final c p[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/i$c, s);
        }

        public static c[] values()
        {
            return (c[])p.clone();
        }

        static 
        {
            a = new c("None", 0);
            b = new c("VideoStart", 1);
            c = new c("VideoEnd", 2);
            d = new c("TouchDown", 3);
            e = new c("TouchRelease", 4);
            f = new c("SceneStart", 5);
            g = new c("SceneEnd", 6);
            h = new c("SceneExit", 7);
            i = new c("Shake", 8);
            j = new c("DropEnter", 9);
            k = new c("DropRelease", 10);
            l = new c("DropCancel", 11);
            m = new c("Code", 12);
            n = new c("AgePass", 13);
            o = new c("AgeFail", 14);
            p = (new c[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o
            });
        }

        private c(String s, int i1)
        {
            super(s, i1);
        }
    }


    private List a;

    public i()
    {
    }

    public static boolean a(b b1)
    {
        boolean flag = true;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.f.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.g.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            flag = false;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return flag;
        }
    }

    public a a(c c1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.b() == c1)
            {
                return a1;
            }
        }

        return null;
    }

    public void a(e e1, int j)
        throws Exception
    {
        int l = e1.b();
        a = new ArrayList(l);
        int k = 0;
        while (k < l) 
        {
            int i1 = e1.a();
            c c1 = c.values()[e1.b()];
            b b1 = b.values()[e1.b()];
            Object obj;
            String s;
            if (j > 1)
            {
                s = e1.c();
            } else
            {
                s = null;
            }
            if (b1 == b.b)
            {
                obj = new Integer(e1.b());
            } else
            if (a(b1))
            {
                obj = new Integer(e1.b());
            } else
            if (b1 == b.c)
            {
                obj = new int[2];
                obj[0] = e1.b();
                obj[1] = e1.a();
            } else
            {
                obj = null;
            }
            a.add(new a(c1, b1, obj, i1, s));
            k++;
        }
    }

    public boolean a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).c() == b.u)
            {
                return true;
            }
        }

        return false;
    }
}
