// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;


// Referenced classes of package com.fitbit.analytics.core:
//            Interaction

public static final class type extends Enum
{

    public static final A A;
    private static final A B[];
    public static final A a;
    public static final A b;
    public static final A c;
    public static final A d;
    public static final A e;
    public static final A f;
    public static final A g;
    public static final A h;
    public static final A i;
    public static final A j;
    public static final A k;
    public static final A l;
    public static final A m;
    public static final A n;
    public static final A o;
    public static final A p;
    public static final A q;
    public static final A r;
    public static final A s;
    public static final A t;
    public static final A u;
    public static final A v;
    public static final A w;
    public static final A x;
    public static final A y;
    public static final A z;
    String interactionId;
    A type;
    A version;

    public static type valueOf(String s1)
    {
        return (type)Enum.valueOf(com/fitbit/analytics/core/Interaction$DEFAULTS, s1);
    }

    public static type[] values()
    {
        return (type[])B.clone();
    }

    static 
    {
        a = new <init>("DASHBOARD", 0, , "1", );
        b = new <init>("APP_OPEN", 1, , "0", );
        c = new <init>("APP_EXIT", 2, , "2", );
        d = new <init>("PAIR_TRACKER_SEARCHING", 3, , "10", );
        e = new <init>("PAIR_TRACKER_COMPLETE", 4, , "11", );
        f = new <init>("VIEW_SELF_PROFILE", 5, , "1000", );
        g = new <init>("VIEW_USER_PROFILE", 6, , "1001", );
        h = new <init>("VIEW_DEVICE_SETTINGS", 7, , "1010", );
        i = new <init>("VIEW_SILENT_ALARMS", 8, , "1020", );
        j = new <init>("VIEW_GOALS", 9, , "1030", );
        k = new <init>("VIEW_STEPS", 10, , "1100", );
        l = new <init>("VIEW_HEARTRATE", 11, , "1200", );
        m = new <init>("VIEW_DISTANCE", 12, , "1400", );
        n = new <init>("VIEW_CALORIES_BURNED", 13, , "1600", );
        o = new <init>("VIEW_FLOORS", 14, , "1800", );
        p = new <init>("VIEW_ACTIVE_MINUTES", 15, , "2000", );
        q = new <init>("VIEW_EXERCISE", 16, , "2200", );
        r = new <init>("VIEW_WEIGHT", 17, , "2400", );
        s = new <init>("VIEW_SLEEP", 18, , "2600", );
        t = new <init>("VIEW_FOOD", 19, , "2800", );
        u = new <init>("VIEW_WATER", 20, , "3000", );
        v = new <init>("VIEW_CHALLENGES", 21, , "3200", );
        w = new <init>("CHALLENGE_ACTION_SHEET", 22, , "3201", );
        x = new <init>("ACTIVE_PENDING_CHALLENGE", 23, , "3202", );
        y = new <init>("FRIENDS_TAB", 24, , "3203", );
        z = new <init>("FIND_FRIEND", 25, , "3204", );
        A = new <init>("VIEW_HELP", 26, , "5200", );
        B = (new B[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A
        });
    }

    private (String s1, int i1,  , String s2,  1)
    {
        super(s1, i1);
        version = ;
        interactionId = s2;
        type = 1;
    }
}
