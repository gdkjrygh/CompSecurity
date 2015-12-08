// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.cc.c;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            ag, h, ab, j, 
//            u

public abstract class r
    implements c
{
    public static final class a extends Enum
    {

        private static a A;
        private static a B;
        private static final a C[];
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
        private static a s;
        private static a t;
        private static a u;
        private static a v;
        private static a w;
        private static a x;
        private static a y;
        private static a z;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bx/r$a, s1);
        }

        public static a[] values()
        {
            return (a[])C.clone();
        }

        static 
        {
            a = new a("UNUSED", 0);
            b = new a("BASE_IMAGERY", 1);
            c = new a("VECTORS", 2);
            d = new a("NIGHT_DIMMER", 3);
            e = new a("DESATURATE", 4);
            f = new a("TRAFFIC", 5);
            g = new a("INDOOR", 6);
            h = new a("LAYER_SHAPES", 7);
            s = new a("TRANSIT", 8);
            i = new a("BUILDINGS", 9);
            t = new a("POLYLINE", 10);
            j = new a("LABELS", 11);
            u = new a("FADE_OUT_OVERLAY", 12);
            v = new a("ROUTE_OVERVIEW_POLYLINE", 13);
            w = new a("TURN_ARROW_OVERLAY", 14);
            k = new a("IMPORTANT_LABELS", 15);
            l = new a("DEBUG_LABELS", 16);
            x = new a("INTERSECTION", 17);
            m = new a("SKY", 18);
            y = new a("MY_LOCATION_OVERLAY_DA", 19);
            z = new a("LAYERS_RAW_GPS", 20);
            n = new a("LAYER_MARKERS_SHADOW", 21);
            o = new a("LAYER_MARKERS", 22);
            p = new a("MY_LOCATION_OVERLAY_VECTORMAPS", 23);
            A = new a("COMPASS_OVERLAY", 24);
            B = new a("LOADING_SPINNY", 25);
            q = new a("BUBBLE", 26);
            r = new a("HEADS_UP_DISPLAY", 27);
            C = (new a[] {
                a, b, c, d, e, f, g, h, s, i, 
                t, j, u, v, w, k, l, x, m, y, 
                z, n, o, p, A, B, q, r
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public r()
    {
    }

    protected final ag a(ag.a a1)
    {
        return new ag(this, a1, new h[0]);
    }

    protected final ag a(ag.a a1, Collection collection, Collection collection1)
    {
        return new ag(this, a1, collection, collection1);
    }

    protected final transient ag a(ag.a a1, h ah[])
    {
        return new ag(this, a1, ah);
    }

    public void a(int j)
    {
    }

    public void a(d d1)
    {
    }

    public abstract void a(d d1, b b1, ab ab);

    public void a(d d1, j j)
    {
    }

    public void a(boolean flag)
    {
    }

    public boolean a(float f, float f1, g g1, b b1)
    {
        return false;
    }

    public boolean a(b b1, d d1)
    {
        return true;
    }

    public boolean a(List list)
    {
        if (list.isEmpty())
        {
            list.add(a(i()));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a_(float f, float f1, b b1)
    {
        return false;
    }

    public void b(d d1)
    {
    }

    public boolean b(float f, float f1, b b1)
    {
        return false;
    }

    public boolean b(float f, float f1, g g1, b b1)
    {
        return false;
    }

    public void c(d d1)
    {
        b(d1);
    }

    public boolean c(float f, float f1, b b1)
    {
        return false;
    }

    public abstract a d();

    public boolean d(float f, float f1, b b1)
    {
        return false;
    }

    public boolean e()
    {
        return true;
    }

    public u g()
    {
        return null;
    }

    protected ag.a i()
    {
        return ag.a.i;
    }

    public void i_()
    {
    }

    protected boolean j_()
    {
        return false;
    }

    public void l_()
    {
    }

    public boolean m()
    {
        return false;
    }

    public boolean m_()
    {
        return false;
    }
}
