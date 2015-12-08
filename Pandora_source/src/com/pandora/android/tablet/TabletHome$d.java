// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import com.pandora.android.util.p;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

public static final class z extends Enum
{

    private static final Map A;
    private static final z B[];
    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    public static final z g;
    public static final z h;
    public static final z i;
    public static final z j;
    public static final z k;
    public static final z l;
    public static final z m;
    public static final z n;
    public static final z o;
    public static final z p;
    public static final z q;
    public static final z r;
    public static final z s;
    public static final z t;
    public static final z u;
    public static final z v;
    public static final z w;
    public static final z x;
    public static final z y;
    private p z;

    static Map a()
    {
        return A;
    }

    public static A valueOf(String s1)
    {
        return (A)Enum.valueOf(com/pandora/android/tablet/TabletHome$d, s1);
    }

    public static A[] values()
    {
        return (A[])B.clone();
    }

    static 
    {
        int i1 = 0;
        a = new <init>("FEED", 0, p.j);
        b = new <init>("FIND_PEOPLE", 1, p.k);
        c = new <init>("PROFILE", 2, p.l);
        d = new <init>("BOOKMARKS", 3, p.n);
        e = new <init>("LIKES", 4, p.o);
        f = new <init>("FOLLOWING", 5, p.p);
        g = new <init>("FOLLOWERS", 6, p.q);
        h = new <init>("SETTINGS", 7, p.r);
        i = new <init>("P1_UPGRADE", 8, p.s);
        j = new <init>("PRIVACY_SETTINGS", 9, p.t);
        k = new <init>("ACCOUNT_SETTINGS", 10, p.u);
        l = new <init>("COMMUNICATIONS_SETTINGS", 11, p.v);
        m = new <init>("ADVANCED_SETTINGS", 12, p.w);
        n = new <init>("DEVICES_SETTINGS", 13, p.z);
        o = new <init>("ARTIST_MESSAGE_SETTINGS", 14, p.A);
        p = new <init>("SLEEP_TIMER_SETTINGS", 15, p.x);
        q = new <init>("ALARM_CLOCK_SETTINGS", 16, p.y);
        r = new <init>("NOTICES", 17, p.B);
        s = new <init>("TRACK_DETAIL", 18, p.C);
        t = new <init>("ARTIST_DETAIL", 19, p.D);
        u = new <init>("ALBUM_DETAIL", 20, p.E);
        v = new <init>("STATION_DETAILS", 21, p.e);
        w = new <init>("STATION_PERSONALIZATION", 22, p.H);
        x = new <init>("EDIT_STATION", 23, p.f);
        y = new <init>("EDIT_PROFILE", 24, p.m);
        B = (new B[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y
        });
        A = new EnumMap(com/pandora/android/util/p);
        d_3B_.clone aclone[] = values();
        for (int j1 = aclone.length; i1 < j1; i1++)
        {
            d_3B_.clone clone = aclone[i1];
            if (clone.z == null)
            {
                continue;
            }
            if (TabletHome.a(clone.z))
            {
                throw new RuntimeException((new StringBuilder()).append("PageName used more than once in a pane enum: ").append(clone.z).toString());
            }
            A.put(clone.z, clone);
        }

    }

    private (String s1, int i1, p p1)
    {
        super(s1, i1);
        z = null;
        z = p1;
    }
}
