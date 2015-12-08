// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;


public final class  extends Enum
{

    private static x A;
    private static final x B[];
    public static final x a;
    public static final x b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;
    public static final x i;
    public static final x j;
    public static final x k;
    public static final x l;
    public static final x m;
    public static final x n;
    public static final x o;
    public static final x p;
    public static final x q;
    public static final x r;
    public static final x s;
    public static final x t;
    public static final x u;
    public static final x v;
    public static final x w;
    public static final x x;
    private static x y;
    private static x z;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/ui/NavigationItem$NavigationGroup, s1);
    }

    public static [] values()
    {
        return ([])B.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("SEARCH", 1);
        c = new <init>("MOMENTS_START", 2);
        d = new <init>("BROWSE", 3);
        e = new <init>("DISCOVER", 4);
        f = new <init>("SOCIAL_CHART", 5);
        g = new <init>("ACTIVITY_FEED", 6);
        h = new <init>("WHATS_NEW", 7);
        i = new <init>("RADIO", 8);
        j = new <init>("COLLECTION", 9);
        y = new <init>("PLAYLISTS", 10);
        k = new <init>("INBOX", 11);
        z = new <init>("PEOPLE", 12);
        l = new <init>("PROFILE", 13);
        m = new <init>("CONFIG", 14);
        A = new <init>("CONTEXT_RECOGNITION", 15);
        n = new <init>("RUNNING", 16);
        o = new <init>("PARTY", 17);
        p = new <init>("MUSIC", 18);
        q = new <init>("SHOWS", 19);
        r = new <init>("MOMENTS", 20);
        s = new <init>("PREMIUM", 21);
        t = new <init>("EVENTS", 22);
        u = new <init>("NAVIGATION_CATEGORIES_CHARTS", 23);
        v = new <init>("NAVIGATION_GENRES_INSPIRATION", 24);
        w = new <init>("NAVIGATION_MOODS_MOMENTS", 25);
        x = new <init>("NAVIGATION_PLAY_MUSIC", 26);
        B = (new B[] {
            a, b, c, d, e, f, g, h, i, j, 
            y, k, z, l, m, A, n, o, p, q, 
            r, s, t, u, v, w, x
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
