// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.crashlytics.android.d;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.pandora.android.util.p;
import com.pandora.radio.data.a;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.b;
import com.pandora.radio.data.y;

public interface h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        private static final a q[];
        p p;

        public static a a(com.pandora.android.util.af.c c1)
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.pandora.android.util.af.c.values().length];
                    try
                    {
                        a[com.pandora.android.util.af.c.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror29) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror28) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror27) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror26) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.j.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror25) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.p.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror24) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.z.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror23) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.X.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror22) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.q.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror21) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.A.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror20) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.Y.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror19) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.s.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.C.ordinal()] = 13;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.N.ordinal()] = 14;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.l.ordinal()] = 15;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.r.ordinal()] = 16;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.B.ordinal()] = 17;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.Z.ordinal()] = 18;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.i.ordinal()] = 19;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.h.ordinal()] = 20;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.k.ordinal()] = 21;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.t.ordinal()] = 22;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.o.ordinal()] = 23;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.x.ordinal()] = 24;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.n.ordinal()] = 25;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.w.ordinal()] = 26;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.m.ordinal()] = 27;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.y.ordinal()] = 28;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.u.ordinal()] = 29;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.pandora.android.util.af.c.Q.ordinal()] = 30;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.pandora.android.ads._cls1.a[c1.ordinal()])
            {
            default:
                com.crashlytics.android.d.a(new IllegalArgumentException((new StringBuilder()).append("Invalid AdActionLocation ViewMode: ").append(c1.ac).toString()));
                return null;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                return a;

            case 5: // '\005'
                return b;

            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                return c;

            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
                return d;

            case 12: // '\f'
            case 13: // '\r'
                return e;

            case 14: // '\016'
            case 15: // '\017'
                return f;

            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
                return g;

            case 19: // '\023'
            case 20: // '\024'
                return h;

            case 21: // '\025'
            case 22: // '\026'
                return i;

            case 23: // '\027'
            case 24: // '\030'
                return j;

            case 25: // '\031'
            case 26: // '\032'
                return k;

            case 27: // '\033'
            case 28: // '\034'
                return l;

            case 29: // '\035'
                return m;

            case 30: // '\036'
                return o;
            }
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/ads/h$a, s);
        }

        public static a[] values()
        {
            return (a[])q.clone();
        }

        static 
        {
            a = new a("now_playing", 0, p.F);
            b = new a("find_people", 1, p.k);
            c = new a("track", 2, p.C);
            d = new a("artist", 3, p.D);
            e = new a("station", 4, p.e);
            f = new a("stations", 5, p.a);
            g = new a("album", 6, p.E);
            h = new a("feed", 7, p.j);
            i = new a("profile", 8, p.l);
            j = new a("following", 9, p.p);
            k = new a("followers", 10, p.q);
            l = new a("likes", 11, p.o);
            m = new a("bookmarks", 12, p.n);
            n = new a("landing_page", 13, p.M);
            o = new a("genre_stations", 14, p.i);
            q = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o
            });
        }

        private a(String s, int i1, p p1)
        {
            super(s, i1);
            p = p1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/android/ads/h$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("WhyAds", 0);
            b = new b("Banner", 1);
            c = new b("MiniBanner", 2);
            d = new b("TapToRegister", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int l)
        {
            super(s, l);
        }
    }


    public abstract PublisherAdView a(String s);

    public abstract void a();

    public abstract void a(AdView.b b1, int l);

    public abstract void a(b b1, com.pandora.radio.data.a a1, String s, boolean flag, Runnable runnable);

    public abstract void a(aa aa, y y);

    public abstract void b();

    public abstract void b(com.pandora.radio.util.k.a a1);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract com.pandora.radio.data.b getAdId();

    public abstract void h();

    public abstract void i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void setZone(int l);
}
