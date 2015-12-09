// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.page;


public final class DebugFlag extends Enum
{

    private static DebugFlag A;
    private static DebugFlag B;
    private static DebugFlag C;
    private static DebugFlag D;
    private static DebugFlag E;
    private static DebugFlag F;
    private static DebugFlag G;
    private static DebugFlag H;
    private static final DebugFlag I[];
    public static final DebugFlag a;
    public static final DebugFlag b;
    public static final DebugFlag c;
    public static final DebugFlag d;
    public static final DebugFlag e;
    public static final DebugFlag f;
    public static final DebugFlag g;
    public static final DebugFlag h;
    public static final DebugFlag i;
    public static final DebugFlag j;
    public static final DebugFlag k;
    public static final DebugFlag l;
    public static final DebugFlag m;
    public static final DebugFlag n;
    public static final DebugFlag o;
    public static final DebugFlag p;
    private static DebugFlag q;
    private static DebugFlag r;
    private static DebugFlag s;
    private static DebugFlag t;
    private static DebugFlag u;
    private static DebugFlag v;
    private static DebugFlag w;
    private static DebugFlag x;
    private static DebugFlag y;
    private static DebugFlag z;

    private DebugFlag(String s1, int i1)
    {
        super(s1, i1);
    }

    public static DebugFlag valueOf(String s1)
    {
        return (DebugFlag)Enum.valueOf(com/spotify/mobile/android/ui/page/DebugFlag, s1);
    }

    public static DebugFlag[] values()
    {
        return (DebugFlag[])I.clone();
    }

    static 
    {
        a = new DebugFlag("CONTEXT_RECOGNITION_ENABLED", 0);
        b = new DebugFlag("USE_GLUE_THEME", 1);
        q = new DebugFlag("FAKE_ARSENAL_DEVICE", 2);
        c = new DebugFlag("FAKE_ARSENAL_ACCOUNT_LOGGED_IN", 3);
        d = new DebugFlag("FAKE_ARSENAL_ACCOUNT_LINKED", 4);
        r = new DebugFlag("IGNORE_ARSENAL_COUNTRY_FLAG", 5);
        e = new DebugFlag("ENABLE_VIEW_LOAD_DISPLAY", 6);
        s = new DebugFlag("PICASSO_DEBUG", 7);
        t = new DebugFlag("ENABLE_AUDIO_RENDERER_FOR_VIDEO", 8);
        u = new DebugFlag("OVERRIDE_TELCO_OFFER_3G_CHECK", 9);
        v = new DebugFlag("OVERRIDE_TELCO_OFFER_SHOWN_ONCE", 10);
        f = new DebugFlag("FORCE_ALLOW_GET_PREMIUM", 11);
        g = new DebugFlag("VIDEO_OVERLAY_INFO", 12);
        h = new DebugFlag("ARTIST_FEEDBACK_IGNORE_TIME", 13);
        i = new DebugFlag("ARTIST_FEEDBACK_DONT_MARK_SEEN", 14);
        j = new DebugFlag("UPDATE_NAG_TEST_VERSIONS_SOURCE", 15);
        k = new DebugFlag("SHOW_SLEEP_TIMER", 16);
        l = new DebugFlag("SHORT_SLEEP_TIMER_VALUE_FOR_TESTING", 17);
        m = new DebugFlag("USE_LEGACY_VIDEO_RENDERER", 18);
        w = new DebugFlag("DISPLAY_GRID_OVERLAY", 19);
        x = new DebugFlag("ENABLE_VIEW_HIERARCHY_INDICATOR", 20);
        y = new DebugFlag("ENABLE_RELAYOUT_TRACKER", 21);
        z = new DebugFlag("DISPLAY_VIEW_STATISTICS", 22);
        A = new DebugFlag("INCORRECT_TYPEFACE_DETECTOR", 23);
        B = new DebugFlag("COLOR_PIPETTE_TOOL", 24);
        C = new DebugFlag("ALIGNMENT_CROSSHAIRS_TOOL", 25);
        D = new DebugFlag("COMPONENT_TYPE_OVERLAY", 26);
        E = new DebugFlag("TYPEFACE_IDENTIFICATION_TOOL", 27);
        F = new DebugFlag("PARTY_MODE", 28);
        n = new DebugFlag("RUNNING_BETA_SERVER", 29);
        o = new DebugFlag("CONNECT_APP2APP", 30);
        G = new DebugFlag("TELCO_OFFER_ALLOW_GET_PREMIUM", 31);
        p = new DebugFlag("NATIVE_WAIT_FOR_DEBUGGER", 32);
        H = new DebugFlag("ENABLE_QUEUE2", 33);
        I = (new DebugFlag[] {
            a, b, q, c, d, r, e, s, t, u, 
            v, f, g, h, i, j, k, l, m, w, 
            x, y, z, A, B, C, D, E, F, n, 
            o, G, p, H
        });
    }
}
