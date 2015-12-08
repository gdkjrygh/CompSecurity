// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.TextView;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kik.a.e.v;
import kik.android.chat.KikApplication;
import kik.android.chat.a.a;

// Referenced classes of package kik.android.chat.b:
//            b, e, f

public final class d
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
        public static final a u;
        public static final a v;
        private static final a y[];
        int w;
        String x;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(kik/android/chat/b/d$a, s1);
        }

        public static a[] values()
        {
            return (a[])y.clone();
        }

        static 
        {
            a = new a("CRIMSON", 0, "#F62222", "Bright Red");
            b = new a("PINK", 1, "#FF69A3", "Bright Pink");
            c = new a("VIOLET", 2, "#B424DF", "Bright Magenta");
            d = new a("INDIGO", 3, "#8737F8", "Bright Violet");
            e = new a("COBALT", 4, "#309DFF", "Bright Blue");
            f = new a("FOREST", 5, "#00A650", "Bright Green");
            g = new a("GREEN", 6, "#91D013", "Bright Kik Green");
            h = new a("GOLD", 7, "#FFD200", "Bright Yellow");
            i = new a("ORANGE", 8, "#FF8900", "Bright Orange");
            j = new a("BROWN", 9, "#784834", "Bright Brown");
            k = new a("STEEL", 10, "#8D92A8", "Bright Grey");
            l = new a("SALMON", 11, "#FD6A6C", "Light Red");
            m = new a("BLUSH", 12, "#FEA7B9", "Light Pink");
            n = new a("MAUVE", 13, "#CD9AEC", "Light Magenta");
            o = new a("LAVENDER", 14, "#B5B8F8", "Light Violet");
            p = new a("BABY_BLUE", 15, "#87BEFF", "Light Blue");
            q = new a("MINT", 16, "#97F2C3", "Light Aqua");
            r = new a("LIME", 17, "#BBE061", "Light Kik Green");
            s = new a("LEMON", 18, "#F9E560", "Light Yellow");
            t = new a("TANGERINE", 19, "#FFB43F", "Light Orange");
            u = new a("COCONUT", 20, "#CFA075", "Light Brown");
            v = new a("ASH", 21, "#E5E5EA", "Light Grey");
            y = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v
            });
        }

        private a(String s1, int i1, String s2, String s3)
        {
            super(s1, i1);
            w = Color.parseColor(s2);
            x = s3;
        }
    }


    public static final int a = Color.parseColor("#000000");
    private static final com.kik.n.a.k.a.a e;
    private final List b;
    private final List c;
    private final HashMap d = new e(this);
    private final b f;
    private final b g;
    private b h;
    private b i;
    private final kik.android.chat.a.a j;
    private v k;
    private final ColorStateList l;

    public d(Context context, kik.android.chat.a.a a1, v v1)
    {
        b = Arrays.asList(new b[] {
            new b(com.kik.n.a.k.a.a.l, KikApplication.f(0x7f09007e), a.l, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.m, KikApplication.f(0x7f09007d), a.m, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.n, KikApplication.f(0x7f09007b), a.n, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.o, KikApplication.f(0x7f09007f), a.o, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.p, KikApplication.f(0x7f090077), kik.android.chat.b.a.p, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.q, KikApplication.f(0x7f090076), a.q, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.r, KikApplication.f(0x7f09007a), a.r, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.s, KikApplication.f(0x7f090080), a.s, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.t, KikApplication.f(0x7f09007c), a.t, kik.android.chat.b.b.a.a), new b(com.kik.n.a.k.a.a.u, KikApplication.f(0x7f090078), a.u, kik.android.chat.b.b.a.a), 
            new b(com.kik.n.a.k.a.a.v, KikApplication.f(0x7f090079), kik.android.chat.b.a.v, kik.android.chat.b.b.a.a)
        });
        c = Arrays.asList(new b[] {
            (new b(com.kik.n.a.k.a.a.a, KikApplication.f(0x7f090073), kik.android.chat.b.a.a, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.b, KikApplication.f(0x7f090072), a.b, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.c, KikApplication.f(0x7f090070), a.c, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.d, KikApplication.f(0x7f090074), a.d, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.e, KikApplication.f(0x7f09006b), a.e, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.f, KikApplication.f(0x7f09006d), a.f, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.g, KikApplication.f(0x7f09006f), a.g, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.h, KikApplication.f(0x7f090075), a.h, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.i, KikApplication.f(0x7f090071), a.i, b.a.b)).f(), (new b(com.kik.n.a.k.a.a.j, KikApplication.f(0x7f09006c), a.j, b.a.b)).f(), 
            (new b(com.kik.n.a.k.a.a.k, KikApplication.f(0x7f09006e), a.k, b.a.b)).f()
        });
        f = new b(null, "White", null, b.a.b, "Incoming White");
        g = new b(null, "classic photo", null, kik.android.chat.b.b.a.a, "Classic Photo");
        i = a(e);
        j = a1;
        k = v1;
        l = (new TextView(context)).getLinkTextColors();
        boolean flag;
        if (f() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a1 = f();
            context = e;
            if (a1 != null)
            {
                context = (com.kik.n.a.k.a.a)d.get(a1);
            }
            a(a(context));
            a();
            k.q("kik.chat.bubble.color");
        }
        h = a(j.b());
        j.d().a(new f(this));
    }

    private b a(com.kik.n.a.k.a.a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b1.d() == a1)
            {
                return b1;
            }
        }

        for (Iterator iterator1 = c.iterator(); iterator1.hasNext();)
        {
            b b2 = (b)iterator1.next();
            if (b2.d() == a1)
            {
                return b2;
            }
        }

        return null;
    }

    static b a(d d1, com.kik.n.a.k.a.a a1)
    {
        return d1.a(a1);
    }

    static b a(d d1, b b1)
    {
        d1.h = b1;
        return b1;
    }

    private String f()
    {
        return k.n("kik.chat.bubble.color");
    }

    public final List a(int i1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.chat.b.b.a.a().length];
                try
                {
                    a[kik.android.chat.b.b.a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        kik.android.chat.b._cls1.a[i1 - 1];
        JVM INSTR tableswitch 1 2: default 28
    //                   1 45
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        Object obj = new ArrayList();
_L5:
        return new ArrayList(((java.util.Collection) (obj)));
_L2:
        obj = b;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = c;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            h = a(b1.d());
            return;
        }
    }

    public final boolean a()
    {
        com.kik.n.a.k.a.a a1;
        if (h == null)
        {
            a1 = e;
        } else
        {
            a1 = h.d();
        }
        if (j.b() != a1)
        {
            j.a(a1);
            return true;
        } else
        {
            return false;
        }
    }

    public final ColorStateList b()
    {
        return l;
    }

    public final b c()
    {
        if (h == null)
        {
            return i;
        } else
        {
            return h;
        }
    }

    public final b d()
    {
        return g;
    }

    public final b e()
    {
        return f;
    }

    static 
    {
        e = com.kik.n.a.k.a.a.g;
    }
}
