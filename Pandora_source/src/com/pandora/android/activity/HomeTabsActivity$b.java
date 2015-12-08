// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.android.util.p;
import p.ca.ad;
import p.ca.ak;
import p.ca.ap;
import p.ca.r;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity, f

public static final class f extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d g[];
    final f e;
    final p f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/pandora/android/activity/HomeTabsActivity$b, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    static 
    {
        a = new <init>("STATIONS", 0, ap.f(), p.a);
        b = new <init>("FEED", 1, r.e(), p.j);
        c = new <init>("PROFILE", 2, ad.n_(), p.l);
        d = new <init>("SETTINGS", 3, ak.f(), p.r);
        g = (new g[] {
            a, b, c, d
        });
    }

    private (String s, int i, f f1, p p1)
    {
        super(s, i);
        e = f1;
        f = p1;
    }
}
