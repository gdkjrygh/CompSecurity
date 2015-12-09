// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.IFilter;
import com.aviary.android.feather.headless.filters.NativeRangeFilter;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.filters.impl.CropFilter;
import com.aviary.android.feather.headless.filters.impl.EffectFilter;
import java.util.Locale;

// Referenced classes of package com.aviary.android.feather.library.filters:
//            MemeFilter, EnhanceFilter, AdjustFilter, BorderFilter, 
//            TextFilter

public class com.aviary.android.feather.library.filters.a
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
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        private static final a u[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/library/filters/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])u.clone();
        }

        static 
        {
            a = new a("SHARPNESS", 0);
            b = new a("BRIGHTNESS", 1);
            c = new a("CONTRAST", 2);
            d = new a("SATURATION", 3);
            e = new a("EFFECTS", 4);
            f = new a("REDEYE", 5);
            g = new a("CROP", 6);
            h = new a("WHITEN", 7);
            i = new a("DRAW", 8);
            j = new a("STICKERS", 9);
            k = new a("TEXT", 10);
            l = new a("BLEMISH", 11);
            m = new a("MEME", 12);
            n = new a("ORIENTATION", 13);
            o = new a("ENHANCE", 14);
            p = new a("WARMTH", 15);
            q = new a("FRAMES", 16);
            r = new a("SPLASH", 17);
            s = new a("FOCUS", 18);
            t = new a("BLUR", 19);
            u = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public com.aviary.android.feather.library.filters.a()
    {
    }

    public static a a(String s)
    {
        try
        {
            s = a.valueOf(s.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String a(a a1)
    {
        return a1.name().toLowerCase(Locale.US);
    }

    public static String[] a()
    {
        return (new String[] {
            a.o.name(), a.e.name(), a.q.name(), a.j.name(), a.g.name(), a.s.name(), a.n.name(), a.b.name(), a.c.name(), a.d.name(), 
            a.p.name(), a.a.name(), a.r.name(), a.i.name(), a.k.name(), a.f.name(), a.h.name(), a.l.name(), a.t.name()
        });
    }

    public static String b(a a1)
    {
        return a(a1);
    }

    public static int c(a a1)
    {
        return 1;
    }

    public static IFilter d(a a1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[a.m.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[a.o.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[a.n.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[a.h.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[a.f.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[a.t.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[a.l.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[a.d.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[a.b.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[a.c.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[a.p.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[a.e.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[a.q.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[a.r.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.s.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.k.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.j.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.i.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        case 19: // '\023'
        case 20: // '\024'
        default:
            return null;

        case 1: // '\001'
            return new CropFilter();

        case 2: // '\002'
            return new MemeFilter();

        case 3: // '\003'
            return new EnhanceFilter();

        case 4: // '\004'
            return new AdjustFilter();

        case 5: // '\005'
            return new NativeRangeFilter("sharpness", "value");

        case 6: // '\006'
            return new NativeToolFilter("whiten", com.aviary.android.feather.headless.filters.NativeToolFilter.b.e);

        case 7: // '\007'
            return new NativeToolFilter("redeye", com.aviary.android.feather.headless.filters.NativeToolFilter.b.d);

        case 8: // '\b'
            return new NativeToolFilter("blur", com.aviary.android.feather.headless.filters.NativeToolFilter.b.f);

        case 9: // '\t'
            return new NativeToolFilter("blemish", com.aviary.android.feather.headless.filters.NativeToolFilter.b.c);

        case 10: // '\n'
            return new NativeRangeFilter("saturation", "value");

        case 11: // '\013'
            return new NativeRangeFilter("brightness", "value");

        case 12: // '\f'
            return new NativeRangeFilter("contrast", "value");

        case 13: // '\r'
            return new NativeRangeFilter("colortemp", "value");

        case 14: // '\016'
            return new EffectFilter();

        case 15: // '\017'
            return new BorderFilter();

        case 16: // '\020'
            return new NativeToolFilter("colorsplash", com.aviary.android.feather.headless.filters.NativeToolFilter.b.a);

        case 17: // '\021'
            return new NativeToolFilter("tiltshift", com.aviary.android.feather.headless.filters.NativeToolFilter.b.b);

        case 18: // '\022'
            return new TextFilter();
        }
    }
}
