// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class shelduck extends Enum
{

    public static final shelduck A;
    private static final shelduck C[];
    public static final shelduck a;
    public static final shelduck b;
    public static final shelduck c;
    public static final shelduck d;
    public static final shelduck e;
    public static final shelduck f;
    public static final shelduck g;
    public static final shelduck h;
    public static final shelduck i;
    public static final shelduck j;
    public static final shelduck k;
    public static final shelduck l;
    public static final shelduck m;
    public static final shelduck n;
    public static final shelduck o;
    public static final shelduck p;
    public static final shelduck q;
    public static final shelduck r;
    public static final shelduck s;
    public static final shelduck t;
    public static final shelduck u;
    public static final shelduck v;
    public static final shelduck w;
    public static final shelduck x;
    public static final shelduck y;
    public static final shelduck z;
    String B;

    private shelduck(String s1, int i1, String s2)
    {
        super(s1, i1);
        B = s2;
    }

    public static shelduck valueOf(String s1)
    {
        return (shelduck)Enum.valueOf(com/taplytics/shelduck, s1);
    }

    public static shelduck[] values()
    {
        return (shelduck[])C.clone();
    }

    static 
    {
        a = new shelduck("VIEWTRACKING", 0, "views");
        b = new shelduck("EVENTS", 1, "events");
        c = new shelduck("ANALYTICS", 2, "analytics");
        d = new shelduck("EXTERNAL", 3, "external");
        e = new shelduck("GOOGLE", 4, "google");
        f = new shelduck("MIXPANEL", 5, "mixpanel");
        g = new shelduck("FLURRY", 6, "flurry");
        h = new shelduck("ADOBE", 7, "adobe");
        i = new shelduck("LOCALYTICS", 8, "localytics");
        j = new shelduck("AMPLITUDE", 9, "amplitude");
        k = new shelduck("LISTVIEWS", 10, "listviews");
        l = new shelduck("RECYCLERVIEWS", 11, "recyclerviews");
        m = new shelduck("VISUAL", 12, "visual");
        n = new shelduck("ERRORS", 13, "errors");
        o = new shelduck("SOCKETS", 14, "sockets");
        p = new shelduck("VIEWPAGERS", 15, "viewpagers");
        q = new shelduck("SUPPORTFRAGMENTS", 16, "supportfragments");
        r = new shelduck("FRAGMENTS", 17, "fragments");
        s = new shelduck("PUSH", 18, "push");
        t = new shelduck("GEOFENCES", 19, "geofences");
        u = new shelduck("CODE", 20, "code");
        v = new shelduck("BUTTONS", 21, "buttons");
        w = new shelduck("DYNAMICVARS", 22, "dynamicvars");
        x = new shelduck("DELAYLOAD", 23, "delay");
        y = new shelduck("SHAKEMENU", 24, "shakemenu");
        z = new shelduck("REQUESTERRORS", 25, "requesterrors");
        A = new shelduck("EVENTSTHROTTLED", 26, "eventsThrottled");
        C = (new shelduck[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A
        });
    }
}
