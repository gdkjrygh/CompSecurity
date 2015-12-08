// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;


// Referenced classes of package com.google.android.m4b.maps.bx:
//            r

public static final class  extends Enum
{

    private static r A;
    private static r B;
    private static final r C[];
    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    public static final r l;
    public static final r m;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    private static r s;
    private static r t;
    private static r u;
    private static r v;
    private static r w;
    private static r x;
    private static r y;
    private static r z;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/bx/r$a, s1);
    }

    public static [] values()
    {
        return ([])C.clone();
    }

    static 
    {
        a = new <init>("UNUSED", 0);
        b = new <init>("BASE_IMAGERY", 1);
        c = new <init>("VECTORS", 2);
        d = new <init>("NIGHT_DIMMER", 3);
        e = new <init>("DESATURATE", 4);
        f = new <init>("TRAFFIC", 5);
        g = new <init>("INDOOR", 6);
        h = new <init>("LAYER_SHAPES", 7);
        s = new <init>("TRANSIT", 8);
        i = new <init>("BUILDINGS", 9);
        t = new <init>("POLYLINE", 10);
        j = new <init>("LABELS", 11);
        u = new <init>("FADE_OUT_OVERLAY", 12);
        v = new <init>("ROUTE_OVERVIEW_POLYLINE", 13);
        w = new <init>("TURN_ARROW_OVERLAY", 14);
        k = new <init>("IMPORTANT_LABELS", 15);
        l = new <init>("DEBUG_LABELS", 16);
        x = new <init>("INTERSECTION", 17);
        m = new <init>("SKY", 18);
        y = new <init>("MY_LOCATION_OVERLAY_DA", 19);
        z = new <init>("LAYERS_RAW_GPS", 20);
        n = new <init>("LAYER_MARKERS_SHADOW", 21);
        o = new <init>("LAYER_MARKERS", 22);
        p = new <init>("MY_LOCATION_OVERLAY_VECTORMAPS", 23);
        A = new <init>("COMPASS_OVERLAY", 24);
        B = new <init>("LOADING_SPINNY", 25);
        q = new <init>("BUBBLE", 26);
        r = new <init>("HEADS_UP_DISPLAY", 27);
        C = (new C[] {
            a, b, c, d, e, f, g, h, s, i, 
            t, j, u, v, w, k, l, x, m, y, 
            z, n, o, p, A, B, q, r
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
