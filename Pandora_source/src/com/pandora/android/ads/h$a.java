// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.crashlytics.android.d;
import com.pandora.android.util.p;

// Referenced classes of package com.pandora.android.ads:
//            h

public static final class p extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final o k;
    public static final o l;
    public static final o m;
    public static final o n;
    public static final o o;
    private static final o q[];
    p p;

    public static c a(com.pandora.android.util. )
    {
        switch (a[.ordinal()])
        {
        default:
            com.crashlytics.android.d.a(new IllegalArgumentException((new StringBuilder()).append("Invalid AdActionLocation ViewMode: ").append(.ac).toString()));
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

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/pandora/android/ads/h$a, s);
    }

    public static o[] values()
    {
        return (o[])q.clone();
    }

    static 
    {
        a = new <init>("now_playing", 0, p.F);
        b = new <init>("find_people", 1, p.k);
        c = new <init>("track", 2, p.C);
        d = new <init>("artist", 3, p.D);
        e = new <init>("station", 4, p.e);
        f = new <init>("stations", 5, p.a);
        g = new <init>("album", 6, p.E);
        h = new <init>("feed", 7, p.j);
        i = new <init>("profile", 8, p.l);
        j = new <init>("following", 9, p.p);
        k = new <init>("followers", 10, p.q);
        l = new <init>("likes", 11, p.o);
        m = new <init>("bookmarks", 12, p.n);
        n = new <init>("landing_page", 13, p.M);
        o = new <init>("genre_stations", 14, p.i);
        q = (new q[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }

    private c(String s, int i1, p p1)
    {
        super(s, i1);
        p = p1;
    }
}
